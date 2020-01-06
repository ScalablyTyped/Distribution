package typings.awsDashSdk.clientsPersonalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateEventTrackerResponse extends js.Object {
  /**
    * The ARN of the event tracker.
    */
  var eventTrackerArn: js.UndefOr[Arn] = js.native
  /**
    * The ID of the event tracker. Include this ID in requests to the PutEvents API.
    */
  var trackingId: js.UndefOr[TrackingId] = js.native
}

object CreateEventTrackerResponse {
  @scala.inline
  def apply(eventTrackerArn: Arn = null, trackingId: TrackingId = null): CreateEventTrackerResponse = {
    val __obj = js.Dynamic.literal()
    if (eventTrackerArn != null) __obj.updateDynamic("eventTrackerArn")(eventTrackerArn.asInstanceOf[js.Any])
    if (trackingId != null) __obj.updateDynamic("trackingId")(trackingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEventTrackerResponse]
  }
}

