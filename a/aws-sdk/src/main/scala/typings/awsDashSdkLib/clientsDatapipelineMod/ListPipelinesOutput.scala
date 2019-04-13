package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPipelinesOutput extends js.Object {
  /**
    * Indicates whether there are more results that can be obtained by a subsequent call.
    */
  var hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The starting point for the next page of results. To view the next page of results, call ListPipelinesOutput again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The pipeline identifiers. If you require additional information about the pipelines, you can use these identifiers to call DescribePipelines and GetPipelineDefinition.
    */
  var pipelineIdList: pipelineList
}

object ListPipelinesOutput {
  @scala.inline
  def apply(
    pipelineIdList: pipelineList,
    hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined,
    marker: java.lang.String = null
  ): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal(pipelineIdList = pipelineIdList)
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[ListPipelinesOutput]
  }
}

