package typings.awsDashSdk.clientsCloudhsmv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cluster extends js.Object {
  /**
    * The cluster's backup policy.
    */
  var BackupPolicy: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.BackupPolicy] = js.undefined
  /**
    * Contains one or more certificates or a certificate signing request (CSR).
    */
  var Certificates: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Certificates] = js.undefined
  /**
    * The cluster's identifier (ID).
    */
  var ClusterId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.ClusterId] = js.undefined
  /**
    * The date and time when the cluster was created.
    */
  var CreateTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The type of HSM that the cluster contains.
    */
  var HsmType: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.HsmType] = js.undefined
  /**
    * Contains information about the HSMs in the cluster.
    */
  var Hsms: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.Hsms] = js.undefined
  /**
    * The default password for the cluster's Pre-Crypto Officer (PRECO) user.
    */
  var PreCoPassword: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.PreCoPassword] = js.undefined
  /**
    * The identifier (ID) of the cluster's security group.
    */
  var SecurityGroup: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.SecurityGroup] = js.undefined
  /**
    * The identifier (ID) of the backup used to create the cluster. This value exists only when the cluster was created from a backup.
    */
  var SourceBackupId: js.UndefOr[BackupId] = js.undefined
  /**
    * The cluster's state.
    */
  var State: js.UndefOr[ClusterState] = js.undefined
  /**
    * A description of the cluster's state.
    */
  var StateMessage: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.StateMessage] = js.undefined
  /**
    * A map of the cluster's subnets and their corresponding Availability Zones.
    */
  var SubnetMapping: js.UndefOr[ExternalSubnetMapping] = js.undefined
  /**
    * The identifier (ID) of the virtual private cloud (VPC) that contains the cluster.
    */
  var VpcId: js.UndefOr[typings.awsDashSdk.clientsCloudhsmv2Mod.VpcId] = js.undefined
}

object Cluster {
  @scala.inline
  def apply(
    BackupPolicy: BackupPolicy = null,
    Certificates: Certificates = null,
    ClusterId: ClusterId = null,
    CreateTimestamp: Timestamp = null,
    HsmType: HsmType = null,
    Hsms: Hsms = null,
    PreCoPassword: PreCoPassword = null,
    SecurityGroup: SecurityGroup = null,
    SourceBackupId: BackupId = null,
    State: ClusterState = null,
    StateMessage: StateMessage = null,
    SubnetMapping: ExternalSubnetMapping = null,
    VpcId: VpcId = null
  ): Cluster = {
    val __obj = js.Dynamic.literal()
    if (BackupPolicy != null) __obj.updateDynamic("BackupPolicy")(BackupPolicy.asInstanceOf[js.Any])
    if (Certificates != null) __obj.updateDynamic("Certificates")(Certificates)
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (CreateTimestamp != null) __obj.updateDynamic("CreateTimestamp")(CreateTimestamp)
    if (HsmType != null) __obj.updateDynamic("HsmType")(HsmType)
    if (Hsms != null) __obj.updateDynamic("Hsms")(Hsms)
    if (PreCoPassword != null) __obj.updateDynamic("PreCoPassword")(PreCoPassword)
    if (SecurityGroup != null) __obj.updateDynamic("SecurityGroup")(SecurityGroup)
    if (SourceBackupId != null) __obj.updateDynamic("SourceBackupId")(SourceBackupId)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateMessage != null) __obj.updateDynamic("StateMessage")(StateMessage)
    if (SubnetMapping != null) __obj.updateDynamic("SubnetMapping")(SubnetMapping)
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId)
    __obj.asInstanceOf[Cluster]
  }
}

