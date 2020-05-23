package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CaptionLabel extends js.Object {
  val Application: typings.activexWord.Word.Application
  val BuiltIn: Boolean
  var ChapterStyleLevel: Double
  val Creator: Double
  val ID: WdCaptionLabelID
  var IncludeChapterNumber: Boolean
  val Name: String
  var NumberStyle: WdCaptionNumberStyle
  val Parent: js.Any
  var Position: WdCaptionPosition
  var Separator: WdSeparatorType
  @JSName("Word.CaptionLabel_typekey")
  var WordDotCaptionLabel_typekey: CaptionLabel
  def Delete(): Unit
}

object CaptionLabel {
  @scala.inline
  def apply(
    Application: Application,
    BuiltIn: Boolean,
    ChapterStyleLevel: Double,
    Creator: Double,
    Delete: () => Unit,
    ID: WdCaptionLabelID,
    IncludeChapterNumber: Boolean,
    Name: String,
    NumberStyle: WdCaptionNumberStyle,
    Parent: js.Any,
    Position: WdCaptionPosition,
    Separator: WdSeparatorType,
    WordDotCaptionLabel_typekey: CaptionLabel
  ): CaptionLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BuiltIn = BuiltIn.asInstanceOf[js.Any], ChapterStyleLevel = ChapterStyleLevel.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), ID = ID.asInstanceOf[js.Any], IncludeChapterNumber = IncludeChapterNumber.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Separator = Separator.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CaptionLabel_typekey")(WordDotCaptionLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptionLabel]
  }
}

