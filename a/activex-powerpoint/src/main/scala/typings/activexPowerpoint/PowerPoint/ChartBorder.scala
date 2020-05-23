package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartBorder extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var LineStyle: js.Any
  val Parent: js.Any
  @JSName("PowerPoint.ChartBorder_typekey")
  var PowerPointDotChartBorder_typekey: ChartBorder
  var Weight: js.Any
}

object ChartBorder {
  @scala.inline
  def apply(
    Application: Application,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    Parent: js.Any,
    PowerPointDotChartBorder_typekey: ChartBorder,
    Weight: js.Any
  ): ChartBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartBorder_typekey")(PowerPointDotChartBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartBorder]
  }
}

