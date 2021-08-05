package typings.awsSdk.accessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAnalyzedResourcesResponse extends StObject {
  
  /**
    * A list of resources that were analyzed.
    */
  var analyzedResources: AnalyzedResourcesList
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAnalyzedResourcesResponse {
  
  inline def apply(analyzedResources: AnalyzedResourcesList): ListAnalyzedResourcesResponse = {
    val __obj = js.Dynamic.literal(analyzedResources = analyzedResources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAnalyzedResourcesResponse]
  }
  
  extension [Self <: ListAnalyzedResourcesResponse](x: Self) {
    
    inline def setAnalyzedResources(value: AnalyzedResourcesList): Self = StObject.set(x, "analyzedResources", value.asInstanceOf[js.Any])
    
    inline def setAnalyzedResourcesVarargs(value: AnalyzedResourceSummary*): Self = StObject.set(x, "analyzedResources", js.Array(value :_*))
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
