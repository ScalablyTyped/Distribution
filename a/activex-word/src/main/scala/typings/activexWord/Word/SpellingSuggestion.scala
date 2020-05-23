package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpellingSuggestion extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Name: String
  val Parent: js.Any
  @JSName("Word.SpellingSuggestion_typekey")
  var WordDotSpellingSuggestion_typekey: SpellingSuggestion
}

object SpellingSuggestion {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    Name: String,
    Parent: js.Any,
    WordDotSpellingSuggestion_typekey: SpellingSuggestion
  ): SpellingSuggestion = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.SpellingSuggestion_typekey")(WordDotSpellingSuggestion_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpellingSuggestion]
  }
}

