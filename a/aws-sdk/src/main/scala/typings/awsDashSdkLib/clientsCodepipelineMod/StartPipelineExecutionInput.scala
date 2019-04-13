package typings
package awsDashSdkLib.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartPipelineExecutionInput extends js.Object {
  /**
    * The system-generated unique ID used to identify a unique execution request.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * The name of the pipeline to start.
    */
  var name: PipelineName
}

object StartPipelineExecutionInput {
  @scala.inline
  def apply(name: PipelineName, clientRequestToken: ClientRequestToken = null): StartPipelineExecutionInput = {
    val __obj = js.Dynamic.literal(name = name)
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken)
    __obj.asInstanceOf[StartPipelineExecutionInput]
  }
}

