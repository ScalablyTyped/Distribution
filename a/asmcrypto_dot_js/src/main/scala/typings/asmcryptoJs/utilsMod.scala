package typings.asmcryptoJs

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "base64_to_bytes")
  @js.native
  def base64ToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_base64")
  @js.native
  def bytesToBase64(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_hex")
  @js.native
  def bytesToHex(arr: Uint8Array): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array): String = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "bytes_to_string")
  @js.native
  def bytesToString(bytes: Uint8Array, utf8: Boolean): String = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(): Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: js.UndefOr[scala.Nothing], heapSize: Double): Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: Uint8Array): Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_init")
  @js.native
  def heapInit(heap: Uint8Array, heapSize: Double): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "_heap_write")
  @js.native
  def heapWrite(heap: Uint8Array, hpos: Double, data: Uint8Array, dpos: Double, dlen: Double): Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "hex_to_bytes")
  @js.native
  def hexToBytes(str: String): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_buffer")
  @js.native
  def isBuffer(a: ArrayBuffer): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_bytes")
  @js.native
  def isBytes(a: Uint8Array): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_number")
  @js.native
  def isNumber(a: Double): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_string")
  @js.native
  def isString(a: String): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "is_typed_array")
  @js.native
  def isTypedArray(a: js.Any): Boolean = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "joinBytes")
  @js.native
  def joinBytes(arg: Uint8Array*): Uint8Array = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "pow2_ceil")
  @js.native
  def pow2Ceil(a: Double): Double = js.native
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String): Uint8Array = js.native
  @JSImport("asmcrypto.js/dist_es8/other/utils", "string_to_bytes")
  @js.native
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = js.native
}
