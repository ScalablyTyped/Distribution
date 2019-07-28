package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typings.awsDashLambda.Anon_Content
import typings.awsDashLambda.awsDashLambdaStrings.ElicitIntent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionElicitIntent
  extends LexDialogActionBase
     with LexDialogAction {
  @JSName("type")
  var type_LexDialogActionElicitIntent: ElicitIntent
}

object LexDialogActionElicitIntent {
  @scala.inline
  def apply(
    `type`: ElicitIntent,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
}

