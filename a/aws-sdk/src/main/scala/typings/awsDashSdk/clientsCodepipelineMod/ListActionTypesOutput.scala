package typings.awsDashSdk.clientsCodepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListActionTypesOutput extends js.Object {
  /**
    * Provides details of the action types.
    */
  var actionTypes: ActionTypeList
  /**
    * If the amount of returned information is significantly large, an identifier is also returned which can be used in a subsequent list action types call to return the next set of action types in the list.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListActionTypesOutput {
  @scala.inline
  def apply(actionTypes: ActionTypeList, nextToken: NextToken = null): ListActionTypesOutput = {
    val __obj = js.Dynamic.literal(actionTypes = actionTypes)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListActionTypesOutput]
  }
}

