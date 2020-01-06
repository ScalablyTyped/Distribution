package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterMessage extends js.Object {
  /**
    * Contains a list of DB clusters for the user.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.native
  /**
    * A pagination token that can be used in a subsequent DescribeDBClusters request.
    */
  var Marker: js.UndefOr[String] = js.native
}

object DBClusterMessage {
  @scala.inline
  def apply(DBClusters: DBClusterList = null, Marker: String = null): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusters != null) __obj.updateDynamic("DBClusters")(DBClusters.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterMessage]
  }
}

