package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Line extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Height: Double
  val Left: Double
  val LineType: WdLineType
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Rectangles: typings.activexWord.Word.Rectangles
  val Top: Double
  val Width: Double
  @JSName("Word.Line_typekey")
  var WordDotLine_typekey: Line
}

object Line {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    LineType: WdLineType,
    Parent: js.Any,
    Range: Range,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotLine_typekey: Line
  ): Line = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], LineType = LineType.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Line_typekey")(WordDotLine_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Line]
  }
}

