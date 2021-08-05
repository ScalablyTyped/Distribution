package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpRoute extends StObject {
  
  /**
    * The action to take if a match is determined.
    */
  var action: TcpRouteAction
  
  /**
    * An object that represents types of timeouts. 
    */
  var timeout: js.UndefOr[TcpTimeout] = js.undefined
}
object TcpRoute {
  
  inline def apply(action: TcpRouteAction): TcpRoute = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpRoute]
  }
  
  extension [Self <: TcpRoute](x: Self) {
    
    inline def setAction(value: TcpRouteAction): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setTimeout(value: TcpTimeout): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
