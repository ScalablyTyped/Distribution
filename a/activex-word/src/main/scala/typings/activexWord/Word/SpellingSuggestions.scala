package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpellingSuggestions extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  val SpellingErrorType: WdSpellingErrorType = js.native
  @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: SpellingSuggestions = js.native
  def Item(Index: Double): SpellingSuggestion = js.native
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
  @scala.inline
  implicit class SpellingSuggestionsOps[Self <: SpellingSuggestions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => SpellingSuggestion): Self = this.set("Item", js.Any.fromFunction1(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpellingErrorType(value: WdSpellingErrorType): Self = this.set("SpellingErrorType", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotSpellingSuggestions_typekey(value: SpellingSuggestions): Self = this.set("Word.SpellingSuggestions_typekey", value.asInstanceOf[js.Any])
  }
  
}

