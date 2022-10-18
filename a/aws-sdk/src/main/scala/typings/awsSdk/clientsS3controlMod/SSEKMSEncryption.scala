package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEKMSEncryption extends StObject {
  
  /**
    * Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric encryption customer managed key to use for encrypting generated manifest objects.
    */
  var KeyId: KmsKeyArnString
}
object SSEKMSEncryption {
  
  inline def apply(KeyId: KmsKeyArnString): SSEKMSEncryption = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEKMSEncryption]
  }
  
  extension [Self <: SSEKMSEncryption](x: Self) {
    
    inline def setKeyId(value: KmsKeyArnString): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
