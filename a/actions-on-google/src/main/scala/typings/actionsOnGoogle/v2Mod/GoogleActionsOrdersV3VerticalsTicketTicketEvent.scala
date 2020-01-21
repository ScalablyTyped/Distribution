package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleActionsOrdersV3VerticalsTicketTicketEvent extends js.Object {
  /**
    * Description of the event.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Entry time, which might be different from the event start time. e.g. the
    * event starts at 9am, but entry time is 8:30am.
    */
  var doorTime: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * End time.
    */
  var endDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * The characters related to this event. It can be directors or actors of a
    * movie event, or performers of a concert, etc.
    */
  var eventCharacters: js.UndefOr[js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter]] = js.undefined
  /**
    * The location where the event is happening, or an organization is located.
    */
  var location: js.UndefOr[GoogleActionsV2Location] = js.undefined
  /**
    * Required: Name of the event. For example, if the event is a movie, this
    * should be the movie name.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Start time.
    */
  var startDate: js.UndefOr[GoogleActionsOrdersV3Time] = js.undefined
  /**
    * Required: Type of the ticket event, e.g. movie, concert.
    */
  var `type`: js.UndefOr[GoogleActionsOrdersV3VerticalsTicketTicketEventType] = js.undefined
  /**
    * Url to the event info.
    */
  var url: js.UndefOr[String] = js.undefined
}

object GoogleActionsOrdersV3VerticalsTicketTicketEvent {
  @scala.inline
  def apply(
    description: String = null,
    doorTime: GoogleActionsOrdersV3Time = null,
    endDate: GoogleActionsOrdersV3Time = null,
    eventCharacters: js.Array[GoogleActionsOrdersV3VerticalsTicketEventCharacter] = null,
    location: GoogleActionsV2Location = null,
    name: String = null,
    startDate: GoogleActionsOrdersV3Time = null,
    `type`: GoogleActionsOrdersV3VerticalsTicketTicketEventType = null,
    url: String = null
  ): GoogleActionsOrdersV3VerticalsTicketTicketEvent = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (doorTime != null) __obj.updateDynamic("doorTime")(doorTime.asInstanceOf[js.Any])
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (eventCharacters != null) __obj.updateDynamic("eventCharacters")(eventCharacters.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleActionsOrdersV3VerticalsTicketTicketEvent]
  }
}

