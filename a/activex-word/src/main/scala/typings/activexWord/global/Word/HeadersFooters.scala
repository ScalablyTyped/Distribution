package typings.activexWord.global.Word

import typings.activexWord.Word.WdHeaderFooterIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.HeadersFooters")
@js.native
class HeadersFooters protected ()
  extends typings.activexWord.Word.HeadersFooters {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("Word.HeadersFooters_typekey")
  override var WordDotHeadersFooters_typekey: typings.activexWord.Word.HeadersFooters = js.native
  /* CompleteClass */
  override def Item(Index: WdHeaderFooterIndex): typings.activexWord.Word.HeaderFooter = js.native
}

