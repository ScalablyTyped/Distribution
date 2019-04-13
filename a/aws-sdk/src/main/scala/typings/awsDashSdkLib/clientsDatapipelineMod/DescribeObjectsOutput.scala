package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeObjectsOutput extends js.Object {
  /**
    * Indicates whether there are more results to return.
    */
  var hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The starting point for the next page of results. To view the next page of results, call DescribeObjects again with this marker value. If the value is null, there are no more results.
    */
  var marker: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of object definitions.
    */
  var pipelineObjects: PipelineObjectList
}

object DescribeObjectsOutput {
  @scala.inline
  def apply(
    pipelineObjects: PipelineObjectList,
    hasMoreResults: js.UndefOr[scala.Boolean] = js.undefined,
    marker: java.lang.String = null
  ): DescribeObjectsOutput = {
    val __obj = js.Dynamic.literal(pipelineObjects = pipelineObjects)
    if (!js.isUndefined(hasMoreResults)) __obj.updateDynamic("hasMoreResults")(hasMoreResults)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    __obj.asInstanceOf[DescribeObjectsOutput]
  }
}

