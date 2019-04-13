package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeLoadBasedAutoScalingResult extends js.Object {
  /**
    * An array of LoadBasedAutoScalingConfiguration objects that describe each layer's configuration.
    */
  var LoadBasedAutoScalingConfigurations: js.UndefOr[LoadBasedAutoScalingConfigurations] = js.undefined
}

object DescribeLoadBasedAutoScalingResult {
  @scala.inline
  def apply(LoadBasedAutoScalingConfigurations: LoadBasedAutoScalingConfigurations = null): DescribeLoadBasedAutoScalingResult = {
    val __obj = js.Dynamic.literal()
    if (LoadBasedAutoScalingConfigurations != null) __obj.updateDynamic("LoadBasedAutoScalingConfigurations")(LoadBasedAutoScalingConfigurations)
    __obj.asInstanceOf[DescribeLoadBasedAutoScalingResult]
  }
}

