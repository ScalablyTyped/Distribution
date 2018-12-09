package typings
package adoneLib.adoneNs.utilNs.iconvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.util.iconv")
@js.native
object iconvNsMembers extends js.Object {
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

