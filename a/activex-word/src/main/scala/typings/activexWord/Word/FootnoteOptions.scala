package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FootnoteOptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Location: WdFootnoteLocation
  var NumberStyle: WdNoteNumberStyle
  var NumberingRule: WdNumberingRule
  val Parent: js.Any
  var StartingNumber: Double
  @JSName("Word.FootnoteOptions_typekey")
  var WordDotFootnoteOptions_typekey: FootnoteOptions
}

object FootnoteOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdFootnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotFootnoteOptions_typekey: FootnoteOptions
  ): FootnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.FootnoteOptions_typekey")(WordDotFootnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FootnoteOptions]
  }
}

