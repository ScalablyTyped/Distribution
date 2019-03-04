package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexEvent extends js.Object {
  var bot: awsDashLambdaLib.Anon_Alias
  var currentIntent: awsDashLambdaLib.Anon_ConfirmationStatus
  var inputTranscript: java.lang.String
  var invocationSource: awsDashLambdaLib.awsDashLambdaLibStrings.DialogCodeHook | awsDashLambdaLib.awsDashLambdaLibStrings.FulfillmentCodeHook
  var messageVersion: awsDashLambdaLib.awsDashLambdaLibStrings.`1DOT0`
  var outputDialogMode: awsDashLambdaLib.awsDashLambdaLibStrings.Text | awsDashLambdaLib.awsDashLambdaLibStrings.Voice
  var requestAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var sessionAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var userId: java.lang.String
}

object LexEvent {
  @scala.inline
  def apply(
    bot: awsDashLambdaLib.Anon_Alias,
    currentIntent: awsDashLambdaLib.Anon_ConfirmationStatus,
    inputTranscript: java.lang.String,
    invocationSource: awsDashLambdaLib.awsDashLambdaLibStrings.DialogCodeHook | awsDashLambdaLib.awsDashLambdaLibStrings.FulfillmentCodeHook,
    messageVersion: awsDashLambdaLib.awsDashLambdaLibStrings.`1DOT0`,
    outputDialogMode: awsDashLambdaLib.awsDashLambdaLibStrings.Text | awsDashLambdaLib.awsDashLambdaLibStrings.Voice,
    sessionAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    userId: java.lang.String,
    requestAttributes: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): LexEvent = {
    val __obj = js.Dynamic.literal(bot = bot, currentIntent = currentIntent, inputTranscript = inputTranscript, invocationSource = invocationSource.asInstanceOf[js.Any], messageVersion = messageVersion, outputDialogMode = outputDialogMode.asInstanceOf[js.Any], sessionAttributes = sessionAttributes, userId = userId)
    if (requestAttributes != null) __obj.updateDynamic("requestAttributes")(requestAttributes)
    __obj.asInstanceOf[LexEvent]
  }
}

