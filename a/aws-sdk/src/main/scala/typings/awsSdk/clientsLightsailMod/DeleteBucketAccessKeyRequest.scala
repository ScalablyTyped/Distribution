package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketAccessKeyRequest extends StObject {
  
  /**
    * The ID of the access key to delete. Use the GetBucketAccessKeys action to get a list of access key IDs that you can specify.
    */
  var accessKeyId: NonEmptyString
  
  /**
    * The name of the bucket that the access key belongs to.
    */
  var bucketName: BucketName
}
object DeleteBucketAccessKeyRequest {
  
  inline def apply(accessKeyId: NonEmptyString, bucketName: BucketName): DeleteBucketAccessKeyRequest = {
    val __obj = js.Dynamic.literal(accessKeyId = accessKeyId.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketAccessKeyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBucketAccessKeyRequest] (val x: Self) extends AnyVal {
    
    inline def setAccessKeyId(value: NonEmptyString): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}
