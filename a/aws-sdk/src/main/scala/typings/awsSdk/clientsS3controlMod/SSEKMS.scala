package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEKMS extends StObject {
  
  /**
    * A container for the ARN of the SSE-KMS encryption. This property is read-only and follows the following format:  arn:aws:kms:us-east-1:example-account-id:key/example-9a73-4afc-8d29-8f5900cef44e  
    */
  var KeyId: SSEKMSKeyId
}
object SSEKMS {
  
  inline def apply(KeyId: SSEKMSKeyId): SSEKMS = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SSEKMS]
  }
  
  extension [Self <: SSEKMS](x: Self) {
    
    inline def setKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
  }
}
