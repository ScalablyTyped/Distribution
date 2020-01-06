package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComputeEnvironmentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.native
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.native
}

object UpdateComputeEnvironmentResponse {
  @scala.inline
  def apply(computeEnvironmentArn: String = null, computeEnvironmentName: String = null): UpdateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (computeEnvironmentArn != null) __obj.updateDynamic("computeEnvironmentArn")(computeEnvironmentArn.asInstanceOf[js.Any])
    if (computeEnvironmentName != null) __obj.updateDynamic("computeEnvironmentName")(computeEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComputeEnvironmentResponse]
  }
}

