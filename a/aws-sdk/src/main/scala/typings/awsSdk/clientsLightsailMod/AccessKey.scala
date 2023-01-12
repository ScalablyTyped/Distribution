package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKey extends StObject {
  
  /**
    * The ID of the access key.
    */
  var accessKeyId: js.UndefOr[IAMAccessKeyId] = js.undefined
  
  /**
    * The timestamp when the access key was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * An object that describes the last time the access key was used.  This object does not include data in the response of a CreateBucketAccessKey action. If the access key has not been used, the region and serviceName values are N/A, and the lastUsedDate value is null. 
    */
  var lastUsed: js.UndefOr[AccessKeyLastUsed] = js.undefined
  
  /**
    * The secret access key used to sign requests. You should store the secret access key in a safe location. We recommend that you delete the access key if the secret access key is compromised.
    */
  var secretAccessKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The status of the access key. A status of Active means that the key is valid, while Inactive means it is not.
    */
  var status: js.UndefOr[StatusType] = js.undefined
}
object AccessKey {
  
  inline def apply(): AccessKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccessKey] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: IAMAccessKeyId): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setLastUsed(value: AccessKeyLastUsed): Self = StObject.set(x, "lastUsed", value.asInstanceOf[js.Any])
    
    inline def setLastUsedUndefined: Self = StObject.set(x, "lastUsed", js.undefined)
    
    inline def setSecretAccessKey(value: NonEmptyString): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
    
    inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
    
    inline def setStatus(value: StatusType): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
