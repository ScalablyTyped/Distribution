package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_C extends js.Object {
  val INs: js.Any = js.native
  /**
    * Decodes base64 string/buffer into a string
    */
  def decode(str: java.lang.String): java.lang.String = js.native
  def decode(str: java.lang.String, options: adoneLib.adoneNs.dataNs.base64Ns.INs.DecodeOptions): java.lang.String = js.native
  def decode(str: nodeLib.Buffer): java.lang.String = js.native
  def decode(str: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.base64Ns.INs.DecodeOptions): java.lang.String = js.native
  /**
    * Maps a character to a base64 number
    */
  def decodeCharCode(c: java.lang.String): scala.Double = js.native
  /**
    * Maps a number to a base64 character
    */
  def decodeNumber(n: scala.Double): java.lang.String = js.native
  def decodeVLQ(value: java.lang.String): scala.Double = js.native
  def decodeVLQ(value: java.lang.String, index: js.UndefOr[scala.Nothing], rest: adoneLib.adoneLibNumbers.`true`): Anon_Index = js.native
  def decodeVLQ(value: java.lang.String, index: scala.Double): scala.Double = js.native
  def decodeVLQ(value: java.lang.String, index: scala.Double, rest: adoneLib.adoneLibNumbers.`true`): Anon_Index = js.native
  def decodeVLQ(value: java.lang.String, index: scala.Double, rest: scala.Boolean): scala.Double = js.native
  /**
    * Decodes base64 string/buffer into a buffer
    */
  @JSName("decode")
  def decode_Buffer(
    str: java.lang.String,
    options: adoneLib.adoneNs.dataNs.base64Ns.INs.DecodeOptions with Anon_BufferTrue
  ): nodeLib.Buffer = js.native
  @JSName("decode")
  def decode_Buffer(
    str: nodeLib.Buffer,
    options: adoneLib.adoneNs.dataNs.base64Ns.INs.DecodeOptions with Anon_BufferTrue
  ): nodeLib.Buffer = js.native
  def encode(str: java.lang.String): nodeLib.Buffer = js.native
  def encode(str: java.lang.String, options: adoneLib.adoneNs.dataNs.base64Ns.INs.EncodeOptions): nodeLib.Buffer = js.native
  def encode(str: nodeLib.Buffer): nodeLib.Buffer = js.native
  def encode(str: nodeLib.Buffer, options: adoneLib.adoneNs.dataNs.base64Ns.INs.EncodeOptions): nodeLib.Buffer = js.native
  def encodeVLQ(value: scala.Double): java.lang.String = js.native
  /**
    * Encodes a string/Buffer to base64
    */
  @JSName("encode")
  def encode_String(
    str: java.lang.String,
    options: adoneLib.adoneNs.dataNs.base64Ns.INs.EncodeOptions with Anon_BufferFalse
  ): java.lang.String = js.native
  @JSName("encode")
  def encode_String(
    str: nodeLib.Buffer,
    options: adoneLib.adoneNs.dataNs.base64Ns.INs.EncodeOptions with Anon_BufferFalse
  ): java.lang.String = js.native
}

