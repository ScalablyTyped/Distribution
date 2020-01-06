package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteComputeEnvironmentRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the compute environment to delete.
    */
  var computeEnvironment: String = js.native
}

object DeleteComputeEnvironmentRequest {
  @scala.inline
  def apply(computeEnvironment: String): DeleteComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteComputeEnvironmentRequest]
  }
}

