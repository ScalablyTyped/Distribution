package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCompilationJobsResponse extends js.Object {
  /**
    * An array of CompilationJobSummary objects, each describing a model compilation job. 
    */
  var CompilationJobSummaries: awsDashSdkLib.clientsSagemakerMod.CompilationJobSummaries
  /**
    * If the response is truncated, Amazon SageMaker returns this NextToken. To retrieve the next set of model compilation jobs, use this token in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCompilationJobsResponse {
  @scala.inline
  def apply(CompilationJobSummaries: CompilationJobSummaries, NextToken: NextToken = null): ListCompilationJobsResponse = {
    val __obj = js.Dynamic.literal(CompilationJobSummaries = CompilationJobSummaries)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCompilationJobsResponse]
  }
}

