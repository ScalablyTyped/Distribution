package typings.asmcryptoJs

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/other/exportedUtils", JSImport.Namespace)
@js.native
object exportedUtilsMod extends js.Object {
  @JSName("base64_to_bytes")
  def base64ToBytes(str: String): Uint8Array = js.native
  @JSName("bytes_to_base64")
  def bytesToBase64(arr: Uint8Array): String = js.native
  @JSName("bytes_to_hex")
  def bytesToHex(arr: Uint8Array): String = js.native
  @JSName("bytes_to_string")
  def bytesToString(bytes: Uint8Array): String = js.native
  @JSName("bytes_to_string")
  def bytesToString(bytes: Uint8Array, utf8: Boolean): String = js.native
  @JSName("hex_to_bytes")
  def hexToBytes(str: String): Uint8Array = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String): Uint8Array = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = js.native
}

