package typings.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.anon.Content
import typings.awsLambda.anon.ContentType
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionConfirmIntent
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: String
  var slots: StringDictionary[String | Null]
  @JSName("type")
  var type_LexDialogActionConfirmIntent: ConfirmIntent
}

object LexDialogActionConfirmIntent {
  @scala.inline
  def apply(
    intentName: String,
    slots: StringDictionary[String | Null],
    `type`: ConfirmIntent,
    message: Content = null,
    responseCard: ContentType = null
  ): LexDialogActionConfirmIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionConfirmIntent]
  }
}

