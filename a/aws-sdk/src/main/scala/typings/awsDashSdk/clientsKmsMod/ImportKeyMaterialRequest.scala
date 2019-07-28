package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImportKeyMaterialRequest extends js.Object {
  /**
    * The encrypted key material to import. It must be encrypted with the public key that you received in the response to a previous GetParametersForImport request, using the wrapping algorithm that you specified in that request.
    */
  var EncryptedKeyMaterial: CiphertextType
  /**
    * Specifies whether the key material expires. The default is KEY_MATERIAL_EXPIRES, in which case you must include the ValidTo parameter. When this parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE, you must omit the ValidTo parameter.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
  /**
    * The import token that you received in the response to a previous GetParametersForImport request. It must be from the same response that contained the public key that you used to encrypt the key material.
    */
  var ImportToken: CiphertextType
  /**
    * The identifier of the CMK to import the key material into. The CMK's Origin must be EXTERNAL. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. You must omit this parameter when the ExpirationModel parameter is set to KEY_MATERIAL_DOES_NOT_EXPIRE. Otherwise it is required.
    */
  var ValidTo: js.UndefOr[DateType] = js.undefined
}

object ImportKeyMaterialRequest {
  @scala.inline
  def apply(
    EncryptedKeyMaterial: CiphertextType,
    ImportToken: CiphertextType,
    KeyId: KeyIdType,
    ExpirationModel: ExpirationModelType = null,
    ValidTo: DateType = null
  ): ImportKeyMaterialRequest = {
    val __obj = js.Dynamic.literal(EncryptedKeyMaterial = EncryptedKeyMaterial.asInstanceOf[js.Any], ImportToken = ImportToken.asInstanceOf[js.Any], KeyId = KeyId)
    if (ExpirationModel != null) __obj.updateDynamic("ExpirationModel")(ExpirationModel.asInstanceOf[js.Any])
    if (ValidTo != null) __obj.updateDynamic("ValidTo")(ValidTo)
    __obj.asInstanceOf[ImportKeyMaterialRequest]
  }
}

