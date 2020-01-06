package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterVersion extends js.Object {
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.native
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.native
}

object ClusterVersion {
  @scala.inline
  def apply(
    ClusterParameterGroupFamily: String = null,
    ClusterVersion: String = null,
    Description: String = null
  ): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterGroupFamily != null) __obj.updateDynamic("ClusterParameterGroupFamily")(ClusterParameterGroupFamily.asInstanceOf[js.Any])
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterVersion]
  }
}

