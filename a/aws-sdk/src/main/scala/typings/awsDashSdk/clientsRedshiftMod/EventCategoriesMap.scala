package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventCategoriesMap extends js.Object {
  /**
    * The events in the event category.
    */
  var Events: js.UndefOr[EventInfoMapList] = js.native
  /**
    * The source type, such as cluster or cluster-snapshot, that the returned categories belong to.
    */
  var SourceType: js.UndefOr[String] = js.native
}

object EventCategoriesMap {
  @scala.inline
  def apply(Events: EventInfoMapList = null, SourceType: String = null): EventCategoriesMap = {
    val __obj = js.Dynamic.literal()
    if (Events != null) __obj.updateDynamic("Events")(Events.asInstanceOf[js.Any])
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCategoriesMap]
  }
}

