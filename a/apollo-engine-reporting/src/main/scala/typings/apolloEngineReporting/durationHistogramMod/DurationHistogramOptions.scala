package typings.apolloEngineReporting.durationHistogramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurationHistogramOptions extends js.Object {
  var buckets: js.UndefOr[js.Array[Double]] = js.undefined
  var initSize: js.UndefOr[Double] = js.undefined
}

object DurationHistogramOptions {
  @scala.inline
  def apply(buckets: js.Array[Double] = null, initSize: Int | Double = null): DurationHistogramOptions = {
    val __obj = js.Dynamic.literal()
    if (buckets != null) __obj.updateDynamic("buckets")(buckets.asInstanceOf[js.Any])
    if (initSize != null) __obj.updateDynamic("initSize")(initSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[DurationHistogramOptions]
  }
}

