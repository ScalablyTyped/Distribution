package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[awsDashLambdaLib.Anon_Content] = js.undefined
  var responseCard: js.UndefOr[awsDashLambdaLib.Anon_Applicationvndamazonawscardgeneric] = js.undefined
  var `type`: awsDashLambdaLib.awsDashLambdaLibStrings.Close | awsDashLambdaLib.awsDashLambdaLibStrings.ElicitIntent | awsDashLambdaLib.awsDashLambdaLibStrings.ElicitSlot | awsDashLambdaLib.awsDashLambdaLibStrings.ConfirmIntent
}

object LexDialogActionBase {
  @scala.inline
  def apply(
    `type`: awsDashLambdaLib.awsDashLambdaLibStrings.Close | awsDashLambdaLib.awsDashLambdaLibStrings.ElicitIntent | awsDashLambdaLib.awsDashLambdaLibStrings.ElicitSlot | awsDashLambdaLib.awsDashLambdaLibStrings.ConfirmIntent,
    message: awsDashLambdaLib.Anon_Content = null,
    responseCard: awsDashLambdaLib.Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionBase]
  }
}

