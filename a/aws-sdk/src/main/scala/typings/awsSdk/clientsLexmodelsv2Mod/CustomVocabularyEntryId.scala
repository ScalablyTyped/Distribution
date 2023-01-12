package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomVocabularyEntryId extends StObject {
  
  /**
    * The unique item identifier for the custom vocabulary items.
    */
  var itemId: ItemId
}
object CustomVocabularyEntryId {
  
  inline def apply(itemId: ItemId): CustomVocabularyEntryId = {
    val __obj = js.Dynamic.literal(itemId = itemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomVocabularyEntryId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomVocabularyEntryId] (val x: Self) extends AnyVal {
    
    inline def setItemId(value: ItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
  }
}
