package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GrpcRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcRouteAction
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcRouteMatch
  
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[GrpcRetryPolicy] = js.undefined
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[GrpcTimeout] = js.undefined
}
object GrpcRoute {
  
  inline def apply(action: GrpcRouteAction, `match`: GrpcRouteMatch): GrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRoute]
  }
  
  extension [Self <: GrpcRoute](x: Self) {
    
    inline def setAction(value: GrpcRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setMatch(value: GrpcRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicy(value: GrpcRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    inline def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    inline def setTimeout(value: GrpcTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
