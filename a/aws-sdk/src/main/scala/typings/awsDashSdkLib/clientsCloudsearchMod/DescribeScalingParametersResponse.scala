package typings
package awsDashSdkLib.clientsCloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeScalingParametersResponse extends js.Object {
  var ScalingParameters: ScalingParametersStatus
}

object DescribeScalingParametersResponse {
  @scala.inline
  def apply(ScalingParameters: ScalingParametersStatus): DescribeScalingParametersResponse = {
    val __obj = js.Dynamic.literal(ScalingParameters = ScalingParameters)
  
    __obj.asInstanceOf[DescribeScalingParametersResponse]
  }
}

