package typings.awsDashSdk.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscriptionsMessage extends js.Object {
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsDashSdk.clientsRedshiftMod.EventSubscriptionsList] = js.undefined
  /**
    * A value that indicates the starting point for the next set of response records in a subsequent request. If a value is returned in a response, you can retrieve the next set of records by providing this returned marker value in the Marker parameter and retrying the command. If the Marker field is empty, all response records have been retrieved for the request. 
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object EventSubscriptionsMessage {
  @scala.inline
  def apply(EventSubscriptionsList: EventSubscriptionsList = null, Marker: String = null): EventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (EventSubscriptionsList != null) __obj.updateDynamic("EventSubscriptionsList")(EventSubscriptionsList)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[EventSubscriptionsMessage]
  }
}

