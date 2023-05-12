package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SseKmsEncryptedObjects extends StObject {
  
  /**
    * Specifies whether Amazon S3 replicates objects that are created with server-side encryption by using an KMS key stored in Key Management Service.
    */
  var Status: SseKmsEncryptedObjectsStatus
}
object SseKmsEncryptedObjects {
  
  inline def apply(Status: SseKmsEncryptedObjectsStatus): SseKmsEncryptedObjects = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SseKmsEncryptedObjects]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SseKmsEncryptedObjects] (val x: Self) extends AnyVal {
    
    inline def setStatus(value: SseKmsEncryptedObjectsStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
  }
}
