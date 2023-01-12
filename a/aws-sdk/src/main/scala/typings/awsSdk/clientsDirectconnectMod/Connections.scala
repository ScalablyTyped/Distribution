package typings.awsSdk.clientsDirectconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Connections extends StObject {
  
  /**
    * The connections.
    */
  var connections: js.UndefOr[ConnectionList] = js.undefined
}
object Connections {
  
  inline def apply(): Connections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Connections]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Connections] (val x: Self) extends AnyVal {
    
    inline def setConnections(value: ConnectionList): Self = StObject.set(x, "connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "connections", js.undefined)
    
    inline def setConnectionsVarargs(value: Connection*): Self = StObject.set(x, "connections", js.Array(value*))
  }
}
