package typings
package awsDashSdkLib.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * The date of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  /**
    * The event categories available for the specified source type.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * The event message.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    *  The identifier of the event source. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it cannot end with a hyphen or contain two consecutive hyphens.  Constraints:replication instance, endpoint, migration task
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    *  The type of AWS DMS resource that generates events.  Valid values: replication-instance | endpoint | migration-task
    */
  var SourceType: js.UndefOr[SourceType] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    EventCategories: EventCategoriesList = null,
    Message: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

