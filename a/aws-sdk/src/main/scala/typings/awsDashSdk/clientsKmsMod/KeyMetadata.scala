package typings.awsDashSdk.clientsKmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyMetadata extends js.Object {
  /**
    * The twelve-digit account ID of the AWS account that owns the CMK.
    */
  var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the CMK. For examples, see AWS Key Management Service (AWS KMS) in the Example ARNs section of the AWS General Reference.
    */
  var Arn: js.UndefOr[ArnType] = js.undefined
  /**
    * The cluster ID of the AWS CloudHSM cluster that contains the key material for the CMK. When you create a CMK in a custom key store, AWS KMS creates the key material for the CMK in the associated AWS CloudHSM cluster. This value is present only when the CMK is created in a custom key store.
    */
  var CloudHsmClusterId: js.UndefOr[CloudHsmClusterIdType] = js.undefined
  /**
    * The date and time when the CMK was created.
    */
  var CreationDate: js.UndefOr[DateType] = js.undefined
  /**
    * A unique identifier for the custom key store that contains the CMK. This value is present only when the CMK is created in a custom key store.
    */
  var CustomKeyStoreId: js.UndefOr[CustomKeyStoreIdType] = js.undefined
  /**
    * The date and time after which AWS KMS deletes the CMK. This value is present only when KeyState is PendingDeletion.
    */
  var DeletionDate: js.UndefOr[DateType] = js.undefined
  /**
    * The description of the CMK.
    */
  var Description: js.UndefOr[DescriptionType] = js.undefined
  /**
    * Specifies whether the CMK is enabled. When KeyState is Enabled this value is true, otherwise it is false.
    */
  var Enabled: js.UndefOr[BooleanType] = js.undefined
  /**
    * Specifies whether the CMK's key material expires. This value is present only when Origin is EXTERNAL, otherwise this value is omitted.
    */
  var ExpirationModel: js.UndefOr[ExpirationModelType] = js.undefined
  /**
    * The globally unique identifier for the CMK.
    */
  var KeyId: KeyIdType
  /**
    * The manager of the CMK. CMKs in your AWS account are either customer managed or AWS managed. For more information about the difference, see Customer Master Keys in the AWS Key Management Service Developer Guide.
    */
  var KeyManager: js.UndefOr[KeyManagerType] = js.undefined
  /**
    * The state of the CMK. For more information about how key state affects the use of a CMK, see How Key State Affects the Use of a Customer Master Key in the AWS Key Management Service Developer Guide.
    */
  var KeyState: js.UndefOr[typings.awsDashSdk.clientsKmsMod.KeyState] = js.undefined
  /**
    * The cryptographic operations for which you can use the CMK. The only valid value is ENCRYPT_DECRYPT, which means you can use the CMK to encrypt and decrypt data.
    */
  var KeyUsage: js.UndefOr[KeyUsageType] = js.undefined
  /**
    * The source of the CMK's key material. When this value is AWS_KMS, AWS KMS created the key material. When this value is EXTERNAL, the key material was imported from your existing key management infrastructure or the CMK lacks key material. When this value is AWS_CLOUDHSM, the key material was created in the AWS CloudHSM cluster associated with a custom key store.
    */
  var Origin: js.UndefOr[OriginType] = js.undefined
  /**
    * The time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. This value is present only for CMKs whose Origin is EXTERNAL and whose ExpirationModel is KEY_MATERIAL_EXPIRES, otherwise this value is omitted.
    */
  var ValidTo: js.UndefOr[DateType] = js.undefined
}

object KeyMetadata {
  @scala.inline
  def apply(
    KeyId: KeyIdType,
    AWSAccountId: AWSAccountIdType = null,
    Arn: ArnType = null,
    CloudHsmClusterId: CloudHsmClusterIdType = null,
    CreationDate: DateType = null,
    CustomKeyStoreId: CustomKeyStoreIdType = null,
    DeletionDate: DateType = null,
    Description: DescriptionType = null,
    Enabled: js.UndefOr[Boolean] = js.undefined,
    ExpirationModel: ExpirationModelType = null,
    KeyManager: KeyManagerType = null,
    KeyState: KeyState = null,
    KeyUsage: KeyUsageType = null,
    Origin: OriginType = null,
    ValidTo: DateType = null
  ): KeyMetadata = {
    val __obj = js.Dynamic.literal(KeyId = KeyId)
    if (AWSAccountId != null) __obj.updateDynamic("AWSAccountId")(AWSAccountId)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CloudHsmClusterId != null) __obj.updateDynamic("CloudHsmClusterId")(CloudHsmClusterId)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (CustomKeyStoreId != null) __obj.updateDynamic("CustomKeyStoreId")(CustomKeyStoreId)
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    if (ExpirationModel != null) __obj.updateDynamic("ExpirationModel")(ExpirationModel.asInstanceOf[js.Any])
    if (KeyManager != null) __obj.updateDynamic("KeyManager")(KeyManager.asInstanceOf[js.Any])
    if (KeyState != null) __obj.updateDynamic("KeyState")(KeyState.asInstanceOf[js.Any])
    if (KeyUsage != null) __obj.updateDynamic("KeyUsage")(KeyUsage.asInstanceOf[js.Any])
    if (Origin != null) __obj.updateDynamic("Origin")(Origin.asInstanceOf[js.Any])
    if (ValidTo != null) __obj.updateDynamic("ValidTo")(ValidTo)
    __obj.asInstanceOf[KeyMetadata]
  }
}

