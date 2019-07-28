package typings.awsDashLambda.awsDashLambdaMod

import typings.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typings.awsDashLambda.Anon_Content
import typings.awsDashLambda.awsDashLambdaStrings.Close
import typings.awsDashLambda.awsDashLambdaStrings.ConfirmIntent
import typings.awsDashLambda.awsDashLambdaStrings.ElicitIntent
import typings.awsDashLambda.awsDashLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[Anon_Content] = js.undefined
  var responseCard: js.UndefOr[Anon_Applicationvndamazonawscardgeneric] = js.undefined
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent
}

object LexDialogActionBase {
  @scala.inline
  def apply(
    `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionBase]
  }
}

