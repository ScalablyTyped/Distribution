package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualNodeTcpConnectionPool extends StObject {
  
  /**
    * Maximum number of outbound TCP connections Envoy can establish concurrently with all hosts in upstream cluster.
    */
  var maxConnections: MaxConnections = js.native
}
object VirtualNodeTcpConnectionPool {
  
  @scala.inline
  def apply(maxConnections: MaxConnections): VirtualNodeTcpConnectionPool = {
    val __obj = js.Dynamic.literal(maxConnections = maxConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeTcpConnectionPool]
  }
  
  @scala.inline
  implicit class VirtualNodeTcpConnectionPoolMutableBuilder[Self <: VirtualNodeTcpConnectionPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxConnections(value: MaxConnections): Self = StObject.set(x, "maxConnections", value.asInstanceOf[js.Any])
  }
}
