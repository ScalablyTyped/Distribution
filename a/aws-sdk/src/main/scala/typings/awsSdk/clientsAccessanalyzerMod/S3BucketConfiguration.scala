package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3BucketConfiguration extends StObject {
  
  /**
    * The configuration of Amazon S3 access points or multi-region access points for the bucket. You can propose up to 10 new access points per bucket.
    */
  var accessPoints: js.UndefOr[S3AccessPointConfigurationsMap] = js.undefined
  
  /**
    * The proposed list of ACL grants for the Amazon S3 bucket. You can propose up to 100 ACL grants per bucket. If the proposed grant configuration is for an existing bucket, the access preview uses the proposed list of grant configurations in place of the existing grants. Otherwise, the access preview uses the existing grants for the bucket.
    */
  var bucketAclGrants: js.UndefOr[S3BucketAclGrantConfigurationsList] = js.undefined
  
  /**
    * The proposed bucket policy for the Amazon S3 bucket.
    */
  var bucketPolicy: js.UndefOr[S3BucketPolicy] = js.undefined
  
  /**
    * The proposed block public access configuration for the Amazon S3 bucket.
    */
  var bucketPublicAccessBlock: js.UndefOr[S3PublicAccessBlockConfiguration] = js.undefined
}
object S3BucketConfiguration {
  
  inline def apply(): S3BucketConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3BucketConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3BucketConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAccessPoints(value: S3AccessPointConfigurationsMap): Self = StObject.set(x, "accessPoints", value.asInstanceOf[js.Any])
    
    inline def setAccessPointsUndefined: Self = StObject.set(x, "accessPoints", js.undefined)
    
    inline def setBucketAclGrants(value: S3BucketAclGrantConfigurationsList): Self = StObject.set(x, "bucketAclGrants", value.asInstanceOf[js.Any])
    
    inline def setBucketAclGrantsUndefined: Self = StObject.set(x, "bucketAclGrants", js.undefined)
    
    inline def setBucketAclGrantsVarargs(value: S3BucketAclGrantConfiguration*): Self = StObject.set(x, "bucketAclGrants", js.Array(value*))
    
    inline def setBucketPolicy(value: S3BucketPolicy): Self = StObject.set(x, "bucketPolicy", value.asInstanceOf[js.Any])
    
    inline def setBucketPolicyUndefined: Self = StObject.set(x, "bucketPolicy", js.undefined)
    
    inline def setBucketPublicAccessBlock(value: S3PublicAccessBlockConfiguration): Self = StObject.set(x, "bucketPublicAccessBlock", value.asInstanceOf[js.Any])
    
    inline def setBucketPublicAccessBlockUndefined: Self = StObject.set(x, "bucketPublicAccessBlock", js.undefined)
  }
}
