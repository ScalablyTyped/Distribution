package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterBacktrackMessage extends js.Object {
  /**
    * Contains a list of backtracks for the user.
    */
  var DBClusterBacktracks: js.UndefOr[DBClusterBacktrackList] = js.undefined
  /**
    * A pagination token that can be used in a subsequent DescribeDBClusterBacktracks request.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object DBClusterBacktrackMessage {
  @scala.inline
  def apply(DBClusterBacktracks: DBClusterBacktrackList = null, Marker: String = null): DBClusterBacktrackMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterBacktracks != null) __obj.updateDynamic("DBClusterBacktracks")(DBClusterBacktracks)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[DBClusterBacktrackMessage]
  }
}

