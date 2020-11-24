package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Language extends js.Object {
  
  val ActiveGrammarDictionary: Dictionary = js.native
  
  val ActiveHyphenationDictionary: Dictionary = js.native
  
  val ActiveSpellingDictionary: Dictionary = js.native
  
  val ActiveThesaurusDictionary: Dictionary = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Creator: Double = js.native
  
  var DefaultWritingStyle: String = js.native
  
  val ID: WdLanguageID = js.native
  
  val Name: String = js.native
  
  val NameLocal: String = js.native
  
  val Parent: js.Any = js.native
  
  var SpellingDictionaryType: WdDictionaryType = js.native
  
  @JSName("Word.Language_typekey")
  var WordDotLanguage_typekey: Language = js.native
  
  val WritingStyleList: js.Any = js.native
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
  
  @scala.inline
  implicit class LanguageOps[Self <: Language] (val x: Self) extends AnyVal {
    
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
    def setActiveGrammarDictionary(value: Dictionary): Self = this.set("ActiveGrammarDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveHyphenationDictionary(value: Dictionary): Self = this.set("ActiveHyphenationDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveSpellingDictionary(value: Dictionary): Self = this.set("ActiveSpellingDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveThesaurusDictionary(value: Dictionary): Self = this.set("ActiveThesaurusDictionary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultWritingStyle(value: String): Self = this.set("DefaultWritingStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setID(value: WdLanguageID): Self = this.set("ID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameLocal(value: String): Self = this.set("NameLocal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpellingDictionaryType(value: WdDictionaryType): Self = this.set("SpellingDictionaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWordDotLanguage_typekey(value: Language): Self = this.set("Word.Language_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritingStyleList(value: js.Any): Self = this.set("WritingStyleList", value.asInstanceOf[js.Any])
  }
}
