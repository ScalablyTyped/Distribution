package typings.awsDashSdk.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScalingParametersRequest extends js.Object {
  var DomainName: typings.awsDashSdk.clientsCloudsearchMod.DomainName
  var ScalingParameters: typings.awsDashSdk.clientsCloudsearchMod.ScalingParameters
}

object UpdateScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, ScalingParameters = ScalingParameters)
  
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
}

