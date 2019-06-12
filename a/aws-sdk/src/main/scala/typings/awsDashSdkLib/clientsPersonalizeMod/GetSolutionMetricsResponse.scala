package typings
package awsDashSdkLib.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetSolutionMetricsResponse extends js.Object {
  /**
    * The metrics for the solution version.
    */
  var metrics: js.UndefOr[Metrics] = js.undefined
  /**
    * The same solution version ARN as specified in the request.
    */
  var solutionVersionArn: js.UndefOr[Arn] = js.undefined
}

object GetSolutionMetricsResponse {
  @scala.inline
  def apply(metrics: Metrics = null, solutionVersionArn: Arn = null): GetSolutionMetricsResponse = {
    val __obj = js.Dynamic.literal()
    if (metrics != null) __obj.updateDynamic("metrics")(metrics)
    if (solutionVersionArn != null) __obj.updateDynamic("solutionVersionArn")(solutionVersionArn)
    __obj.asInstanceOf[GetSolutionMetricsResponse]
  }
}

