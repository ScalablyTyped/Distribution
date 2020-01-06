package typings.awsDashSdk.clientsSecretsmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSecretResponse extends js.Object {
  /**
    * The ARN of the secret.
    */
  var ARN: js.UndefOr[SecretARNType] = js.native
  /**
    * This value exists if the secret is scheduled for deletion. Some time after the specified date and time, Secrets Manager deletes the secret and all of its versions. If a secret is scheduled for deletion, then its details, including the encrypted secret information, is not accessible. To cancel a scheduled deletion and restore access, use RestoreSecret.
    */
  var DeletedDate: js.UndefOr[DeletedDateType] = js.native
  /**
    * The user-provided description of the secret.
    */
  var Description: js.UndefOr[DescriptionType] = js.native
  /**
    * The ARN or alias of the AWS KMS customer master key (CMK) that's used to encrypt the SecretString or SecretBinary fields in each version of the secret. If you don't provide a key, then Secrets Manager defaults to encrypting the secret fields with the default AWS KMS CMK (the one named awssecretsmanager) for this account.
    */
  var KmsKeyId: js.UndefOr[KmsKeyIdType] = js.native
  /**
    * The last date that this secret was accessed. This value is truncated to midnight of the date and therefore shows only the date, not the time.
    */
  var LastAccessedDate: js.UndefOr[LastAccessedDateType] = js.native
  /**
    * The last date and time that this secret was modified in any way.
    */
  var LastChangedDate: js.UndefOr[LastChangedDateType] = js.native
  /**
    * The most recent date and time that the Secrets Manager rotation process was successfully completed. This value is null if the secret has never rotated.
    */
  var LastRotatedDate: js.UndefOr[LastRotatedDateType] = js.native
  /**
    * The user-provided friendly name of the secret.
    */
  var Name: js.UndefOr[SecretNameType] = js.native
  var OwningService: js.UndefOr[OwningServiceType] = js.native
  /**
    * Specifies whether automatic rotation is enabled for this secret. To enable rotation, use RotateSecret with AutomaticallyRotateAfterDays set to a value greater than 0. To disable rotation, use CancelRotateSecret.
    */
  var RotationEnabled: js.UndefOr[RotationEnabledType] = js.native
  /**
    * The ARN of a Lambda function that's invoked by Secrets Manager to rotate the secret either automatically per the schedule or manually by a call to RotateSecret.
    */
  var RotationLambdaARN: js.UndefOr[RotationLambdaARNType] = js.native
  /**
    * A structure that contains the rotation configuration for this secret.
    */
  var RotationRules: js.UndefOr[RotationRulesType] = js.native
  /**
    * The list of user-defined tags that are associated with the secret. To add tags to a secret, use TagResource. To remove tags, use UntagResource.
    */
  var Tags: js.UndefOr[TagListType] = js.native
  /**
    * A list of all of the currently assigned VersionStage staging labels and the VersionId that each is attached to. Staging labels are used to keep track of the different versions during the rotation process.  A version that does not have any staging labels attached is considered deprecated and subject to deletion. Such versions are not included in this list. 
    */
  var VersionIdsToStages: js.UndefOr[SecretVersionsToStagesMapType] = js.native
}

object DescribeSecretResponse {
  @scala.inline
  def apply(
    ARN: SecretARNType = null,
    DeletedDate: DeletedDateType = null,
    Description: DescriptionType = null,
    KmsKeyId: KmsKeyIdType = null,
    LastAccessedDate: LastAccessedDateType = null,
    LastChangedDate: LastChangedDateType = null,
    LastRotatedDate: LastRotatedDateType = null,
    Name: SecretNameType = null,
    OwningService: OwningServiceType = null,
    RotationEnabled: js.UndefOr[Boolean] = js.undefined,
    RotationLambdaARN: RotationLambdaARNType = null,
    RotationRules: RotationRulesType = null,
    Tags: TagListType = null,
    VersionIdsToStages: SecretVersionsToStagesMapType = null
  ): DescribeSecretResponse = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN.asInstanceOf[js.Any])
    if (DeletedDate != null) __obj.updateDynamic("DeletedDate")(DeletedDate.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (KmsKeyId != null) __obj.updateDynamic("KmsKeyId")(KmsKeyId.asInstanceOf[js.Any])
    if (LastAccessedDate != null) __obj.updateDynamic("LastAccessedDate")(LastAccessedDate.asInstanceOf[js.Any])
    if (LastChangedDate != null) __obj.updateDynamic("LastChangedDate")(LastChangedDate.asInstanceOf[js.Any])
    if (LastRotatedDate != null) __obj.updateDynamic("LastRotatedDate")(LastRotatedDate.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (OwningService != null) __obj.updateDynamic("OwningService")(OwningService.asInstanceOf[js.Any])
    if (!js.isUndefined(RotationEnabled)) __obj.updateDynamic("RotationEnabled")(RotationEnabled.asInstanceOf[js.Any])
    if (RotationLambdaARN != null) __obj.updateDynamic("RotationLambdaARN")(RotationLambdaARN.asInstanceOf[js.Any])
    if (RotationRules != null) __obj.updateDynamic("RotationRules")(RotationRules.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VersionIdsToStages != null) __obj.updateDynamic("VersionIdsToStages")(VersionIdsToStages.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSecretResponse]
  }
}

