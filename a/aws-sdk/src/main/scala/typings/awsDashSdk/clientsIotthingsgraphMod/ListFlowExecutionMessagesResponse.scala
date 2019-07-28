package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFlowExecutionMessagesResponse extends js.Object {
  /**
    * A list of objects that contain information about events in the specified flow execution.
    */
  var messages: js.UndefOr[FlowExecutionMessages] = js.undefined
  /**
    * The string to specify as nextToken when you request the next page of results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFlowExecutionMessagesResponse {
  @scala.inline
  def apply(messages: FlowExecutionMessages = null, nextToken: NextToken = null): ListFlowExecutionMessagesResponse = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListFlowExecutionMessagesResponse]
  }
}

