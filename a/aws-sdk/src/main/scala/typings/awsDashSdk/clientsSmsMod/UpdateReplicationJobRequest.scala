package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateReplicationJobRequest extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * When true, the replication job produces encrypted AMIs . See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  /**
    * The time between consecutive replication runs, in hours.
    */
  var frequency: js.UndefOr[Frequency] = js.undefined
  /**
    *  KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The maximum number of SMS-created AMIs to retain. The oldest will be deleted once the maximum number is reached and a new AMI is created.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: ReplicationJobId
  /**
    * The name of the IAM role to be used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
}

object UpdateReplicationJobRequest {
  @scala.inline
  def apply(
    replicationJobId: ReplicationJobId,
    description: Description = null,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    frequency: Int | Double = null,
    kmsKeyId: KmsKeyId = null,
    licenseType: LicenseType = null,
    nextReplicationRunStartTime: Timestamp = null,
    numberOfRecentAmisToKeep: Int | Double = null,
    roleName: RoleName = null
  ): UpdateReplicationJobRequest = {
    val __obj = js.Dynamic.literal(replicationJobId = replicationJobId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (frequency != null) __obj.updateDynamic("frequency")(frequency.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (nextReplicationRunStartTime != null) __obj.updateDynamic("nextReplicationRunStartTime")(nextReplicationRunStartTime)
    if (numberOfRecentAmisToKeep != null) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep.asInstanceOf[js.Any])
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    __obj.asInstanceOf[UpdateReplicationJobRequest]
  }
}

