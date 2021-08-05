package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpellingSuggestions extends StObject {
  
  val Application: typings.activexWord.Word.Application
  
  val Count: Double
  
  val Creator: Double
  
  def Item(Index: Double): SpellingSuggestion
  
  val Parent: js.Any
  
  val SpellingErrorType: WdSpellingErrorType
  
  /* private */ @JSName("Word.SpellingSuggestions_typekey")
  var WordDotSpellingSuggestions_typekey: SpellingSuggestions
}
object SpellingSuggestions {
  
  inline def apply(
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
  
  extension [Self <: SpellingSuggestions](x: Self) {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setCount(value: Double): Self = StObject.set(x, "Count", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: Double): Self = StObject.set(x, "Creator", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Double => SpellingSuggestion): Self = StObject.set(x, "Item", js.Any.fromFunction1(value))
    
    inline def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSpellingErrorType(value: WdSpellingErrorType): Self = StObject.set(x, "SpellingErrorType", value.asInstanceOf[js.Any])
    
    inline def setWordDotSpellingSuggestions_typekey(value: SpellingSuggestions): Self = StObject.set(x, "Word.SpellingSuggestions_typekey", value.asInstanceOf[js.Any])
  }
}
