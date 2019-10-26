package typings.actionsDashOnDashGoogle.distServiceDialogflowApiV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogflowV1FollowupEvent extends js.Object {
  var data: js.UndefOr[DialogflowV1Parameters] = js.undefined
  var name: js.UndefOr[String] = js.undefined
}

object DialogflowV1FollowupEvent {
  @scala.inline
  def apply(data: DialogflowV1Parameters = null, name: String = null): DialogflowV1FollowupEvent = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[DialogflowV1FollowupEvent]
  }
}

