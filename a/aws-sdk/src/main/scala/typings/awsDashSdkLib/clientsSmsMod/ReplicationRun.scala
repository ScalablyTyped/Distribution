package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationRun extends js.Object {
  /**
    * The identifier of the Amazon Machine Image (AMI) from the replication run.
    */
  var amiId: js.UndefOr[AmiId] = js.undefined
  /**
    * The completion time of the last replication run.
    */
  var completedTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The description of the replication run.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Whether the replication run should produce encrypted AMI or not. See also KmsKeyId below.
    */
  var encrypted: js.UndefOr[Encrypted] = js.undefined
  /**
    * KMS key ID for replication jobs that produce encrypted AMIs. Can be any of the following:    KMS key ID   KMS key alias   ARN referring to KMS key ID   ARN referring to KMS key alias    If encrypted is true but a KMS key id is not specified, the customer's default KMS key for EBS is used. 
    */
  var kmsKeyId: js.UndefOr[KmsKeyId] = js.undefined
  /**
    * The identifier of the replication run.
    */
  var replicationRunId: js.UndefOr[ReplicationRunId] = js.undefined
  /**
    * The start time of the next replication run.
    */
  var scheduledStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Details of the current stage of the replication run.
    */
  var stageDetails: js.UndefOr[ReplicationRunStageDetails] = js.undefined
  /**
    * The state of the replication run.
    */
  var state: js.UndefOr[ReplicationRunState] = js.undefined
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationRunStatusMessage] = js.undefined
  /**
    * The type of replication run.
    */
  var `type`: js.UndefOr[ReplicationRunType] = js.undefined
}

object ReplicationRun {
  @scala.inline
  def apply(
    amiId: AmiId = null,
    completedTime: Timestamp = null,
    description: Description = null,
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    replicationRunId: ReplicationRunId = null,
    scheduledStartTime: Timestamp = null,
    stageDetails: ReplicationRunStageDetails = null,
    state: ReplicationRunState = null,
    statusMessage: ReplicationRunStatusMessage = null,
    `type`: ReplicationRunType = null
  ): ReplicationRun = {
    val __obj = js.Dynamic.literal()
    if (amiId != null) __obj.updateDynamic("amiId")(amiId)
    if (completedTime != null) __obj.updateDynamic("completedTime")(completedTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (replicationRunId != null) __obj.updateDynamic("replicationRunId")(replicationRunId)
    if (scheduledStartTime != null) __obj.updateDynamic("scheduledStartTime")(scheduledStartTime)
    if (stageDetails != null) __obj.updateDynamic("stageDetails")(stageDetails)
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationRun]
  }
}

