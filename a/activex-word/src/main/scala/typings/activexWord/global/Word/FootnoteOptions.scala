package typings.activexWord.global.Word

import typings.activexWord.Word.WdFootnoteLocation
import typings.activexWord.Word.WdNoteNumberStyle
import typings.activexWord.Word.WdNumberingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.FootnoteOptions")
@js.native
class FootnoteOptions protected ()
  extends typings.activexWord.Word.FootnoteOptions {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Location: WdFootnoteLocation = js.native
  /* CompleteClass */
  override var NumberStyle: WdNoteNumberStyle = js.native
  /* CompleteClass */
  override var NumberingRule: WdNumberingRule = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var StartingNumber: Double = js.native
  /* CompleteClass */
  @JSName("Word.FootnoteOptions_typekey")
  override var WordDotFootnoteOptions_typekey: typings.activexWord.Word.FootnoteOptions = js.native
}

