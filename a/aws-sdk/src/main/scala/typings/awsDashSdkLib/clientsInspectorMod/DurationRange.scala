package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationRange extends js.Object {
  /**
    * The maximum value of the duration range. Must be less than or equal to 604800 seconds (1 week).
    */
  var maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
  /**
    * The minimum value of the duration range. Must be greater than zero.
    */
  var minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
}

object DurationRange {
  @scala.inline
  def apply(
    maxSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined,
    minSeconds: js.UndefOr[AssessmentRunDuration] = js.undefined
  ): DurationRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxSeconds)) __obj.updateDynamic("maxSeconds")(maxSeconds)
    if (!js.isUndefined(minSeconds)) __obj.updateDynamic("minSeconds")(minSeconds)
    __obj.asInstanceOf[DurationRange]
  }
}

