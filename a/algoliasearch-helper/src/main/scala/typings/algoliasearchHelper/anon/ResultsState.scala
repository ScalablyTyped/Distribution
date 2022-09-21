package typings.algoliasearchHelper.anon

import typings.algoliasearchHelper.mod.SearchParameters
import typings.algoliasearchHelper.mod.SearchResults
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultsState extends StObject {
  
  var results: SearchResults[Any]
  
  var state: SearchParameters
}
object ResultsState {
  
  inline def apply(results: SearchResults[Any], state: SearchParameters): ResultsState = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultsState]
  }
  
  extension [Self <: ResultsState](x: Self) {
    
    inline def setResults(value: SearchResults[Any]): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setState(value: SearchParameters): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
