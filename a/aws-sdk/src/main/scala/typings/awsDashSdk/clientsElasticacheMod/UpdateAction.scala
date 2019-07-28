package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateAction extends js.Object {
  /**
    * The estimated length of time for the update to complete
    */
  var EstimatedUpdateTime: js.UndefOr[String] = js.undefined
  /**
    * The status of the service update on the node group
    */
  var NodeGroupUpdateStatus: js.UndefOr[NodeGroupUpdateStatusList] = js.undefined
  /**
    * The progress of the service update on the replication group
    */
  var NodesUpdated: js.UndefOr[String] = js.undefined
  /**
    * The ID of the replication group
    */
  var ReplicationGroupId: js.UndefOr[String] = js.undefined
  /**
    * The unique ID of the service update
    */
  var ServiceUpdateName: js.UndefOr[String] = js.undefined
  /**
    * The recommended date to apply the service update to ensure compliance. For information on compliance, see Self-Service Security Updates for Compliance.
    */
  var ServiceUpdateRecommendedApplyByDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The date the update is first available
    */
  var ServiceUpdateReleaseDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The severity of the service update
    */
  var ServiceUpdateSeverity: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ServiceUpdateSeverity] = js.undefined
  /**
    * The status of the service update
    */
  var ServiceUpdateStatus: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ServiceUpdateStatus] = js.undefined
  /**
    * Reflects the nature of the service update 
    */
  var ServiceUpdateType: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.ServiceUpdateType] = js.undefined
  /**
    * If yes, all nodes in the replication group have been updated by the recommended apply-by date. If no, at least one node in the replication group have not been updated by the recommended apply-by date. If N/A, the replication group was created after the recommended apply-by date.
    */
  var SlaMet: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.SlaMet] = js.undefined
  /**
    * The date that the service update is available to a replication group
    */
  var UpdateActionAvailableDate: js.UndefOr[TStamp] = js.undefined
  /**
    * The status of the update action
    */
  var UpdateActionStatus: js.UndefOr[typings.awsDashSdk.clientsElasticacheMod.UpdateActionStatus] = js.undefined
  /**
    * The date when the UpdateActionStatus was last modified
    */
  var UpdateActionStatusModifiedDate: js.UndefOr[TStamp] = js.undefined
}

object UpdateAction {
  @scala.inline
  def apply(
    EstimatedUpdateTime: String = null,
    NodeGroupUpdateStatus: NodeGroupUpdateStatusList = null,
    NodesUpdated: String = null,
    ReplicationGroupId: String = null,
    ServiceUpdateName: String = null,
    ServiceUpdateRecommendedApplyByDate: TStamp = null,
    ServiceUpdateReleaseDate: TStamp = null,
    ServiceUpdateSeverity: ServiceUpdateSeverity = null,
    ServiceUpdateStatus: ServiceUpdateStatus = null,
    ServiceUpdateType: ServiceUpdateType = null,
    SlaMet: SlaMet = null,
    UpdateActionAvailableDate: TStamp = null,
    UpdateActionStatus: UpdateActionStatus = null,
    UpdateActionStatusModifiedDate: TStamp = null
  ): UpdateAction = {
    val __obj = js.Dynamic.literal()
    if (EstimatedUpdateTime != null) __obj.updateDynamic("EstimatedUpdateTime")(EstimatedUpdateTime)
    if (NodeGroupUpdateStatus != null) __obj.updateDynamic("NodeGroupUpdateStatus")(NodeGroupUpdateStatus)
    if (NodesUpdated != null) __obj.updateDynamic("NodesUpdated")(NodesUpdated)
    if (ReplicationGroupId != null) __obj.updateDynamic("ReplicationGroupId")(ReplicationGroupId)
    if (ServiceUpdateName != null) __obj.updateDynamic("ServiceUpdateName")(ServiceUpdateName)
    if (ServiceUpdateRecommendedApplyByDate != null) __obj.updateDynamic("ServiceUpdateRecommendedApplyByDate")(ServiceUpdateRecommendedApplyByDate)
    if (ServiceUpdateReleaseDate != null) __obj.updateDynamic("ServiceUpdateReleaseDate")(ServiceUpdateReleaseDate)
    if (ServiceUpdateSeverity != null) __obj.updateDynamic("ServiceUpdateSeverity")(ServiceUpdateSeverity.asInstanceOf[js.Any])
    if (ServiceUpdateStatus != null) __obj.updateDynamic("ServiceUpdateStatus")(ServiceUpdateStatus.asInstanceOf[js.Any])
    if (ServiceUpdateType != null) __obj.updateDynamic("ServiceUpdateType")(ServiceUpdateType.asInstanceOf[js.Any])
    if (SlaMet != null) __obj.updateDynamic("SlaMet")(SlaMet.asInstanceOf[js.Any])
    if (UpdateActionAvailableDate != null) __obj.updateDynamic("UpdateActionAvailableDate")(UpdateActionAvailableDate)
    if (UpdateActionStatus != null) __obj.updateDynamic("UpdateActionStatus")(UpdateActionStatus.asInstanceOf[js.Any])
    if (UpdateActionStatusModifiedDate != null) __obj.updateDynamic("UpdateActionStatusModifiedDate")(UpdateActionStatusModifiedDate)
    __obj.asInstanceOf[UpdateAction]
  }
}

