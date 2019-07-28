package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DBClusterParameterGroupNameMessage extends js.Object {
  /**
    * The name of a DB cluster parameter group. Constraints:   Must be from 1 to 255 letters or numbers.   The first character must be a letter.   Cannot end with a hyphen or contain two consecutive hyphens.    This value is stored as a lowercase string. 
    */
  var DBClusterParameterGroupName: js.UndefOr[String] = js.undefined
}

object DBClusterParameterGroupNameMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String = null): DBClusterParameterGroupNameMessage = {
    val __obj = js.Dynamic.literal()
    if (DBClusterParameterGroupName != null) __obj.updateDynamic("DBClusterParameterGroupName")(DBClusterParameterGroupName)
    __obj.asInstanceOf[DBClusterParameterGroupNameMessage]
  }
}

