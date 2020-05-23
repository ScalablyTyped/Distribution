package typings.activexWord.global.Word

import typings.activexWord.Word.WdSpellingErrorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.SpellingSuggestions")
@js.native
class SpellingSuggestions protected ()
  extends typings.activexWord.Word.SpellingSuggestions {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val SpellingErrorType: WdSpellingErrorType = js.native
  /* CompleteClass */
  @JSName("Word.SpellingSuggestions_typekey")
  override var WordDotSpellingSuggestions_typekey: typings.activexWord.Word.SpellingSuggestions = js.native
  /* CompleteClass */
  override def Item(Index: Double): typings.activexWord.Word.SpellingSuggestion = js.native
}

