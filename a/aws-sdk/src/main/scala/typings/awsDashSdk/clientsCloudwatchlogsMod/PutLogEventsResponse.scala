package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutLogEventsResponse extends js.Object {
  /**
    * The next sequence token.
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.native
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.native
}

object PutLogEventsResponse {
  @scala.inline
  def apply(nextSequenceToken: SequenceToken = null, rejectedLogEventsInfo: RejectedLogEventsInfo = null): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextSequenceToken != null) __obj.updateDynamic("nextSequenceToken")(nextSequenceToken.asInstanceOf[js.Any])
    if (rejectedLogEventsInfo != null) __obj.updateDynamic("rejectedLogEventsInfo")(rejectedLogEventsInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutLogEventsResponse]
  }
}

