package typings.awsSdk.clientsIvsrealtimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListStagesRequest extends StObject {
  
  /**
    * Maximum number of results to return. Default: 50.
    */
  var maxResults: js.UndefOr[MaxStageResults] = js.undefined
  
  /**
    * The first stage to retrieve. This is used for pagination; see the nextToken response field.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListStagesRequest {
  
  inline def apply(): ListStagesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListStagesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListStagesRequest] (val x: Self) extends AnyVal {
    
    inline def setMaxResults(value: MaxStageResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
