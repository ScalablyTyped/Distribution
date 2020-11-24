package typings.angularSignalrHub.ngSignalr

import org.scalablytyped.runtime.StringDictionary
import typings.signalr.SignalR.StateChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HubOptions extends js.Object {
  
  /**
    * Function to handle hub connection errors
    */
  var errorHandler: js.UndefOr[js.Function1[/* error */ String, Unit]] = js.native
  
  /**
    * Collection of client side callbacks
    */
  var listeners: js.UndefOr[StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]] = js.native
  
  /**
    * Enable/disable logging
    */
  var logging: js.UndefOr[Boolean] = js.native
  
  /**
    * String array of server side methods which the client can call
    */
  var methods: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Object representing additional query params to be sent on connection
    */
  var queryParams: js.UndefOr[StringDictionary[String]] = js.native
  
  /**
    * Sets the root path for the SignalR web service
    */
  var rootPath: js.UndefOr[String] = js.native
  
  /**
    * Function to handle hub connection state changed event
    */
  var stateChanged: js.UndefOr[js.Function1[/* state */ StateChanged, Unit]] = js.native
  
  /**
    * Sets transport method (e.g    'longPolling'    or    ['webSockets', 'longPolling'] )
    */
  var transport: js.UndefOr[js.Any] = js.native
  
  /**
    * Use a shared global connection or create a new one just for this hub, defaults to true
    */
  var useSharedConnection: js.UndefOr[Boolean] = js.native
}
object HubOptions {
  
  @scala.inline
  def apply(): HubOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HubOptions]
  }
  
  @scala.inline
  implicit class HubOptionsOps[Self <: HubOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setErrorHandler(value: /* error */ String => Unit): Self = this.set("errorHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteErrorHandler: Self = this.set("errorHandler", js.undefined)
    
    @scala.inline
    def setListeners(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = this.set("listeners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListeners: Self = this.set("listeners", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setMethodsVarargs(value: String*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[String]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethods: Self = this.set("methods", js.undefined)
    
    @scala.inline
    def setQueryParams(value: StringDictionary[String]): Self = this.set("queryParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQueryParams: Self = this.set("queryParams", js.undefined)
    
    @scala.inline
    def setRootPath(value: String): Self = this.set("rootPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootPath: Self = this.set("rootPath", js.undefined)
    
    @scala.inline
    def setStateChanged(value: /* state */ StateChanged => Unit): Self = this.set("stateChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteStateChanged: Self = this.set("stateChanged", js.undefined)
    
    @scala.inline
    def setTransport(value: js.Any): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setUseSharedConnection(value: Boolean): Self = this.set("useSharedConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSharedConnection: Self = this.set("useSharedConnection", js.undefined)
  }
}
