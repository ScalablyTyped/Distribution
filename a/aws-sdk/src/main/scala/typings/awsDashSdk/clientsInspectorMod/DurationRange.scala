package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationRange extends js.Object {
  /**
    * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
    */
  var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.native
  /**
    * The minimum value of the duration range. Must be greater than zero.
    */
  var minSeconds: js.UndefOr[AssessmentRunDuration] = js.native
}

object DurationRange {
  @scala.inline
  def apply(maxSeconds: Int | Double = null, minSeconds: Int | Double = null): DurationRange = {
    val __obj = js.Dynamic.literal()
    if (maxSeconds != null) __obj.updateDynamic("maxSeconds")(maxSeconds.asInstanceOf[js.Any])
    if (minSeconds != null) __obj.updateDynamic("minSeconds")(minSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationRange]
  }
}

