package typings.adone.adoneNs.cryptoNs.asn1Ns

import typings.adone.adoneNs.cryptoNs.asn1Ns.INs.RawDataParams
import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.crypto.asn1.RawData")
@js.native
class RawData () extends js.Object {
  def this(params: RawDataParams) = this()
  var data: ArrayBuffer = js.native
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Double = js.native
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}

