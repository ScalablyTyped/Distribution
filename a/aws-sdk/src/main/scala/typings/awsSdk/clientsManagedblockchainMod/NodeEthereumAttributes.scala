package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeEthereumAttributes extends StObject {
  
  /**
    * The endpoint on which the Ethereum node listens to run Ethereum API methods over HTTP connections from a client. Use this endpoint in client code for smart contracts when using an HTTP connection. Connections to this endpoint are authenticated using Signature Version 4.
    */
  var HttpEndpoint: js.UndefOr[String] = js.undefined
  
  /**
    * The endpoint on which the Ethereum node listens to run Ethereum JSON-RPC methods over WebSocket connections from a client. Use this endpoint in client code for smart contracts when using a WebSocket connection. Connections to this endpoint are authenticated using Signature Version 4.
    */
  var WebSocketEndpoint: js.UndefOr[String] = js.undefined
}
object NodeEthereumAttributes {
  
  inline def apply(): NodeEthereumAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeEthereumAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeEthereumAttributes] (val x: Self) extends AnyVal {
    
    inline def setHttpEndpoint(value: String): Self = StObject.set(x, "HttpEndpoint", value.asInstanceOf[js.Any])
    
    inline def setHttpEndpointUndefined: Self = StObject.set(x, "HttpEndpoint", js.undefined)
    
    inline def setWebSocketEndpoint(value: String): Self = StObject.set(x, "WebSocketEndpoint", value.asInstanceOf[js.Any])
    
    inline def setWebSocketEndpointUndefined: Self = StObject.set(x, "WebSocketEndpoint", js.undefined)
  }
}
