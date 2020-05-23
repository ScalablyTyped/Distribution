package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Breaks: typings.activexWord.Word.Breaks
  val Creator: Double
  val EnhMetaFileBits: js.Any
  val Height: Double
  val Left: Double
  val Parent: js.Any
  val Rectangles: typings.activexWord.Word.Rectangles
  val Top: Double
  val Width: Double
  @JSName("Word.Page_typekey")
  var WordDotPage_typekey: Page
}

object Page {
  @scala.inline
  def apply(
    Application: Application,
    Breaks: Breaks,
    Creator: Double,
    EnhMetaFileBits: js.Any,
    Height: Double,
    Left: Double,
    Parent: js.Any,
    Rectangles: Rectangles,
    Top: Double,
    Width: Double,
    WordDotPage_typekey: Page
  ): Page = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Breaks = Breaks.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EnhMetaFileBits = EnhMetaFileBits.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Rectangles = Rectangles.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Page_typekey")(WordDotPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Page]
  }
}

