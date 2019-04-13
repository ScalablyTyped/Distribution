package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListModelsOutput extends js.Object {
  /**
    * An array of ModelSummary objects, each of which lists a model.
    */
  var Models: ModelSummaryList
  /**
    *  If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of models, use it in the subsequent request. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListModelsOutput {
  @scala.inline
  def apply(Models: ModelSummaryList, NextToken: PaginationToken = null): ListModelsOutput = {
    val __obj = js.Dynamic.literal(Models = Models)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListModelsOutput]
  }
}

