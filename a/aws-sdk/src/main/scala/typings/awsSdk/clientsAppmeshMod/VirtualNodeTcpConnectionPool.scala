package typings.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeTcpConnectionPool extends StObject {
  
  /**
    * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
    */
  var maxConnections: MaxConnections
}
object VirtualNodeTcpConnectionPool {
  
  inline def apply(maxConnections: MaxConnections): VirtualNodeTcpConnectionPool = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeTcpConnectionPool]
  }
  
  extension [Self <: VirtualNodeTcpConnectionPool](x: Self) {
    
    inline def setMaxConnections(value: MaxConnections): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
  }
}
