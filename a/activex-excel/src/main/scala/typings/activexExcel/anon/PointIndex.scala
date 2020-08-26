package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PointIndex extends js.Object {
  val PointIndex: Double = js.native
  val SeriesIndex: Double = js.native
}

object PointIndex {
  @scala.inline
  def apply(PointIndex: Double, SeriesIndex: Double): PointIndex = {
    val __obj = js.Dynamic.literal(PointIndex = PointIndex.asInstanceOf[js.Any], SeriesIndex = SeriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointIndex]
  }
  @scala.inline
  implicit class PointIndexOps[Self <: PointIndex] (val x: Self) extends AnyVal {
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
    def setPointIndex(value: Double): Self = this.set("PointIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("SeriesIndex", value.asInstanceOf[js.Any])
  }
  
}

