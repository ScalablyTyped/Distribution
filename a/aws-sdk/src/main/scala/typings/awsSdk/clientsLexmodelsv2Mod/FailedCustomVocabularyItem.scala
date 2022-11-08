package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailedCustomVocabularyItem extends StObject {
  
  /**
    * The unique error code for the failed custom vocabulary item from the custom vocabulary list.
    */
  var errorCode: js.UndefOr[ErrorCode] = js.undefined
  
  /**
    * The error message for the failed custom vocabulary item from the custom vocabulary list.
    */
  var errorMessage: js.UndefOr[ErrorMessage] = js.undefined
  
  /**
    * The unique item identifer for the failed custom vocabulary item from the custom vocabulary list.
    */
  var itemId: js.UndefOr[ItemId] = js.undefined
}
object FailedCustomVocabularyItem {
  
  inline def apply(): FailedCustomVocabularyItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailedCustomVocabularyItem]
  }
  
  extension [Self <: FailedCustomVocabularyItem](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setItemId(value: ItemId): Self = StObject.set(x, "itemId", value.asInstanceOf[js.Any])
    
    inline def setItemIdUndefined: Self = StObject.set(x, "itemId", js.undefined)
  }
}
