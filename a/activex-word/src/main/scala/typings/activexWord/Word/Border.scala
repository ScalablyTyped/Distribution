package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Border extends js.Object {
  val Application: typings.activexWord.Word.Application
  var ArtStyle: WdPageBorderArt
  var ArtWidth: Double
  var Color: WdColor
  var ColorIndex: WdColorIndex
  val Creator: Double
  val Inside: Boolean
  var LineStyle: WdLineStyle
  var LineWidth: WdLineWidth
  val Parent: js.Any
  var Visible: Boolean
  @JSName("Word.Border_typekey")
  var WordDotBorder_typekey: Border
}

object Border {
  @scala.inline
  def apply(
    Application: Application,
    ArtStyle: WdPageBorderArt,
    ArtWidth: Double,
    Color: WdColor,
    ColorIndex: WdColorIndex,
    Creator: Double,
    Inside: Boolean,
    LineStyle: WdLineStyle,
    LineWidth: WdLineWidth,
    Parent: js.Any,
    Visible: Boolean,
    WordDotBorder_typekey: Border
  ): Border = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], ArtStyle = ArtStyle.asInstanceOf[js.Any], ArtWidth = ArtWidth.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Inside = Inside.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], LineWidth = LineWidth.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Border_typekey")(WordDotBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Border]
  }
}

