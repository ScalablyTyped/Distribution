package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelParameterVersionResult extends js.Object {
  /**
    * The label does not meet the requirements. For information about parameter label requirements, see Labeling Parameters in the AWS Systems Manager User Guide.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.native
  /**
    * The version of the parameter that has been labeled.
    */
  var ParameterVersion: js.UndefOr[PSParameterVersion] = js.native
}

object LabelParameterVersionResult {
  @scala.inline
  def apply(InvalidLabels: ParameterLabelList = null, ParameterVersion: Int | Double = null): LabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidLabels != null) __obj.updateDynamic("InvalidLabels")(InvalidLabels.asInstanceOf[js.Any])
    if (ParameterVersion != null) __obj.updateDynamic("ParameterVersion")(ParameterVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelParameterVersionResult]
  }
}

