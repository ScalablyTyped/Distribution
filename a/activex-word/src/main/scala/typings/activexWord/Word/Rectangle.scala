package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rectangle extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Height: Double
  val Left: Double
  val Lines: typings.activexWord.Word.Lines
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val RectangleType: WdRectangleType
  val Top: Double
  val Width: Double
  @JSName("Word.Rectangle_typekey")
  var WordDotRectangle_typekey: Rectangle
}

object Rectangle {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Height: Double,
    Left: Double,
    Lines: Lines,
    Parent: js.Any,
    Range: Range,
    RectangleType: WdRectangleType,
    Top: Double,
    Width: Double,
    WordDotRectangle_typekey: Rectangle
  ): Rectangle = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Lines = Lines.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], RectangleType = RectangleType.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Rectangle_typekey")(WordDotRectangle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rectangle]
  }
}

