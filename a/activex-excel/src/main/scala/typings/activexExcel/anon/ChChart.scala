package typings.activexExcel.anon

import typings.activexExcel.Excel.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChChart extends js.Object {
  val Ch: Chart
}

object ChChart {
  @scala.inline
  def apply(Ch: Chart): ChChart = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChChart]
  }
}

