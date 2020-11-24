package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpRoute extends js.Object {
  
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
  implicit class HttpRouteOps[Self <: HttpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAction(value: HttpRouteAction): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatch(value: HttpRouteMatch): Self = this.set("match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryPolicy(value: HttpRetryPolicy): Self = this.set("retryPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryPolicy: Self = this.set("retryPolicy", js.undefined)
    
    @scala.inline
    def setTimeout(value: HttpTimeout): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
