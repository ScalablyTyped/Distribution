package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: GrpcRouteAction = js.native
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: GrpcRouteMatch = js.native
  
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[GrpcRetryPolicy] = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[GrpcTimeout] = js.native
}
object GrpcRoute {
  
  @scala.inline
  def apply(action: GrpcRouteAction, `match`: GrpcRouteMatch): GrpcRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GrpcRoute]
  }
  
  @scala.inline
  implicit class GrpcRouteMutableBuilder[Self <: GrpcRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: GrpcRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: GrpcRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: GrpcRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: GrpcTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
