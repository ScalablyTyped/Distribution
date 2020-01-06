package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateScalingParametersResponse extends js.Object {
  var ScalingParameters: ScalingParametersStatus = js.native
}

object UpdateScalingParametersResponse {
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): UpdateScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateScalingParametersResponse]
  }
}

