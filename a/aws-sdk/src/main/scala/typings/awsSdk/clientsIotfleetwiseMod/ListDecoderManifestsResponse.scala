package typings.awsSdk.clientsIotfleetwiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDecoderManifestsResponse extends StObject {
  
  /**
    *  The token to retrieve the next set of results, or null if there are no more results. 
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsIotfleetwiseMod.nextToken] = js.undefined
  
  /**
    *  A list of information about each decoder manifest. 
    */
  var summaries: js.UndefOr[decoderManifestSummaries] = js.undefined
}
object ListDecoderManifestsResponse {
  
  inline def apply(): ListDecoderManifestsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDecoderManifestsResponse]
  }
  
  extension [Self <: ListDecoderManifestsResponse](x: Self) {
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSummaries(value: decoderManifestSummaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: DecoderManifestSummary*): Self = StObject.set(x, "summaries", js.Array(value*))
  }
}
