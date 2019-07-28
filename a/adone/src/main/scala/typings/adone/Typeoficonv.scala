package typings.adone

import typings.adone.adoneNs.utilNs.iconvNs.INs.SupportedEncoding
import typings.adone.adoneStrings.`?`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoficonv extends js.Object {
  val INs: TypeofIEncoding = js.native
  val defaultCharSingleByte: `?` = js.native
  val defaultCharUnicode: String = js.native
  def decode(buffer: Buffer, encoding: SupportedEncoding): String = js.native
  def decode(buffer: Buffer, encoding: SupportedEncoding, options: js.Object): String = js.native
  def encode(buffer: String, encoding: SupportedEncoding): Buffer = js.native
  def encode(buffer: String, encoding: SupportedEncoding, options: js.Object): Buffer = js.native
  def encodingExists(encoding: String): Boolean = js.native
}

