package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewCustomVocabularyItem extends StObject {
  
  /**
    * The display as value assigned to the new custom vocabulary item from the custom vocabulary list.
    */
  var displayAs: js.UndefOr[Phrase] = js.undefined
  
  /**
    * The unique phrase for the new custom vocabulary item from the custom vocabulary list.
    */
  var phrase: Phrase
  
  /**
    * The weight assigned to the new custom vocabulary item from the custom vocabulary list.
    */
  var weight: js.UndefOr[Weight] = js.undefined
}
object NewCustomVocabularyItem {
  
  inline def apply(phrase: Phrase): NewCustomVocabularyItem = {
    val __obj = js.Dynamic.literal(phrase = phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[NewCustomVocabularyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewCustomVocabularyItem] (val x: Self) extends AnyVal {
    
    inline def setDisplayAs(value: Phrase): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
    
    inline def setPhrase(value: Phrase): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Weight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
