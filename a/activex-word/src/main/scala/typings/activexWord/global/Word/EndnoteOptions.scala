package typings.activexWord.global.Word

import typings.activexWord.Word.WdEndnoteLocation
import typings.activexWord.Word.WdNoteNumberStyle
import typings.activexWord.Word.WdNumberingRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.EndnoteOptions")
@js.native
class EndnoteOptions protected ()
  extends typings.activexWord.Word.EndnoteOptions {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Location: WdEndnoteLocation = js.native
  /* CompleteClass */
  override var NumberStyle: WdNoteNumberStyle = js.native
  /* CompleteClass */
  override var NumberingRule: WdNumberingRule = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var StartingNumber: Double = js.native
  /* CompleteClass */
  @JSName("Word.EndnoteOptions_typekey")
  override var WordDotEndnoteOptions_typekey: typings.activexWord.Word.EndnoteOptions = js.native
}

