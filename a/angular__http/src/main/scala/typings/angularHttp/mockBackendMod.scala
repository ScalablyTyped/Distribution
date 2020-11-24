package typings.angularHttp

import typings.angularHttp.interfacesMod.Connection
import typings.angularHttp.interfacesMod.ConnectionBackend
import typings.angularHttp.mod.Request
import typings.angularHttp.mod.Response
import typings.rxjs.mod.ReplaySubject
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/http/testing/src/mock_backend", JSImport.Namespace)
@js.native
object mockBackendMod extends js.Object {
  
  @js.native
  class MockBackend () extends ConnectionBackend {
    
    /**
      * {@link EventEmitter}
      * of {@link MockConnection} instances that have been created by this backend. Can be subscribed
      * to in order to respond to connections.
      *
      * This property only exists in the mock implementation, not in real Backends.
      */
    var connections: js.Any = js.native
    
    /**
      * An array representation of `connections`. This array will be updated with each connection that
      * is created by this backend.
      *
      * This property only exists in the mock implementation, not in real Backends.
      */
    var connectionsArray: js.Array[MockConnection] = js.native
    
    /**
      * Creates a new {@link MockConnection}. This is equivalent to calling `new
      * MockConnection()`, except that it also will emit the new `Connection` to the `connections`
      * emitter of this `MockBackend` instance. This method will usually only be used by tests
      * against the framework itself, not by end-users.
      */
    def createConnection(req: Request): MockConnection = js.native
    
    /**
      * {@link EventEmitter} of {@link MockConnection} instances that haven't yet been resolved (i.e.
      * with a `readyState`
      * less than 4). Used internally to verify that no connections are pending via the
      * `verifyNoPendingRequests` method.
      *
      * This property only exists in the mock implementation, not in real Backends.
      */
    var pendingConnections: js.Any = js.native
    
    /**
      * Can be used in conjunction with `verifyNoPendingRequests` to resolve any not-yet-resolve
      * connections, if it's expected that there are connections that have not yet received a response.
      *
      * This method only exists in the mock implementation, not in real Backends.
      */
    def resolveAllConnections(): Unit = js.native
    
    /**
      * Checks all connections, and raises an exception if any connection has not received a response.
      *
      * This method only exists in the mock implementation, not in real Backends.
      */
    def verifyNoPendingRequests(): Unit = js.native
  }
  
  @js.native
  class MockConnection protected () extends Connection {
    def this(req: Request) = this()
    
    /**
      * Not yet implemented!
      *
      * Sends the provided {@link Response} to the `downloadObserver` of the `Request`
      * associated with this connection.
      */
    def mockDownload(res: Response): Unit = js.native
    
    /**
      * Emits the provided error object as an error to the {@link Response} {@link EventEmitter}
      * returned
      * from {@link Http}.
      *
      */
    def mockError(): Unit = js.native
    def mockError(err: Error): Unit = js.native
    
    /**
      * Sends a mock response to the connection. This response is the value that is emitted to the
      * {@link EventEmitter} returned by {@link Http}.
      *
      */
    def mockRespond(res: Response): Unit = js.native
    
    /**
      * {@link Request} instance used to create the connection.
      */
    @JSName("request")
    var request_MockConnection: Request = js.native
    
    /**
      * {@link EventEmitter} of {@link Response}. Can be subscribed to in order to be notified when a
      * response is available.
      */
    @JSName("response")
    var response_MockConnection: ReplaySubject[Response] = js.native
  }
}
