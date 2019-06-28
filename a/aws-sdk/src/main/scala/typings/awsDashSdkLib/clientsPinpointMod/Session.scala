package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Session extends js.Object {
  /**
    * The duration of the session, in milliseconds.
    */
  var Duration: js.UndefOr[__integer] = js.undefined
  /**
    * The unique identifier for the session.
    */
  var Id: __string
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: __string
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[__string] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    Id: __string,
    StartTimestamp: __string,
    Duration: js.UndefOr[__integer] = js.undefined,
    StopTimestamp: __string = null
  ): Session = {
    val __obj = js.Dynamic.literal(Id = Id, StartTimestamp = StartTimestamp)
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (StopTimestamp != null) __obj.updateDynamic("StopTimestamp")(StopTimestamp)
    __obj.asInstanceOf[Session]
  }
}

