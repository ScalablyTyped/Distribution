package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListTestGridSessionActionsRequest extends StObject {
  
  /**
    * The maximum number of sessions to return per response.
    */
  var maxResult: js.UndefOr[MaxPageSize] = js.undefined
  
  /**
    * Pagination token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The ARN of the session to retrieve.
    */
  var sessionArn: DeviceFarmArn
}
object ListTestGridSessionActionsRequest {
  
  inline def apply(sessionArn: DeviceFarmArn): ListTestGridSessionActionsRequest = {
    val __obj = js.Dynamic.literal(sessionArn = sessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTestGridSessionActionsRequest]
  }
  
  extension [Self <: ListTestGridSessionActionsRequest](x: Self) {
    
    inline def setMaxResult(value: MaxPageSize): Self = StObject.set(x, "maxResult", value.asInstanceOf[js.Any])
    
    inline def setMaxResultUndefined: Self = StObject.set(x, "maxResult", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSessionArn(value: DeviceFarmArn): Self = StObject.set(x, "sessionArn", value.asInstanceOf[js.Any])
  }
}
