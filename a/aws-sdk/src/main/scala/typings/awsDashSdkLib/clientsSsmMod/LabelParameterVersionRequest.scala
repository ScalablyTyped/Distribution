package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelParameterVersionRequest extends js.Object {
  /**
    * One or more labels to attach to the specified parameter version.
    */
  var Labels: ParameterLabelList
  /**
    * The parameter name on which you want to attach one or more labels.
    */
  var Name: PSParameterName
  /**
    * The specific version of the parameter on which you want to attach one or more labels. If no version is specified, the system attaches the label to the latest version.)
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
}

object LabelParameterVersionRequest {
  @scala.inline
  def apply(
    Labels: ParameterLabelList,
    Name: PSParameterName,
    ParameterVersion: js.UndefOr[PSParameterVersion] = js.undefined
  ): LabelParameterVersionRequest = {
    val __obj = js.Dynamic.literal(Labels = Labels, Name = Name)
    if (!js.isUndefined(ParameterVersion)) __obj.updateDynamic("ParameterVersion")(ParameterVersion)
    __obj.asInstanceOf[LabelParameterVersionRequest]
  }
}

