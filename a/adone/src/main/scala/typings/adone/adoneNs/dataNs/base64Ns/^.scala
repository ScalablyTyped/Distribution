package typings.adone.adoneNs.dataNs.base64Ns

import typings.adone.Anon_Buffer
import typings.adone.Anon_BufferTrue
import typings.adone.Anon_Index
import typings.adone.adoneNs.dataNs.base64Ns.INs.DecodeOptions
import typings.adone.adoneNs.dataNs.base64Ns.INs.EncodeOptions
import typings.adone.adoneNumbers.`true`
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("adone.data.base64")
@js.native
object ^ extends js.Object {
  /**
    * Decodes base64 string/buffer into a string
    */
  def decode(str: String): String = js.native
  /**
    * Decodes base64 string/buffer into a buffer
    */
  def decode(str: String, options: DecodeOptions with Anon_BufferTrue): Buffer = js.native
  def decode(str: Buffer): String = js.native
  def decode(str: Buffer, options: DecodeOptions with Anon_BufferTrue): Buffer = js.native
  /**
    * Maps a character to a base64 number
    */
  def decodeCharCode(c: String): Double = js.native
  /**
    * Maps a number to a base64 character
    */
  def decodeNumber(n: Double): String = js.native
  def decodeVLQ(value: String): Double = js.native
  def decodeVLQ(value: String, index: Double): Double = js.native
  def decodeVLQ(value: String, index: Double, rest: Boolean): Double = js.native
  @JSName("decodeVLQ")
  def decodeVLQ_true(value: String, index: js.UndefOr[scala.Nothing], rest: `true`): Anon_Index = js.native
  @JSName("decodeVLQ")
  def decodeVLQ_true(value: String, index: Double, rest: `true`): Anon_Index = js.native
  @JSName("decode")
  def decode_String(str: String, options: DecodeOptions): String = js.native
  @JSName("decode")
  def decode_String(str: Buffer, options: DecodeOptions): String = js.native
  def encode(str: String): Buffer = js.native
  def encode(str: String, options: EncodeOptions): Buffer = js.native
  def encode(str: Buffer): Buffer = js.native
  def encode(str: Buffer, options: EncodeOptions): Buffer = js.native
  def encodeVLQ(value: Double): String = js.native
  /**
    * Encodes a string/Buffer to base64
    */
  @JSName("encode")
  def encode_String(str: String, options: EncodeOptions with Anon_Buffer): String = js.native
  @JSName("encode")
  def encode_String(str: Buffer, options: EncodeOptions with Anon_Buffer): String = js.native
}

