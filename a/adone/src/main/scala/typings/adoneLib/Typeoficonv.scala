package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoficonv extends js.Object {
  val INs: TypeofIEncoding = js.native
  val defaultCharSingleByte: adoneLib.adoneLibStrings.`?` = js.native
  val defaultCharUnicode: java.lang.String = js.native
  def decode(buffer: nodeLib.Buffer, encoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding): java.lang.String = js.native
  def decode(
    buffer: nodeLib.Buffer,
    encoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding,
    options: js.Object
  ): java.lang.String = js.native
  def encode(buffer: java.lang.String, encoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding): nodeLib.Buffer = js.native
  def encode(
    buffer: java.lang.String,
    encoding: adoneLib.adoneNs.utilNs.iconvNs.INs.SupportedEncoding,
    options: js.Object
  ): nodeLib.Buffer = js.native
  def encodingExists(encoding: java.lang.String): scala.Boolean = js.native
}

