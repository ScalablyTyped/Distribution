package typings.awsCrt.mod

import org.scalablytyped.runtime.Instantiable1
import typings.awsCrt.httpMod.HttpHeader
import typings.awsCrt.httpMod.HttpProxyAuthenticationType
import typings.awsCrt.nativeHttpMod.HttpProxyConnectionType
import typings.awsCrt.nativeIoMod.ClientBootstrap
import typings.awsCrt.nativeIoMod.InputStream
import typings.awsCrt.nativeIoMod.SocketOptions
import typings.awsCrt.nativeIoMod.TlsConnectionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object http {
  
  @JSImport("aws-crt", "http.HttpClientConnection")
  @js.native
  open class HttpClientConnection protected ()
    extends typings.awsCrt.nativeHttpMod.HttpClientConnection {
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host_name: String,
      port: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions,
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions,
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions,
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions,
      handle: Any
    ) = this()
  }
  
  @JSImport("aws-crt", "http.HttpClientConnectionManager")
  @js.native
  open class HttpClientConnectionManager protected ()
    extends typings.awsCrt.nativeHttpMod.HttpClientConnectionManager {
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
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: Unit,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: Unit,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
    def this(
      bootstrap: ClientBootstrap,
      host: String,
      port: Double,
      max_connections: Double,
      initial_window_size: Double,
      socket_options: SocketOptions,
      tls_opts: TlsConnectionOptions,
      proxy_options: typings.awsCrt.nativeHttpMod.HttpProxyOptions
    ) = this()
  }
  
  @JSImport("aws-crt", "http.HttpClientStream")
  @js.native
  open class HttpClientStream protected ()
    extends typings.awsCrt.nativeHttpMod.HttpClientStream {
    def this(
      native_handle: Any,
      connection: typings.awsCrt.nativeHttpMod.HttpClientConnection,
      request: typings.awsCrt.nativeHttpMod.HttpRequest
    ) = this()
  }
  /* static members */
  object HttpClientStream {
    
    @JSImport("aws-crt", "http.HttpClientStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when http response data is available.
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpClientStream.DATA")
    @js.native
    def DATA: String = js.native
    inline def DATA_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the stream has completed
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpClientStream.END")
    @js.native
    def END: String = js.native
    inline def END_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("END")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs in stream processing
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpClientStream.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when inline headers are delivered while communicating over H2
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpClientStream.HEADERS")
    @js.native
    def HEADERS: String = js.native
    inline def HEADERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HEADERS")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the http response headers have arrived.
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpClientStream.RESPONSE")
    @js.native
    def RESPONSE: String = js.native
    inline def RESPONSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RESPONSE")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "http.HttpConnection")
  @js.native
  open class HttpConnection protected ()
    extends typings.awsCrt.nativeHttpMod.HttpConnection {
    /* protected */ def this(native_handle: Any) = this()
  }
  /* static members */
  object HttpConnection {
    
    @JSImport("aws-crt", "http.HttpConnection")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Emitted when the connection has completed
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpConnection.CLOSE")
    @js.native
    def CLOSE: String = js.native
    inline def CLOSE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSE")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when the connection is connected and ready to start streams
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpConnection.CONNECT")
    @js.native
    def CONNECT: String = js.native
    inline def CONNECT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECT")(x.asInstanceOf[js.Any])
    
    /**
      * Emitted when an error occurs on the connection
      *
      * @event
      */
    @JSImport("aws-crt", "http.HttpConnection.ERROR")
    @js.native
    def ERROR: String = js.native
    inline def ERROR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ERROR")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("aws-crt", "http.HttpHeaders")
  @js.native
  val HttpHeaders: Instantiable1[
    /* headers */ js.UndefOr[js.Array[HttpHeader]], 
    typings.awsCrt.bindingMod.HttpHeaders
  ] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("aws-crt", "http.HttpHeaders")
  @js.native
  /** Construct from a collection of [name, value] pairs */
  open class HttpHeadersCls ()
    extends typings.awsCrt.bindingMod.HttpHeaders {
    def this(headers: js.Array[HttpHeader]) = this()
  }
  
  @JSImport("aws-crt", "http.HttpProxyAuthenticationType")
  @js.native
  object HttpProxyAuthenticationType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.httpMod.HttpProxyAuthenticationType & Double] = js.native
    
    /* 1 */ val Basic: typings.awsCrt.httpMod.HttpProxyAuthenticationType.Basic & Double = js.native
    
    /* 0 */ val None: typings.awsCrt.httpMod.HttpProxyAuthenticationType.None & Double = js.native
  }
  
  @JSImport("aws-crt", "http.HttpProxyConnectionType")
  @js.native
  object HttpProxyConnectionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.awsCrt.nativeHttpMod.HttpProxyConnectionType & Double] = js.native
    
    /* 1 */ val Forwarding: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Forwarding & Double = js.native
    
    /* 0 */ val Legacy: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Legacy & Double = js.native
    
    /* 2 */ val Tunneling: typings.awsCrt.nativeHttpMod.HttpProxyConnectionType.Tunneling & Double = js.native
  }
  
  @JSImport("aws-crt", "http.HttpProxyOptions")
  @js.native
  open class HttpProxyOptions protected ()
    extends typings.awsCrt.nativeHttpMod.HttpProxyOptions {
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
  
  @JSImport("aws-crt", "http.HttpRequest")
  @js.native
  open class HttpRequest protected ()
    extends typings.awsCrt.nativeHttpMod.HttpRequest {
    def this(method: String, path: String) = this()
    def this(method: String, path: String, headers: typings.awsCrt.nativeHttpMod.HttpHeaders) = this()
    def this(method: String, path: String, headers: Unit, body: InputStream) = this()
    def this(method: String, path: String, headers: typings.awsCrt.nativeHttpMod.HttpHeaders, body: InputStream) = this()
  }
  
  @JSImport("aws-crt", "http.HttpStream")
  @js.native
  open class HttpStream protected ()
    extends typings.awsCrt.nativeHttpMod.HttpStream {
    /* protected */ def this(native_handle: Any, connection: typings.awsCrt.nativeHttpMod.HttpConnection) = this()
  }
}
