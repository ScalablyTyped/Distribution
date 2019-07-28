package typings.awsDashSdk.clientsDocdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCategoriesMap extends js.Object {
  /**
    * The event categories for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * The source type that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.undefined
}

object EventCategoriesMap {
  @scala.inline
  def apply(EventCategories: EventCategoriesList = null, SourceType: String = null): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    __obj.asInstanceOf[EventCategoriesMap]
  }
}

