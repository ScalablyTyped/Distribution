package typings.awsCrt

import typings.awsCrt.awsCrtStrings.connect
import typings.awsCrt.awsCrtStrings.disconnect
import typings.awsCrt.awsCrtStrings.error
import typings.awsCrt.awsCrtStrings.interrupt
import typings.awsCrt.awsCrtStrings.message
import typings.awsCrt.awsCrtStrings.resume
import typings.awsCrt.distCommonEventMod.BufferedEventEmitter
import typings.awsCrt.distCommonHttpMod.HttpProxyAuthenticationType
import typings.awsCrt.distCommonMqttMod.MqttConnectionConnected
import typings.awsCrt.distCommonMqttMod.MqttConnectionDisconnected
import typings.awsCrt.distCommonMqttMod.MqttConnectionResumed
import typings.awsCrt.distCommonMqttMod.MqttRequest
import typings.awsCrt.distCommonMqttMod.MqttSubscribeRequest
import typings.awsCrt.distCommonMqttMod.OnMessageCallback
import typings.awsCrt.distCommonMqttMod.Payload
import typings.awsCrt.distCommonMqttMod.QoS
import typings.awsCrt.distNativeErrorMod.CrtError
import typings.awsCrt.distNativeHttpMod.HttpProxyConnectionType
import typings.awsCrt.distNativeHttpMod.HttpRequest
import typings.awsCrt.distNativeIoMod.ClientBootstrap
import typings.awsCrt.distNativeIoMod.ClientTlsContext
import typings.awsCrt.distNativeIoMod.SocketOptions
import typings.awsCrt.distNativeIoMod.TlsConnectionOptions
import typings.awsCrt.distNativeNativeResourceMod.NativeResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNativeMqttMod {
  
  @JSImport("aws-crt/dist/native/mqtt", "HttpProxyOptions")
  @js.native
  open class HttpProxyOptions protected ()
    extends typings.awsCrt.distNativeHttpMod.HttpProxyOptions {
    /**
      *
      * @param host_name Name of the proxy server to connect through
      * @param port Port number of the proxy server to connect through
      * @param auth_method Type of proxy authentication to use. Default is {@link HttpProxyAuthenticationType.None}
      * @param auth_username Username to use when `auth_type` is {@link HttpProxyAuthenticationType.Basic}
      * @param auth_password Password to use when `auth_type` is {@link HttpProxyAuthenticationType.Basic}
      * @param tls_opts Optional TLS connection options for the connection to the proxy host.
      *                 Must be distinct from the {@link TlsConnectionOptions} provided to
      *                 the HTTP connection
      * @param connection_type Optional Type of connection to make.  If not specified,
      *                 {@link HttpProxyConnectionType.Legacy} will be used.
      */
    def this(host_name: String, port: Double) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: HttpProxyAuthenticationType, auth_username: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: String, auth_password: String) = this()
    def this(host_name: String, port: Double, auth_method: Unit, auth_username: Unit, auth_password: String) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: Unit,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: String,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: String,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: Unit,
      connection_type: HttpProxyConnectionType
    ) = this()
    def this(
      host_name: String,
      port: Double,
      auth_method: HttpProxyAuthenticationType,
      auth_username: Unit,
      auth_password: Unit,
      tls_opts: TlsConnectionOptions,
      connection_type: HttpProxyConnectionType
    ) = this()
  }
  
  @JSImport("aws-crt/dist/native/mqtt", "MqttClient")
  @js.native
  /**
    * @param bootstrap The {@link ClientBootstrap} to use for socket connections.  Leave undefined to use the
    *          default system-wide bootstrap (recommended).
    */
  open class MqttClient () extends NativeResource {
    def this(bootstrap: ClientBootstrap) = this()
    
    val bootstrap: js.UndefOr[ClientBootstrap] = js.native
    
    /**
      * Creates a new {@link MqttClientConnection}
      * @param config Configuration for the mqtt connection
      * @returns A new connection
      */
    def new_connection(config: MqttConnectionConfig): MqttClientConnection = js.native
  }
  
  @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection")
  @js.native
  open class MqttClientConnection protected () extends BufferedEventEmitter {
    /**
      * @param client The client that owns this connection
      * @param config The configuration for this connection
      */
    def this(client: MqttClient, config: MqttConnectionConfig) = this()
    
    /* private */ var _on_any_publish: Any = js.native
    
    /* private */ var _on_connect_callback: Any = js.native
    
    /* private */ var _on_connection_interrupted: Any = js.native
    
    /* private */ var _on_connection_resumed: Any = js.native
    
    /* private */ var _on_disconnect_callback: Any = js.native
    
    /* private */ var _on_puback_callback: Any = js.native
    
    /* private */ var _on_suback_callback: Any = js.native
    
    /* private */ var _on_unsuback_callback: Any = js.native
    
    /* private */ var _reject: Any = js.native
    
    val client: MqttClient = js.native
    
    /* private */ var close: Any = js.native
    
    /* private */ var config: Any = js.native
    
    /**
      * Open the actual connection to the server (async).
      * @returns A Promise which completes whether the connection succeeds or fails.
      *          If connection fails, the Promise will reject with an exception.
      *          If connection succeeds, the Promise will return a boolean that is
      *          true for resuming an existing session, or false if the session is new
      */
    def connect(): js.Promise[Boolean] = js.native
    
    /**
      * Close the connection (async).
      * @returns Promise which completes when the connection is closed.
      */
    def disconnect(): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_connect(event: connect, listener: MqttConnectionConnected): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, listener: MqttConnectionDisconnected): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: MqttConnectionError): this.type = js.native
    @JSName("on")
    def on_interrupt(event: interrupt, listener: MqttConnectionInterrupted): this.type = js.native
    @JSName("on")
    def on_message(event: message, listener: OnMessageCallback): this.type = js.native
    @JSName("on")
    def on_resume(event: resume, listener: MqttConnectionResumed): this.type = js.native
    
    /**
      * Publish message (async).
      * If the device is offline, the PUBLISH packet will be sent once the connection resumes.
      *
      * @param topic Topic name
      * @param payload Contents of message
      * @param qos Quality of Service for delivering this message
      * @param retain If true, the server will store the message and its QoS so that it can be
      *               delivered to future subscribers whose subscriptions match the topic name
      * @returns Promise which returns a {@link MqttRequest} which will contain the packet id of
      *          the PUBLISH packet.
      *
      * * For QoS 0, completes as soon as the packet is sent.
      * * For QoS 1, completes when PUBACK is received.
      * * For QoS 2, completes when PUBCOMP is received.
      */
    def publish(topic: String, payload: Payload, qos: QoS): js.Promise[MqttRequest] = js.native
    def publish(topic: String, payload: Payload, qos: QoS, retain: Boolean): js.Promise[MqttRequest] = js.native
    
    /**
      * The connection will automatically reconnect. To cease reconnection attempts, call {@link disconnect}.
      * To resume the connection, call {@link connect}.
      * @deprecated
      */
    def reconnect(): js.Promise[Boolean] = js.native
    
    /**
      * Subscribe to a topic filter (async).
      * The client sends a SUBSCRIBE packet and the server responds with a SUBACK.
      *
      * subscribe() may be called while the device is offline, though the async
      * operation cannot complete successfully until the connection resumes.
      *
      * Once subscribed, `callback` is invoked each time a message matching
      * the `topic` is received. It is possible for such messages to arrive before
      * the SUBACK is received.
      *
      * @param topic Subscribe to this topic filter, which may include wildcards
      * @param qos Maximum requested QoS that server may use when sending messages to the client.
      *            The server may grant a lower QoS in the SUBACK
      * @param on_message Optional callback invoked when message received.
      * @returns Promise which returns a {@link MqttSubscribeRequest} which will contain the
      *          result of the SUBSCRIBE. The Promise resolves when a SUBACK is returned
      *          from the server or is rejected when an exception occurs.
      */
    def subscribe(topic: String, qos: QoS): js.Promise[MqttSubscribeRequest] = js.native
    def subscribe(topic: String, qos: QoS, on_message: OnMessageCallback): js.Promise[MqttSubscribeRequest] = js.native
    
    val tls_ctx: js.UndefOr[ClientTlsContext] = js.native
    
    /**
      * Unsubscribe from a topic filter (async).
      * The client sends an UNSUBSCRIBE packet, and the server responds with an UNSUBACK.
      * @param topic The topic filter to unsubscribe from. May contain wildcards.
      * @returns Promise wihch returns a {@link MqttRequest} which will contain the packet id
      *          of the UNSUBSCRIBE packet being acknowledged. Promise is resolved when an
      *          UNSUBACK is received from the server or is rejected when an exception occurs.
      */
    def unsubscribe(topic: String): js.Promise[MqttRequest] = js.native
  }
  /* static members */
  object MqttClientConnection {
    
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when the connection successfully establishes itself for the first time
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.CONNECT")
    @js.native
    def CONNECT: String = js.native
    inline def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when connection has disconnected sucessfully.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.DISCONNECT")
    @js.native
    def DISCONNECT: String = js.native
    inline def DISCONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DISCONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs.  The error will contain the error
      * code and message.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection is dropped unexpectedly. The error will contain the error
      * code and message.  The underlying mqtt implementation will attempt to reconnect.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.INTERRUPT")
    @js.native
    def INTERRUPT: String = js.native
    inline def INTERRUPT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INTERRUPT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when any MQTT publish message arrives.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.MESSAGE")
    @js.native
    def MESSAGE: String = js.native
    inline def MESSAGE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MESSAGE")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection reconnects (after an interrupt). Only triggers on connections after the initial one.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/mqtt", "MqttClientConnection.RESUME")
    @js.native
    def RESUME: String = js.native
    inline def RESUME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESUME")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt/dist/native/mqtt", "MqttWill")
  @js.native
  open class MqttWill protected ()
    extends typings.awsCrt.distCommonMqttMod.MqttWill {
    def this(
      /** Topic to publish Will message on. */
    topic: String,
      /** QoS used when publishing the Will message. */
    qos: QoS,
      /** Content of Will message. */
    payload: Payload
    ) = this()
    def this(
      /** Topic to publish Will message on. */
    topic: String,
      /** QoS used when publishing the Will message. */
    qos: QoS,
      /** Content of Will message. */
    payload: Payload,
      /** Whether the Will message is to be retained when it is published. */
    retain: Boolean
    ) = this()
  }
  
  @JSImport("aws-crt/dist/native/mqtt", "QoS")
  @js.native
  object QoS extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.distCommonMqttMod.QoS & Double] = js.native
    
    /* 1 */ val AtLeastOnce: typings.awsCrt.distCommonMqttMod.QoS.AtLeastOnce & Double = js.native
    
    /* 0 */ val AtMostOnce: typings.awsCrt.distCommonMqttMod.QoS.AtMostOnce & Double = js.native
    
    /* 2 */ val ExactlyOnce: typings.awsCrt.distCommonMqttMod.QoS.ExactlyOnce & Double = js.native
  }
  
  trait MqttConnectionConfig extends StObject {
    
    /**
      * Whether or not to start a clean session with each reconnect.
      * If True, the server will forget all subscriptions with each reconnect.
      * Set False to request that the server resume an existing session
      * or start a new session that may be resumed after a connection loss.
      * The `session_present` bool in the connection callback informs
      * whether an existing session was successfully resumed.
      * If an existing session is resumed, the server remembers previous subscriptions
      * and sends mesages (with QoS1 or higher) that were published while the client was offline.
      */
    var clean_session: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ID to place in CONNECT packet. Must be unique across all devices/clients.
      * If an ID is already in use, the other client will be disconnected.
      */
    var client_id: String
    
    /** Server name to connect to */
    var host_name: String
    
    /**
      * The keep alive value, in seconds, to send in CONNECT packet.
      * A PING will automatically be sent at this interval.
      * The server will assume the connection is lost if no PING is received after 1.5X this value.
      * This duration must be longer than {@link ping_timeout}.
      */
    var keep_alive: js.UndefOr[Double] = js.undefined
    
    /** Password to connect with */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * Milliseconds to wait for ping response before client assumes
      * the connection is invalid and attempts to reconnect.
      * This duration must be shorter than keep_alive_secs.
      * Alternatively, TCP keep-alive via :attr:`SocketOptions.keep_alive`
      * may accomplish this in a more efficient (low-power) scenario,
      * but keep-alive options may not work the same way on every platform and OS version.
      */
    var ping_timeout: js.UndefOr[Double] = js.undefined
    
    /** Server port to connect to */
    var port: Double
    
    /**
      * Milliseconds to wait for the response to the operation requires response by protocol.
      * Set to zero to disable timeout. Otherwise, the operation will fail if no response is
      * received within this amount of time after the packet is written to the socket.
      * It applied to PUBLISH (QoS>0) and UNSUBSCRIBE now.
      */
    var protocol_operation_timeout: js.UndefOr[Double] = js.undefined
    
    /** Optional proxy options */
    var proxy_options: js.UndefOr[typings.awsCrt.distNativeHttpMod.HttpProxyOptions] = js.undefined
    
    /**
      * Maximum seconds to wait between reconnect attempts.
      * Must be >= {@link reconnect_min_sec}.
      * Wait starts at min and doubles with each attempt until max is reached.
      */
    var reconnect_max_sec: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum seconds to wait between reconnect attempts.
      * Must be <= {@link reconnect_max_sec}.
      * Wait starts at min and doubles with each attempt until max is reached.
      */
    var reconnect_min_sec: js.UndefOr[Double] = js.undefined
    
    /** Optional socket options */
    var socket_options: SocketOptions
    
    /**
      * TLS context for secure socket connections.
      * If None is provided, then an unencrypted connection is used.
      */
    var tls_ctx: js.UndefOr[ClientTlsContext] = js.undefined
    
    /** If true, connect to MQTT over websockets */
    var use_websocket: js.UndefOr[Boolean] = js.undefined
    
    /** Username to connect with */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * Optional function to transform websocket handshake request.
      * If provided, function is called each time a websocket connection is attempted.
      * The function may modify the HTTP request before it is sent to the server.
      */
    var websocket_handshake_transform: js.UndefOr[
        js.Function2[
          /* request */ HttpRequest, 
          /* done */ js.Function1[/* error_code */ js.UndefOr[Double], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Will to send with CONNECT packet. The will is
      * published by the server when its connection to the client is unexpectedly lost.
      */
    var will: js.UndefOr[typings.awsCrt.distCommonMqttMod.MqttWill] = js.undefined
  }
  object MqttConnectionConfig {
    
    inline def apply(client_id: String, host_name: String, port: Double, socket_options: SocketOptions): MqttConnectionConfig = {
      val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], host_name = host_name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], socket_options = socket_options.asInstanceOf[js.Any])
      __obj.asInstanceOf[MqttConnectionConfig]
    }
    
    extension [Self <: MqttConnectionConfig](x: Self) {
      
      inline def setClean_session(value: Boolean): Self = StObject.set(x, "clean_session", value.asInstanceOf[js.Any])
      
      inline def setClean_sessionUndefined: Self = StObject.set(x, "clean_session", js.undefined)
      
      inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
      
      inline def setHost_name(value: String): Self = StObject.set(x, "host_name", value.asInstanceOf[js.Any])
      
      inline def setKeep_alive(value: Double): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
      
      inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPing_timeout(value: Double): Self = StObject.set(x, "ping_timeout", value.asInstanceOf[js.Any])
      
      inline def setPing_timeoutUndefined: Self = StObject.set(x, "ping_timeout", js.undefined)
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol_operation_timeout(value: Double): Self = StObject.set(x, "protocol_operation_timeout", value.asInstanceOf[js.Any])
      
      inline def setProtocol_operation_timeoutUndefined: Self = StObject.set(x, "protocol_operation_timeout", js.undefined)
      
      inline def setProxy_options(value: typings.awsCrt.distNativeHttpMod.HttpProxyOptions): Self = StObject.set(x, "proxy_options", value.asInstanceOf[js.Any])
      
      inline def setProxy_optionsUndefined: Self = StObject.set(x, "proxy_options", js.undefined)
      
      inline def setReconnect_max_sec(value: Double): Self = StObject.set(x, "reconnect_max_sec", value.asInstanceOf[js.Any])
      
      inline def setReconnect_max_secUndefined: Self = StObject.set(x, "reconnect_max_sec", js.undefined)
      
      inline def setReconnect_min_sec(value: Double): Self = StObject.set(x, "reconnect_min_sec", value.asInstanceOf[js.Any])
      
      inline def setReconnect_min_secUndefined: Self = StObject.set(x, "reconnect_min_sec", js.undefined)
      
      inline def setSocket_options(value: SocketOptions): Self = StObject.set(x, "socket_options", value.asInstanceOf[js.Any])
      
      inline def setTls_ctx(value: ClientTlsContext): Self = StObject.set(x, "tls_ctx", value.asInstanceOf[js.Any])
      
      inline def setTls_ctxUndefined: Self = StObject.set(x, "tls_ctx", js.undefined)
      
      inline def setUse_websocket(value: Boolean): Self = StObject.set(x, "use_websocket", value.asInstanceOf[js.Any])
      
      inline def setUse_websocketUndefined: Self = StObject.set(x, "use_websocket", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setWebsocket_handshake_transform(
        value: (/* request */ HttpRequest, /* done */ js.Function1[/* error_code */ js.UndefOr[Double], Unit]) => Unit
      ): Self = StObject.set(x, "websocket_handshake_transform", js.Any.fromFunction2(value))
      
      inline def setWebsocket_handshake_transformUndefined: Self = StObject.set(x, "websocket_handshake_transform", js.undefined)
      
      inline def setWill(value: typings.awsCrt.distCommonMqttMod.MqttWill): Self = StObject.set(x, "will", value.asInstanceOf[js.Any])
      
      inline def setWillUndefined: Self = StObject.set(x, "will", js.undefined)
    }
  }
  
  type MqttConnectionError = js.Function1[/* error */ CrtError, Unit]
  
  type MqttConnectionInterrupted = js.Function1[/* error */ CrtError, Unit]
}
