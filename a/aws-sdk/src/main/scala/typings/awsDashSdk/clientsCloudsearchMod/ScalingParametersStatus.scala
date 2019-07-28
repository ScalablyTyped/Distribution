package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScalingParametersStatus extends js.Object {
  var Options: ScalingParameters
  var Status: OptionStatus
}

object ScalingParametersStatus {
  @scala.inline
  def apply(Options: ScalingParameters, Status: OptionStatus): ScalingParametersStatus = {
    val __obj = js.Dynamic.literal(Options = Options, Status = Status)
  
    __obj.asInstanceOf[ScalingParametersStatus]
  }
}

