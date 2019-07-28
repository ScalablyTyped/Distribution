package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SegmentBehaviors extends js.Object {
  /**
    * The dimension settings that are based on how recently an endpoint was active.
    */
  var Recency: js.UndefOr[RecencyDimension] = js.undefined
}

object SegmentBehaviors {
  @scala.inline
  def apply(Recency: RecencyDimension = null): SegmentBehaviors = {
    val __obj = js.Dynamic.literal()
    if (Recency != null) __obj.updateDynamic("Recency")(Recency)
    __obj.asInstanceOf[SegmentBehaviors]
  }
}

