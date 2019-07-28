package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroup extends js.Object {
  /**
    * The description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.undefined
  /**
    * The name of the cluster parameter group family that this cluster parameter group is compatible with.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.undefined
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.undefined
  /**
    * The list of tags for the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object ClusterParameterGroup {
  @scala.inline
  def apply(
    Description: String = null,
    ParameterGroupFamily: String = null,
    ParameterGroupName: String = null,
    Tags: TagList = null
  ): ClusterParameterGroup = {
    val __obj = js.Dynamic.literal()
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (ParameterGroupFamily != null) __obj.updateDynamic("ParameterGroupFamily")(ParameterGroupFamily)
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[ClusterParameterGroup]
  }
}

