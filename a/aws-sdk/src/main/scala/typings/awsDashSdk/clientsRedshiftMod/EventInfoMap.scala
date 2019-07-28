package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventInfoMap extends js.Object {
  /**
    * The category of an Amazon Redshift event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * The description of an Amazon Redshift event.
    */
  var EventDescription: js.UndefOr[String] = js.undefined
  /**
    * The identifier of an Amazon Redshift event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.undefined
}

object EventInfoMap {
  @scala.inline
  def apply(
    EventCategories: EventCategoriesList = null,
    EventDescription: String = null,
    EventId: String = null,
    Severity: String = null
  ): EventInfoMap = {
    val __obj = js.Dynamic.literal()
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (EventDescription != null) __obj.updateDynamic("EventDescription")(EventDescription)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity)
    __obj.asInstanceOf[EventInfoMap]
  }
}

