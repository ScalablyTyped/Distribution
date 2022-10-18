package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SocketAddress extends StObject {
  
  /**
    * Name of a socket address.
    */
  var name: String
  
  /**
    * Port of a socket address.
    */
  var port: Integer
}
object SocketAddress {
  
  inline def apply(name: String, port: Integer): SocketAddress = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketAddress]
  }
  
  extension [Self <: SocketAddress](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Integer): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
