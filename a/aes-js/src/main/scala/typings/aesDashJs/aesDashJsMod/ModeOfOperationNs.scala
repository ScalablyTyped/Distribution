package typings.aesDashJs.aesDashJsMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.aesDashJs.aesDashJsMod.ModeOfOperationNs.ModeOfOperationCBC
import typings.aesDashJs.aesDashJsMod.ModeOfOperationNs.ModeOfOperationCFB
import typings.aesDashJs.aesDashJsMod.ModeOfOperationNs.ModeOfOperationCTR
import typings.aesDashJs.aesDashJsMod.ModeOfOperationNs.ModeOfOperationECB
import typings.aesDashJs.aesDashJsMod.ModeOfOperationNs.ModeOfOperationOFB
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aes-js", "ModeOfOperation")
@js.native
object ModeOfOperationNs extends js.Object {
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

