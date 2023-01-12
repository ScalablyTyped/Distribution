package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBucketAccessKeysRequest extends StObject {
  
  /**
    * The name of the bucket for which to return access keys.
    */
  var bucketName: BucketName
}
object GetBucketAccessKeysRequest {
  
  inline def apply(bucketName: BucketName): GetBucketAccessKeysRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketAccessKeysRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetBucketAccessKeysRequest] (val x: Self) extends AnyVal {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
  }
}
