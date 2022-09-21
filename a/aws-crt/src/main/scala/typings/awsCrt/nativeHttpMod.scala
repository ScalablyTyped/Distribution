package typings.awsCrt

import org.scalablytyped.runtime.Instantiable1
import typings.awsCrt.awsCrtStrings.close
import typings.awsCrt.awsCrtStrings.connect
import typings.awsCrt.awsCrtStrings.data
import typings.awsCrt.awsCrtStrings.end
import typings.awsCrt.awsCrtStrings.error
import typings.awsCrt.awsCrtStrings.headers
import typings.awsCrt.awsCrtStrings.response
import typings.awsCrt.eventMod.BufferedEventEmitter
import typings.awsCrt.httpMod.CommonHttpProxyOptions
import typings.awsCrt.httpMod.HttpClientConnectionClosed
import typings.awsCrt.httpMod.HttpClientConnectionConnected
import typings.awsCrt.httpMod.HttpClientConnectionError
import typings.awsCrt.httpMod.HttpHeader
import typings.awsCrt.httpMod.HttpProxyAuthenticationType
import typings.awsCrt.httpMod.HttpStreamComplete
import typings.awsCrt.httpMod.HttpStreamData
import typings.awsCrt.httpMod.HttpStreamError
import typings.awsCrt.nativeIoMod.ClientBootstrap
import typings.awsCrt.nativeIoMod.InputStream
import typings.awsCrt.nativeIoMod.SocketOptions
import typings.awsCrt.nativeIoMod.TlsConnectionOptions
import typings.awsCrt.nativeResourceMod.NativeResource
import typings.awsCrt.resourceSafetyMod.ResourceSafe
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeHttpMod {
  
  @JSImport("aws-crt/dist/native/http", "HttpClientConnection")
  @js.native
  open class HttpClientConnection protected () extends HttpConnection {
    def this(bootstrap: Unit, host_name: String, port: Double, socket_options: SocketOptions) = this()
    /** Asynchronously establish a new HttpClientConnection.
      * @param bootstrap Client bootstrap to use when initiating socket connection.  Leave undefined to use the
      *          default system-wide bootstrap (recommended).
      * @param host_name Host to connect to
      * @param port Port to connect to on host
      * @param socket_options Socket options
      * @param tls_opts Optional TLS connection options
      * @param proxy_options Optional proxy options
      */
    def this(bootstrap: ClientBootstrap, host_name: String, port: Double, socket_options: SocketOptions) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: Unit,
      handle: Any
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions,
      handle: Any
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: Unit,
      handle: Any
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions,
      handle: Any
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: Unit,
      handle: Any
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions,
      handle: Any
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: Unit,
      handle: Any
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions,
      handle: Any
    ) = this()
    
    /* private */ var _on_setup: Any = js.native
    
    /* private */ var _on_shutdown: Any = js.native
    
    /* protected */ var bootstrap: js.UndefOr[ClientBootstrap] = js.native
    
    /**
      * Create {@link HttpClientStream} to carry out the request/response exchange.
      *
      * NOTE: The stream sends no data until :meth:`HttpClientStream.activate()`
      * is called. Call {@link HttpStream.activate} when you're ready for
      * callbacks and events to fire.
      * @param request - The HttpRequest to attempt on this connection
      * @returns A new stream that will deliver events for the request
      */
    def request(request: HttpRequest): HttpClientStream = js.native
    
    /* protected */ var socket_options: SocketOptions = js.native
    
    /* protected */ var tls_opts: js.UndefOr[TlsConnectionOptions] = js.native
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpClientConnectionManager")
  @js.native
  open class HttpClientConnectionManager protected () extends NativeResource {
    def this(
      bootstrap: Unit,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions
    ) = this()
    /**
      * @param bootstrap Client bootstrap to use when initiating socket connections.  Leave undefined to use the
      *          default system-wide bootstrap (recommended).
      * @param host Host to connect to
      * @param port Port to connect to on host
      * @param max_connections Maximum number of connections to pool
      * @param initial_window_size Optional initial window size
      * @param socket_options Socket options to use when initiating socket connections
      * @param tls_opts Optional TLS connection options
      * @param proxy_options Optional proxy options
      */
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: HttpProxyOptions
    ) = this()
    
    /**
      * Vends a connection from the pool
      * @returns A promise that results in an HttpClientConnection. When done with the connection, return
      *          it via {@link release}
      */
    def acquire(): js.Promise[HttpClientConnection] = js.native
    
    val bootstrap: js.UndefOr[ClientBootstrap] = js.native
    
    /** Closes all connections and rejects all pending requests */
    def close(): Unit = js.native
    
    /* private */ var connections: Any = js.native
    
    val host: String = js.native
    
    val initial_window_size: Double = js.native
    
    val max_connections: Double = js.native
    
    val port: Double = js.native
    
    val proxy_options: js.UndefOr[HttpProxyOptions] = js.native
    
    /**
      * Returns an unused connection to the pool
      * @param connection - The connection to return
      */
    def release(connection: HttpClientConnection): Unit = js.native
    
    val socket_options: SocketOptions = js.native
    
    val tls_opts: js.UndefOr[TlsConnectionOptions] = js.native
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpClientStream")
  @js.native
  open class HttpClientStream protected () extends HttpStream {
    def this(native_handle: Any, connection: HttpClientConnection, request: HttpRequest) = this()
    
    /** @internal */
    def _on_response(status_code: Number, header_array: js.Array[js.Tuple2[String, String]]): Unit = js.native
    
    @JSName("on")
    def on_data(event: data, listener: HttpStreamData): this.type = js.native
    @JSName("on")
    def on_end(event: end, listener: HttpStreamComplete): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: HttpStreamError): this.type = js.native
    @JSName("on")
    def on_headers(event: headers, listener: HttpStreamHeaders): this.type = js.native
    @JSName("on")
    def on_response(event: response, listener: HttpStreamResponse): this.type = js.native
    
    val request: HttpRequest = js.native
    
    /* private */ var response_status_code: Any = js.native
    
    /**
      * HTTP status code returned from the server.
      * @return Either the status code, or undefined if the server response has not arrived yet.
      */
    def status_code(): js.UndefOr[Number] = js.native
  }
  /* static members */
  object HttpClientStream {
    
    @JSImport("aws-crt/dist/native/http", "HttpClientStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when http response data is available.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpClientStream.DATA")
    @js.native
    def DATA: String = js.native
    inline def DATA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the stream has completed
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpClientStream.END")
    @js.native
    def END: String = js.native
    inline def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs in stream processing
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpClientStream.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when inline headers are delivered while communicating over H2
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpClientStream.HEADERS")
    @js.native
    def HEADERS: String = js.native
    inline def HEADERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the http response headers have arrived.
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpClientStream.RESPONSE")
    @js.native
    def RESPONSE: String = js.native
    inline def RESPONSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPONSE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends BufferedEventEmitter
       with ResourceSafe {
    /* protected */ def this(native_handle: Any) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: HttpClientConnectionClosed): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, listener: HttpClientConnectionConnected): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: HttpClientConnectionError): this.type = js.native
  }
  /* static members */
  object HttpConnection {
    
    @JSImport("aws-crt/dist/native/http", "HttpConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when the connection has completed
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpConnection.CLOSE")
    @js.native
    def CLOSE: String = js.native
    inline def CLOSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection is connected and ready to start streams
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpConnection.CONNECT")
    @js.native
    def CONNECT: String = js.native
    inline def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs on the connection
      *
      * @event
      */
    @JSImport("aws-crt/dist/native/http", "HttpConnection.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpHeaders")
  @js.native
  val HttpHeaders: Instantiable1[
    /* headers */ js.UndefOr[js.Array[HttpHeader]], 
    typings.awsCrt.bindingMod.HttpHeaders
  ] = js.native
  type HttpHeaders = typings.awsCrt.bindingMod.HttpHeaders
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("aws-crt/dist/native/http", "HttpHeaders")
  @js.native
  /** Construct from a collection of [name, value] pairs */
  open class HttpHeadersCls ()
    extends typings.awsCrt.bindingMod.HttpHeaders {
    def this(headers: js.Array[HttpHeader]) = this()
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpProxyAuthenticationType")
  @js.native
  object HttpProxyAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.httpMod.HttpProxyAuthenticationType & Double] = js.native
    
    /* 1 */ val Basic: typings.awsCrt.httpMod.HttpProxyAuthenticationType.Basic & Double = js.native
    
    /* 0 */ val None: typings.awsCrt.httpMod.HttpProxyAuthenticationType.None & Double = js.native
  }
  
  @js.native
  sealed trait HttpProxyConnectionType extends StObject
  @JSImport("aws-crt/dist/native/http", "HttpProxyConnectionType")
  @js.native
  object HttpProxyConnectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[HttpProxyConnectionType & Double] = js.native
    
    /**
      * Establish a forwarding-based connection with the proxy.  Tls is not allowed in this case.
      */
    @js.native
    sealed trait Forwarding
      extends StObject
         with HttpProxyConnectionType
    /* 1 */ val Forwarding: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Forwarding & Double = js.native
    
    /**
      * (Default for backwards compatibility).  If Tls options are supplied then the connection will be a tunneling
      * one, otherwise it will be a forwarding one.
      */
    @js.native
    sealed trait Legacy
      extends StObject
         with HttpProxyConnectionType
    /* 0 */ val Legacy: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Legacy & Double = js.native
    
    /**
      * Establish a tunneling-based connection with the proxy.
      */
    @js.native
    sealed trait Tunneling
      extends StObject
         with HttpProxyConnectionType
    /* 2 */ val Tunneling: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Tunneling & Double = js.native
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpProxyOptions")
  @js.native
  open class HttpProxyOptions protected () extends CommonHttpProxyOptions {
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
    
    var connection_type: js.UndefOr[HttpProxyConnectionType] = js.native
    
    /** @internal */
    def create_native_handle(): Any = js.native
    
    var tls_opts: js.UndefOr[TlsConnectionOptions] = js.native
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.awsCrt.bindingMod.HttpRequest {
    def this(method: String, path: String) = this()
    def this(method: String, path: String, headers: typings.awsCrt.nativeHttpMod.HttpHeaders) = this()
    def this(method: String, path: String, headers: Unit, body: InputStream) = this()
    def this(method: String, path: String, headers: typings.awsCrt.nativeHttpMod.HttpHeaders, body: InputStream) = this()
  }
  
  @JSImport("aws-crt/dist/native/http", "HttpStream")
  @js.native
  open class HttpStream protected ()
    extends BufferedEventEmitter
       with ResourceSafe {
    /* protected */ def this(native_handle: Any, connection: HttpConnection) = this()
    
    /** @internal */
    def _on_body(data: js.typedarray.ArrayBuffer): Unit = js.native
    
    /** @internal */
    def _on_complete(error_code: Number): Unit = js.native
    
    /**
      * Begin sending the request.
      *
      * The stream does nothing until this is called. Call activate() when you
      * are ready for its callbacks and events to fire.
      */
    def activate(): Unit = js.native
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    val connection: HttpConnection = js.native
  }
  
  type HttpStreamHeaders = js.Function1[/* headers */ typings.awsCrt.nativeHttpMod.HttpHeaders, Unit]
  
  type HttpStreamResponse = js.Function2[
    /* status_code */ Double, 
    /* headers */ typings.awsCrt.nativeHttpMod.HttpHeaders, 
    Unit
  ]
  
  /* was `typeof crt_native.HttpRequest` */
  type nativeHttpRequest = typings.awsCrt.bindingMod.HttpRequest
}
