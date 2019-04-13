package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteParametersResult extends js.Object {
  /**
    * The names of the deleted parameters.
    */
  var DeletedParameters: js.UndefOr[ParameterNameList] = js.undefined
  /**
    * The names of parameters that weren't deleted because the parameters are not valid.
    */
  var InvalidParameters: js.UndefOr[ParameterNameList] = js.undefined
}

object DeleteParametersResult {
  @scala.inline
  def apply(DeletedParameters: ParameterNameList = null, InvalidParameters: ParameterNameList = null): DeleteParametersResult = {
    val __obj = js.Dynamic.literal()
    if (DeletedParameters != null) __obj.updateDynamic("DeletedParameters")(DeletedParameters)
    if (InvalidParameters != null) __obj.updateDynamic("InvalidParameters")(InvalidParameters)
    __obj.asInstanceOf[DeleteParametersResult]
  }
}

