package typings.asn1js.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asn1js", "LocalValueBlock")
@js.native
class LocalValueBlock () extends LocalBaseBlock {
  def fromBER(inputBuffer: ArrayBuffer, inputOffset: Double, inputLength: Double): Unit = js.native
  def toBER(): ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): ArrayBuffer = js.native
}

