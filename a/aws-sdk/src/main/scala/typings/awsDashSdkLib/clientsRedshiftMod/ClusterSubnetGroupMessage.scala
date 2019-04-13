package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSubnetGroupMessage extends js.Object {
  /**
    * A list of ClusterSubnetGroup instances. 
    */
  var ClusterSubnetGroups: js.UndefOr[ClusterSubnetGroups] = js.undefined
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object ClusterSubnetGroupMessage {
  @scala.inline
  def apply(ClusterSubnetGroups: ClusterSubnetGroups = null, Marker: String = null): ClusterSubnetGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterSubnetGroups != null) __obj.updateDynamic("ClusterSubnetGroups")(ClusterSubnetGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ClusterSubnetGroupMessage]
  }
}

