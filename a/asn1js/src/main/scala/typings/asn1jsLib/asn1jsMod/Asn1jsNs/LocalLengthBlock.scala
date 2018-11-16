package typings
package asn1jsLib.asn1jsMod.Asn1jsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocalLengthBlock extends LocalBaseBlock {
  var isIndefiniteForm: scala.Boolean = js.native
  var length: scala.Double = js.native
  var longFormUsed: scala.Boolean = js.native
  def fromBER(inputBuffer: stdLib.ArrayBuffer, inputOffset: scala.Double, inputLength: scala.Double): scala.Unit = js.native
  def toBER(): stdLib.ArrayBuffer = js.native
  def toBER(sizeOnly: scala.Boolean): stdLib.ArrayBuffer = js.native
}

