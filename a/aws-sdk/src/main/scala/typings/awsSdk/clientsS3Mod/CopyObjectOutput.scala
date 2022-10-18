package typings.awsSdk.clientsS3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CopyObjectOutput extends StObject {
  
  /**
    * Indicates whether the copied object uses an S3 Bucket Key for server-side encryption with Amazon Web Services KMS (SSE-KMS).
    */
  var BucketKeyEnabled: js.UndefOr[typings.awsSdk.clientsS3Mod.BucketKeyEnabled] = js.undefined
  
  /**
    * Container for all response elements.
    */
  var CopyObjectResult: js.UndefOr[typings.awsSdk.clientsS3Mod.CopyObjectResult] = js.undefined
  
  /**
    * Version of the copied object in the destination bucket.
    */
  var CopySourceVersionId: js.UndefOr[typings.awsSdk.clientsS3Mod.CopySourceVersionId] = js.undefined
  
  /**
    * If the object expiration is configured, the response includes this header.
    */
  var Expiration: js.UndefOr[typings.awsSdk.clientsS3Mod.Expiration] = js.undefined
  
  var RequestCharged: js.UndefOr[typings.awsSdk.clientsS3Mod.RequestCharged] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header confirming the encryption algorithm used.
    */
  var SSECustomerAlgorithm: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerAlgorithm] = js.undefined
  
  /**
    * If server-side encryption with a customer-provided encryption key was requested, the response will include this header to provide round-trip message integrity verification of the customer-provided encryption key.
    */
  var SSECustomerKeyMD5: js.UndefOr[typings.awsSdk.clientsS3Mod.SSECustomerKeyMD5] = js.undefined
  
  /**
    * If present, specifies the Amazon Web Services KMS Encryption Context to use for object encryption. The value of this header is a base64-encoded UTF-8 string holding JSON with the encryption context key-value pairs.
    */
  var SSEKMSEncryptionContext: js.UndefOr[typings.awsSdk.clientsS3Mod.SSEKMSEncryptionContext] = js.undefined
  
  /**
    * If present, specifies the ID of the Amazon Web Services Key Management Service (Amazon Web Services KMS) symmetric customer managed key that was used for the object.
    */
  var SSEKMSKeyId: js.UndefOr[typings.awsSdk.clientsS3Mod.SSEKMSKeyId] = js.undefined
  
  /**
    * The server-side encryption algorithm used when storing this object in Amazon S3 (for example, AES256, aws:kms).
    */
  var ServerSideEncryption: js.UndefOr[typings.awsSdk.clientsS3Mod.ServerSideEncryption] = js.undefined
  
  /**
    * Version ID of the newly created copy.
    */
  var VersionId: js.UndefOr[ObjectVersionId] = js.undefined
}
object CopyObjectOutput {
  
  inline def apply(): CopyObjectOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CopyObjectOutput]
  }
  
  extension [Self <: CopyObjectOutput](x: Self) {
    
    inline def setBucketKeyEnabled(value: BucketKeyEnabled): Self = StObject.set(x, "BucketKeyEnabled", value.asInstanceOf[js.Any])
    
    inline def setBucketKeyEnabledUndefined: Self = StObject.set(x, "BucketKeyEnabled", js.undefined)
    
    inline def setCopyObjectResult(value: CopyObjectResult): Self = StObject.set(x, "CopyObjectResult", value.asInstanceOf[js.Any])
    
    inline def setCopyObjectResultUndefined: Self = StObject.set(x, "CopyObjectResult", js.undefined)
    
    inline def setCopySourceVersionId(value: CopySourceVersionId): Self = StObject.set(x, "CopySourceVersionId", value.asInstanceOf[js.Any])
    
    inline def setCopySourceVersionIdUndefined: Self = StObject.set(x, "CopySourceVersionId", js.undefined)
    
    inline def setExpiration(value: Expiration): Self = StObject.set(x, "Expiration", value.asInstanceOf[js.Any])
    
    inline def setExpirationUndefined: Self = StObject.set(x, "Expiration", js.undefined)
    
    inline def setRequestCharged(value: RequestCharged): Self = StObject.set(x, "RequestCharged", value.asInstanceOf[js.Any])
    
    inline def setRequestChargedUndefined: Self = StObject.set(x, "RequestCharged", js.undefined)
    
    inline def setSSECustomerAlgorithm(value: SSECustomerAlgorithm): Self = StObject.set(x, "SSECustomerAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerAlgorithmUndefined: Self = StObject.set(x, "SSECustomerAlgorithm", js.undefined)
    
    inline def setSSECustomerKeyMD5(value: SSECustomerKeyMD5): Self = StObject.set(x, "SSECustomerKeyMD5", value.asInstanceOf[js.Any])
    
    inline def setSSECustomerKeyMD5Undefined: Self = StObject.set(x, "SSECustomerKeyMD5", js.undefined)
    
    inline def setSSEKMSEncryptionContext(value: SSEKMSEncryptionContext): Self = StObject.set(x, "SSEKMSEncryptionContext", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSEncryptionContextUndefined: Self = StObject.set(x, "SSEKMSEncryptionContext", js.undefined)
    
    inline def setSSEKMSKeyId(value: SSEKMSKeyId): Self = StObject.set(x, "SSEKMSKeyId", value.asInstanceOf[js.Any])
    
    inline def setSSEKMSKeyIdUndefined: Self = StObject.set(x, "SSEKMSKeyId", js.undefined)
    
    inline def setServerSideEncryption(value: ServerSideEncryption): Self = StObject.set(x, "ServerSideEncryption", value.asInstanceOf[js.Any])
    
    inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "ServerSideEncryption", js.undefined)
    
    inline def setVersionId(value: ObjectVersionId): Self = StObject.set(x, "VersionId", value.asInstanceOf[js.Any])
    
    inline def setVersionIdUndefined: Self = StObject.set(x, "VersionId", js.undefined)
  }
}
