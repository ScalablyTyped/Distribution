package typings.awsSdk.anon

import typings.awsSdk.s3Mod.AccountId
import typings.awsSdk.s3Mod.BucketName
import typings.awsSdk.s3Mod.IfMatch
import typings.awsSdk.s3Mod.IfModifiedSince
import typings.awsSdk.s3Mod.IfNoneMatch
import typings.awsSdk.s3Mod.IfUnmodifiedSince
import typings.awsSdk.s3Mod.ObjectKey
import typings.awsSdk.s3Mod.ObjectVersionId
import typings.awsSdk.s3Mod.PartNumber
import typings.awsSdk.s3Mod.Range
import typings.awsSdk.s3Mod.RequestPayer
import typings.awsSdk.s3Mod.SSECustomerAlgorithm
import typings.awsSdk.s3Mod.SSECustomerKey
import typings.awsSdk.s3Mod.SSECustomerKeyMD5
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/s3.HeadObjectRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait HeadObjectRequestwaiterWa extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The name of the bucket containing the object. When using this API with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this operation with an access point through the AWS SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using Access Points in the Amazon Simple Storage Service Developer Guide. When using this API with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When using this operation using S3 on Outposts through the AWS SDKs, you provide the Outposts bucket ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see Using S3 on Outposts in the Amazon Simple Storage Service Developer Guide.
    */
  var Bucket: BucketName
  
  /**
    * The account id of the expected bucket owner. If the bucket is owned by a different account, the request will fail with an HTTP 403 (Access Denied) error.
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Return the object only if its entity tag (ETag) is the same as the one specified, otherwise return a 412 (precondition failed).
    */
  var IfMatch: js.UndefOr[typings.awsSdk.s3Mod.IfMatch] = js.undefined
  
  /**
    * Return the object only if it has been modified since the specified time, otherwise return a 304 (not modified).
    */
  var IfModifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfModifiedSince] = js.undefined
  
  /**
    * Return the object only if its entity tag (ETag) is different from the one specified, otherwise return a 304 (not modified).
    */
  var IfNoneMatch: js.UndefOr[typings.awsSdk.s3Mod.IfNoneMatch] = js.undefined
  
  /**
    * Return the object only if it has not been modified since the specified time, otherwise return a 412 (precondition failed).
    */
  var IfUnmodifiedSince: js.UndefOr[typings.awsSdk.s3Mod.IfUnmodifiedSince] = js.undefined
  
  /**
    * The object key.
    */
  var Key: ObjectKey
  
  /**
    * Part number of the object being read. This is a positive integer between 1 and 10,000. Effectively performs a 'ranged' HEAD request for the part specified. Useful querying about the size of the part and the number of parts in this object.
    */
  var PartNumber: js.UndefOr[typings.awsSdk.s3Mod.PartNumber] = js.undefined
  
  /**
    * Downloads the specified range bytes of an object. For more information about the HTTP Range header, see http://www.w3.org/Protocols/rfc2616/rfc2616-sec14.html#sec14.35.  Amazon S3 doesn't support retrieving multiple ranges of data per GET request. 
    */
  var Range: js.UndefOr[typings.awsSdk.s3Mod.Range] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.s3Mod.RequestPayer] = js.undefined
  
  /**
    * Specifies the algorithm to use to when encrypting the object (for example, AES256).
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * Specifies the customer-provided encryption key for Amazon S3 to use in encrypting data. This value is used to store the object and then it is discarded; Amazon S3 does not store the encryption key. The key must be appropriate for use with the algorithm specified in the x-amz-server-side-encryption-customer-algorithm header.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKey] = js.undefined
  
  /**
    * Specifies the 128-bit MD5 digest of the encryption key according to RFC 1321. Amazon S3 uses this header for a message integrity check to ensure that the encryption key was transmitted without error.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.s3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * VersionId used to reference a specific version of the object.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object HeadObjectRequestwaiterWa {
  
  @scala.inline
  def apply(Bucket: BucketName, Key: ObjectKey): HeadObjectRequestwaiterWa = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadObjectRequestwaiterWa]
  }
  
  @scala.inline
  implicit class HeadObjectRequestwaiterWaMutableBuilder[Self <: HeadObjectRequestwaiterWa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    @scala.inline
    def setIfMatch(value: IfMatch): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    @scala.inline
    def setIfModifiedSince(value: IfModifiedSince): Self = StObject.set(x, "IfModifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfModifiedSinceUndefined: Self = StObject.set(x, "IfModifiedSince", js.undefined)
    
    @scala.inline
    def setIfNoneMatch(value: IfNoneMatch): Self = StObject.set(x, "IfNoneMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfNoneMatchUndefined: Self = StObject.set(x, "IfNoneMatch", js.undefined)
    
    @scala.inline
    def setIfUnmodifiedSince(value: IfUnmodifiedSince): Self = StObject.set(x, "IfUnmodifiedSince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIfUnmodifiedSinceUndefined: Self = StObject.set(x, "IfUnmodifiedSince", js.undefined)
    
    @scala.inline
    def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumber(value: PartNumber): Self = StObject.set(x, "PartNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartNumberUndefined: Self = StObject.set(x, "PartNumber", js.undefined)
    
    @scala.inline
    def setRange(value: Range): Self = StObject.set(x, "Range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "Range", js.undefined)
    
    @scala.inline
    def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    @scala.inline
    def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    @scala.inline
    def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    @scala.inline
    def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    @scala.inline
    def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
