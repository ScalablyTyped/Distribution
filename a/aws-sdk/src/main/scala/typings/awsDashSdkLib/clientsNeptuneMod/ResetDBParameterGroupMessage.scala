package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDBParameterGroupMessage extends js.Object {
  /**
    * The name of the DB parameter group. Constraints:   Must match the name of an existing DBParameterGroup.  
    */
  var DBParameterGroupName: String
  /**
    * To reset the entire DB parameter group, specify the DBParameterGroup name and ResetAllParameters parameters. To reset specific parameters, provide a list of the following: ParameterName and ApplyMethod. A maximum of 20 parameters can be modified in a single request. Valid Values (for Apply method): pending-reboot 
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
  /**
    * Specifies whether (true) or not (false) to reset all parameters in the DB parameter group to default values. Default: true 
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
}

object ResetDBParameterGroupMessage {
  @scala.inline
  def apply(
    DBParameterGroupName: String,
    Parameters: ParametersList = null,
    ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  ): ResetDBParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBParameterGroupName = DBParameterGroupName)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (!js.isUndefined(ResetAllParameters)) __obj.updateDynamic("ResetAllParameters")(ResetAllParameters)
    __obj.asInstanceOf[ResetDBParameterGroupMessage]
  }
}

