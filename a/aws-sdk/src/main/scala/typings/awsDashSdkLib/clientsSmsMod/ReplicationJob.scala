package typings
package awsDashSdkLib.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationJob extends js.Object {
  /**
    * The description of the replication job.
    */
  var description: js.UndefOr[Description] = js.undefined
  /**
    * Whether the replication job should produce encrypted AMIs or not. See also KmsKeyId below.
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
    * The ID of the latest Amazon Machine Image (AMI).
    */
  var latestAmiId: js.UndefOr[AmiId] = js.undefined
  /**
    * The license type to be used for the AMI created by a successful replication run.
    */
  var licenseType: js.UndefOr[LicenseType] = js.undefined
  /**
    * The start time of the next replication run.
    */
  var nextReplicationRunStartTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Number of recent AMIs to keep in the customer's account for a replication job. By default the value is set to zero, meaning that all AMIs are kept.
    */
  var numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined
  /**
    * The identifier of the replication job.
    */
  var replicationJobId: js.UndefOr[ReplicationJobId] = js.undefined
  /**
    * Information about the replication runs.
    */
  var replicationRunList: js.UndefOr[ReplicationRunList] = js.undefined
  /**
    * The name of the IAM role to be used by the Server Migration Service.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * 
    */
  var runOnce: js.UndefOr[RunOnce] = js.undefined
  /**
    * The seed replication time.
    */
  var seedReplicationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The identifier of the server.
    */
  var serverId: js.UndefOr[ServerId] = js.undefined
  /**
    * The type of server.
    */
  var serverType: js.UndefOr[ServerType] = js.undefined
  /**
    * The state of the replication job.
    */
  var state: js.UndefOr[ReplicationJobState] = js.undefined
  /**
    * The description of the current status of the replication job.
    */
  var statusMessage: js.UndefOr[ReplicationJobStatusMessage] = js.undefined
  /**
    * Information about the VM server.
    */
  var vmServer: js.UndefOr[VmServer] = js.undefined
}

object ReplicationJob {
  @scala.inline
  def apply(
    description: Description = null,
    encrypted: js.UndefOr[Encrypted] = js.undefined,
    frequency: js.UndefOr[Frequency] = js.undefined,
    kmsKeyId: KmsKeyId = null,
    latestAmiId: AmiId = null,
    licenseType: LicenseType = null,
    nextReplicationRunStartTime: Timestamp = null,
    numberOfRecentAmisToKeep: js.UndefOr[NumberOfRecentAmisToKeep] = js.undefined,
    replicationJobId: ReplicationJobId = null,
    replicationRunList: ReplicationRunList = null,
    roleName: RoleName = null,
    runOnce: js.UndefOr[RunOnce] = js.undefined,
    seedReplicationTime: Timestamp = null,
    serverId: ServerId = null,
    serverType: ServerType = null,
    state: ReplicationJobState = null,
    statusMessage: ReplicationJobStatusMessage = null,
    vmServer: VmServer = null
  ): ReplicationJob = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(encrypted)) __obj.updateDynamic("encrypted")(encrypted)
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency)
    if (kmsKeyId != null) __obj.updateDynamic("kmsKeyId")(kmsKeyId)
    if (latestAmiId != null) __obj.updateDynamic("latestAmiId")(latestAmiId)
    if (licenseType != null) __obj.updateDynamic("licenseType")(licenseType.asInstanceOf[js.Any])
    if (nextReplicationRunStartTime != null) __obj.updateDynamic("nextReplicationRunStartTime")(nextReplicationRunStartTime)
    if (!js.isUndefined(numberOfRecentAmisToKeep)) __obj.updateDynamic("numberOfRecentAmisToKeep")(numberOfRecentAmisToKeep)
    if (replicationJobId != null) __obj.updateDynamic("replicationJobId")(replicationJobId)
    if (replicationRunList != null) __obj.updateDynamic("replicationRunList")(replicationRunList)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (!js.isUndefined(runOnce)) __obj.updateDynamic("runOnce")(runOnce)
    if (seedReplicationTime != null) __obj.updateDynamic("seedReplicationTime")(seedReplicationTime)
    if (serverId != null) __obj.updateDynamic("serverId")(serverId)
    if (serverType != null) __obj.updateDynamic("serverType")(serverType.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (vmServer != null) __obj.updateDynamic("vmServer")(vmServer)
    __obj.asInstanceOf[ReplicationJob]
  }
}

