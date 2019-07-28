package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSolutionMetricsRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the solution version for which to get metrics.
    */
  var solutionVersionArn: Arn
}

object GetSolutionMetricsRequest {
  @scala.inline
  def apply(solutionVersionArn: Arn): GetSolutionMetricsRequest = {
    val __obj = js.Dynamic.literal(solutionVersionArn = solutionVersionArn)
  
    __obj.asInstanceOf[GetSolutionMetricsRequest]
  }
}

