package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorFormat extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val Creator: Double
  val Parent: js.Any
  @JSName("PowerPoint.ChartColorFormat_typekey")
  var PowerPointDotChartColorFormat_typekey: ChartColorFormat
  val RGB: Double
  var SchemeColor: Double
  val Type: Double
  val _Default: Double
}

object ChartColorFormat {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Parent: js.Any,
    PowerPointDotChartColorFormat_typekey: ChartColorFormat,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartColorFormat_typekey")(PowerPointDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
}

