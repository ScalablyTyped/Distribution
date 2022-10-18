package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBucketRequest extends StObject {
  
  /**
    * The name for the bucket. For more information about bucket names, see Bucket naming rules in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  var bucketName: BucketName
  
  /**
    * The ID of the bundle to use for the bucket. A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a bucket. Use the GetBucketBundles action to get a list of bundle IDs that you can specify. Use the UpdateBucketBundle action to change the bundle after the bucket is created.
    */
  var bundleId: NonEmptyString
  
  /**
    * A Boolean value that indicates whether to enable versioning of objects in the bucket. For more information about versioning, see Enabling and suspending object versioning in a bucket in Amazon Lightsail in the Amazon Lightsail Developer Guide.
    */
  var enableObjectVersioning: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The tag keys and optional values to add to the bucket during creation. Use the TagResource action to tag the bucket after it's created.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateBucketRequest {
  
  inline def apply(bucketName: BucketName, bundleId: NonEmptyString): CreateBucketRequest = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], bundleId = bundleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBucketRequest]
  }
  
  extension [Self <: CreateBucketRequest](x: Self) {
    
    inline def setBucketName(value: BucketName): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setBundleId(value: NonEmptyString): Self = StObject.set(x, "bundleId", value.asInstanceOf[js.Any])
    
    inline def setEnableObjectVersioning(value: Boolean): Self = StObject.set(x, "enableObjectVersioning", value.asInstanceOf[js.Any])
    
    inline def setEnableObjectVersioningUndefined: Self = StObject.set(x, "enableObjectVersioning", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
