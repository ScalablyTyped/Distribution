package typings.asmcryptoJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportedUtilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array): String = js.native
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = js.native
}
