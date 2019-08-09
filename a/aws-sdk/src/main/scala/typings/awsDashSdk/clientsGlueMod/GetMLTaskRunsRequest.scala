package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMLTaskRunsRequest extends js.Object {
  /**
    * The filter criteria, in the TaskRunFilterCriteria structure, for the task run.
    */
  var Filter: js.UndefOr[TaskRunFilterCriteria] = js.undefined
  /**
    * The maximum number of results to return. 
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A token for pagination of the results. The default is empty.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  /**
    * The sorting criteria, in the TaskRunSortCriteria structure, for the task run.
    */
  var Sort: js.UndefOr[TaskRunSortCriteria] = js.undefined
  /**
    * The unique identifier of the machine learning transform.
    */
  var TransformId: HashString
}

object GetMLTaskRunsRequest {
  @scala.inline
  def apply(
    TransformId: HashString,
    Filter: TaskRunFilterCriteria = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: PaginationToken = null,
    Sort: TaskRunSortCriteria = null
  ): GetMLTaskRunsRequest = {
    val __obj = js.Dynamic.literal(TransformId = TransformId)
    if (Filter != null) __obj.updateDynamic("Filter")(Filter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Sort != null) __obj.updateDynamic("Sort")(Sort)
    __obj.asInstanceOf[GetMLTaskRunsRequest]
  }
}

