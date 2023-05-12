package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.akamaiEdgeworkersStrings.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("encoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Represents a decoder for a specific text encoding,
    * such as UTF-8, ISO-8859-2, KOI8-R, GBK, etc.
    * A decoder takes a stream of bytes as input and emits a stream of code points.
    */
  @JSImport("encoding", "TextDecoder")
  @js.native
  /**
    * Constructs a new TextDecoder object
    * @param utfLabel [Optional] a string representing the encoding to be used. Defaults to "utf-8".
    * @param options [Optional] TextDecoderOption dictionary
    */
  open class TextDecoder () extends StObject {
    def this(utfLabel: String) = this()
    def this(utfLabel: String, options: TextDecoderOptions) = this()
    def this(utfLabel: Unit, options: TextDecoderOptions) = this()
    
    /**
      * Returns a string containing the text decoded with the method of the specific TextDecoder object
      * @param buffer [Optional] an ArrayBuffer, a TypedArray or a DataView object containing the text to decode.
      * @param options [Optional] An object with the stream property
      */
    def decode(): String = js.native
    def decode(buffer: js.typedarray.ArrayBuffer): String = js.native
    def decode(buffer: js.typedarray.ArrayBuffer, options: StreamObject): String = js.native
    def decode(buffer: js.typedarray.DataView): String = js.native
    def decode(buffer: js.typedarray.DataView, options: StreamObject): String = js.native
    def decode(buffer: Unit, options: StreamObject): String = js.native
    def decode(buffer: TypedArray): String = js.native
    def decode(buffer: TypedArray, options: StreamObject): String = js.native
    
    /**
      * A string containing the name of the decoder, that is a string describing the method the TextDecoder will use
      */
    val encoding: String = js.native
    
    /**
      * The fatal  flag passed into the constructor
      */
    val fatal: Boolean = js.native
    
    /**
      * The ignoreBOM  flag passed into the constructor
      */
    val ignoreBOM: Boolean = js.native
  }
  
  /**
    * Takes a stream of code points as input and emits a stream of UTF-8 bytes
    */
  @JSImport("encoding", "TextEncoder")
  @js.native
  /**
    * Constructor for a new TextEncoder object
    */
  open class TextEncoder () extends StObject {
    
    /**
      * Converts input string into a stream of UTF-8 bytes
      * @param text is a String to encode
      */
    def encode(text: String): js.typedarray.Uint8Array = js.native
    
    /**
      * Containing the name of the encoding algorithm used by the specific encoder
      */
    val encoding: String = js.native
  }
  
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
  
  trait StreamObject extends StObject {
    
    /**
      * A boolean flag indicating that additional data will follow in subsequent calls to decode().
      * Set to true if processing the data in chunks, and false for the final chunk or if the data is not chunked.
      * It defaults to false.
      */
    var stream: Boolean
  }
  object StreamObject {
    
    inline def apply(stream: Boolean): StreamObject = {
      val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StreamObject] (val x: Self) extends AnyVal {
      
      inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextDecoderOptions extends StObject {
    
    var fatal: js.UndefOr[Boolean] = js.undefined
    
    var ignoreBOM: js.UndefOr[Boolean] = js.undefined
  }
  object TextDecoderOptions {
    
    inline def apply(): TextDecoderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextDecoderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextDecoderOptions] (val x: Self) extends AnyVal {
      
      inline def setFatal(value: Boolean): Self = StObject.set(x, "fatal", value.asInstanceOf[js.Any])
      
      inline def setFatalUndefined: Self = StObject.set(x, "fatal", js.undefined)
      
      inline def setIgnoreBOM(value: Boolean): Self = StObject.set(x, "ignoreBOM", value.asInstanceOf[js.Any])
      
      inline def setIgnoreBOMUndefined: Self = StObject.set(x, "ignoreBOM", js.undefined)
    }
  }
  
  type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
}
