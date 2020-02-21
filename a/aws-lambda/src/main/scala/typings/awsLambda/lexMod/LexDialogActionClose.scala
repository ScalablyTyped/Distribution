package typings.awsLambda.lexMod

import typings.awsLambda.AnonApplicationvndamazonawscardgeneric
import typings.awsLambda.AnonContent
import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.Failed_
import typings.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: Fulfilled | Failed_
  @JSName("type")
  var type_LexDialogActionClose: Close
}

object LexDialogActionClose {
  @scala.inline
  def apply(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionClose]
  }
}

