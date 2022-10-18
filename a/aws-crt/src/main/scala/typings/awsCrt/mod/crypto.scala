package typings.awsCrt.mod

import typings.awsCrt.distCommonCryptoMod.Hashable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object crypto {
  
  @JSImport("aws-crt", "crypto")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt", "crypto.Md5Hash")
  @js.native
  open class Md5Hash ()
    extends typings.awsCrt.distNativeCryptoMod.Md5Hash
  
  @JSImport("aws-crt", "crypto.Sha1Hash")
  @js.native
  open class Sha1Hash ()
    extends typings.awsCrt.distNativeCryptoMod.Sha1Hash
  
  @JSImport("aws-crt", "crypto.Sha256Hash")
  @js.native
  open class Sha256Hash ()
    extends typings.awsCrt.distNativeCryptoMod.Sha256Hash
  
  @JSImport("aws-crt", "crypto.Sha256Hmac")
  @js.native
  open class Sha256Hmac protected ()
    extends typings.awsCrt.distNativeCryptoMod.Sha256Hmac {
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
}
