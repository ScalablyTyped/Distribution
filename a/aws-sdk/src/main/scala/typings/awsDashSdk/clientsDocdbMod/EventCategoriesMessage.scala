package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCategoriesMessage extends js.Object {
  /**
    * A list of event category maps.
    */
  var EventCategoriesMapList: js.UndefOr[typings.awsDashSdk.clientsDocdbMod.EventCategoriesMapList] = js.undefined
}

object EventCategoriesMessage {
  @scala.inline
  def apply(EventCategoriesMapList: EventCategoriesMapList = null): EventCategoriesMessage = {
    val __obj = js.Dynamic.literal()
    if (EventCategoriesMapList != null) __obj.updateDynamic("EventCategoriesMapList")(EventCategoriesMapList)
    __obj.asInstanceOf[EventCategoriesMessage]
  }
}

