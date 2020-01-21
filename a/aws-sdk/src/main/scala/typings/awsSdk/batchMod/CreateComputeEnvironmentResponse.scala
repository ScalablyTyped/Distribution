package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateComputeEnvironmentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.native
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.native
}

object CreateComputeEnvironmentResponse {
  @scala.inline
  def apply(computeEnvironmentArn: String = null, computeEnvironmentName: String = null): CreateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    if (computeEnvironmentArn != null) __obj.updateDynamic("computeEnvironmentArn")(computeEnvironmentArn.asInstanceOf[js.Any])
    if (computeEnvironmentName != null) __obj.updateDynamic("computeEnvironmentName")(computeEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComputeEnvironmentResponse]
  }
}

