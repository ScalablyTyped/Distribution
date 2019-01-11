package typings
package adoneLib.adoneNs.dataNs.base64urlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.base64url")
@js.native
object ^ extends js.Object {
  def decode(str: java.lang.String): java.lang.String = js.native
  def decode(str: java.lang.String, options: adoneLib.adoneNs.dataNs.base64urlNs.INs.DecodeOptions): java.lang.String = js.native
  @JSName("decode")
  def decode_Buffer(
    str: java.lang.String,
    options: adoneLib.adoneNs.dataNs.base64urlNs.INs.DecodeOptions with adoneLib.Anon_BufferTrue
  ): nodeLib.Buffer = js.native
  def encode(str: java.lang.String): java.lang.String = js.native
  def encode(str: java.lang.String, options: adoneLib.adoneNs.dataNs.base64urlNs.INs.EncodeOptions): java.lang.String = js.native
  def encode(str: nodeLib.Buffer): java.lang.String = js.native
  def encode(str: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.base64urlNs.INs.EncodeOptions): java.lang.String = js.native
  def escape(str: java.lang.String): java.lang.String = js.native
  def unescape(str: java.lang.String): java.lang.String = js.native
}

