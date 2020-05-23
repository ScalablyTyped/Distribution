package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointIndex extends js.Object {
  val PointIndex: Double
  val SeriesIndex: Double
}

object PointIndex {
  @scala.inline
  def apply(PointIndex: Double, SeriesIndex: Double): PointIndex = {
    val __obj = js.Dynamic.literal(PointIndex = PointIndex.asInstanceOf[js.Any], SeriesIndex = SeriesIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointIndex]
  }
}

