package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomVocabularyItem extends StObject {
  
  /**
    * The display as value for the custom vocabulary item from the custom vocabulary list.
    */
  var displayAs: js.UndefOr[Phrase] = js.undefined
  
  /**
    * The unique item identifer for the custom vocabulary item from the custom vocabulary list.
    */
  var itemId: ItemId
  
  /**
    * The unique phrase for the custom vocabulary item from the custom vocabulary list.
    */
  var phrase: Phrase
  
  /**
    * The weight assigned for the custom vocabulary item from the custom vocabulary list.
    */
  var weight: js.UndefOr[Weight] = js.undefined
}
object CustomVocabularyItem {
  
  inline def apply(itemId: ItemId, phrase: Phrase): CustomVocabularyItem = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any], phrase = phrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomVocabularyItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomVocabularyItem] (val x: Self) extends AnyVal {
    
    inline def setDisplayAs(value: Phrase): Self = StObject.set(x, "displayAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayAsUndefined: Self = StObject.set(x, "displayAs", js.undefined)
    
    inline def setItemId(value: ItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setPhrase(value: Phrase): Self = StObject.set(x, "phrase", value.asInstanceOf[js.Any])
    
    inline def setWeight(value: Weight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
  }
}
