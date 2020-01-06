package typings.awsDashSdk.clientsCodeguruprofilerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProfileTime extends js.Object {
  /**
    * The start time of the profile.
    */
  var start: js.UndefOr[Timestamp] = js.native
}

object ProfileTime {
  @scala.inline
  def apply(start: Timestamp = null): ProfileTime = {
    val __obj = js.Dynamic.literal()
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileTime]
  }
}

