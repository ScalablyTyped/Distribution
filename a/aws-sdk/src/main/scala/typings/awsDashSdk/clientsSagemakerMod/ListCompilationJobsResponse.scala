package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCompilationJobsResponse extends js.Object {
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: typings.awsDashSdk.clientsSagemakerMod.CompilationJobSummaries
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.undefined
}

object ListCompilationJobsResponse {
  @scala.inline
  def apply(CompilationJobSummaries: CompilationJobSummaries, NextToken: NextToken = null): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
}

