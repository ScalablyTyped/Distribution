package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListActionTypesOutput extends js.Object {
  /**
    * Provides details of the action types.
    */
  var actionTypes: ActionTypeList = js.native
  /**
    * If the amount of returned information is significantly large, an identifier is also returned. It can be used in a subsequent list action types call to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListActionTypesOutput {
  @scala.inline
  def apply(actionTypes: ActionTypeList, nextToken: NextToken = null): ListActionTypesOutput = {
    val __obj = js.Dynamic.literal(actionTypes = actionTypes.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListActionTypesOutput]
  }
}

