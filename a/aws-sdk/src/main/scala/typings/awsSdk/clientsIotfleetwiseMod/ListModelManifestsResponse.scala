package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListModelManifestsResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of information about vehicle models.
    */
  var summaries: js.UndefOr[modelManifestSummaries] = js.undefined
}
object ListModelManifestsResponse {
  
  inline def apply(): ListModelManifestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListModelManifestsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListModelManifestsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: modelManifestSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: ModelManifestSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
