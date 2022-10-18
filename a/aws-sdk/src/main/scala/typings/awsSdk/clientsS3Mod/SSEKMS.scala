package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SSEKMS extends StObject {
  
  /**
    * Specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key to use for encrypting inventory reports.
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
