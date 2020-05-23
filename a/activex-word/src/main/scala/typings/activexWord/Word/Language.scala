package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Language extends js.Object {
  val ActiveGrammarDictionary: Dictionary
  val ActiveHyphenationDictionary: Dictionary
  val ActiveSpellingDictionary: Dictionary
  val ActiveThesaurusDictionary: Dictionary
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var DefaultWritingStyle: String
  val ID: WdLanguageID
  val Name: String
  val NameLocal: String
  val Parent: js.Any
  var SpellingDictionaryType: WdDictionaryType
  @JSName("Word.Language_typekey")
  var WordDotLanguage_typekey: Language
  val WritingStyleList: js.Any
}

object Language {
  @scala.inline
  def apply(
    ActiveGrammarDictionary: Dictionary,
    ActiveHyphenationDictionary: Dictionary,
    ActiveSpellingDictionary: Dictionary,
    ActiveThesaurusDictionary: Dictionary,
    Application: Application,
    Creator: Double,
    DefaultWritingStyle: String,
    ID: WdLanguageID,
    Name: String,
    NameLocal: String,
    Parent: js.Any,
    SpellingDictionaryType: WdDictionaryType,
    WordDotLanguage_typekey: Language,
    WritingStyleList: js.Any
  ): Language = {
    val __obj = js.Dynamic.literal(ActiveGrammarDictionary = ActiveGrammarDictionary.asInstanceOf[js.Any], ActiveHyphenationDictionary = ActiveHyphenationDictionary.asInstanceOf[js.Any], ActiveSpellingDictionary = ActiveSpellingDictionary.asInstanceOf[js.Any], ActiveThesaurusDictionary = ActiveThesaurusDictionary.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DefaultWritingStyle = DefaultWritingStyle.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NameLocal = NameLocal.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SpellingDictionaryType = SpellingDictionaryType.asInstanceOf[js.Any], WritingStyleList = WritingStyleList.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Language_typekey")(WordDotLanguage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Language]
  }
}

