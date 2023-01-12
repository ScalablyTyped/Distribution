package typings.awsSdk.clientsCloudsearchdomainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuggestionMatch extends StObject {
  
  /**
    * The document ID of the suggested document.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The relevance score of a suggested match.
    */
  var score: js.UndefOr[Long] = js.undefined
  
  /**
    * The string that matches the query string specified in the SuggestRequest. 
    */
  var suggestion: js.UndefOr[String] = js.undefined
}
object SuggestionMatch {
  
  inline def apply(): SuggestionMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionMatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SuggestionMatch] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setScore(value: Long): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
    
    inline def setSuggestion(value: String): Self = StObject.set(x, "suggestion", value.asInstanceOf[js.Any])
    
    inline def setSuggestionUndefined: Self = StObject.set(x, "suggestion", js.undefined)
  }
}
