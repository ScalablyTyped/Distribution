package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReplicationJobRequest extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * When true, the replication job produces encrypted AMIs. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.undefined
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  /**
    * The name of the IAM role to be used by the AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.undefined
  /**
    * The seed replication time.
    */
  var seedReplicationTime: Timestamp
  /**
    * The identifier of the server.
    */
  var serverId: ServerId
}

object CreateReplicationJobRequest {
  @scala.inline
  def apply(
    seedReplicationTime: Timestamp,
    serverId: ServerId,
    description: Description = null,
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    frequency: js.UndefOr[Frequency] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    licenseType: LicenseType = null,
    numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
    roleName: RoleName = null,
    runOnce: js.UndefOr[RunOnce] = js.undefined
  ): CreateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(seedReplicationTime = seedReplicationTime, serverId = serverId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfRecentAmisToKeep)) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce)
    __obj.asInstanceOf[CreateReplicationJobRequest]
  }
}

