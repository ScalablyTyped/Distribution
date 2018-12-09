package typings
package adoneLib.adoneNs.cryptoNs.asn1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.RawData")
@js.native
class RawData () extends js.Object {
  def this(params: adoneLib.adoneNs.cryptoNs.asn1Ns.INs.RawDataParams) = this()
  var data: stdLib.ArrayBuffer = js.native
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Double = js.native
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

