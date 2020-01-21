package typings.awsLambda.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.AnonApplicationvndamazonawscardgeneric
import typings.awsLambda.AnonContent
import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import typings.awsLambda.awsLambdaStrings.Delegate
import typings.awsLambda.awsLambdaStrings.ElicitIntent
import typings.awsLambda.awsLambdaStrings.ElicitSlot
import typings.awsLambda.awsLambdaStrings.Failed_
import typings.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.awsLambda.mod.LexDialogActionClose
  - typings.awsLambda.mod.LexDialogActionElicitIntent
  - typings.awsLambda.mod.LexDialogActionElicitSlot
  - typings.awsLambda.mod.LexDialogActionConfirmIntent
  - typings.awsLambda.mod.LexDialogActionDelegate
*/
trait LexDialogAction extends js.Object

object LexDialogAction {
  @scala.inline
  def LexDialogActionElicitSlot(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionConfirmIntent(
    intentName: String,
    slots: StringDictionary[String | Null],
    `type`: ConfirmIntent,
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionElicitIntent(
    `type`: ElicitIntent,
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionClose(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionDelegate(slots: StringDictionary[String | Null], `type`: Delegate): LexDialogAction = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
}

