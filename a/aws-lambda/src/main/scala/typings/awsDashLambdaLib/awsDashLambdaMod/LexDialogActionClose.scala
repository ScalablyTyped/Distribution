package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: awsDashLambdaLib.awsDashLambdaLibStrings.Fulfilled | awsDashLambdaLib.awsDashLambdaLibStrings.Failed
  @JSName("type")
  var type_LexDialogActionClose: awsDashLambdaLib.awsDashLambdaLibStrings.Close
}

object LexDialogActionClose {
  @scala.inline
  def apply(
    fulfillmentState: awsDashLambdaLib.awsDashLambdaLibStrings.Fulfilled | awsDashLambdaLib.awsDashLambdaLibStrings.Failed,
    `type`: awsDashLambdaLib.awsDashLambdaLibStrings.Close,
    message: awsDashLambdaLib.Anon_Content = null,
    responseCard: awsDashLambdaLib.Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("fulfillmentState")(fulfillmentState.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionClose]
  }
}

