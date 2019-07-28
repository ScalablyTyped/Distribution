package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceUtilization extends js.Object {
  /**
    * Utilization of current Amazon EC2 Instance 
    */
  var EC2ResourceUtilization: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.EC2ResourceUtilization] = js.undefined
}

object ResourceUtilization {
  @scala.inline
  def apply(EC2ResourceUtilization: EC2ResourceUtilization = null): ResourceUtilization = {
    val __obj = js.Dynamic.literal()
    if (EC2ResourceUtilization != null) __obj.updateDynamic("EC2ResourceUtilization")(EC2ResourceUtilization)
    __obj.asInstanceOf[ResourceUtilization]
  }
}

