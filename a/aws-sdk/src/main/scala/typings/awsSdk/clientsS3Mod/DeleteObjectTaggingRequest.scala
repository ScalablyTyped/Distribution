package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteObjectTaggingRequest extends StObject {
  
  /**
    * The bucket name containing the objects from which to remove the tags.  When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When using this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using Amazon S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The key that identifies the object in the bucket from which to remove all tags.
    */
  var Key: ObjectKey
  
  /**
    * The versionId of the object that the tag-set will be removed from.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object DeleteObjectTaggingRequest {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey): DeleteObjectTaggingRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteObjectTaggingRequest]
  }
  
  extension [Self <: DeleteObjectTaggingRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
