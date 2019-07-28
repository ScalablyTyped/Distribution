package typings.adone.adoneNs.cryptoNs.asn1Ns.INs

import typings.std.ArrayBuffer
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
  var tagClass: Double = js.native
  var tagNumber: Double = js.native
  var valueHex: ArrayBuffer = js.native
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}

