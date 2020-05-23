package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpellingSuggestions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  val SpellingErrorType: WdSpellingErrorType
  @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: SpellingSuggestions
  def Item(Index: Double): SpellingSuggestion
}

object SpellingSuggestions {
  @scala.inline
  def apply(
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => SpellingSuggestion,
    Parent: js.Any,
    SpellingErrorType: WdSpellingErrorType,
    WordDotSpellingSuggestions_typekey: SpellingSuggestions
  ): SpellingSuggestions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], SpellingErrorType = SpellingErrorType.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SpellingSuggestions_typekey")(WordDotSpellingSuggestions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingSuggestions]
  }
}

