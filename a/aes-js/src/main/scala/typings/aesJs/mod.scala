package typings.aesJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aes-js", "AES")
  @js.native
  open class AES protected () extends StObject {
    /**
      * Create a new AES block cipher.
      * @param key The cipher key.
      */
    def this(key: ByteSource) = this()
    
    def encrypt(v: ByteSource): ByteSource = js.native
  }
  
  @JSImport("aes-js", "Counter")
  @js.native
  open class Counter protected () extends StObject {
    def this(initialValue: Double) = this()
    def this(initialValue: ByteSource) = this()
    
    def increment(): Unit = js.native
    
    def setBytes(bytes: ByteSource): Unit = js.native
    
    def setValue(value: Double): Unit = js.native
  }
  
  object ModeOfOperation {
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCBC")
    @js.native
    open class ModeOfOperationCBC protected () extends StObject {
      /**
        * Create a new CBC stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      
      def decrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
      
      def encrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCFB")
    @js.native
    open class ModeOfOperationCFB protected () extends StObject {
      /**
        * Create a new CFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        * @param segmentSize The cipher segment size.
        */
      def this(key: ByteSource, iv: ByteSource, segmentSize: Double) = this()
      
      def decrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
      
      def encrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationCTR")
    @js.native
    open class ModeOfOperationCTR protected () extends StObject {
      /**
        * Create a new CTR stream cipher.
        * @param key The cipher key.
        * @param counter The cipher counter state.
        */
      def this(key: ByteSource) = this()
      def this(key: ByteSource, counter: Counter) = this()
      
      def decrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
      
      def encrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationECB")
    @js.native
    open class ModeOfOperationECB protected () extends StObject {
      /**
        * Create a new ECB stream cipher.
        * @param key The cipher key.
        */
      def this(key: ByteSource) = this()
      
      def decrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
      
      def encrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
    }
    
    @JSImport("aes-js", "ModeOfOperation.ModeOfOperationOFB")
    @js.native
    open class ModeOfOperationOFB protected () extends StObject {
      /**
        * Create a new OFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      
      def decrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
      
      def encrypt(v: ByteSource): js.typedarray.Uint8Array = js.native
    }
    
    /* was `typeof ModeOfOperationCBC` */
    @JSImport("aes-js", "ModeOfOperation.cbc")
    @js.native
    open class cbc protected () extends ModeOfOperationCBC {
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
    open class cfb protected () extends ModeOfOperationCFB {
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
    open class ctr protected () extends ModeOfOperationCTR {
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
    open class ecb protected () extends ModeOfOperationECB {
      /**
        * Create a new ECB stream cipher.
        * @param key The cipher key.
        */
      def this(key: ByteSource) = this()
    }
    
    /* was `typeof ModeOfOperationOFB` */
    @JSImport("aes-js", "ModeOfOperation.ofb")
    @js.native
    open class ofb protected () extends ModeOfOperationOFB {
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
      
      @JSImport("aes-js", "padding.pkcs7")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Add standard PKCS7 padding to an array.
        * @param data The input data.
        */
      inline def pad(data: ByteSource): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("pad")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
      
      /**
        * Remove standard PKCS7 padding from an array.
        * @param data The input data.
        */
      inline def strip(data: ByteSource): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("strip")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    }
  }
  
  object utils {
    
    object hex {
      
      @JSImport("aes-js", "utils.hex")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Convert an array-like object to a hexadecimal string.
        * @param data The input data.
        */
      inline def fromBytes(data: ByteSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Convert a hexadecimal string to a Uint8Array.
        * @param data The input string.
        */
      inline def toBytes(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    }
    
    object utf8 {
      
      @JSImport("aes-js", "utils.utf8")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * Convert an array-like object containing UTF8 data to a string.
        * @param data The input data.
        */
      inline def fromBytes(data: ByteSource): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBytes")(data.asInstanceOf[js.Any]).asInstanceOf[String]
      
      /**
        * Convert a UTF8 encoded string to a Uint8Array.
        * @param data The input string.
        */
      inline def toBytes(data: String): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("toBytes")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
    }
  }
  
  type ByteSource = js.typedarray.ArrayBuffer | js.typedarray.Uint8Array | js.Array[Double]
}
