package typings.awsCrt.distNativeEventstreamMod

import typings.awsCrt.distNativeIoMod.ClientTlsContext
import typings.awsCrt.distNativeIoMod.SocketOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConnectionOptions extends StObject {
  
  /**
    * Name of the host to connect to
    */
  var hostName: String
  
  /**
    * Port of the host to connect to
    */
  var port: Double
  
  /**
    * Optional, additional socket options for the desired connection
    */
  var socketOptions: js.UndefOr[SocketOptions] = js.undefined
  
  /**
    * TLS context for the desired connection
    */
  var tlsCtx: js.UndefOr[ClientTlsContext] = js.undefined
}
object ClientConnectionOptions {
  
  inline def apply(hostName: String, port: Double): ClientConnectionOptions = {
    val __obj = js.Dynamic.literal(hostName = hostName.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientConnectionOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClientConnectionOptions] (val x: Self) extends AnyVal {
    
    inline def setHostName(value: String): Self = StObject.set(x, "hostName", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setSocketOptions(value: SocketOptions): Self = StObject.set(x, "socketOptions", value.asInstanceOf[js.Any])
    
    inline def setSocketOptionsUndefined: Self = StObject.set(x, "socketOptions", js.undefined)
    
    inline def setTlsCtx(value: ClientTlsContext): Self = StObject.set(x, "tlsCtx", value.asInstanceOf[js.Any])
    
    inline def setTlsCtxUndefined: Self = StObject.set(x, "tlsCtx", js.undefined)
  }
}
