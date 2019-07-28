package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventCategoriesResponse extends js.Object {
  /**
    * A list of event categories.
    */
  var EventCategoryGroupList: js.UndefOr[typings.awsDashSdk.clientsDmsMod.EventCategoryGroupList] = js.undefined
}

object DescribeEventCategoriesResponse {
  @scala.inline
  def apply(EventCategoryGroupList: EventCategoryGroupList = null): DescribeEventCategoriesResponse = {
    val __obj = js.Dynamic.literal()
    if (EventCategoryGroupList != null) __obj.updateDynamic("EventCategoryGroupList")(EventCategoryGroupList)
    __obj.asInstanceOf[DescribeEventCategoriesResponse]
  }
}

