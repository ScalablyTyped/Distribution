package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBorder extends js.Object {
  val Application: js.Any
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var LineStyle: js.Any
  val Parent: js.Any
  var Weight: js.Any
  @JSName("Word.ChartBorder_typekey")
  var WordDotChartBorder_typekey: ChartBorder
}

object ChartBorder {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    Parent: js.Any,
    Weight: js.Any,
    WordDotChartBorder_typekey: ChartBorder
  ): ChartBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartBorder_typekey")(WordDotChartBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorder]
  }
}

