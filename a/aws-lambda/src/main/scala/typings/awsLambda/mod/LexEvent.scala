package typings.awsLambda.mod

import org.scalablytyped.runtime.StringDictionary
import typings.awsLambda.AnonAlias
import typings.awsLambda.AnonConfirmationStatus
import typings.awsLambda.awsLambdaStrings.DialogCodeHook
import typings.awsLambda.awsLambdaStrings.FulfillmentCodeHook
import typings.awsLambda.awsLambdaStrings.Text
import typings.awsLambda.awsLambdaStrings.Voice
import typings.awsLambda.awsLambdaStrings.`1Dot0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexEvent extends js.Object {
  var bot: AnonAlias
  var currentIntent: AnonConfirmationStatus
  var inputTranscript: String
  var invocationSource: DialogCodeHook | FulfillmentCodeHook
  var messageVersion: `1Dot0`
  var outputDialogMode: Text | Voice
  var requestAttributes: StringDictionary[String] | Null
  var sessionAttributes: StringDictionary[String]
  var userId: String
}

object LexEvent {
  @scala.inline
  def apply(
    bot: AnonAlias,
    currentIntent: AnonConfirmationStatus,
    inputTranscript: String,
    invocationSource: DialogCodeHook | FulfillmentCodeHook,
    messageVersion: `1Dot0`,
    outputDialogMode: Text | Voice,
    sessionAttributes: StringDictionary[String],
    userId: String,
    requestAttributes: StringDictionary[String] = null
  ): LexEvent = {
    val __obj = js.Dynamic.literal(bot = bot.asInstanceOf[js.Any], currentIntent = currentIntent.asInstanceOf[js.Any], inputTranscript = inputTranscript.asInstanceOf[js.Any], invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion.asInstanceOf[js.Any], outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    if (requestAttributes != null) __obj.updateDynamic("requestAttributes")(requestAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexEvent]
  }
}

