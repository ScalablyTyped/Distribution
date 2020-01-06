package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group to modify.
    */
  var DBClusterParameterGroupName: String = js.native
  /**
    * A list of parameters in the DB cluster parameter group to modify.
    */
  var Parameters: ParametersList = js.native
}

object ModifyDBClusterParameterGroupMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String, Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName.asInstanceOf[js.Any], Parameters = Parameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ModifyDBClusterParameterGroupMessage]
  }
}

