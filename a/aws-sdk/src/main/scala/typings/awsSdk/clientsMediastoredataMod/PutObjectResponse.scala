package typings.awsSdk.clientsMediastoredataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectResponse extends StObject {
  
  /**
    * The SHA256 digest of the object that is persisted.
    */
  var ContentSHA256: js.UndefOr[SHA256Hash] = js.undefined
  
  /**
    * Unique identifier of the object in the container.
    */
  var ETag: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.ETag] = js.undefined
  
  /**
    * The storage class where the object was persisted. The class should be “Temporal”.
    */
  var StorageClass: js.UndefOr[typings.awsSdk.clientsMediastoredataMod.StorageClass] = js.undefined
}
object PutObjectResponse {
  
  inline def apply(): PutObjectResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutObjectResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutObjectResponse] (val x: Self) extends AnyVal {
    
    inline def setContentSHA256(value: SHA256Hash): Self = StObject.set(x, "ContentSHA256", value.asInstanceOf[js.Any])
    
    inline def setContentSHA256Undefined: Self = StObject.set(x, "ContentSHA256", js.undefined)
    
    inline def setETag(value: ETag): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setStorageClass(value: StorageClass): Self = StObject.set(x, "StorageClass", value.asInstanceOf[js.Any])
    
    inline def setStorageClassUndefined: Self = StObject.set(x, "StorageClass", js.undefined)
  }
}
