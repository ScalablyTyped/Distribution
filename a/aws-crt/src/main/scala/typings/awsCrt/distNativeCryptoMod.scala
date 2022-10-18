package typings.awsCrt

import typings.awsCrt.distCommonCryptoMod.Hashable
import typings.awsCrt.distNativeNativeResourceMod.NativeResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeCryptoMod {
  
  @JSImport("aws-crt/dist/native/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/crypto", "Md5Hash")
  @js.native
  open class Md5Hash () extends Hash
  
  @JSImport("aws-crt/dist/native/crypto", "Sha1Hash")
  @js.native
  open class Sha1Hash () extends Hash
  
  @JSImport("aws-crt/dist/native/crypto", "Sha256Hash")
  @js.native
  open class Sha256Hash () extends Hash
  
  @JSImport("aws-crt/dist/native/crypto", "Sha256Hmac")
  @js.native
  open class Sha256Hmac protected () extends Hmac {
    def this(secret: Hashable) = this()
  }
  
  inline def hashMd5(data: Hashable): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_md5")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashMd5(data: Hashable, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_md5")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashSha1(data: Hashable): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha1")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashSha1(data: Hashable, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha1")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashSha256(data: Hashable): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha256")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashSha256(data: Hashable, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha256")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hmacSha256(secret: Hashable, data: Hashable): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  inline def hmacSha256(secret: Hashable, data: Hashable, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  /**
    * Object that allows for continuous hashing of data.
    *
    * @internal
    */
  @js.native
  trait Hash extends NativeResource {
    
    def finalize(truncate_to: Double): js.typedarray.DataView = js.native
    
    /**
      * Hash additional data.
      * @param data Additional data to hash
      */
    def update(data: Hashable): Unit = js.native
  }
  
  /**
    * Object that allows for continuous hashing of data with an hmac secret.
    *
    * @category Crypto
    */
  @js.native
  trait Hmac extends NativeResource {
    
    def finalize(truncate_to: Double): js.typedarray.DataView = js.native
    
    /**
      * Hash additional data.
      *
      * @param data additional data to hash
      */
    def update(data: Hashable): Unit = js.native
  }
}
