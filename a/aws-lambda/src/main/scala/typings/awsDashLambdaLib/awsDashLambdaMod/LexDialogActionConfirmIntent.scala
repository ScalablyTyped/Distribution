package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionConfirmIntent
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: java.lang.String
  var slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]
  @JSName("type")
  var type_LexDialogActionConfirmIntent: awsDashLambdaLib.awsDashLambdaLibStrings.ConfirmIntent
}

object LexDialogActionConfirmIntent {
  @scala.inline
  def apply(
    intentName: java.lang.String,
    slots: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null],
    `type`: awsDashLambdaLib.awsDashLambdaLibStrings.ConfirmIntent,
    message: awsDashLambdaLib.Anon_Content = null,
    responseCard: awsDashLambdaLib.Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionConfirmIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName, slots = slots)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionConfirmIntent]
  }
}

