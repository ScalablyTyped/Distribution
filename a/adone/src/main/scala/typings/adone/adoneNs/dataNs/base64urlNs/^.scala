package typings.adone.adoneNs.dataNs.base64urlNs

import typings.adone.Anon_BufferTrue
import typings.adone.adoneNs.dataNs.base64urlNs.INs.DecodeOptions
import typings.adone.adoneNs.dataNs.base64urlNs.INs.EncodeOptions
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.base64url")
@js.native
object ^ extends js.Object {
  def decode(str: String): String = js.native
  def decode(str: String, options: DecodeOptions with Anon_BufferTrue): Buffer = js.native
  @JSName("decode")
  def decode_String(str: String, options: DecodeOptions): String = js.native
  def encode(str: String): String = js.native
  def encode(str: String, options: EncodeOptions): String = js.native
  def encode(str: Buffer): String = js.native
  def encode(str: Buffer, options: EncodeOptions): String = js.native
  def escape(str: String): String = js.native
  def unescape(str: String): String = js.native
}

