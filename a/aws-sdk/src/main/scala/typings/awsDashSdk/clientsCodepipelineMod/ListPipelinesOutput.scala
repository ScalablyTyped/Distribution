package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPipelinesOutput extends js.Object {
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list pipelines call to return the next set of pipelines in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The list of pipelines.
    */
  var pipelines: js.UndefOr[PipelineList] = js.native
}

object ListPipelinesOutput {
  @scala.inline
  def apply(nextToken: NextToken = null, pipelines: PipelineList = null): ListPipelinesOutput = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (pipelines != null) __obj.updateDynamic("pipelines")(pipelines.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPipelinesOutput]
  }
}

