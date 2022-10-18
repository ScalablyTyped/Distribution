package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionsList extends StObject {
  
  /**
    * A list of connections used by the job.
    */
  var Connections: js.UndefOr[OrchestrationStringList] = js.undefined
}
object ConnectionsList {
  
  inline def apply(): ConnectionsList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionsList]
  }
  
  extension [Self <: ConnectionsList](x: Self) {
    
    inline def setConnections(value: OrchestrationStringList): Self = StObject.set(x, "Connections", value.asInstanceOf[js.Any])
    
    inline def setConnectionsUndefined: Self = StObject.set(x, "Connections", js.undefined)
    
    inline def setConnectionsVarargs(value: GenericString*): Self = StObject.set(x, "Connections", js.Array(value*))
  }
}
