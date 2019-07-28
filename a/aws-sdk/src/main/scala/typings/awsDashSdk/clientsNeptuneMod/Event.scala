package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Event extends js.Object {
  /**
    * Specifies the date and time of the event.
    */
  var Date: js.UndefOr[TStamp] = js.undefined
  /**
    * Specifies the category for the event.
    */
  var EventCategories: js.UndefOr[EventCategoriesList] = js.undefined
  /**
    * Provides the text of this event.
    */
  var Message: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) for the event.
    */
  var SourceArn: js.UndefOr[String] = js.undefined
  /**
    * Provides the identifier for the source of the event.
    */
  var SourceIdentifier: js.UndefOr[String] = js.undefined
  /**
    * Specifies the source type for this event.
    */
  var SourceType: js.UndefOr[typings.awsDashSdk.clientsNeptuneMod.SourceType] = js.undefined
}

object Event {
  @scala.inline
  def apply(
    Date: TStamp = null,
    EventCategories: EventCategoriesList = null,
    Message: String = null,
    SourceArn: String = null,
    SourceIdentifier: String = null,
    SourceType: SourceType = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (Date != null) __obj.updateDynamic("Date")(Date)
    if (EventCategories != null) __obj.updateDynamic("EventCategories")(EventCategories)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (SourceArn != null) __obj.updateDynamic("SourceArn")(SourceArn)
    if (SourceIdentifier != null) __obj.updateDynamic("SourceIdentifier")(SourceIdentifier)
    if (SourceType != null) __obj.updateDynamic("SourceType")(SourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

