package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartColorFormat extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Parent: js.Any
  val RGB: Double
  var SchemeColor: Double
  val Type: Double
  @JSName("Word.ChartColorFormat_typekey")
  var WordDotChartColorFormat_typekey: ChartColorFormat
  val _Default: Double
}

object ChartColorFormat {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Parent: js.Any,
    RGB: Double,
    SchemeColor: Double,
    Type: Double,
    WordDotChartColorFormat_typekey: ChartColorFormat,
    _Default: Double
  ): ChartColorFormat = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RGB = RGB.asInstanceOf[js.Any], SchemeColor = SchemeColor.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], _Default = _Default.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartColorFormat_typekey")(WordDotChartColorFormat_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartColorFormat]
  }
}

