package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterVersion extends js.Object {
  /**
    * The name of the cluster parameter group family for the cluster.
    */
  var ClusterParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The version number used by the cluster.
    */
  var ClusterVersion: js.UndefOr[String] = js.undefined
  /**
    * The description of the cluster version.
    */
  var Description: js.UndefOr[String] = js.undefined
}

object ClusterVersion {
  @scala.inline
  def apply(
    ClusterParameterGroupFamily: String = null,
    ClusterVersion: String = null,
    Description: String = null
  ): ClusterVersion = {
    val __obj = js.Dynamic.literal()
    if (ClusterParameterGroupFamily != null) __obj.updateDynamic("ClusterParameterGroupFamily")(ClusterParameterGroupFamily)
    if (ClusterVersion != null) __obj.updateDynamic("ClusterVersion")(ClusterVersion)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    __obj.asInstanceOf[ClusterVersion]
  }
}

