package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartPipelineExecutionInput extends js.Object {
  /**
    * The system-generated unique ID used to identify a unique execution request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The name of the pipeline to start.
    */
  var name: PipelineName = js.native
}

object StartPipelineExecutionInput {
  @scala.inline
  def apply(name: PipelineName, clientRequestToken: ClientRequestToken = null): StartPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartPipelineExecutionInput]
  }
}

