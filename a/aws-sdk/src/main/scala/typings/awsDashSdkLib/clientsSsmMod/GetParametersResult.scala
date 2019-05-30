package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParametersResult extends js.Object {
  /**
    * A list of parameters that are not formatted correctly or do not run during an execution.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
  /**
    * A list of details for a parameter.
    */
  var Parameters: js.UndefOr[ParameterList] = js.undefined
}

object GetParametersResult {
  @scala.inline
  def apply(InvalidParameters: ParameterNameList = null, Parameters: ParameterList = null): GetParametersResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidParameters != null) __obj.updateDynamic("InvalidParameters")(InvalidParameters)
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    __obj.asInstanceOf[GetParametersResult]
  }
}

