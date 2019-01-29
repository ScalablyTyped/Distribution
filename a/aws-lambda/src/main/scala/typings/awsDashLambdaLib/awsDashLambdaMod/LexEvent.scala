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

