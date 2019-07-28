package typings.awsDashLambda.awsDashLambdaMod

import org.scalablytyped.runtime.StringDictionary
import typings.awsDashLambda.Anon_Applicationvndamazonawscardgeneric
import typings.awsDashLambda.Anon_Content
import typings.awsDashLambda.awsDashLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionElicitSlot
  extends LexDialogActionBase
     with LexDialogAction {
  var intentName: String
  var slotToElicit: String
  var slots: StringDictionary[String | Null]
  @JSName("type")
  var type_LexDialogActionElicitSlot: ElicitSlot
}

object LexDialogActionElicitSlot {
  @scala.inline
  def apply(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: Anon_Content = null,
    responseCard: Anon_Applicationvndamazonawscardgeneric = null
  ): LexDialogActionElicitSlot = {
    val __obj = js.Dynamic.literal(intentName = intentName, slotToElicit = slotToElicit, slots = slots)
    __obj.updateDynamic("type")(`type`)
    if (message != null) __obj.updateDynamic("message")(message)
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard)
    __obj.asInstanceOf[LexDialogActionElicitSlot]
  }
}

