package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.SpellingSuggestions")
@js.native
class SpellingSuggestions protected () extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val SpellingErrorType: WdSpellingErrorType = js.native
  @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: SpellingSuggestions = js.native
  def Item(Index: Double): SpellingSuggestion = js.native
}

