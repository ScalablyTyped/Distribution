package typings.awsSdk.clientsInspectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewAgentsRequest extends StObject {
  
  /**
    * You can use this parameter to indicate the maximum number of items you want in the response. The default value is 10. The maximum value is 500.
    */
  var maxResults: js.UndefOr[PreviewAgentsMaxResults] = js.undefined
  
  /**
    * You can use this parameter when paginating results. Set the value of this parameter to null on your first call to the PreviewAgents action. Subsequent calls to the action fill nextToken in the request with the value of NextToken from the previous response to continue listing data.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ARN of the assessment target whose agents you want to preview.
    */
  var previewAgentsArn: Arn
}
object PreviewAgentsRequest {
  
  inline def apply(previewAgentsArn: Arn): PreviewAgentsRequest = {
    val __obj = js.Dynamic.literal(previewAgentsArn = previewAgentsArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewAgentsRequest]
  }
  
  extension [Self <: PreviewAgentsRequest](x: Self) {
    
    inline def setMaxResults(value: PreviewAgentsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setPreviewAgentsArn(value: Arn): Self = StObject.set(x, "previewAgentsArn", value.asInstanceOf[js.Any])
  }
}
