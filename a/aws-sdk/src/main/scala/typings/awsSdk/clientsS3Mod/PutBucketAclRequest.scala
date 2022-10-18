package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutBucketAclRequest extends StObject {
  
  /**
    * The canned ACL to apply to the bucket.
    */
  var ACL: js.UndefOr[BucketCannedACL] = js.undefined
  
  /**
    * Contains the elements that set the ACL permissions for an object per grantee.
    */
  var AccessControlPolicy: js.UndefOr[typings.awsSdk.clientsS3Mod.AccessControlPolicy] = js.undefined
  
  /**
    * The bucket to which to apply the ACL.
    */
  var Bucket: BucketName
  
  /**
    * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not provide any additional functionality if not using the SDK. When sending this header, there must be a corresponding x-amz-checksum or x-amz-trailer header sent. Otherwise, Amazon S3 fails the request with the HTTP status code 400 Bad Request. For more information, see Checking object integrity in the Amazon S3 User Guide. If you provide an individual checksum, Amazon S3 ignores any provided ChecksumAlgorithm parameter.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * The base64-encoded 128-bit MD5 digest of the data. This header must be used as a message integrity check to verify that the request body was not corrupted in transit. For more information, go to RFC 1864.  For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentMD5] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Allows grantee the read, write, read ACP, and write ACP permissions on the bucket.
    */
  var GrantFullControl: js.UndefOr[typings.awsSdk.clientsS3Mod.GrantFullControl] = js.undefined
  
  /**
    * Allows grantee to list the objects in the bucket.
    */
  var GrantRead: js.UndefOr[typings.awsSdk.clientsS3Mod.GrantRead] = js.undefined
  
  /**
    * Allows grantee to read the bucket ACL.
    */
  var GrantReadACP: js.UndefOr[typings.awsSdk.clientsS3Mod.GrantReadACP] = js.undefined
  
  /**
    * Allows grantee to create new objects in the bucket. For the bucket and object owners of existing objects, also allows deletions and overwrites of those objects.
    */
  var GrantWrite: js.UndefOr[typings.awsSdk.clientsS3Mod.GrantWrite] = js.undefined
  
  /**
    * Allows grantee to write the ACL for the applicable bucket.
    */
  var GrantWriteACP: js.UndefOr[typings.awsSdk.clientsS3Mod.GrantWriteACP] = js.undefined
}
object PutBucketAclRequest {
  
  inline def apply(Bucket: BucketName): PutBucketAclRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutBucketAclRequest]
  }
  
  extension [Self <: PutBucketAclRequest](x: Self) {
    
    inline def setACL(value: BucketCannedACL): Self = StObject.set(x, "ACL", value.asInstanceOf[js.Any])
    
    inline def setACLUndefined: Self = StObject.set(x, "ACL", js.undefined)
    
    inline def setAccessControlPolicy(value: AccessControlPolicy): Self = StObject.set(x, "AccessControlPolicy", value.asInstanceOf[js.Any])
    
    inline def setAccessControlPolicyUndefined: Self = StObject.set(x, "AccessControlPolicy", js.undefined)
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setGrantFullControl(value: GrantFullControl): Self = StObject.set(x, "GrantFullControl", value.asInstanceOf[js.Any])
    
    inline def setGrantFullControlUndefined: Self = StObject.set(x, "GrantFullControl", js.undefined)
    
    inline def setGrantRead(value: GrantRead): Self = StObject.set(x, "GrantRead", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACP(value: GrantReadACP): Self = StObject.set(x, "GrantReadACP", value.asInstanceOf[js.Any])
    
    inline def setGrantReadACPUndefined: Self = StObject.set(x, "GrantReadACP", js.undefined)
    
    inline def setGrantReadUndefined: Self = StObject.set(x, "GrantRead", js.undefined)
    
    inline def setGrantWrite(value: GrantWrite): Self = StObject.set(x, "GrantWrite", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACP(value: GrantWriteACP): Self = StObject.set(x, "GrantWriteACP", value.asInstanceOf[js.Any])
    
    inline def setGrantWriteACPUndefined: Self = StObject.set(x, "GrantWriteACP", js.undefined)
    
    inline def setGrantWriteUndefined: Self = StObject.set(x, "GrantWrite", js.undefined)
  }
}
