package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterParameterGroup extends js.Object {
  /**
    * The description of the parameter group.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group family that this cluster parameter group is compatible with.
    */
  var ParameterGroupFamily: js.UndefOr[String] = js.native
  /**
    * The name of the cluster parameter group.
    */
  var ParameterGroupName: js.UndefOr[String] = js.native
  /**
    * The list of tags for the cluster parameter group.
    */
  var Tags: js.UndefOr[TagList] = js.native
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
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (ParameterGroupFamily != null) __obj.updateDynamic("ParameterGroupFamily")(ParameterGroupFamily.asInstanceOf[js.Any])
    if (ParameterGroupName != null) __obj.updateDynamic("ParameterGroupName")(ParameterGroupName.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterParameterGroup]
  }
}

