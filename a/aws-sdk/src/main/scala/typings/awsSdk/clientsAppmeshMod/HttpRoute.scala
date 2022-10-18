package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: HttpRouteAction
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: HttpRouteMatch
  
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.undefined
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[HttpTimeout] = js.undefined
}
object HttpRoute {
  
  inline def apply(action: HttpRouteAction, `match`: HttpRouteMatch): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRoute]
  }
  
  extension [Self <: HttpRoute](x: Self) {
    
    inline def setAction(value: HttpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: HttpRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: HttpRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: HttpTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
