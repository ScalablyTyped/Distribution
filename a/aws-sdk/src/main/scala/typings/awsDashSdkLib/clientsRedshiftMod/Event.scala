package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  /**
    * A list of the event categories. Values: Configuration, Management, Monitoring, Security
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * The identifier of the event.
    */
  var EventId: js.UndefOr[String] = js.undefined
  /**
    * The text of this event.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The severity of the event. Values: ERROR, INFO
    */
  var Severity: js.UndefOr[String] = js.undefined
  /**
    * The identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * The source type for this event.
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    EventCategories: EventCategoriesList = null,
    EventId: String = null,
    Message: String = null,
    Severity: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (EventId != null) __obj.updateDynamic("EventId")(EventId)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

