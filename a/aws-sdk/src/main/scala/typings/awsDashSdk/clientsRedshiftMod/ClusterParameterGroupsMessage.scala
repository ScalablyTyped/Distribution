package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterParameterGroupsMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
  /**
    * A list of ClusterParameterGroup instances. Each instance describes one cluster parameter group. 
    */
  var ParameterGroups: js.UndefOr[ParameterGroupList] = js.undefined
}

object ClusterParameterGroupsMessage {
  @scala.inline
  def apply(Marker: String = null, ParameterGroups: ParameterGroupList = null): ClusterParameterGroupsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (ParameterGroups != null) __obj.updateDynamic("ParameterGroups")(ParameterGroups)
    __obj.asInstanceOf[ClusterParameterGroupsMessage]
  }
}

