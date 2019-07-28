package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.Anon_Alias
import typings.awsDashLambda.Anon_ConfirmationStatus
import typings.awsDashLambda.awsDashLambdaStrings.DialogCodeHook
import typings.awsDashLambda.awsDashLambdaStrings.FulfillmentCodeHook
import typings.awsDashLambda.awsDashLambdaStrings.Text
import typings.awsDashLambda.awsDashLambdaStrings.Voice
import typings.awsDashLambda.awsDashLambdaStrings.`1DOT0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexEvent extends js.Object {
  var bot: Anon_Alias
  var currentIntent: Anon_ConfirmationStatus
  var inputTranscript: String
  var invocationSource: DialogCodeHook | FulfillmentCodeHook
  var messageVersion: `1DOT0`
  var outputDialogMode: Text | Voice
  var requestAttributes: StringDictionary[String] | Null
  var sessionAttributes: StringDictionary[String]
  var userId: String
}

object LexEvent {
  @scala.inline
  def apply(
    bot: Anon_Alias,
    currentIntent: Anon_ConfirmationStatus,
    inputTranscript: String,
    invocationSource: DialogCodeHook | FulfillmentCodeHook,
    messageVersion: `1DOT0`,
    outputDialogMode: Text | Voice,
    sessionAttributes: StringDictionary[String],
    userId: String,
    requestAttributes: StringDictionary[String] = null
  ): LexEvent = {
    val __obj = js.Dynamic.literal(bot = bot, currentIntent = currentIntent, inputTranscript = inputTranscript, invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion, outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes, userId = userId)
    if (requestAttributes != null) __obj.updateDynamic("requestAttributes")(requestAttributes)
    __obj.asInstanceOf[LexEvent]
  }
}

