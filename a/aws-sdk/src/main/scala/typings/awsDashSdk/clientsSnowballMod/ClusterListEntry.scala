package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterListEntry extends js.Object {
  /**
    * The 39-character ID for the cluster that you want to list, for example CID123e4567-e89b-12d3-a456-426655440000.
    */
  var ClusterId: js.UndefOr[String] = js.undefined
  /**
    * The current state of this cluster. For information about the state of a specific node, see JobListEntry$JobState.
    */
  var ClusterState: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.ClusterState] = js.undefined
  /**
    * The creation date for this cluster.
    */
  var CreationDate: js.UndefOr[Timestamp] = js.undefined
  /**
    * Defines an optional description of the cluster, for example Environmental Data Cluster-01.
    */
  var Description: js.UndefOr[String] = js.undefined
}

object ClusterListEntry {
  @scala.inline
  def apply(
    ClusterId: String = null,
    ClusterState: ClusterState = null,
    CreationDate: Timestamp = null,
    Description: String = null
  ): ClusterListEntry = {
    val __obj = js.Dynamic.literal()
    if (ClusterId != null) __obj.updateDynamic("ClusterId")(ClusterId)
    if (ClusterState != null) __obj.updateDynamic("ClusterState")(ClusterState.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[ClusterListEntry]
  }
}

