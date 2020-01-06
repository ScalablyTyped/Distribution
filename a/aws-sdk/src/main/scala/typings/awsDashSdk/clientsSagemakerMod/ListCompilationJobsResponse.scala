package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListCompilationJobsResponse extends js.Object {
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: typings.awsDashSdk.clientsSagemakerMod.CompilationJobSummaries = js.native
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSagemakerMod.NextToken] = js.native
}

object ListCompilationJobsResponse {
  @scala.inline
  def apply(CompilationJobSummaries: CompilationJobSummaries, NextToken: NextToken = null): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
}

