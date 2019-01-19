package typings
package aesDashJsLib.aesDashJsMod

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
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource, iv: aesDashJsLib.aesDashJsMod.ByteSource) = this()
    def decrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
    def encrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class ModeOfOperationCFB protected () extends js.Object {
    /**
      * Create a new CFB stream cipher.
      * @param key The cipher key.
      * @param iv The cipher initialization vector.
      * @param segmentSize The cipher segment size.
      */
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource, iv: aesDashJsLib.aesDashJsMod.ByteSource, segmentSize: scala.Double) = this()
    def decrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
    def encrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class ModeOfOperationCTR protected () extends js.Object {
    /**
      * Create a new CTR stream cipher.
      * @param key The cipher key.
      * @param counter The cipher counter state.
      */
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource) = this()
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource, counter: aesDashJsLib.aesDashJsMod.Counter) = this()
    def decrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
    def encrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class ModeOfOperationECB protected () extends js.Object {
    /**
      * Create a new ECB stream cipher.
      * @param key The cipher key.
      */
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource) = this()
    def decrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
    def encrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
  }
  
  @js.native
  class ModeOfOperationOFB protected () extends js.Object {
    /**
      * Create a new OFB stream cipher.
      * @param key The cipher key.
      * @param iv The cipher initialization vector.
      */
    def this(key: aesDashJsLib.aesDashJsMod.ByteSource, iv: aesDashJsLib.aesDashJsMod.ByteSource) = this()
    def decrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
    def encrypt(v: aesDashJsLib.aesDashJsMod.ByteSource): stdLib.Uint8Array = js.native
  }
  
  val cbc: org.scalablytyped.runtime.Instantiable2[
    /* key */ aesDashJsLib.aesDashJsMod.ByteSource, 
    /* iv */ aesDashJsLib.aesDashJsMod.ByteSource, 
    ModeOfOperationCBC
  ] = js.native
  val cfb: org.scalablytyped.runtime.Instantiable3[
    /* key */ aesDashJsLib.aesDashJsMod.ByteSource, 
    /* iv */ aesDashJsLib.aesDashJsMod.ByteSource, 
    /* segmentSize */ scala.Double, 
    ModeOfOperationCFB
  ] = js.native
  val ctr: org.scalablytyped.runtime.Instantiable2[
    /* key */ aesDashJsLib.aesDashJsMod.ByteSource, 
    /* counter */ js.UndefOr[/* counter */ aesDashJsLib.aesDashJsMod.Counter], 
    ModeOfOperationCTR
  ] = js.native
  val ecb: org.scalablytyped.runtime.Instantiable1[/* key */ aesDashJsLib.aesDashJsMod.ByteSource, ModeOfOperationECB] = js.native
  val ofb: org.scalablytyped.runtime.Instantiable2[
    /* key */ aesDashJsLib.aesDashJsMod.ByteSource, 
    /* iv */ aesDashJsLib.aesDashJsMod.ByteSource, 
    ModeOfOperationOFB
  ] = js.native
}

