package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.I.LocalIdentificationBlock")
@js.native
class LocalIdentificationBlock () extends LocalBaseBlock {
  def this(params: LocalIdentificationBlockParams) = this()
  var isConstructed: scala.Boolean = js.native
  // ILocalHexBlock implementation
  var isHexOnly: scala.Boolean = js.native
  var tagClass: scala.Double = js.native
  var tagNumber: scala.Double = js.native
  var valueHex: stdLib.ArrayBuffer = js.native
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

