package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoryGroup extends js.Object {
  /**
    *  A list of event categories from a source type that you've chosen.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.native
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | replication-server | security-group | replication-task
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoryGroup {
  @scala.inline
  def apply(EventCategories: EventCategoriesList = null, SourceType: String = null): EventCategoryGroup = {
    val __obj = js.Dynamic.literal()
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategoryGroup]
  }
}

