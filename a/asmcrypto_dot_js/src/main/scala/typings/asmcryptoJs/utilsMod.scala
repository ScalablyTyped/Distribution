package typings.asmcryptoJs

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("asmcrypto.js/dist_es8/other/utils", JSImport.Namespace)
@js.native
object utilsMod extends js.Object {
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
  @JSName("_heap_init")
  def heapInit(): Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: js.UndefOr[scala.Nothing], heapSize: Double): Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: Uint8Array): Uint8Array = js.native
  @JSName("_heap_init")
  def heapInit(heap: Uint8Array, heapSize: Double): Uint8Array = js.native
  @JSName("_heap_write")
  def heapWrite(heap: Uint8Array, hpos: Double, data: Uint8Array, dpos: Double, dlen: Double): Double = js.native
  @JSName("hex_to_bytes")
  def hexToBytes(str: String): Uint8Array = js.native
  @JSName("is_buffer")
  def isBuffer(a: ArrayBuffer): Boolean = js.native
  @JSName("is_bytes")
  def isBytes(a: Uint8Array): Boolean = js.native
  @JSName("is_number")
  def isNumber(a: Double): Boolean = js.native
  @JSName("is_string")
  def isString(a: String): Boolean = js.native
  @JSName("is_typed_array")
  def isTypedArray(a: js.Any): Boolean = js.native
  def joinBytes(arg: Uint8Array*): Uint8Array = js.native
  @JSName("pow2_ceil")
  def pow2Ceil(a: Double): Double = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String): Uint8Array = js.native
  @JSName("string_to_bytes")
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = js.native
}

