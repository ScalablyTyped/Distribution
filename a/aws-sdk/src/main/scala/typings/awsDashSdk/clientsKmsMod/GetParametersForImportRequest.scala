package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParametersForImportRequest extends js.Object {
  /**
    * The identifier of the CMK into which you will import key material. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  /**
    * The algorithm you will use to encrypt the key material before importing it with ImportKeyMaterial. For more information, see Encrypt the Key Material in the AWS Key Management Service Developer Guide.
    */
  var WrappingAlgorithm: AlgorithmSpec
  /**
    * The type of wrapping key (public key) to return in the response. Only 2048-bit RSA public keys are supported.
    */
  var WrappingKeySpec: typings.awsDashSdk.clientsKmsMod.WrappingKeySpec
}

object GetParametersForImportRequest {
  @scala.inline
  def apply(KeyId: KeyIdType, WrappingAlgorithm: AlgorithmSpec, WrappingKeySpec: WrappingKeySpec): GetParametersForImportRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId, WrappingAlgorithm = WrappingAlgorithm.asInstanceOf[js.Any], WrappingKeySpec = WrappingKeySpec.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetParametersForImportRequest]
  }
}

