package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: TcpRouteAction = js.native
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[TcpTimeout] = js.native
}
object TcpRoute {
  
  @scala.inline
  def apply(action: TcpRouteAction): TcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRoute]
  }
  
  @scala.inline
  implicit class TcpRouteMutableBuilder[Self <: TcpRoute] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: TcpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: TcpTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
