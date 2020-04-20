package typings.activexExcel

import typings.activexExcel.Excel.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChChart extends js.Object {
  val Ch: Chart
}

object AnonChChart {
  @scala.inline
  def apply(Ch: Chart): AnonChChart = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChChart]
  }
}

