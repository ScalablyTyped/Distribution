package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorFormat extends js.Object {
  val Application: js.Any
  val Creator: Double
  @JSName("Office.ChartColorFormat_typekey")
  var OfficeDotChartColorFormat_typekey: ChartColorFormat
  val Parent: js.Any
  var RGB: Double
  var SchemeColor: Double
  val Type: Double
  val _Default: Double
}

object ChartColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    OfficeDotChartColorFormat_typekey: ChartColorFormat,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.ChartColorFormat_typekey")(OfficeDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
}

