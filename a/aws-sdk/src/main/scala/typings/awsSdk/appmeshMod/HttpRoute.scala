package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRoute extends StObject {
  
  /**
    * An object that represents the action to take if a match is determined.
    */
  var action: HttpRouteAction = js.native
  
  /**
    * An object that represents the criteria for determining a request match.
    */
  var `match`: HttpRouteMatch = js.native
  
  /**
    * An object that represents a retry policy.
    */
  var retryPolicy: js.UndefOr[HttpRetryPolicy] = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[HttpTimeout] = js.native
}
object HttpRoute {
  
  @scala.inline
  def apply(action: HttpRouteAction, `match`: HttpRouteMatch): HttpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpRoute]
  }
  
  @scala.inline
  implicit class HttpRouteMutableBuilder[Self <: HttpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: HttpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: HttpRouteMatch): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: HttpRetryPolicy): Self = StObject.set(x, "retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicyUndefined: Self = StObject.set(x, "retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: HttpTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
