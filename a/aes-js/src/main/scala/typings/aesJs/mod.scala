package typings.aesJs

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AES protected () extends js.Object {
    /**
      * Create a new AES block cipher.
      * @param key The cipher key.
      */
    def this(key: ByteSource) = this()
    def encrypt(v: ByteSource): ByteSource = js.native
  }
  
  @js.native
  class Counter protected () extends js.Object {
    def this(initialValue: Double) = this()
    def increment(): Unit = js.native
    def setBytes(bytes: ByteSource): Unit = js.native
    def setValue(value: Double): Unit = js.native
  }
  
  @js.native
  object ModeOfOperation extends js.Object {
    @js.native
    class ModeOfOperationCBC protected () extends js.Object {
      /**
        * Create a new CBC stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      def decrypt(v: ByteSource): Uint8Array = js.native
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @js.native
    class ModeOfOperationCFB protected () extends js.Object {
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
    
    @js.native
    class ModeOfOperationCTR protected () extends js.Object {
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
    
    @js.native
    class ModeOfOperationECB protected () extends js.Object {
      /**
        * Create a new ECB stream cipher.
        * @param key The cipher key.
        */
      def this(key: ByteSource) = this()
      def decrypt(v: ByteSource): Uint8Array = js.native
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    @js.native
    class ModeOfOperationOFB protected () extends js.Object {
      /**
        * Create a new OFB stream cipher.
        * @param key The cipher key.
        * @param iv The cipher initialization vector.
        */
      def this(key: ByteSource, iv: ByteSource) = this()
      def decrypt(v: ByteSource): Uint8Array = js.native
      def encrypt(v: ByteSource): Uint8Array = js.native
    }
    
    val cbc: Instantiable2[/* key */ ByteSource, /* iv */ ByteSource, ModeOfOperationCBC] = js.native
    val cfb: Instantiable3[
        /* key */ ByteSource, 
        /* iv */ ByteSource, 
        /* segmentSize */ Double, 
        ModeOfOperationCFB
      ] = js.native
    val ctr: Instantiable2[/* key */ ByteSource, js.UndefOr[/* counter */ Counter], ModeOfOperationCTR] = js.native
    val ecb: Instantiable1[/* key */ ByteSource, ModeOfOperationECB] = js.native
    val ofb: Instantiable2[/* key */ ByteSource, /* iv */ ByteSource, ModeOfOperationOFB] = js.native
  }
  
  @js.native
  object padding extends js.Object {
    @js.native
    object pkcs7 extends js.Object {
      /**
        * Add standard PKCS7 padding to an array.
        * @param data The input data.
        */
      def pad(data: ByteSource): Uint8Array = js.native
      /**
        * Remove standard PKCS7 padding from an array.
        * @param data The input data.
        */
      def strip(data: ByteSource): Uint8Array = js.native
    }
    
  }
  
  @js.native
  object utils extends js.Object {
    @js.native
    object hex extends js.Object {
      /**
        * Convert an array-like object to a hexadecimal string.
        * @param data The input data.
        */
      def fromBytes(data: ByteSource): String = js.native
      /**
        * Convert a hexadecimal string to a Uint8Array.
        * @param data The input string.
        */
      def toBytes(data: String): Uint8Array = js.native
    }
    
    @js.native
    object utf8 extends js.Object {
      /**
        * Convert an array-like object containing UTF8 data to a string.
        * @param data The input data.
        */
      def fromBytes(data: ByteSource): String = js.native
      /**
        * Convert a UTF8 encoded string to a Uint8Array.
        * @param data The input string.
        */
      def toBytes(data: String): Uint8Array = js.native
    }
    
  }
  
  type ByteSource = ArrayBuffer | Uint8Array | js.Array[Double]
}

