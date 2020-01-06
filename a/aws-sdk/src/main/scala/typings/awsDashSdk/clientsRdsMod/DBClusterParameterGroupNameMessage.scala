package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group. Constraints:   Must be 1 to 255 letters or numbers.   First character must be a letter   Can't end with a hyphen or contain two consecutive hyphens    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.native
}

object DBClusterParameterGroupNameMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String = null): DBClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
  }
}

