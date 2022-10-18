package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccessPreviewsRequest extends StObject {
  
  /**
    * The ARN of the analyzer used to generate the access preview.
    */
  var analyzerArn: AnalyzerArn
  
  /**
    * The maximum number of results to return in the response.
    */
  var maxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token used for pagination of results returned.
    */
  var nextToken: js.UndefOr[Token] = js.undefined
}
object ListAccessPreviewsRequest {
  
  inline def apply(analyzerArn: AnalyzerArn): ListAccessPreviewsRequest = {
    val __obj = js.Dynamic.literal(analyzerArn = analyzerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAccessPreviewsRequest]
  }
  
  extension [Self <: ListAccessPreviewsRequest](x: Self) {
    
    inline def setAnalyzerArn(value: AnalyzerArn): Self = StObject.set(x, "analyzerArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
