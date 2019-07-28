package typings.awsDashSdk.clientsSmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppSummary extends js.Object {
  /**
    * Unique ID of the application.
    */
  var appId: js.UndefOr[AppId] = js.undefined
  /**
    * Time of creation of this application.
    */
  var creationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Description of the application.
    */
  var description: js.UndefOr[AppDescription] = js.undefined
  /**
    * Timestamp of the application's creation.
    */
  var lastModified: js.UndefOr[Timestamp] = js.undefined
  /**
    * Timestamp of the application's most recent successful replication.
    */
  var latestReplicationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * Details about the latest launch of the application.
    */
  var launchDetails: js.UndefOr[LaunchDetails] = js.undefined
  /**
    * Launch status of the application.
    */
  var launchStatus: js.UndefOr[AppLaunchStatus] = js.undefined
  /**
    * A message related to the launch status of the application.
    */
  var launchStatusMessage: js.UndefOr[AppLaunchStatusMessage] = js.undefined
  /**
    * Name of the application.
    */
  var name: js.UndefOr[AppName] = js.undefined
  /**
    * Replication status of the application.
    */
  var replicationStatus: js.UndefOr[AppReplicationStatus] = js.undefined
  /**
    * A message related to the replication status of the application.
    */
  var replicationStatusMessage: js.UndefOr[AppReplicationStatusMessage] = js.undefined
  /**
    * Name of the service role in the customer's account used by AWS SMS.
    */
  var roleName: js.UndefOr[RoleName] = js.undefined
  /**
    * Status of the application.
    */
  var status: js.UndefOr[AppStatus] = js.undefined
  /**
    * A message related to the status of the application
    */
  var statusMessage: js.UndefOr[AppStatusMessage] = js.undefined
  /**
    * Number of server groups present in the application.
    */
  var totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined
  /**
    * Number of servers present in the application.
    */
  var totalServers: js.UndefOr[TotalServers] = js.undefined
}

object AppSummary {
  @scala.inline
  def apply(
    appId: AppId = null,
    creationTime: Timestamp = null,
    description: AppDescription = null,
    lastModified: Timestamp = null,
    latestReplicationTime: Timestamp = null,
    launchDetails: LaunchDetails = null,
    launchStatus: AppLaunchStatus = null,
    launchStatusMessage: AppLaunchStatusMessage = null,
    name: AppName = null,
    replicationStatus: AppReplicationStatus = null,
    replicationStatusMessage: AppReplicationStatusMessage = null,
    roleName: RoleName = null,
    status: AppStatus = null,
    statusMessage: AppStatusMessage = null,
    totalServerGroups: js.UndefOr[TotalServerGroups] = js.undefined,
    totalServers: js.UndefOr[TotalServers] = js.undefined
  ): AppSummary = {
    val __obj = js.Dynamic.literal()
    if (appId != null) __obj.updateDynamic("appId")(appId)
    if (creationTime != null) __obj.updateDynamic("creationTime")(creationTime)
    if (description != null) __obj.updateDynamic("description")(description)
    if (lastModified != null) __obj.updateDynamic("lastModified")(lastModified)
    if (latestReplicationTime != null) __obj.updateDynamic("latestReplicationTime")(latestReplicationTime)
    if (launchDetails != null) __obj.updateDynamic("launchDetails")(launchDetails)
    if (launchStatus != null) __obj.updateDynamic("launchStatus")(launchStatus.asInstanceOf[js.Any])
    if (launchStatusMessage != null) __obj.updateDynamic("launchStatusMessage")(launchStatusMessage)
    if (name != null) __obj.updateDynamic("name")(name)
    if (replicationStatus != null) __obj.updateDynamic("replicationStatus")(replicationStatus.asInstanceOf[js.Any])
    if (replicationStatusMessage != null) __obj.updateDynamic("replicationStatusMessage")(replicationStatusMessage)
    if (roleName != null) __obj.updateDynamic("roleName")(roleName)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (statusMessage != null) __obj.updateDynamic("statusMessage")(statusMessage)
    if (!js.isUndefined(totalServerGroups)) __obj.updateDynamic("totalServerGroups")(totalServerGroups)
    if (!js.isUndefined(totalServers)) __obj.updateDynamic("totalServers")(totalServers)
    __obj.asInstanceOf[AppSummary]
  }
}

