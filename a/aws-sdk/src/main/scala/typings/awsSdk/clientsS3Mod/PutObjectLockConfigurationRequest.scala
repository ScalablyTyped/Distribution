package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutObjectLockConfigurationRequest extends StObject {
  
  /**
    * The bucket whose Object Lock configuration you want to create or replace.
    */
  var Bucket: BucketName
  
  /**
    * Indicates the algorithm used to create the checksum for the object when using the SDK. This header will not provide any additional functionality if not using the SDK. When sending this header, there must be a corresponding x-amz-checksum or x-amz-trailer header sent. Otherwise, Amazon S3 fails the request with the HTTP status code 400 Bad Request. For more information, see Checking object integrity in the Amazon S3 User Guide. If you provide an individual checksum, Amazon S3 ignores any provided ChecksumAlgorithm parameter.
    */
  var ChecksumAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.ChecksumAlgorithm] = js.undefined
  
  /**
    * The MD5 hash for the request body. For requests made using the Amazon Web Services Command Line Interface (CLI) or Amazon Web Services SDKs, this field is calculated automatically.
    */
  var ContentMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.ContentMD5] = js.undefined
  
  /**
    * The account ID of the expected bucket owner. If the bucket is owned by a different account, the request fails with the HTTP status code 403 Forbidden (access denied).
    */
  var ExpectedBucketOwner: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The Object Lock configuration that you want to apply to the specified bucket.
    */
  var ObjectLockConfiguration: js.UndefOr[typings.awsSdk.clientsS3Mod.ObjectLockConfiguration] = js.undefined
  
  var RequestPayer: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestPayer] = js.undefined
  
  /**
    * A token to allow Object Lock to be enabled for an existing bucket.
    */
  var Token: js.UndefOr[ObjectLockToken] = js.undefined
}
object PutObjectLockConfigurationRequest {
  
  inline def apply(Bucket: BucketName): PutObjectLockConfigurationRequest = {
    val __obj = js.Dynamic.literal(Bucket = Bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutObjectLockConfigurationRequest]
  }
  
  extension [Self <: PutObjectLockConfigurationRequest](x: Self) {
    
    inline def setBucket(value: BucketName): Self = StObject.set(x, "Bucket", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithm(value: ChecksumAlgorithm): Self = StObject.set(x, "ChecksumAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setChecksumAlgorithmUndefined: Self = StObject.set(x, "ChecksumAlgorithm", js.undefined)
    
    inline def setContentMD5(value: ContentMD5): Self = StObject.set(x, "ContentMD5", value.asInstanceOf[js.Any])
    
    inline def setContentMD5Undefined: Self = StObject.set(x, "ContentMD5", js.undefined)
    
    inline def setExpectedBucketOwner(value: AccountId): Self = StObject.set(x, "ExpectedBucketOwner", value.asInstanceOf[js.Any])
    
    inline def setExpectedBucketOwnerUndefined: Self = StObject.set(x, "ExpectedBucketOwner", js.undefined)
    
    inline def setObjectLockConfiguration(value: ObjectLockConfiguration): Self = StObject.set(x, "ObjectLockConfiguration", value.asInstanceOf[js.Any])
    
    inline def setObjectLockConfigurationUndefined: Self = StObject.set(x, "ObjectLockConfiguration", js.undefined)
    
    inline def setRequestPayer(value: RequestPayer): Self = StObject.set(x, "RequestPayer", value.asInstanceOf[js.Any])
    
    inline def setRequestPayerUndefined: Self = StObject.set(x, "RequestPayer", js.undefined)
    
    inline def setToken(value: ObjectLockToken): Self = StObject.set(x, "Token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "Token", js.undefined)
  }
}
