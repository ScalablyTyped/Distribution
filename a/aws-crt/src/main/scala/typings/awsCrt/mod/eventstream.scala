package typings.awsCrt.mod

import typings.awsCrt.distNativeEventstreamMod.ClientConnectionOptions
import typings.awsCrt.distNativeEventstreamMod.HeaderType
import typings.awsCrt.distNativeEventstreamMod.HeaderValue
import typings.awsCrt.distNativeEventstreamMod.Payload
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object eventstream {
  
  @JSImport("aws-crt", "eventstream.ClientConnection")
  @js.native
  open class ClientConnection protected ()
    extends typings.awsCrt.distNativeEventstreamMod.ClientConnection {
    /**
      * Configures and creates a new ClientConnection instance
      *
      * @param config configuration options for the event stream connection
      */
    def this(config: ClientConnectionOptions) = this()
  }
  /* static members */
  object ClientConnection {
    
    @JSImport("aws-crt", "eventstream.ClientConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Event emitted when the connection is closed for any reason.
      *
      * Listener type: {@link DisconnectionListener}
      *
      * @event
      */
    @JSImport("aws-crt", "eventstream.ClientConnection.DISCONNECTION")
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
    @JSImport("aws-crt", "eventstream.ClientConnection.PROTOCOL_MESSAGE")
    @js.native
    def PROTOCOL_MESSAGE: String = js.native
    inline def PROTOCOL_MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PROTOCOL_MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientConnection._s_on_connection_send_protocol_message_completion")
    @js.native
    def _s_on_connection_send_protocol_message_completion: Any = js.native
    inline def _s_on_connection_send_protocol_message_completion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_send_protocol_message_completion")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientConnection._s_on_connection_setup")
    @js.native
    def _s_on_connection_setup: Any = js.native
    inline def _s_on_connection_setup_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_connection_setup")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientConnection._s_on_disconnect")
    @js.native
    def _s_on_disconnect: Any = js.native
    inline def _s_on_disconnect_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_disconnect")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientConnection._s_on_protocol_message")
    @js.native
    def _s_on_protocol_message: Any = js.native
    inline def _s_on_protocol_message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_protocol_message")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "eventstream.ClientStream")
  @js.native
  open class ClientStream protected ()
    extends typings.awsCrt.distNativeEventstreamMod.ClientStream {
    def this(connection: typings.awsCrt.distNativeEventstreamMod.ClientConnection) = this()
  }
  /* static members */
  object ClientStream {
    
    @JSImport("aws-crt", "eventstream.ClientStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Event emitted when the stream is shut down for any reason.
      *
      * Listener type: {@link StreamEndedListener}
      *
      * @event
      */
    @JSImport("aws-crt", "eventstream.ClientStream.ENDED")
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
    @JSImport("aws-crt", "eventstream.ClientStream.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientStream._s_on_stream_activated")
    @js.native
    def _s_on_stream_activated: Any = js.native
    inline def _s_on_stream_activated_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_activated")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientStream._s_on_stream_ended")
    @js.native
    def _s_on_stream_ended: Any = js.native
    inline def _s_on_stream_ended_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_ended")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientStream._s_on_stream_message")
    @js.native
    def _s_on_stream_message: Any = js.native
    inline def _s_on_stream_message_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_message")(x.asInstanceOf[js.Any])
    
    @JSImport("aws-crt", "eventstream.ClientStream._s_on_stream_send_message_completion")
    @js.native
    def _s_on_stream_send_message_completion: Any = js.native
    inline def _s_on_stream_send_message_completion_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_s_on_stream_send_message_completion")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "eventstream.Header")
  @js.native
  open class Header protected ()
    extends typings.awsCrt.distNativeEventstreamMod.Header {
    /** @internal */
    def this(name: String, `type`: HeaderType) = this()
    def this(name: String, `type`: HeaderType, value: HeaderValue) = this()
  }
  /* static members */
  object Header {
    
    @JSImport("aws-crt", "eventstream.Header")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a new boolean-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newBoolean(name: String, value: Boolean): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newBoolean")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new byte-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newByte(name: String, value: Double): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newByte")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new byte-buffer-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newByteBuffer(name: String, value: Payload): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newByteBuffer")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new 16-bit-integer-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newInt16(name: String, value: Double): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt16")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new 32-bit-integer-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newInt32(name: String, value: Double): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt32")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new 64-bit-integer-valued message header from a big integer.
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newInt64FromBigint(name: String, value: js.BigInt): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt64FromBigint")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new 64-bit-integer-valued message header.  number cannot represent a full 64-bit integer range but
      * its usage is so common that this exists for convenience.  Internally, we always track 64 bit integers as
      * bigints.
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newInt64FromNumber(name: String, value: Double): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newInt64FromNumber")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new string-valued message header
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newString(name: String, value: String): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newString")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new timestamp-valued message header from a date.
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newTimeStampFromDate(name: String, date: js.Date): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampFromDate")(name.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new timestamp-valued message header from an integral value in seconds since epoch.
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newTimeStampFromSecondsSinceEpoch(name: String, secondsSinceEpoch: Double): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newTimeStampFromSecondsSinceEpoch")(name.asInstanceOf[js.Any], secondsSinceEpoch.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    /**
      * Create a new UUID-valued message header.
      * WIP
      *
      * @param name name of the header
      * @param value value of the header
      */
    inline def newUUID(name: String, value: js.typedarray.ArrayBuffer): typings.awsCrt.distNativeEventstreamMod.Header = (^.asInstanceOf[js.Dynamic].applyDynamic("newUUID")(name.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[typings.awsCrt.distNativeEventstreamMod.Header]
    
    @JSImport("aws-crt", "eventstream.Header.validateHeaderName")
    @js.native
    def validateHeaderName: Any = js.native
    inline def validateHeaderName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("validateHeaderName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "eventstream.HeaderType")
  @js.native
  object HeaderType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeEventstreamMod.HeaderType & Double] = js.native
    
    /* 1 */ val BooleanFalse: typings.awsCrt.distNativeEventstreamMod.HeaderType.BooleanFalse & Double = js.native
    
    /* 0 */ val BooleanTrue: typings.awsCrt.distNativeEventstreamMod.HeaderType.BooleanTrue & Double = js.native
    
    /* 2 */ val Byte: typings.awsCrt.distNativeEventstreamMod.HeaderType.Byte & Double = js.native
    
    /* 6 */ val ByteBuffer: typings.awsCrt.distNativeEventstreamMod.HeaderType.ByteBuffer & Double = js.native
    
    /* 3 */ val Int16: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int16 & Double = js.native
    
    /* 4 */ val Int32: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int32 & Double = js.native
    
    /* 5 */ val Int64: typings.awsCrt.distNativeEventstreamMod.HeaderType.Int64 & Double = js.native
    
    /* 7 */ val String: typings.awsCrt.distNativeEventstreamMod.HeaderType.String & Double = js.native
    
    /* 8 */ val Timestamp: typings.awsCrt.distNativeEventstreamMod.HeaderType.Timestamp & Double = js.native
    
    /* 9 */ val UUID: typings.awsCrt.distNativeEventstreamMod.HeaderType.UUID & Double = js.native
  }
  
  @JSImport("aws-crt", "eventstream.MessageFlags")
  @js.native
  object MessageFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeEventstreamMod.MessageFlags & Double] = js.native
    
    /* 1 */ val ConnectionAccepted: typings.awsCrt.distNativeEventstreamMod.MessageFlags.ConnectionAccepted & Double = js.native
    
    /* 0 */ val None: typings.awsCrt.distNativeEventstreamMod.MessageFlags.None & Double = js.native
    
    /* 2 */ val TerminateStream: typings.awsCrt.distNativeEventstreamMod.MessageFlags.TerminateStream & Double = js.native
  }
  
  @JSImport("aws-crt", "eventstream.MessageType")
  @js.native
  object MessageType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distNativeEventstreamMod.MessageType & Double] = js.native
    
    /* 1 */ val ApplicationError: typings.awsCrt.distNativeEventstreamMod.MessageType.ApplicationError & Double = js.native
    
    /* 0 */ val ApplicationMessage: typings.awsCrt.distNativeEventstreamMod.MessageType.ApplicationMessage & Double = js.native
    
    /* 4 */ val Connect: typings.awsCrt.distNativeEventstreamMod.MessageType.Connect & Double = js.native
    
    /* 5 */ val ConnectAck: typings.awsCrt.distNativeEventstreamMod.MessageType.ConnectAck & Double = js.native
    
    /* 7 */ val InternalError: typings.awsCrt.distNativeEventstreamMod.MessageType.InternalError & Double = js.native
    
    /* 2 */ val Ping: typings.awsCrt.distNativeEventstreamMod.MessageType.Ping & Double = js.native
    
    /* 3 */ val PingResponse: typings.awsCrt.distNativeEventstreamMod.MessageType.PingResponse & Double = js.native
    
    /* 6 */ val ProtocolError: typings.awsCrt.distNativeEventstreamMod.MessageType.ProtocolError & Double = js.native
  }
}
