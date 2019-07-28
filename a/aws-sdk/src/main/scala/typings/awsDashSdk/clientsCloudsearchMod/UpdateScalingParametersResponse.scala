package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScalingParametersResponse extends js.Object {
  var ScalingParameters: ScalingParametersStatus
}

object UpdateScalingParametersResponse {
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): UpdateScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters)
  
    __obj.asInstanceOf[UpdateScalingParametersResponse]
  }
}

