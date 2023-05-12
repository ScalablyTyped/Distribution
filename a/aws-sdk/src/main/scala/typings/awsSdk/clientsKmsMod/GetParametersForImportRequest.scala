package typings.awsSdk.clientsKmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetParametersForImportRequest extends StObject {
  
  /**
    * The identifier of the symmetric encryption KMS key into which you will import key material. The Origin of the KMS key must be EXTERNAL. Specify the key ID or key ARN of the KMS key. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a KMS key, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  
  /**
    * The algorithm you will use to encrypt the key material before using the ImportKeyMaterial operation to import it. For more information, see Encrypt the key material in the Key Management Service Developer Guide.  The RSAES_PKCS1_V1_5 wrapping algorithm is deprecated. We recommend that you begin using a different wrapping algorithm immediately. KMS will end support for RSAES_PKCS1_V1_5 by October 1, 2023 pursuant to cryptographic key management guidance from the National Institute of Standards and Technology (NIST). 
    */
  var WrappingAlgorithm: AlgorithmSpec
  
  /**
    * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
    */
  var WrappingKeySpec: typings.awsSdk.clientsKmsMod.WrappingKeySpec
}
object GetParametersForImportRequest {
  
  inline def apply(KeyId: KeyIdType, WrappingAlgorithm: AlgorithmSpec, WrappingKeySpec: WrappingKeySpec): GetParametersForImportRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any], WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParametersForImportRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetParametersForImportRequest] (val x: Self) extends AnyVal {
    
    inline def setKeyId(value: KeyIdType): Self = StObject.set(x, "KeyId", value.asInstanceOf[js.Any])
    
    inline def setWrappingAlgorithm(value: AlgorithmSpec): Self = StObject.set(x, "WrappingAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setWrappingKeySpec(value: WrappingKeySpec): Self = StObject.set(x, "WrappingKeySpec", value.asInstanceOf[js.Any])
  }
}
