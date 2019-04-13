package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterSecurityGroupMessage extends js.Object {
  /**
    * A list of ClusterSecurityGroup instances. 
    */
  var ClusterSecurityGroups: js.UndefOr[ClusterSecurityGroups] = js.undefined
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object ClusterSecurityGroupMessage {
  @scala.inline
  def apply(ClusterSecurityGroups: ClusterSecurityGroups = null, Marker: String = null): ClusterSecurityGroupMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterSecurityGroups != null) __obj.updateDynamic("ClusterSecurityGroups")(ClusterSecurityGroups)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ClusterSecurityGroupMessage]
  }
}

