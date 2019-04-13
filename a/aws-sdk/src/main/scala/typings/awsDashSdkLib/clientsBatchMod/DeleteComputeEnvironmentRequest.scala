package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteComputeEnvironmentRequest extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the compute environment to delete. 
    */
  var computeEnvironment: String
}

object DeleteComputeEnvironmentRequest {
  @scala.inline
  def apply(computeEnvironment: String): DeleteComputeEnvironmentRequest = {
    val __obj = js.Dynamic.literal(computeEnvironment = computeEnvironment)
  
    __obj.asInstanceOf[DeleteComputeEnvironmentRequest]
  }
}

