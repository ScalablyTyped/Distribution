package typings.activexWord.global.Word

import typings.activexWord.Word.WdStyleSheetLinkType
import typings.activexWord.Word.WdStyleSheetPrecedence
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.StyleSheets")
@js.native
class StyleSheets protected ()
  extends typings.activexWord.Word.StyleSheets {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.StyleSheets_typekey")
  override var WordDotStyleSheets_typekey: typings.activexWord.Word.StyleSheets = js.native
  /* CompleteClass */
  override def Add(
    FileName: String,
    LinkType: WdStyleSheetLinkType,
    Title: String,
    Precedence: WdStyleSheetPrecedence
  ): typings.activexWord.Word.StyleSheet = js.native
  /* CompleteClass */
  override def Item(Index: js.Any): typings.activexWord.Word.StyleSheet = js.native
}

