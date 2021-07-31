package typings.asmcryptoJs

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def base64ToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def bytesToBase64(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_base64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bytesToHex(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_hex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def bytesToString(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def bytesToString(bytes: Uint8Array, utf8: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def heapInit(): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_heap_init")().asInstanceOf[Uint8Array]
  @scala.inline
  def heapInit(heap: Unit, heapSize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_heap_init")(heap.asInstanceOf[js.Any], heapSize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  @scala.inline
  def heapInit(heap: Uint8Array): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("_heap_init")(heap.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def heapInit(heap: Uint8Array, heapSize: Double): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("_heap_init")(heap.asInstanceOf[js.Any], heapSize.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
  
  @scala.inline
  def heapWrite(heap: Uint8Array, hpos: Double, data: Uint8Array, dpos: Double, dlen: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("_heap_write")(heap.asInstanceOf[js.Any], hpos.asInstanceOf[js.Any], data.asInstanceOf[js.Any], dpos.asInstanceOf[js.Any], dlen.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def hexToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def isBuffer(a: ArrayBuffer): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_buffer")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isBytes(a: Uint8Array): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_bytes")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isNumber(a: Double): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_number")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isString(a: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_string")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isTypedArray(a: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_typed_array")(a.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def joinBytes(arg: Uint8Array*): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("joinBytes")(arg.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  @scala.inline
  def pow2Ceil(a: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("pow2_ceil")(a.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def stringToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  @scala.inline
  def stringToBytes(str: String, utf8: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
