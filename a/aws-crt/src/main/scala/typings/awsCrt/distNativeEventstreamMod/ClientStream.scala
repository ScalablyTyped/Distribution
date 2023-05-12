package typings.awsCrt.distNativeEventstreamMod

import typings.awsCrt.awsCrtStrings.ended
import typings.awsCrt.awsCrtStrings.message
import typings.awsCrt.distCommonEventMod.BufferedEventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("aws-crt/dist/native/eventstream", "ClientStream")
@js.native
open class ClientStream protected () extends BufferedEventEmitter {
  def this(connection: ClientConnection) = this()
  
  /**
    * Activates the stream, allowing it to start sending and receiving messages.  The promise completes when
    * the activation message has been written to the wire.
    *
    * activate() may only be called once.
    *
    * @param options -- configuration data for stream activation, including operation name and initial message
    */
  def activate(options: ActivateStreamOptions): js.Promise[Unit] = js.native
  
  /**
    * Shuts down the stream (if active) and begins the process to release native resources associated with it by
    * having the native binding release the only reference to the extern object representing the stream.  Once
    * close() has been called, no more events will be emitted and all public API invocations will trigger an exception.
    *
    * Ultimately, the native resources will not be released until the native stream has fully shut down and that
    * shutdown event has reached the libuv event loop.
    *
    * This function **must** be called for every ClientStream instance or native resources will leak.
    */
  def close(): Unit = js.native
  
  /**
    * Returns true if the stream is currently active and ready-to-use, false otherwise.
    */
  def isActive(): Boolean = js.native
  
  @JSName("on")
  def on_ended(event: ended, listener: StreamEndedListener): this.type = js.native
  @JSName("on")
  def on_message(event: message, listener: MessageListener): this.type = js.native
  
  /**
    * Attempts to send an event stream message.
    *
    * @param options configuration -- including the message itself -- for sending a message
    *
    * Returns a promise that will be fulfilled when the message is successfully flushed to the wire, and rejected if
    * an error occurs prior to that point.
    */
  def sendMessage(options: StreamMessageOptions): js.Promise[Unit] = js.native
  
  /* private */ var state: Any = js.native
}
/* static members */
object ClientStream {
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Event emitted when the stream is shut down for any reason.
    *
    * Listener type: {@link StreamEndedListener}
    *
    * @event
    */
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream.ENDED")
  @js.native
  def ENDED: String = js.native
  inline def ENDED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDED")(x.asInstanceOf[js.Any])
  
  /**
    * Event emitted when a stream message is received from the remote endpoint
    *
    * Listener type: {@link MessageListener}
    *
    * @event
    */
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream.MESSAGE")
  @js.native
  def MESSAGE: String = js.native
  inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream._s_on_stream_activated")
  @js.native
  def _s_on_stream_activated: Any = js.native
  inline def _s_on_stream_activated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_activated")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream._s_on_stream_ended")
  @js.native
  def _s_on_stream_ended: Any = js.native
  inline def _s_on_stream_ended_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_ended")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream._s_on_stream_message")
  @js.native
  def _s_on_stream_message: Any = js.native
  inline def _s_on_stream_message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_message")(x.asInstanceOf[js.Any])
  
  @JSImport("aws-crt/dist/native/eventstream", "ClientStream._s_on_stream_send_message_completion")
  @js.native
  def _s_on_stream_send_message_completion: Any = js.native
  inline def _s_on_stream_send_message_completion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_send_message_completion")(x.asInstanceOf[js.Any])
}
