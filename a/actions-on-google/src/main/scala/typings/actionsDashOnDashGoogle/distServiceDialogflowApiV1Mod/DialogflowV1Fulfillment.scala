package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1Fulfillment extends js.Object {
  var messages: js.UndefOr[js.Array[DialogflowV1Message]] = js.undefined
  var speech: js.UndefOr[String] = js.undefined
}

object DialogflowV1Fulfillment {
  @scala.inline
  def apply(messages: js.Array[DialogflowV1Message] = null, speech: String = null): DialogflowV1Fulfillment = {
    val __obj = js.Dynamic.literal()
    if (messages != null) __obj.updateDynamic("messages")(messages)
    if (speech != null) __obj.updateDynamic("speech")(speech)
    __obj.asInstanceOf[DialogflowV1Fulfillment]
  }
}

