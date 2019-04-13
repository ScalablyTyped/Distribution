package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group to modify.
    */
  var DBClusterParameterGroupName: String
  /**
    * A list of parameters in the DB cluster parameter group to modify.
    */
  var Parameters: ParametersList
}

object ModifyDBClusterParameterGroupMessage {
  @scala.inline
  def apply(DBClusterParameterGroupName: String, Parameters: ParametersList): ModifyDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName, Parameters = Parameters)
  
    __obj.asInstanceOf[ModifyDBClusterParameterGroupMessage]
  }
}

