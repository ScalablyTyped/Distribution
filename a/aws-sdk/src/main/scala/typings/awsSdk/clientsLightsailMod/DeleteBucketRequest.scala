package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBucketRequest extends StObject {
  
  /**
    * The name of the bucket to delete. Use the GetBuckets action to get a list of bucket names that you can specify.
    */
  var bucketName: BucketName
  
  /**
    * A Boolean value that indicates whether to force delete the bucket. You must force delete the bucket if it has one of the following conditions:   The bucket is the origin of a distribution.   The bucket has instances that were granted access to it using the SetResourceAccessForBucket action.   The bucket has objects.   The bucket has access keys.    Force deleting a bucket might impact other resources that rely on the bucket, such as instances, distributions, or software that use the issued access keys. 
    */
  var forceDelete: js.UndefOr[Boolean] = js.undefined
}
object DeleteBucketRequest {
  
  inline def apply(bucketName: BucketName): DeleteBucketRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBucketRequest]
  }
  
  extension [Self <: DeleteBucketRequest](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setForceDelete(value: Boolean): Self = StObject.set(x, "forceDelete", value.asInstanceOf[js.Any])
    
    inline def setForceDeleteUndefined: Self = StObject.set(x, "forceDelete", js.undefined)
  }
}
