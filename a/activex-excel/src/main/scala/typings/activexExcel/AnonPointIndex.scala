package typings.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPointIndex extends js.Object {
  val PointIndex: Double
  val SeriesIndex: Double
}

object AnonPointIndex {
  @scala.inline
  def apply(PointIndex: Double, SeriesIndex: Double): AnonPointIndex = {
    val __obj = js.Dynamic.literal(PointIndex = PointIndex.asInstanceOf[js.Any], SeriesIndex = SeriesIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPointIndex]
  }
}

