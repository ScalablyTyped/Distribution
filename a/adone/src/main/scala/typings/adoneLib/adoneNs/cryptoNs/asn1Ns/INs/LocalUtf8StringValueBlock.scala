package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(adoneLib.adoneNs.cryptoNs.asn1Ns.INs.LocalHexBlock because Inheritance from two classes)*/
@JSGlobal("adone.crypto.asn1.I.LocalUtf8StringValueBlock")
@js.native
class LocalUtf8StringValueBlock () extends LocalBaseBlock {
  def this(params: LocalSidValueBlockParams) = this()
  var isHexOnly: scala.Boolean = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

