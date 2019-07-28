package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTransformJobsResponse extends js.Object {
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of transform jobs, use it in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
  /**
    * An array of TransformJobSummary objects.
    */
  var TransformJobSummaries: typings.awsDashSdk.clientsSagemakerMod.TransformJobSummaries
}

object ListTransformJobsResponse {
  @scala.inline
  def apply(TransformJobSummaries: TransformJobSummaries, NextToken: NextToken = null): ListTransformJobsResponse = {
    val __obj = js.Dynamic.literal(TransformJobSummaries = TransformJobSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTransformJobsResponse]
  }
}

