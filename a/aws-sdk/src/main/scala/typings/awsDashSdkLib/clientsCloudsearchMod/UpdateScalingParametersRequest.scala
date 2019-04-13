package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateScalingParametersRequest extends js.Object {
  var DomainName: awsDashSdkLib.clientsCloudsearchMod.DomainName
  var ScalingParameters: awsDashSdkLib.clientsCloudsearchMod.ScalingParameters
}

object UpdateScalingParametersRequest {
  @scala.inline
  def apply(DomainName: DomainName, ScalingParameters: ScalingParameters): UpdateScalingParametersRequest = {
    val __obj = js.Dynamic.literal(DomainName = DomainName, ScalingParameters = ScalingParameters)
  
    __obj.asInstanceOf[UpdateScalingParametersRequest]
  }
}

