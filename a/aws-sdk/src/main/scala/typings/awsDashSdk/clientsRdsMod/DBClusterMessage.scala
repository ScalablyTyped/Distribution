package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterMessage extends js.Object {
  /**
    * Contains a list of DB clusters for the user.
    */
  var DBClusters: js.UndefOr[DBClusterList] = js.undefined
  /**
    * A pagination token that can be used in a subsequent DescribeDBClusters request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterMessage {
  @scala.inline
  def apply(DBClusters: DBClusterList = null, Marker: String = null): DBClusterMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusters != null) __obj.updateDynamic("DBClusters")(DBClusters)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterMessage]
  }
}

