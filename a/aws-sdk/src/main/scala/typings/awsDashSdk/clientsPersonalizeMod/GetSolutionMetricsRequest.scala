package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSolutionMetricsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution version for which to get metrics.
    */
  var solutionVersionArn: Arn = js.native
}

object GetSolutionMetricsRequest {
  @scala.inline
  def apply(solutionVersionArn: Arn): GetSolutionMetricsRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetSolutionMetricsRequest]
  }
}

