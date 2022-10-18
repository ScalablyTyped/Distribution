package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadDefaultKeyPairResult extends StObject {
  
  /**
    * The timestamp when the default key pair was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.undefined
  
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.undefined
}
object DownloadDefaultKeyPairResult {
  
  inline def apply(): DownloadDefaultKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DownloadDefaultKeyPairResult]
  }
  
  extension [Self <: DownloadDefaultKeyPairResult](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setPrivateKeyBase64(value: Base64): Self = StObject.set(x, "privateKeyBase64", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyBase64Undefined: Self = StObject.set(x, "privateKeyBase64", js.undefined)
    
    inline def setPublicKeyBase64(value: Base64): Self = StObject.set(x, "publicKeyBase64", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyBase64Undefined: Self = StObject.set(x, "publicKeyBase64", js.undefined)
  }
}
