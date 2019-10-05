package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PendingModifiedValues extends js.Object {
  /**
    * The pending or in-progress change of the automated snapshot retention period.
    */
  var AutomatedSnapshotRetentionPeriod: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The pending or in-progress change of the new identifier for the cluster.
    */
  var ClusterIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The pending or in-progress change of the cluster type.
    */
  var ClusterType: js.UndefOr[String] = js.undefined
  /**
    * The pending or in-progress change of the service version.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  /**
    * The encryption type for a cluster. Possible values are: KMS and None. For the China region the possible values are None, and Legacy. 
    */
  var EncryptionType: js.UndefOr[String] = js.undefined
  /**
    * An option that specifies whether to create the cluster with enhanced VPC routing enabled. To create a cluster that uses enhanced VPC routing, the cluster must be in a VPC. For more information, see Enhanced VPC Routing in the Amazon Redshift Cluster Management Guide. If this option is true, enhanced VPC routing is enabled.  Default: false
    */
  var EnhancedVpcRouting: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The name of the maintenance track that the cluster will change to during the next maintenance window.
    */
  var MaintenanceTrackName: js.UndefOr[String] = js.undefined
  /**
    * The pending or in-progress change of the master user password for the cluster.
    */
  var MasterUserPassword: js.UndefOr[String] = js.undefined
  /**
    * The pending or in-progress change of the cluster's node type.
    */
  var NodeType: js.UndefOr[String] = js.undefined
  /**
    * The pending or in-progress change of the number of nodes in the cluster.
    */
  var NumberOfNodes: js.UndefOr[IntegerOptional] = js.undefined
  /**
    * The pending or in-progress change of the ability to connect to the cluster from the public network.
    */
  var PubliclyAccessible: js.UndefOr[BooleanOptional] = js.undefined
}

object PendingModifiedValues {
  @scala.inline
  def apply(
    AutomatedSnapshotRetentionPeriod: Int | scala.Double = null,
    ClusterIdentifier: String = null,
    ClusterType: String = null,
    ClusterVersion: String = null,
    EncryptionType: String = null,
    EnhancedVpcRouting: js.UndefOr[scala.Boolean] = js.undefined,
    MaintenanceTrackName: String = null,
    MasterUserPassword: String = null,
    NodeType: String = null,
    NumberOfNodes: Int | scala.Double = null,
    PubliclyAccessible: js.UndefOr[scala.Boolean] = js.undefined
  ): PendingModifiedValues = {
    val __obj = js.Dynamic.literal()
    if (AutomatedSnapshotRetentionPeriod != null) __obj.updateDynamic("AutomatedSnapshotRetentionPeriod")(AutomatedSnapshotRetentionPeriod.asInstanceOf[js.Any])
    if (ClusterIdentifier != null) __obj.updateDynamic("ClusterIdentifier")(ClusterIdentifier)
    if (ClusterType != null) __obj.updateDynamic("ClusterType")(ClusterType)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType)
    if (!js.isUndefined(EnhancedVpcRouting)) __obj.updateDynamic("EnhancedVpcRouting")(EnhancedVpcRouting)
    if (MaintenanceTrackName != null) __obj.updateDynamic("MaintenanceTrackName")(MaintenanceTrackName)
    if (MasterUserPassword != null) __obj.updateDynamic("MasterUserPassword")(MasterUserPassword)
    if (NodeType != null) __obj.updateDynamic("NodeType")(NodeType)
    if (NumberOfNodes != null) __obj.updateDynamic("NumberOfNodes")(NumberOfNodes.asInstanceOf[js.Any])
    if (!js.isUndefined(PubliclyAccessible)) __obj.updateDynamic("PubliclyAccessible")(PubliclyAccessible)
    __obj.asInstanceOf[PendingModifiedValues]
  }
}

