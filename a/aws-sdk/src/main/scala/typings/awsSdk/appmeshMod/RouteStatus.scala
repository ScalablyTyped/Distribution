package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteStatus extends StObject {
  
  /**
    * The current status for the route.
    */
  var status: RouteStatusCode
}
object RouteStatus {
  
  @scala.inline
  def apply(status: RouteStatusCode): RouteStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteStatus]
  }
  
  @scala.inline
  implicit class RouteStatusMutableBuilder[Self <: RouteStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: RouteStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
