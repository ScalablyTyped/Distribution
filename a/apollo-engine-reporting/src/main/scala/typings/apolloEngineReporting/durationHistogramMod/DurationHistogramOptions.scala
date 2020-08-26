package typings.apolloEngineReporting.durationHistogramMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DurationHistogramOptions extends js.Object {
  var buckets: js.UndefOr[js.Array[Double]] = js.native
  var initSize: js.UndefOr[Double] = js.native
}

object DurationHistogramOptions {
  @scala.inline
  def apply(): DurationHistogramOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DurationHistogramOptions]
  }
  @scala.inline
  implicit class DurationHistogramOptionsOps[Self <: DurationHistogramOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBucketsVarargs(value: Double*): Self = this.set("buckets", js.Array(value :_*))
    @scala.inline
    def setBuckets(value: js.Array[Double]): Self = this.set("buckets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBuckets: Self = this.set("buckets", js.undefined)
    @scala.inline
    def setInitSize(value: Double): Self = this.set("initSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitSize: Self = this.set("initSize", js.undefined)
  }
  
}

