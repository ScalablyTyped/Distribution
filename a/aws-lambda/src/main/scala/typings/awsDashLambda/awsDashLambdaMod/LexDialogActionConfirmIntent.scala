package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typings.awsDashLambda.Anon_Content
import typings.awsDashLambda.awsDashLambdaStrings.ConfirmIntent
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
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionConfirmIntent = {
    val __obj = js.Dynamic.literal(intentName = intentName, slots = slots)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionConfirmIntent]
  }
}

