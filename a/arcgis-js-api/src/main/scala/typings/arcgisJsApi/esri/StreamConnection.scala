package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.connected
import typings.arcgisJsApi.arcgisJsApiStrings.disconnected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
	 * A web socket connection to a stream service.
	 *
	 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-StreamConnection.html)
	 */
trait StreamConnection extends StObject {
  
  /**
  		 * The error that explains an unsuccessful attempt to connect to the stream service or an unexpected disconnection from the stream service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-StreamConnection.html#connectionError)
  		 */
  val connectionError: Error
  
  /**
  		 * The status of the Web Socket connection with the stream service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-StreamConnection.html#connectionStatus)
  		 */
  val connectionStatus: connected | disconnected
  
  /**
  		 * Destroys the existing connection instance to the stream service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-StreamConnection.html#destroy)
  		 */
  def destroy(): scala.Unit
}
object StreamConnection {
  
  inline def apply(connectionError: Error, connectionStatus: connected | disconnected, destroy: () => scala.Unit): StreamConnection = {
    val __obj = js.Dynamic.literal(connectionError = connectionError.asInstanceOf[js.Any], connectionStatus = connectionStatus.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[StreamConnection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamConnection] (val x: Self) extends AnyVal {
    
    inline def setConnectionError(value: Error): Self = StObject.set(x, "connectionError", value.asInstanceOf[js.Any])
    
    inline def setConnectionStatus(value: connected | disconnected): Self = StObject.set(x, "connectionStatus", value.asInstanceOf[js.Any])
    
    inline def setDestroy(value: () => scala.Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
  }
}
