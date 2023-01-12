package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateKeyPairResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the new key pair you just created.
    */
  var keyPair: js.UndefOr[KeyPair] = js.undefined
  
  /**
    * An array of objects that describe the result of the action, such as the status of the request, the timestamp of the request, and the resources affected by the request.
    */
  var operation: js.UndefOr[Operation] = js.undefined
  
  /**
    * A base64-encoded RSA private key.
    */
  var privateKeyBase64: js.UndefOr[Base64] = js.undefined
  
  /**
    * A base64-encoded public key of the ssh-rsa type.
    */
  var publicKeyBase64: js.UndefOr[Base64] = js.undefined
}
object CreateKeyPairResult {
  
  inline def apply(): CreateKeyPairResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateKeyPairResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateKeyPairResult] (val x: Self) extends AnyVal {
    
    inline def setKeyPair(value: KeyPair): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
    
    inline def setOperation(value: Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
    
    inline def setPrivateKeyBase64(value: Base64): Self = StObject.set(x, "privateKeyBase64", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyBase64Undefined: Self = StObject.set(x, "privateKeyBase64", js.undefined)
    
    inline def setPublicKeyBase64(value: Base64): Self = StObject.set(x, "publicKeyBase64", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyBase64Undefined: Self = StObject.set(x, "publicKeyBase64", js.undefined)
  }
}
