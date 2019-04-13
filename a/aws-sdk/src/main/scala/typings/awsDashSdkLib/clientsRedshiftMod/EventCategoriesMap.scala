package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventCategoriesMap extends js.Object {
  /**
    * The events in the event category.
    */
  var Events: js.UndefOr[EventInfoMapList] = js.undefined
  /**
    * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.undefined
}

object EventCategoriesMap {
  @scala.inline
  def apply(Events: EventInfoMapList = null, SourceType: String = null): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType)
    __obj.asInstanceOf[EventCategoriesMap]
  }
}

