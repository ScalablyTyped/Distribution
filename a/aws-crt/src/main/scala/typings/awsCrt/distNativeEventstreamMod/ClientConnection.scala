package typings.awsCrt.distNativeEventstreamMod

import typings.awsCrt.awsCrtStrings.disconnection
import typings.awsCrt.awsCrtStrings.protocolMessage
import typings.awsCrt.distCommonEventMod.BufferedEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-crt/dist/native/eventstream", "ClientConnection")
@js.native
open class ClientConnection protected () extends BufferedEventEmitter {
  /**
    * Configures and creates a new ClientConnection instance
    *
    * @param config configuration options for the event stream connection
    */
  def this(config: ClientConnectionOptions) = this()
  
  /**
    * Shuts down the connection (if active) and begins the process to release native resources associated with it by
    * having the native binding release the only reference to the extern object representing the connection.  Once
    * close() has been called, no more events will be emitted and all public API invocations will trigger an exception.
    *
    * Ultimately, the native resources will not be released until the connection has fully shut down and that
    * shutdown event has reached the libuv event loop.
    *
    * This function **must** be called for every ClientConnection instance or native resources will leak.
    */
  def close(): Unit = js.native
  
  /**
    * Attempts to open a network connection to the configured remote endpoint.  Returned promise will be fulfilled if
    * the transport-level connection is successfully established, and rejected otherwise.
    *
    * connect() may only be called once.
    */
  def connect(options: ConnectOptions): js.Promise[Unit] = js.native
  
  /**
    * Returns true if the connection is currently open and ready-to-use, false otherwise.
    *
    * Internal note: Our notion of "connected" is intentionally not an invocation of
    * aws_event_stream_rpc_client_connection_is_open() (whose status is an out-of-sync race condition vs. our
    * well-defined client state)
    */
  def isConnected(): Boolean = js.native
  
  /**
    * Creates a new stream within the connection.
    */
  def newStream(): ClientStream = js.native
  
  @JSName("on")
  def on_disconnection(event: disconnection, listener: DisconnectionListener): this.type = js.native
  @JSName("on")
  def on_protocolMessage(event: protocolMessage, listener: MessageListener): this.type = js.native
  
  /**
    * Attempts to send an event stream protocol message over an open connection.
    *
    * @param options configuration -- including the message itself -- for sending a protocol message
    *
    * Returns a promise that will be fulfilled when the message is successfully flushed to the wire, and rejected if
    * an error occurs prior to that point.
    */
  def sendProtocolMessage(options: ProtocolMessageOptions): js.Promise[Unit] = js.native
  
  /* private */ var state: Any = js.native
}
/* static members */
object ClientConnection {
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Event emitted when the connection is closed for any reason.
    *
    * Listener type: {@link DisconnectionListener}
    *
    * @event
    */
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection.DISCONNECTION")
  @js.native
  def DISCONNECTION: String = js.native
  inline def DISCONNECTION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECTION")(x.asInstanceOf[js.Any])
  
  /**
    * Event emitted when a protocol message is received from the remote endpoint
    *
    * Listener type: {@link MessageListener}
    *
    * @event
    */
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection.PROTOCOL_MESSAGE")
  @js.native
  def PROTOCOL_MESSAGE: String = js.native
  inline def PROTOCOL_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROTOCOL_MESSAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection._s_on_connection_send_protocol_message_completion")
  @js.native
  def _s_on_connection_send_protocol_message_completion: Any = js.native
  inline def _s_on_connection_send_protocol_message_completion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_send_protocol_message_completion")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection._s_on_connection_setup")
  @js.native
  def _s_on_connection_setup: Any = js.native
  inline def _s_on_connection_setup_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_setup")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection._s_on_disconnect")
  @js.native
  def _s_on_disconnect: Any = js.native
  inline def _s_on_disconnect_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_disconnect")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientConnection._s_on_protocol_message")
  @js.native
  def _s_on_protocol_message: Any = js.native
  inline def _s_on_protocol_message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_protocol_message")(x.asInstanceOf[js.Any])
}
