package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session extends js.Object {
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[__integer] = js.native
  /**
    * The unique identifier for the session.
    */
  var Id: __string = js.native
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: __string = js.native
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[__string] = js.native
}

object Session {
  @scala.inline
  def apply(
    Id: __string,
    StartTimestamp: __string,
    Duration: Int | Double = null,
    StopTimestamp: __string = null
  ): Session = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], StartTimestamp = StartTimestamp.asInstanceOf[js.Any])
    if (Duration != null) __obj.updateDynamic("Duration")(Duration.asInstanceOf[js.Any])
    if (StopTimestamp != null) __obj.updateDynamic("StopTimestamp")(StopTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session]
  }
}

