package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClusterVersionsMessage extends js.Object {
  /**
    * A list of Version elements. 
    */
  var ClusterVersions: js.UndefOr[ClusterVersionList] = js.undefined
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object ClusterVersionsMessage {
  @scala.inline
  def apply(ClusterVersions: ClusterVersionList = null, Marker: String = null): ClusterVersionsMessage = {
    val __obj = js.Dynamic.literal()
    if (ClusterVersions != null) __obj.updateDynamic("ClusterVersions")(ClusterVersions)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[ClusterVersionsMessage]
  }
}

