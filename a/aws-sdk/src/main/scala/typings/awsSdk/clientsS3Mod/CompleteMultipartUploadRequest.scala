package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompleteMultipartUploadRequest extends StObject {
  
  /**
    * Name of the bucket to which the multipart upload was initiated. When using this action with an access point, you must direct requests to the access point hostname. The access point hostname takes the form AccessPointName-AccountId.s3-accesspoint.Region.amazonaws.com. When using this action with an access point through the Amazon Web Services SDKs, you provide the access point ARN in place of the bucket name. For more information about access point ARNs, see Using access points in the Amazon S3 User Guide. When you use this action with Amazon S3 on Outposts, you must direct requests to the S3 on Outposts hostname. The S3 on Outposts hostname takes the form  AccessPointName-AccountId.outpostID.s3-outposts.Region.amazonaws.com. When you use this action with S3 on Outposts through the Amazon Web Services SDKs, you provide the Outposts access point ARN in place of the bucket name. For more information about S3 on Outposts ARNs, see What is S3 on Outposts in the Amazon S3 User Guide.
    */
  var Bucket: BucketName
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32 checksum of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumCRC32] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 32-bit CRC32C checksum of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumCRC32C: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumCRC32C] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 160-bit SHA-1 digest of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA1: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumSHA1] = js.undefined
  
  /**
    * This header can be used as a data integrity check to verify that the data received is the same data that was originally sent. This header specifies the base64-encoded, 256-bit SHA-256 digest of the object. For more information, see Checking object integrity in the Amazon S3 User Guide.
    */
  var ChecksumSHA256: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumSHA256] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Object key for which the multipart upload was initiated.
    */
  var Key: ObjectKey
  
  /**
    * The container for the multipart upload request information.
    */
  var MultipartUpload: js.UndefOr[CompletedMultipartUpload] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestPayer] = js.undefined
  
  /**
    * The server-side encryption (SSE) algorithm used to encrypt the object. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * The server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerKey: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKey] = js.undefined
  
  /**
    * The MD5 server-side encryption (SSE) customer managed key. This parameter is needed only when the object was created using a checksum algorithm. For more information, see Protecting data using SSE-C keys in the Amazon S3 User Guide.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * ID for the initiated multipart upload.
    */
  var UploadId: MultipartUploadId
}
object CompleteMultipartUploadRequest {
  
  inline def apply(Bucket: BucketName, Key: ObjectKey, UploadId: MultipartUploadId): CompleteMultipartUploadRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any], Key = Key.asInstanceOf[js.Any], UploadId = UploadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompleteMultipartUploadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CompleteMultipartUploadRequest] (val x: Self) extends AnyVal {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32(value: ChecksumCRC32): Self = StObject.set(x, "ChecksumCRC32", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32C(value: ChecksumCRC32C): Self = StObject.set(x, "ChecksumCRC32C", value.asInstanceOf[js.Any])
    
    inline def setChecksumCRC32CUndefined: Self = StObject.set(x, "ChecksumCRC32C", js.undefined)
    
    inline def setChecksumCRC32Undefined: Self = StObject.set(x, "ChecksumCRC32", js.undefined)
    
    inline def setChecksumSHA1(value: ChecksumSHA1): Self = StObject.set(x, "ChecksumSHA1", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA1Undefined: Self = StObject.set(x, "ChecksumSHA1", js.undefined)
    
    inline def setChecksumSHA256(value: ChecksumSHA256): Self = StObject.set(x, "ChecksumSHA256", value.asInstanceOf[js.Any])
    
    inline def setChecksumSHA256Undefined: Self = StObject.set(x, "ChecksumSHA256", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setKey(value: ObjectKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setMultipartUpload(value: CompletedMultipartUpload): Self = StObject.set(x, "MultipartUpload", value.asInstanceOf[js.Any])
    
    inline def setMultipartUploadUndefined: Self = StObject.set(x, "MultipartUpload", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKey(value: SSECustomerKey): Self = StObject.set(x, "SSECustomerKey", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSECustomerKeyUndefined: Self = StObject.set(x, "SSECustomerKey", js.undefined)
    
    inline def setUploadId(value: MultipartUploadId): Self = StObject.set(x, "UploadId", value.asInstanceOf[js.Any])
  }
}
