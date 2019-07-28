package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typings.awsDashLambda.Anon_Content
import typings.awsDashLambda.awsDashLambdaStrings.Close
import typings.awsDashLambda.awsDashLambdaStrings.Failed
import typings.awsDashLambda.awsDashLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: Fulfilled | Failed
  @JSName("type")
  var type_LexDialogActionClose: Close
}

object LexDialogActionClose {
  @scala.inline
  def apply(
    fulfillmentState: Fulfilled | Failed,
    `type`: Close,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionClose]
  }
}

