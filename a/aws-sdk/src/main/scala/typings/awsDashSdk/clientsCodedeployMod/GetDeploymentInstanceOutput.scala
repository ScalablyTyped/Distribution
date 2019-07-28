package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDeploymentInstanceOutput extends js.Object {
  /**
    *  Information about the instance. 
    */
  var instanceSummary: js.UndefOr[InstanceSummary] = js.undefined
}

object GetDeploymentInstanceOutput {
  @scala.inline
  def apply(instanceSummary: InstanceSummary = null): GetDeploymentInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceSummary != null) __obj.updateDynamic("instanceSummary")(instanceSummary)
    __obj.asInstanceOf[GetDeploymentInstanceOutput]
  }
}

