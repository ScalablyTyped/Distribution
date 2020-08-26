package typings.activexExcel.anon

import typings.activexExcel.Excel.Chart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChChart extends js.Object {
  val Ch: Chart = js.native
}

object ChChart {
  @scala.inline
  def apply(Ch: Chart): ChChart = {
    val __obj = js.Dynamic.literal(Ch = Ch.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChChart]
  }
  @scala.inline
  implicit class ChChartOps[Self <: ChChart] (val x: Self) extends AnyVal {
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
    def setCh(value: Chart): Self = this.set("Ch", value.asInstanceOf[js.Any])
  }
  
}

