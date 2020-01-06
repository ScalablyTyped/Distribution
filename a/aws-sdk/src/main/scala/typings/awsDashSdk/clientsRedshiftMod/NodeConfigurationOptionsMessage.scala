package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeConfigurationOptionsMessage extends js.Object {
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.native
  /**
    * A list of valid node configurations.
    */
  var NodeConfigurationOptionList: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.NodeConfigurationOptionList] = js.native
}

object NodeConfigurationOptionsMessage {
  @scala.inline
  def apply(Marker: String = null, NodeConfigurationOptionList: NodeConfigurationOptionList = null): NodeConfigurationOptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (NodeConfigurationOptionList != null) __obj.updateDynamic("NodeConfigurationOptionList")(NodeConfigurationOptionList.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeConfigurationOptionsMessage]
  }
}

