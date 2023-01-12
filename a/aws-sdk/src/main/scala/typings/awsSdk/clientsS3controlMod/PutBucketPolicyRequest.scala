package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketPolicyRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the Outposts bucket.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * Specifies the bucket. For using this parameter with Amazon S3 on Outposts with the REST API, you must specify the name and the x-amz-outpost-id as well. For using this parameter with S3 on Outposts with the Amazon Web Services SDK and CLI, you must specify the ARN of the bucket accessed in the format arn:aws:s3-outposts:&lt;Region&gt;:&lt;account-id&gt;:outpost/&lt;outpost-id&gt;/bucket/&lt;my-bucket-name&gt;. For example, to access the bucket reports through outpost my-outpost owned by account 123456789012 in Region us-west-2, use the URL encoding of arn:aws:s3-outposts:us-west-2:123456789012:outpost/my-outpost/bucket/reports. The value must be URL encoded. 
    */
  var Bucket: BucketName
  
  /**
    * Set this parameter to true to confirm that you want to remove your permissions to change this bucket policy in the future.  This is not supported by Amazon S3 on Outposts buckets. 
    */
  var ConfirmRemoveSelfBucketAccess: js.UndefOr[typings.awsSdk.clientsS3controlMod.ConfirmRemoveSelfBucketAccess] = js.undefined
  
  /**
    * The bucket policy as a JSON document.
    */
  var Policy: typings.awsSdk.clientsS3controlMod.Policy
}
object PutBucketPolicyRequest {
  
  inline def apply(AccountId: AccountId, Bucket: BucketName, Policy: Policy): PutBucketPolicyRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Bucket = Bucket.asInstanceOf[js.Any], Policy = Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutBucketPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setConfirmRemoveSelfBucketAccess(value: ConfirmRemoveSelfBucketAccess): Self = StObject.set(x, "ConfirmRemoveSelfBucketAccess", value.asInstanceOf[js.Any])
    
    inline def setConfirmRemoveSelfBucketAccessUndefined: Self = StObject.set(x, "ConfirmRemoveSelfBucketAccess", js.undefined)
    
    inline def setPolicy(value: Policy): Self = StObject.set(x, "Policy", value.asInstanceOf[js.Any])
  }
}
