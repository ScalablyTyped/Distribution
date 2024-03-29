package typings.asmcryptoJs

import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object exportedUtilsMod {
  
  @JSImport("asmcrypto.js/dist_es8/other/exportedUtils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def base64ToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("base64_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def bytesToBase64(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_base64")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToHex(arr: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_hex")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def bytesToString(bytes: Uint8Array): String = ^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def bytesToString(bytes: Uint8Array, utf8: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("bytes_to_string")(bytes.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def hexToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("hex_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  
  inline def stringToBytes(str: String): Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any]).asInstanceOf[Uint8Array]
  inline def stringToBytes(str: String, utf8: Boolean): Uint8Array = (^.asInstanceOf[js.Dynamic].applyDynamic("string_to_bytes")(str.asInstanceOf[js.Any], utf8.asInstanceOf[js.Any])).asInstanceOf[Uint8Array]
}
