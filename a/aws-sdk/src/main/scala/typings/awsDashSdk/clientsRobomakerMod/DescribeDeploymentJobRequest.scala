package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeDeploymentJobRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the deployment job.
    */
  var job: Arn
}

object DescribeDeploymentJobRequest {
  @scala.inline
  def apply(job: Arn): DescribeDeploymentJobRequest = {
    val __obj = js.Dynamic.literal(job = job)
  
    __obj.asInstanceOf[DescribeDeploymentJobRequest]
  }
}

