package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionElicitIntent
  extends LexDialogActionBase
     with LexDialogAction {
  @JSName("type")
  var type_LexDialogActionElicitIntent: awsDashLambdaLib.awsDashLambdaLibStrings.ElicitIntent
}

object LexDialogActionElicitIntent {
  @scala.inline
  def apply(
    `type`: awsDashLambdaLib.awsDashLambdaLibStrings.ElicitIntent,
    message: awsDashLambdaLib.Anon_Content = null,
    responseCard: awsDashLambdaLib.Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionElicitIntent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionElicitIntent]
  }
}

