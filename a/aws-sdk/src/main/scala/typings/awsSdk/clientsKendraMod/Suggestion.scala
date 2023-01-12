package typings.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suggestion extends StObject {
  
  /**
    * The unique UUID (universally unique identifier) of a single query suggestion.
    */
  var Id: js.UndefOr[ResultId] = js.undefined
  
  /**
    * The value for the unique UUID (universally unique identifier) of a single query suggestion. The value is the text string of a suggestion.
    */
  var Value: js.UndefOr[SuggestionValue] = js.undefined
}
object Suggestion {
  
  inline def apply(): Suggestion = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suggestion]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Suggestion] (val x: Self) extends AnyVal {
    
    inline def setId(value: ResultId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setValue(value: SuggestionValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
