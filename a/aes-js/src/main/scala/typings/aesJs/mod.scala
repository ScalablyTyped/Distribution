package typings.aesJs

import typings.std.ArrayBuffer
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aes-js", "AES")
  @js.native
  class AES protected () extends StObject {
    /**
      * Create a new AES block cipher.
      * @param key The cipher key.
      */
    def this(key: ByteSource) = this()
    
    def encrypt(v: ByteSource): ByteSource = js.native
  }
  
  @JSImport("aes-js", "Counter")
  @js.native
  class Counter protected () extends StObject {
    def this(initialValue: Double) = this()
    def this(initialValue: ByteSource) = this()
    
    def increment(): Unit = js.native
    
    def setBytes(bytes: ByteSource): Unit = js.native
    
    def setValue(value: Double): Unit = js.native
  }
  
  object ModeOfOperation {
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCBC")
    @js.native
    class ModeOfOperationCBC protected () extends StObject {
      /**
        * Create a new CBC stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      
      def decrypt(v: ByteSource): Uint8Array = js.native
      
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCFB")
    @js.native
    class ModeOfOperationCFB protected () extends StObject {
      /**
        * Create a new CFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        * @param segmentSize The cipher segment size.
        */
      def this(key: ByteSource, iv: ByteSource, segmentSize: Double) = this()
      
      def decrypt(v: ByteSource): Uint8Array = js.native
      
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCTR")
    @js.native
    class ModeOfOperationCTR protected () extends StObject {
      /**
        * Create a new CTR stream cipher.
        * @param key The cipher key.
        * @param counter The cipher counter state.
        */
      def this(key: ByteSource) = this()
      def this(key: ByteSource, counter: Counter) = this()
      
      def decrypt(v: ByteSource): Uint8Array = js.native
      
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationECB")
    @js.native
    class ModeOfOperationECB protected () extends StObject {
      /**
        * Create a new ECB stream cipher.
        * @param key The cipher key.
        */
      def this(key: ByteSource) = this()
      
      def decrypt(v: ByteSource): Uint8Array = js.native
      
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationOFB")
    @js.native
    class ModeOfOperationOFB protected () extends StObject {
      /**
        * Create a new OFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      
      def decrypt(v: ByteSource): Uint8Array = js.native
      
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    /* was `typeof ModeOfOperationCBC` */
    @JSImport("aes-js", "ModeOfOperation.cbc")
    @js.native
    class cbc protected () extends ModeOfOperationCBC {
      /**
        * Create a new CBC stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
    }
    
    /* was `typeof ModeOfOperationCFB` */
    @JSImport("aes-js", "ModeOfOperation.cfb")
    @js.native
    class cfb protected () extends ModeOfOperationCFB {
      /**
        * Create a new CFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        * @param segmentSize The cipher segment size.
        */
      def this(key: ByteSource, iv: ByteSource, segmentSize: Double) = this()
    }
    
    /* was `typeof ModeOfOperationCTR` */
    @JSImport("aes-js", "ModeOfOperation.ctr")
    @js.native
    class ctr protected () extends ModeOfOperationCTR {
      /**
        * Create a new CTR stream cipher.
        * @param key The cipher key.
        * @param counter The cipher counter state.
        */
      def this(key: ByteSource) = this()
      def this(key: ByteSource, counter: Counter) = this()
    }
    
    /* was `typeof ModeOfOperationECB` */
    @JSImport("aes-js", "ModeOfOperation.ecb")
    @js.native
    class ecb protected () extends ModeOfOperationECB {
      /**
        * Create a new ECB stream cipher.
        * @param key The cipher key.
        */
      def this(key: ByteSource) = this()
    }
    
    /* was `typeof ModeOfOperationOFB` */
    @JSImport("aes-js", "ModeOfOperation.ofb")
    @js.native
    class ofb protected () extends ModeOfOperationOFB {
      /**
        * Create a new OFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
    }
  }
  
  object padding {
    
    object pkcs7 {
      
      /**
        * Add standard PKCS7 padding to an array.
        * @param data The input data.
        */
      @JSImport("aes-js", "padding.pkcs7.pad")
      @js.native
      def pad(data: ByteSource): Uint8Array = js.native
      
      /**
        * Remove standard PKCS7 padding from an array.
        * @param data The input data.
        */
      @JSImport("aes-js", "padding.pkcs7.strip")
      @js.native
      def strip(data: ByteSource): Uint8Array = js.native
    }
  }
  
  object utils {
    
    object hex {
      
      /**
        * Convert an array-like object to a hexadecimal string.
        * @param data The input data.
        */
      @JSImport("aes-js", "utils.hex.fromBytes")
      @js.native
      def fromBytes(data: ByteSource): String = js.native
      
      /**
        * Convert a hexadecimal string to a Uint8Array.
        * @param data The input string.
        */
      @JSImport("aes-js", "utils.hex.toBytes")
      @js.native
      def toBytes(data: String): Uint8Array = js.native
    }
    
    object utf8 {
      
      /**
        * Convert an array-like object containing UTF8 data to a string.
        * @param data The input data.
        */
      @JSImport("aes-js", "utils.utf8.fromBytes")
      @js.native
      def fromBytes(data: ByteSource): String = js.native
      
      /**
        * Convert a UTF8 encoded string to a Uint8Array.
        * @param data The input string.
        */
      @JSImport("aes-js", "utils.utf8.toBytes")
      @js.native
      def toBytes(data: String): Uint8Array = js.native
    }
  }
  
  type ByteSource = ArrayBuffer | Uint8Array | js.Array[Double]
}
