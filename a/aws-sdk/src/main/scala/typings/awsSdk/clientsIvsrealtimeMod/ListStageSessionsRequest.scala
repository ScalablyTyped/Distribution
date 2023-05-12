package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStageSessionsRequest extends StObject {
  
  /**
    * Maximum number of results to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxStageSessionResults] = js.undefined
  
  /**
    * The first stage to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Stage ARN.
    */
  var stageArn: StageArn
}
object ListStageSessionsRequest {
  
  inline def apply(stageArn: StageArn): ListStageSessionsRequest = {
    val __obj = js.Dynamic.literal(stageArn = stageArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListStageSessionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStageSessionsRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxStageSessionResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setStageArn(value: StageArn): Self = StObject.set(x, "stageArn", value.asInstanceOf[js.Any])
  }
}
