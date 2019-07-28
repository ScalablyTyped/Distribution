package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelParameterVersionResult extends js.Object {
  /**
    * The label does not meet the requirements. For information about parameter label requirements, see Labeling Parameters in the AWS Systems Manager User Guide.
    */
  var InvalidLabels: js.UndefOr[ParameterLabelList] = js.undefined
}

object LabelParameterVersionResult {
  @scala.inline
  def apply(InvalidLabels: ParameterLabelList = null): LabelParameterVersionResult = {
    val __obj = js.Dynamic.literal()
    if (InvalidLabels != null) __obj.updateDynamic("InvalidLabels")(InvalidLabels)
    __obj.asInstanceOf[LabelParameterVersionResult]
  }
}

