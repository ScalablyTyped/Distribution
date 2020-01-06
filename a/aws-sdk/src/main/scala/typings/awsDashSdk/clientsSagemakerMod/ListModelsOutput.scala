package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListModelsOutput extends js.Object {
  /**
    * An array of ModelSummary objects, each of which lists a model.
    */
  var Models: ModelSummaryList = js.native
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListModelsOutput {
  @scala.inline
  def apply(Models: ModelSummaryList, NextToken: PaginationToken = null): ListModelsOutput = {
    val __obj = js.Dynamic.literal(Models = Models.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListModelsOutput]
  }
}

