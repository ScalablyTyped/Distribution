package typings.awsLambda.lexMod

import typings.awsLambda.anon.Content
import typings.awsLambda.anon.ContentType
import typings.awsLambda.awsLambdaStrings.Close
import typings.awsLambda.awsLambdaStrings.ConfirmIntent
import typings.awsLambda.awsLambdaStrings.ElicitIntent
import typings.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[Content] = js.undefined
  var responseCard: js.UndefOr[ContentType] = js.undefined
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent
}

object LexDialogActionBase {
  @scala.inline
  def apply(
    `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent,
    message: Content = null,
    responseCard: ContentType = null
  ): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionBase]
  }
}

