package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def atob(encodedData: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("atob")(encodedData.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("encoding", "base16")
  @js.native
  val base16: Base16_ = js.native
  
  @JSImport("encoding", "base64")
  @js.native
  val base64: Base64_ = js.native
  
  @JSImport("encoding", "base64url")
  @js.native
  val base64url: Base64url_ = js.native
  
  inline def btoa(stringToEncode: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("btoa")(stringToEncode.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait Base16_ extends StObject {
    
    /**
      * @param encodedData Input data that needs to be decoded.
      * @param outputFormat Optional argument for output format type.
      */
    def decode(encodedData: String): DecodedValue = js.native
    def decode(
      encodedData: String,
      outputFormat: typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.String | Uint8Array
    ): DecodedValue = js.native
  }
  
  @js.native
  trait Base64_ extends StObject {
    
    /**
      * @param encodedData Input data that needs to be decoded.
      * @param outputFormat Optional argument for output format type.
      */
    def decode(encodedData: String): DecodedValue = js.native
    def decode(
      encodedData: String,
      outputFormat: typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.String | Uint8Array
    ): DecodedValue = js.native
  }
  
  @js.native
  trait Base64url_ extends StObject {
    
    /**
      * @param encodedData Input data that needs to be decoded.
      * @param outputFormat Optional argument for output format type.
      */
    def decode(encodedData: String): DecodedValue = js.native
    def decode(
      encodedData: String,
      outputFormat: typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.String | Uint8Array
    ): DecodedValue = js.native
  }
  
  type DecodedValue = String | js.typedarray.Uint8Array
}
