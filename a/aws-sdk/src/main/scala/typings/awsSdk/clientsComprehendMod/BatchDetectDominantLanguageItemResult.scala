package typings.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDetectDominantLanguageItemResult extends StObject {
  
  /**
    * The zero-based index of the document in the input list.
    */
  var Index: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more DominantLanguage objects describing the dominant languages in the document.
    */
  var Languages: js.UndefOr[ListOfDominantLanguages] = js.undefined
}
object BatchDetectDominantLanguageItemResult {
  
  inline def apply(): BatchDetectDominantLanguageItemResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDetectDominantLanguageItemResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BatchDetectDominantLanguageItemResult] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Integer): Self = StObject.set(x, "Index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "Index", js.undefined)
    
    inline def setLanguages(value: ListOfDominantLanguages): Self = StObject.set(x, "Languages", value.asInstanceOf[js.Any])
    
    inline def setLanguagesUndefined: Self = StObject.set(x, "Languages", js.undefined)
    
    inline def setLanguagesVarargs(value: DominantLanguage*): Self = StObject.set(x, "Languages", js.Array(value*))
  }
}
