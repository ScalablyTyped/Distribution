package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationRun extends js.Object {
  /**
    * The identifier of the Amazon Machine Image (AMI) from the replication run.
    */
  var amiId: js.UndefOr[AmiId] = js.native
  /**
    * The completion time of the last replication run.
    */
  var completedTime: js.UndefOr[Timestamp] = js.native
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * Whether the replication run should produce encrypted AMI or not. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.native
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.native
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.native
  /**
    * The start time of the next replication run.
    */
  var scheduledStartTime: js.UndefOr[Timestamp] = js.native
  /**
    * Details of the current stage of the replication run.
    */
  var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.native
  /**
    * The state of the replication run.
    */
  var state: js.UndefOr[ReplicationRunState] = js.native
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.native
  /**
    * The type of replication run.
    */
  var `type`: js.UndefOr[ReplicationRunType] = js.native
}

object ReplicationRun {
  @scala.inline
  def apply(
    amiId: AmiId = null,
    completedTime: Timestamp = null,
    description: Description = null,
    encrypted: js.UndefOr[Boolean] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    replicationRunId: ReplicationRunId = null,
    scheduledStartTime: Timestamp = null,
    stageDetails: ReplicationRunStageDetails = null,
    state: ReplicationRunState = null,
    statusMessage: ReplicationRunStatusMessage = null,
    `type`: ReplicationRunType = null
  ): ReplicationRun = {
    val __obj = js.Dynamic.literal()
    if (amiId != null) __obj.updateDynamic("amiId")(amiId.asInstanceOf[js.Any])
    if (completedTime != null) __obj.updateDynamic("completedTime")(completedTime.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId.asInstanceOf[js.Any])
    if (replicationRunId != null) __obj.updateDynamic("replicationRunId")(replicationRunId.asInstanceOf[js.Any])
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime.asInstanceOf[js.Any])
    if (stageDetails != null) __obj.updateDynamic("stageDetails")(stageDetails.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRun]
  }
}

