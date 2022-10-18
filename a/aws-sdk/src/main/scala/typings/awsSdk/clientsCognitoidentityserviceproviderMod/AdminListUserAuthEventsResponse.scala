package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminListUserAuthEventsResponse extends StObject {
  
  /**
    * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
    */
  var AuthEvents: js.UndefOr[AuthEventsType] = js.undefined
  
  /**
    * A pagination token.
    */
  var NextToken: js.UndefOr[PaginationKey] = js.undefined
}
object AdminListUserAuthEventsResponse {
  
  inline def apply(): AdminListUserAuthEventsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminListUserAuthEventsResponse]
  }
  
  extension [Self <: AdminListUserAuthEventsResponse](x: Self) {
    
    inline def setAuthEvents(value: AuthEventsType): Self = StObject.set(x, "AuthEvents", value.asInstanceOf[js.Any])
    
    inline def setAuthEventsUndefined: Self = StObject.set(x, "AuthEvents", js.undefined)
    
    inline def setAuthEventsVarargs(value: AuthEventType*): Self = StObject.set(x, "AuthEvents", js.Array(value*))
    
    inline def setNextToken(value: PaginationKey): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
