package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutLogEventsResponse extends js.Object {
  /**
    * The next sequence token.
    */
  var nextSequenceToken: js.UndefOr[SequenceToken] = js.undefined
  /**
    * The rejected events.
    */
  var rejectedLogEventsInfo: js.UndefOr[RejectedLogEventsInfo] = js.undefined
}

object PutLogEventsResponse {
  @scala.inline
  def apply(nextSequenceToken: SequenceToken = null, rejectedLogEventsInfo: RejectedLogEventsInfo = null): PutLogEventsResponse = {
    val __obj = js.Dynamic.literal()
    if (nextSequenceToken != null) __obj.updateDynamic("nextSequenceToken")(nextSequenceToken)
    if (rejectedLogEventsInfo != null) __obj.updateDynamic("rejectedLogEventsInfo")(rejectedLogEventsInfo)
    __obj.asInstanceOf[PutLogEventsResponse]
  }
}

