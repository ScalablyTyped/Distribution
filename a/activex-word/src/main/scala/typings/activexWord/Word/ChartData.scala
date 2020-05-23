package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartData extends js.Object {
  val IsLinked: Boolean
  @JSName("Word.ChartData_typekey")
  var WordDotChartData_typekey: ChartData
  val Workbook: js.Any
  def Activate(): Unit
  def BreakLink(): Unit
}

object ChartData {
  @scala.inline
  def apply(
    Activate: () => Unit,
    BreakLink: () => Unit,
    IsLinked: Boolean,
    WordDotChartData_typekey: ChartData,
    Workbook: js.Any
  ): ChartData = {
    val __obj = js.Dynamic.literal(Activate = js.Any.fromFunction0(Activate), BreakLink = js.Any.fromFunction0(BreakLink), IsLinked = IsLinked.asInstanceOf[js.Any], Workbook = Workbook.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartData_typekey")(WordDotChartData_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartData]
  }
}

