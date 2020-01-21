package typings.awsLambda.mod

import typings.awsLambda.AnonApplicationvndamazonawscardgeneric
import typings.awsLambda.AnonContent
import typings.awsLambda.awsLambdaStrings.ElicitIntent
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
    message: AnonContent = null,
    responseCard: AnonApplicationvndamazonawscardgeneric = null
  ): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
}

