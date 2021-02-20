package typings.angularSignalrHub

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryDeferred
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.Hub.Proxy
import typings.signalr.SignalR.StateChanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngSignalr {
  
  @js.native
  trait Hub extends StObject {
    
    def connect(): JQueryPromise[_] = js.native
    
    var connection: Connection = js.native
    
    def disconnect(): Unit = js.native
    
    var hubName: String = js.native
    
    def invoke(method: String, args: js.Any*): JQueryDeferred[_] = js.native
    
    def on(event: String, fn: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    var proxy: Proxy = js.native
  }
  object Hub {
    
    @scala.inline
    def apply(
      connect: () => JQueryPromise[_],
      connection: Connection,
      disconnect: () => Unit,
      hubName: String,
      invoke: (String, /* repeated */ js.Any) => JQueryDeferred[_],
      on: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit,
      proxy: Proxy
    ): Hub = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction0(connect), connection = connection.asInstanceOf[js.Any], disconnect = js.Any.fromFunction0(disconnect), hubName = hubName.asInstanceOf[js.Any], invoke = js.Any.fromFunction2(invoke), on = js.Any.fromFunction2(on), proxy = proxy.asInstanceOf[js.Any])
      __obj.asInstanceOf[Hub]
    }
    
    @scala.inline
    implicit class HubMutableBuilder[Self <: Hub] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConnect(value: () => JQueryPromise[_]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnection(value: Connection): Self = StObject.set(x, "connection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnect(value: () => Unit): Self = StObject.set(x, "disconnect", js.Any.fromFunction0(value))
      
      @scala.inline
      def setHubName(value: String): Self = StObject.set(x, "hubName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInvoke(value: (String, /* repeated */ js.Any) => JQueryDeferred[_]): Self = StObject.set(x, "invoke", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOn(value: (String, js.Function1[/* repeated */ js.Any, Unit]) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      @scala.inline
      def setProxy(value: Proxy): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait HubFactory extends /**
    * Creates a new Hub connection
    */
  Instantiable2[/* hubName */ String, /* options */ HubOptions, Hub]
  
  @js.native
  trait HubOptions extends StObject {
    
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
    implicit class HubOptionsMutableBuilder[Self <: HubOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: /* error */ String => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setListeners(value: StringDictionary[js.Function1[/* repeated */ js.Any, Unit]]): Self = StObject.set(x, "listeners", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListenersUndefined: Self = StObject.set(x, "listeners", js.undefined)
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setMethods(value: js.Array[String]): Self = StObject.set(x, "methods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodsUndefined: Self = StObject.set(x, "methods", js.undefined)
      
      @scala.inline
      def setMethodsVarargs(value: String*): Self = StObject.set(x, "methods", js.Array(value :_*))
      
      @scala.inline
      def setQueryParams(value: StringDictionary[String]): Self = StObject.set(x, "queryParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryParamsUndefined: Self = StObject.set(x, "queryParams", js.undefined)
      
      @scala.inline
      def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootPathUndefined: Self = StObject.set(x, "rootPath", js.undefined)
      
      @scala.inline
      def setStateChanged(value: /* state */ StateChanged => Unit): Self = StObject.set(x, "stateChanged", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStateChangedUndefined: Self = StObject.set(x, "stateChanged", js.undefined)
      
      @scala.inline
      def setTransport(value: js.Any): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      @scala.inline
      def setUseSharedConnection(value: Boolean): Self = StObject.set(x, "useSharedConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseSharedConnectionUndefined: Self = StObject.set(x, "useSharedConnection", js.undefined)
    }
  }
}
