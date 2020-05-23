package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartFont extends js.Object {
  val Application: js.Any
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
  var Shadow: js.Any
  var Size: js.Any
  var StrikeThrough: js.Any
  var Subscript: js.Any
  var Superscript: js.Any
  var Underline: js.Any
  @JSName("Word.ChartFont_typekey")
  var WordDotChartFont_typekey: ChartFont
}

object ChartFont {
  @scala.inline
  def apply(
    Application: js.Any,
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
    Shadow: js.Any,
    Size: js.Any,
    StrikeThrough: js.Any,
    Subscript: js.Any,
    Superscript: js.Any,
    Underline: js.Any,
    WordDotChartFont_typekey: ChartFont
  ): ChartFont = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Background = Background.asInstanceOf[js.Any], Bold = Bold.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], FontStyle = FontStyle.asInstanceOf[js.Any], Italic = Italic.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], OutlineFont = OutlineFont.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Shadow = Shadow.asInstanceOf[js.Any], Size = Size.asInstanceOf[js.Any], StrikeThrough = StrikeThrough.asInstanceOf[js.Any], Subscript = Subscript.asInstanceOf[js.Any], Superscript = Superscript.asInstanceOf[js.Any], Underline = Underline.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartFont_typekey")(WordDotChartFont_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartFont]
  }
}

