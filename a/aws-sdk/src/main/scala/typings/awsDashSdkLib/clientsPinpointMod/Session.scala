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
    * A unique identifier for the session.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the session began.
    */
  var StartTimestamp: js.UndefOr[__string] = js.undefined
  /**
    * The date and time when the session ended.
    */
  var StopTimestamp: js.UndefOr[__string] = js.undefined
}

object Session {
  @scala.inline
  def apply(
    Duration: js.UndefOr[__integer] = js.undefined,
    Id: __string = null,
    StartTimestamp: __string = null,
    StopTimestamp: __string = null
  ): Session = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Duration)) __obj.updateDynamic("Duration")(Duration)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (StartTimestamp != null) __obj.updateDynamic("StartTimestamp")(StartTimestamp)
    if (StopTimestamp != null) __obj.updateDynamic("StopTimestamp")(StopTimestamp)
    __obj.asInstanceOf[Session]
  }
}

