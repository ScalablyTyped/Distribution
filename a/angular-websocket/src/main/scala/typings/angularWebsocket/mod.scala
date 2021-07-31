package typings.angularWebsocket

import typings.angular.mod.IPromise
import typings.angular.mod.IScope
import typings.angularWebsocket.angularWebsocketStrings.arraybuffer
import typings.angularWebsocket.angularWebsocketStrings.blob
import typings.std.CloseEvent
import typings.std.Event
import typings.std.MessageEvent
import typings.std.RegExp
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  type IWebSocket = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
  
  type IWebSocketConfigOptions = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
  
  type IWebSocketMessageHandler = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler
  
  type IWebSocketMessageOptions = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions
  
  type IWebSocketProvider = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketProvider
  
  type IWebSocketQueueItem = typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem
  
  /* augmented module */
  object angularAugmentingMod {
    
    object websocket {
      
      @js.native
      trait IWebSocket extends StObject {
        
        /**
          * Closes the underlying socket, as long as no data is still being sent from the client.
          *
          * @param force if `true`, force close even if data is still being sent
          * @returns this instance, for method chaining
          */
        def close(): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        def close(force: Boolean): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * The initial timeout.
          */
        var initialTimeout: Double = js.native
        
        /**
          * Maximun timeout used to determine reconnection delay.
          */
        var maxTimeout: Double = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is closed for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onClose(callback: js.Function1[/* event */ CloseEvent, Unit]): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when the socket is closed.
          */
        var onCloseCallbacks: js.Array[js.Function1[/* evt */ CloseEvent, Unit]] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is closed for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onError(callback: js.Function1[/* event */ Event, Unit]): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when an error is received from the socket.
          */
        var onErrorCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection has an error for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onMessage(callback: js.Function1[/* event */ MessageEvent[js.Any], Unit]): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        def onMessage(
          callback: js.Function1[/* event */ MessageEvent[js.Any], Unit],
          options: typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions
        ): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when a message is received from the socket.
          */
        var onMessageCallbacks: js.Array[
                typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler
              ] = js.native
        
        /**
          * Adds a callback to be executed each time a socket connection is opened for
          * this instance.
          *
          * @param event event object
          * @returns this instance, for method chaining
          */
        def onOpen(callback: js.Function1[/* event */ Event, Unit]): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket = js.native
        
        /**
          * List of callbacks to be executed when the socket is opened.
          */
        var onOpenCallbacks: js.Array[js.Function1[/* evt */ Event, Unit]] = js.native
        
        /**
          * Returns either the readyState value from the underlying WebSocket instance
          * or a proprietary value representing the internal state
          */
        var readyState: Double = js.native
        
        /**
          * Adds data to a queue, and attempts to send if the socket is ready.
          *
          * @param data data to send, if this is an object, it will be stringified before sending
          */
        def send(data: String): IPromise[js.Any] = js.native
        def send(data: js.Object): IPromise[js.Any] = js.native
        
        /**
          * Queue of send calls to be made on socket when socket is able to receive data.
          */
        var sendQueue: js.Array[typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem] = js.native
        
        /**
          * WebSocket instance.
          */
        var socket: WebSocket = js.native
      }
      
      /**
        * Options available to be specified for IWebSocketProvider.
        */
      trait IWebSocketConfigOptions extends StObject {
        
        var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
        
        var initialTimeout: js.UndefOr[Double] = js.undefined
        
        var maxTimeout: js.UndefOr[Double] = js.undefined
        
        var reconnectIfNotNormalClose: js.UndefOr[Boolean] = js.undefined
        
        var rootScopeFailOver: js.UndefOr[Boolean] = js.undefined
        
        var scope: js.UndefOr[IScope] = js.undefined
        
        var useApplyAsync: js.UndefOr[Boolean] = js.undefined
      }
      object IWebSocketConfigOptions {
        
        @scala.inline
        def apply(): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions]
        }
        
        @scala.inline
        implicit class IWebSocketConfigOptionsMutableBuilder[Self <: typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setBinaryType(value: blob | arraybuffer): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
          
          @scala.inline
          def setInitialTimeout(value: Double): Self = StObject.set(x, "initialTimeout", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setInitialTimeoutUndefined: Self = StObject.set(x, "initialTimeout", js.undefined)
          
          @scala.inline
          def setMaxTimeout(value: Double): Self = StObject.set(x, "maxTimeout", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxTimeoutUndefined: Self = StObject.set(x, "maxTimeout", js.undefined)
          
          @scala.inline
          def setReconnectIfNotNormalClose(value: Boolean): Self = StObject.set(x, "reconnectIfNotNormalClose", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setReconnectIfNotNormalCloseUndefined: Self = StObject.set(x, "reconnectIfNotNormalClose", js.undefined)
          
          @scala.inline
          def setRootScopeFailOver(value: Boolean): Self = StObject.set(x, "rootScopeFailOver", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRootScopeFailOverUndefined: Self = StObject.set(x, "rootScopeFailOver", js.undefined)
          
          @scala.inline
          def setScope(value: IScope): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
          
          @scala.inline
          def setUseApplyAsync(value: Boolean): Self = StObject.set(x, "useApplyAsync", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setUseApplyAsyncUndefined: Self = StObject.set(x, "useApplyAsync", js.undefined)
        }
      }
      
      /** Type corresponding to onMessage callbacks stored in $Websocket#onMessageCallbacks instance. */
      trait IWebSocketMessageHandler extends StObject {
        
        var autoApply: Boolean
        
        def fn(evt: MessageEvent[js.Any]): Unit
        
        var pattern: js.UndefOr[String | RegExp] = js.undefined
      }
      object IWebSocketMessageHandler {
        
        @scala.inline
        def apply(autoApply: Boolean, fn: MessageEvent[js.Any] => Unit): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler = {
          val __obj = js.Dynamic.literal(autoApply = autoApply.asInstanceOf[js.Any], fn = js.Any.fromFunction1(fn))
          __obj.asInstanceOf[typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler]
        }
        
        @scala.inline
        implicit class IWebSocketMessageHandlerMutableBuilder[Self <: typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageHandler] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFn(value: MessageEvent[js.Any] => Unit): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPattern(value: String | RegExp): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
        }
      }
      
      /** Options available to be specified for IWebSocket.onMessage */
      trait IWebSocketMessageOptions extends StObject {
        
        /** If true, each message handled will safely call `$rootScope.$digest()`. */
        var autoApply: js.UndefOr[Boolean] = js.undefined
        
        /**
          * If specified, only messages that match the filter will cause the message event
          * to be fired.
          */
        var filter: js.UndefOr[String | RegExp] = js.undefined
      }
      object IWebSocketMessageOptions {
        
        @scala.inline
        def apply(): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions]
        }
        
        @scala.inline
        implicit class IWebSocketMessageOptionsMutableBuilder[Self <: typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketMessageOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
          
          @scala.inline
          def setFilter(value: String | RegExp): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
        }
      }
      
      /**
        * Creates and opens an IWebSocket instance.
        *
        * @param url url to connect to
        * @return websocket instance
        */
      type IWebSocketProvider = js.Function3[
            /* url */ String, 
            /* protocols */ js.UndefOr[
              String | js.Array[String] | typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
            ], 
            /* options */ js.UndefOr[
              typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketConfigOptions
            ], 
            typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocket
          ]
      
      /** Type corresponding to items stored in $WebSocket#sendQueue instance. */
      trait IWebSocketQueueItem extends StObject {
        
        var defered: IPromise[Unit]
        
        var message: js.Any
      }
      object IWebSocketQueueItem {
        
        @scala.inline
        def apply(defered: IPromise[Unit], message: js.Any): typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem = {
          val __obj = js.Dynamic.literal(defered = defered.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem]
        }
        
        @scala.inline
        implicit class IWebSocketQueueItemMutableBuilder[Self <: typings.angularWebsocket.mod.angularAugmentingMod.websocket.IWebSocketQueueItem] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setDefered(value: IPromise[Unit]): Self = StObject.set(x, "defered", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMessage(value: js.Any): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
