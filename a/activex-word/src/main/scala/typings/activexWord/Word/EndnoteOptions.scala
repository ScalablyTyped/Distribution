package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EndnoteOptions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var Location: WdEndnoteLocation
  var NumberStyle: WdNoteNumberStyle
  var NumberingRule: WdNumberingRule
  val Parent: js.Any
  var StartingNumber: Double
  @JSName("Word.EndnoteOptions_typekey")
  var WordDotEndnoteOptions_typekey: EndnoteOptions
}

object EndnoteOptions {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Location: WdEndnoteLocation,
    NumberStyle: WdNoteNumberStyle,
    NumberingRule: WdNumberingRule,
    Parent: js.Any,
    StartingNumber: Double,
    WordDotEndnoteOptions_typekey: EndnoteOptions
  ): EndnoteOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], NumberStyle = NumberStyle.asInstanceOf[js.Any], NumberingRule = NumberingRule.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], StartingNumber = StartingNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.EndnoteOptions_typekey")(WordDotEndnoteOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndnoteOptions]
  }
}

