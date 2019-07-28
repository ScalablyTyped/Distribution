package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObjectsInput extends js.Object {
  /**
    * Indicates whether any expressions in the object should be evaluated when the object descriptions are returned.
    */
  var evaluateExpressions: js.UndefOr[Boolean] = js.undefined
  /**
    * The starting point for the results to be returned. For the first call, this value should be empty. As long as there are more results, continue to call DescribeObjects with the marker value from the previous call to retrieve the next set of results.
    */
  var marker: js.UndefOr[String] = js.undefined
  /**
    * The IDs of the pipeline objects that contain the definitions to be described. You can pass as many as 25 identifiers in a single call to DescribeObjects.
    */
  var objectIds: idList
  /**
    * The ID of the pipeline that contains the object definitions.
    */
  var pipelineId: id
}

object DescribeObjectsInput {
  @scala.inline
  def apply(
    objectIds: idList,
    pipelineId: id,
    evaluateExpressions: js.UndefOr[Boolean] = js.undefined,
    marker: String = null
  ): DescribeObjectsInput = {
    val __obj = js.Dynamic.literal(objectIds = objectIds, pipelineId = pipelineId)
    if (!js.isUndefined(evaluateExpressions)) __obj.updateDynamic("evaluateExpressions")(evaluateExpressions)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[DescribeObjectsInput]
  }
}

