package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetDeploymentInstancesOutput extends js.Object {
  /**
    * Information about errors that might have occurred during the API call.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.native
  /**
    * Information about the instance.
    */
  var instancesSummary: js.UndefOr[InstanceSummaryList] = js.native
}

object BatchGetDeploymentInstancesOutput {
  @scala.inline
  def apply(errorMessage: ErrorMessage = null, instancesSummary: InstanceSummaryList = null): BatchGetDeploymentInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (errorMessage != null) __obj.updateDynamic("errorMessage")(errorMessage.asInstanceOf[js.Any])
    if (instancesSummary != null) __obj.updateDynamic("instancesSummary")(instancesSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetDeploymentInstancesOutput]
  }
}

