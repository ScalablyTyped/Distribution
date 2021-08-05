package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnalyzersResponse extends StObject {
  
  /**
    * The analyzers retrieved.
    */
  var analyzers: AnalyzersList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAnalyzersResponse {
  
  inline def apply(analyzers: AnalyzersList): ListAnalyzersResponse = {
    val __obj = js.Dynamic.literal(analyzers = analyzers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzersResponse]
  }
  
  extension [Self <: ListAnalyzersResponse](x: Self) {
    
    inline def setAnalyzers(value: AnalyzersList): Self = StObject.set(x, "analyzers", value.asInstanceOf[js.Any])
    
    inline def setAnalyzersVarargs(value: AnalyzerSummary*): Self = StObject.set(x, "analyzers", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
