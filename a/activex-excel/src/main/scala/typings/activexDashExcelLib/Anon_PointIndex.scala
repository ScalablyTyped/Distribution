package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PointIndex extends js.Object {
  val PointIndex: scala.Double
  val SeriesIndex: scala.Double
}

object Anon_PointIndex {
  @scala.inline
  def apply(PointIndex: scala.Double, SeriesIndex: scala.Double): Anon_PointIndex = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("PointIndex")(PointIndex)
    __obj.updateDynamic("SeriesIndex")(SeriesIndex)
    __obj.asInstanceOf[Anon_PointIndex]
  }
}

