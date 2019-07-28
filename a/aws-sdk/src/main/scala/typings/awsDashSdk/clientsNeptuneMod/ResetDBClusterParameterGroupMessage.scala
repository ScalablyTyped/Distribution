package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetDBClusterParameterGroupMessage extends js.Object {
  /**
    * The name of the DB cluster parameter group to reset.
    */
  var DBClusterParameterGroupName: String
  /**
    * A list of parameter names in the DB cluster parameter group to reset to the default values. You can't use this parameter if the ResetAllParameters parameter is set to true.
    */
  var Parameters: js.UndefOr[ParametersList] = js.undefined
  /**
    * A value that is set to true to reset all parameters in the DB cluster parameter group to their default values, and false otherwise. You can't use this parameter if there is a list of parameter names specified for the Parameters parameter.
    */
  var ResetAllParameters: js.UndefOr[Boolean] = js.undefined
}

object ResetDBClusterParameterGroupMessage {
  @scala.inline
  def apply(
    DBClusterParameterGroupName: String,
    Parameters: ParametersList = null,
    ResetAllParameters: js.UndefOr[Boolean] = js.undefined
  ): ResetDBClusterParameterGroupMessage = {
    val __obj = js.Dynamic.literal(DBClusterParameterGroupName = DBClusterParameterGroupName)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (!js.isUndefined(ResetAllParameters)) __obj.updateDynamic("ResetAllParameters")(ResetAllParameters)
    __obj.asInstanceOf[ResetDBClusterParameterGroupMessage]
  }
}

