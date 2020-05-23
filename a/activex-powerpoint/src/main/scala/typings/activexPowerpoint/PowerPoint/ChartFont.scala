package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFont extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Background: js.Any
  var Bold: js.Any
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var FontStyle: js.Any
  var Italic: js.Any
  var Name: js.Any
  var OutlineFont: js.Any
  val Parent: js.Any
  @JSName("PowerPoint.ChartFont_typekey")
  var PowerPointDotChartFont_typekey: ChartFont
  var Shadow: js.Any
  var Size: js.Any
  var Strikethrough: js.Any
  var Subscript: js.Any
  var Superscript: js.Any
  var Underline: js.Any
}

object ChartFont {
  @scala.inline
  def apply(
    Application: Application,
    Background: js.Any,
    Bold: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    FontStyle: js.Any,
    Italic: js.Any,
    Name: js.Any,
    OutlineFont: js.Any,
    Parent: js.Any,
    PowerPointDotChartFont_typekey: ChartFont,
    Shadow: js.Any,
    Size: js.Any,
    Strikethrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], Strikethrough = Strikethrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.ChartFont_typekey")(PowerPointDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
}

