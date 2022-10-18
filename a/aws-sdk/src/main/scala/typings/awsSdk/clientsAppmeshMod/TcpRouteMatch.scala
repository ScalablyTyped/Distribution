package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TcpRouteMatch extends StObject {
  
  /**
    * The port number to match on.
    */
  var port: js.UndefOr[ListenerPort] = js.undefined
}
object TcpRouteMatch {
  
  inline def apply(): TcpRouteMatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TcpRouteMatch]
  }
  
  extension [Self <: TcpRouteMatch](x: Self) {
    
    inline def setPort(value: ListenerPort): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
  }
}
