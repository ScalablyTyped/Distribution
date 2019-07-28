package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPartnerEventsRequest extends js.Object {
  /**
    * The list of events to write to the event bus.
    */
  var Entries: PutPartnerEventsRequestEntryList
}

object PutPartnerEventsRequest {
  @scala.inline
  def apply(Entries: PutPartnerEventsRequestEntryList): PutPartnerEventsRequest = {
    val __obj = js.Dynamic.literal(Entries = Entries)
  
    __obj.asInstanceOf[PutPartnerEventsRequest]
  }
}

