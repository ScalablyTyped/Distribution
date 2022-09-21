package typings.awsCrt

import typings.awsCrt.anon.Payload
import typings.awsCrt.httpMod.HttpHeader
import typings.awsCrt.mqttMod.OnMessageCallback
import typings.awsCrt.mqttMod.QoS
import typings.awsCrt.nativeAuthMod.AwsSigningConfig
import typings.awsCrt.nativeIoMod.InputStream
import typings.awsCrt.nativeIoMod.TlsContextOptions.Pkcs11Options
import typings.node.bufferMod.global.Buffer
import typings.std.Number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindingMod {
  
  @JSImport("aws-crt/dist/native/binding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("aws-crt/dist/native/binding", "AwsCredentialsProvider")
  @js.native
  /* protected */ open class AwsCredentialsProvider () extends StObject
  /* static members */
  object AwsCredentialsProvider {
    
    @JSImport("aws-crt/dist/native/binding", "AwsCredentialsProvider")
    @js.native
    val ^ : js.Any = js.native
    
    inline def newDefault(): AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")().asInstanceOf[AwsCredentialsProvider]
    inline def newDefault(bootstrap: NativeHandle): AwsCredentialsProvider = ^.asInstanceOf[js.Dynamic].applyDynamic("newDefault")(bootstrap.asInstanceOf[js.Any]).asInstanceOf[AwsCredentialsProvider]
    
    inline def newStatic(access_key: StringLike, secret_key: StringLike): AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any])).asInstanceOf[AwsCredentialsProvider]
    inline def newStatic(access_key: StringLike, secret_key: StringLike, session_token: StringLike): AwsCredentialsProvider = (^.asInstanceOf[js.Dynamic].applyDynamic("newStatic")(access_key.asInstanceOf[js.Any], secret_key.asInstanceOf[js.Any], session_token.asInstanceOf[js.Any])).asInstanceOf[AwsCredentialsProvider]
  }
  
  @JSImport("aws-crt/dist/native/binding", "HttpHeaders")
  @js.native
  /** Construct from a collection of [name, value] pairs */
  open class HttpHeaders ()
    extends StObject
       with typings.awsCrt.httpMod.HttpHeaders {
    def this(headers: js.Array[HttpHeader]) = this()
    
    /** @internal */
    def get_index(index: Double): HttpHeader = js.native
  }
  
  @JSImport("aws-crt/dist/native/binding", "HttpRequest")
  @js.native
  open class HttpRequest protected () extends StObject {
    def this(method: String, path: String) = this()
    def this(method: String, path: String, headers: HttpHeaders) = this()
    def this(method: String, path: String, headers: Unit, body: InputStream) = this()
    def this(method: String, path: String, headers: HttpHeaders, body: InputStream) = this()
    
    /** Optional body as a stream */
    var body: InputStream = js.native
    
    /** Optional headers. */
    val headers: HttpHeaders = js.native
    
    /** HTTP request method (verb). Default value is "GET". */
    var method: String = js.native
    
    /** HTTP path-and-query value. Default value is "/". */
    var path: String = js.native
  }
  
  inline def awsSignRequest(
    request: HttpRequest,
    config: AwsSigningConfig,
    on_complete: js.Function1[/* error_code */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("aws_sign_request")(request.asInstanceOf[js.Any], config.asInstanceOf[js.Any], on_complete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def awsVerifySigv4aSigning(
    request: HttpRequest,
    config: AwsSigningConfig,
    expected_canonical_request: StringLike,
    signature: StringLike,
    ecc_key_pub_x: StringLike,
    ecc_key_pub_y: StringLike
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aws_verify_sigv4a_signing")(request.asInstanceOf[js.Any], config.asInstanceOf[js.Any], expected_canonical_request.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], ecc_key_pub_x.asInstanceOf[js.Any], ecc_key_pub_y.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def checksumsCrc32(data: StringLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksums_crc32")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def checksumsCrc32(data: StringLike, previous: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksums_crc32")(data.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def checksumsCrc32c(data: StringLike): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("checksums_crc32c")(data.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def checksumsCrc32c(data: StringLike, previous: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checksums_crc32c")(data.asInstanceOf[js.Any], previous.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def errorCodeToName(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_name")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def errorCodeToString(error_code: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("error_code_to_string")(error_code.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hashDigest(handle: NativeHandle): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_digest")(handle.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashDigest(handle: NativeHandle, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_digest")(handle.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashMd5Compute(data: StringLike): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_md5_compute")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashMd5Compute(data: StringLike, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_md5_compute")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashMd5New(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_md5_new")().asInstanceOf[Unit]
  
  inline def hashSha1Compute(data: StringLike): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha1_compute")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashSha1Compute(data: StringLike, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha1_compute")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashSha1New(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha1_new")().asInstanceOf[Unit]
  
  inline def hashSha256Compute(data: StringLike): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha256_compute")(data.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hashSha256Compute(data: StringLike, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha256_compute")(data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hashSha256New(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hash_sha256_new")().asInstanceOf[Unit]
  
  inline def hashUpdate(handle: NativeHandle, data: StringLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hash_update")(handle.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def hmacDigest(handle: NativeHandle): js.typedarray.DataView = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_digest")(handle.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.DataView]
  inline def hmacDigest(handle: NativeHandle, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_digest")(handle.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hmacMd5Compute(secret: StringLike, data: StringLike): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md5_compute")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  inline def hmacMd5Compute(secret: StringLike, data: StringLike, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md5_compute")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hmacMd5New(secret: StringLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_md5_new")(secret.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hmacSha256Compute(secret: StringLike, data: StringLike): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256_compute")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  inline def hmacSha256Compute(secret: StringLike, data: StringLike, truncate_to: Double): js.typedarray.DataView = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256_compute")(secret.asInstanceOf[js.Any], data.asInstanceOf[js.Any], truncate_to.asInstanceOf[js.Any])).asInstanceOf[js.typedarray.DataView]
  
  inline def hmacSha256New(secret: StringLike): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hmac_sha256_new")(secret.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def hmacUpdate(handle: NativeHandle, data: StringLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("hmac_update")(handle.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def httpConnectionClose(connection: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_close")(connection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def httpConnectionManagerAcquire(manager: NativeHandle, on_acquired: js.Function2[/* handle */ Any, /* error_code */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_acquire")(manager.asInstanceOf[js.Any], on_acquired.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def httpConnectionManagerClose(manager: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_close")(manager.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def httpConnectionManagerNew(bootstrap: Unit, host: StringLike, port: Double, max_connections: Double, window_size: Double): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: Unit,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: Unit,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionManagerNew(
    bootstrap: NativeHandle,
    host: StringLike,
    port: Double,
    max_connections: Double,
    window_size: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle,
    on_shutdown: js.Function0[Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_new")(bootstrap.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], max_connections.asInstanceOf[js.Any], window_size.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def httpConnectionManagerRelease(manager: NativeHandle, connection: NativeHandle): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_manager_release")(manager.asInstanceOf[js.Any], connection.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: Unit,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: Unit,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: Unit,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpConnectionNew(
    bootstrap: NativeHandle,
    on_setup: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    on_shutdown: js.Function2[/* handle */ Any, /* error_code */ Double, Unit],
    host_name: StringLike,
    port: Double,
    socket_options: NativeHandle,
    tls_options: NativeHandle,
    proxy_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_connection_new")(bootstrap.asInstanceOf[js.Any], on_setup.asInstanceOf[js.Any], on_shutdown.asInstanceOf[js.Any], host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Double): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: Unit,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: Unit,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Double, username: Unit, password: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: StringLike,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: StringLike,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: Unit,
    password: StringLike,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Double, username: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: Unit,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: Unit,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: StringLike
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: StringLike,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: StringLike,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Double,
    username: StringLike,
    password: StringLike,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: Unit,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: Unit,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Unit, username: Unit, password: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: StringLike,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: StringLike,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: Unit,
    password: StringLike,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Unit, username: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: Unit,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: Unit,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: Unit,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(host_name: StringLike, port: Double, auth_method: Unit, username: StringLike, password: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: StringLike,
    tls_options: Unit,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: StringLike,
    tls_options: NativeHandle
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def httpProxyOptionsNew(
    host_name: StringLike,
    port: Double,
    auth_method: Unit,
    username: StringLike,
    password: StringLike,
    tls_options: NativeHandle,
    connection_type: Double
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_proxy_options_new")(host_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], auth_method.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], tls_options.asInstanceOf[js.Any], connection_type.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def httpStreamActivate(stream: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("http_stream_activate")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def httpStreamClose(stream: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("http_stream_close")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def httpStreamNew(
    stream: NativeHandle,
    request: HttpRequest,
    on_complete: js.Function1[/* error_code */ Number, Unit],
    on_response: js.Function2[/* status_code */ Number, /* headers */ js.Array[HttpHeader], Unit],
    on_body: js.Function1[/* data */ js.typedarray.ArrayBuffer, Unit]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("http_stream_new")(stream.asInstanceOf[js.Any], request.asInstanceOf[js.Any], on_complete.asInstanceOf[js.Any], on_response.asInstanceOf[js.Any], on_body.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def ioClientBootstrapNew(): NativeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("io_client_bootstrap_new")().asInstanceOf[NativeHandle]
  
  inline def ioInputStreamAppend(stream: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("io_input_stream_append")(stream.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def ioInputStreamAppend(stream: NativeHandle, data: Buffer): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("io_input_stream_append")(stream.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def ioInputStreamNew(capacity: Double): NativeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("io_input_stream_new")(capacity.asInstanceOf[js.Any]).asInstanceOf[NativeHandle]
  
  inline def ioLoggingEnable(log_level: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("io_logging_enable")(log_level.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ioPkcs11LibClose(pkcs11_lib: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("io_pkcs11_lib_close")(pkcs11_lib.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def ioPkcs11LibNew(path: String, behavior: Double): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_pkcs11_lib_new")(path.asInstanceOf[js.Any], behavior.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def ioSocketOptionsNew(
    `type`: Double,
    domain: Double,
    connect_timeout_ms: Double,
    keep_alive_interval_sec: Double,
    keep_alive_timeout_sec: Double,
    keep_alive_max_failed_probes: Double,
    keepalive: Boolean
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_socket_options_new")(`type`.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], connect_timeout_ms.asInstanceOf[js.Any], keep_alive_interval_sec.asInstanceOf[js.Any], keep_alive_timeout_sec.asInstanceOf[js.Any], keep_alive_max_failed_probes.asInstanceOf[js.Any], keepalive.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def ioTlsConnectionOptionsNew(tls_ctx: NativeHandle): NativeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("io_tls_connection_options_new")(tls_ctx.asInstanceOf[js.Any]).asInstanceOf[NativeHandle]
  inline def ioTlsConnectionOptionsNew(tls_ctx: NativeHandle, server_name: Unit, alpn_list: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_tls_connection_options_new")(tls_ctx.asInstanceOf[js.Any], server_name.asInstanceOf[js.Any], alpn_list.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def ioTlsConnectionOptionsNew(tls_ctx: NativeHandle, server_name: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_tls_connection_options_new")(tls_ctx.asInstanceOf[js.Any], server_name.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  inline def ioTlsConnectionOptionsNew(tls_ctx: NativeHandle, server_name: StringLike, alpn_list: StringLike): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_tls_connection_options_new")(tls_ctx.asInstanceOf[js.Any], server_name.asInstanceOf[js.Any], alpn_list.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def ioTlsCtxNew(
    min_tls_version: Double,
    ca_filepath: js.UndefOr[StringLike],
    ca_dirpath: js.UndefOr[StringLike],
    certificate_authority: js.UndefOr[StringLike],
    alpn_list: js.UndefOr[StringLike],
    certificate_filepath: js.UndefOr[StringLike],
    certificate: js.UndefOr[StringLike],
    private_key_filepath: js.UndefOr[StringLike],
    private_key: js.UndefOr[StringLike],
    pkcs12_filepath: js.UndefOr[StringLike],
    pkcs12_password: js.UndefOr[StringLike],
    pkcs11_options: js.UndefOr[Pkcs11Options],
    windows_cert_store_path: js.UndefOr[StringLike],
    verify_peer: js.UndefOr[Boolean]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("io_tls_ctx_new")(min_tls_version.asInstanceOf[js.Any], ca_filepath.asInstanceOf[js.Any], ca_dirpath.asInstanceOf[js.Any], certificate_authority.asInstanceOf[js.Any], alpn_list.asInstanceOf[js.Any], certificate_filepath.asInstanceOf[js.Any], certificate.asInstanceOf[js.Any], private_key_filepath.asInstanceOf[js.Any], private_key.asInstanceOf[js.Any], pkcs12_filepath.asInstanceOf[js.Any], pkcs12_password.asInstanceOf[js.Any], pkcs11_options.asInstanceOf[js.Any], windows_cert_store_path.asInstanceOf[js.Any], verify_peer.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def isAlpnAvailable(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("is_alpn_available")().asInstanceOf[Boolean]
  
  inline def mqttClientConnectionClose(connection: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_close")(connection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def mqttClientConnectionConnect(
    connection: NativeHandle,
    client_id: StringLike,
    server_name: StringLike,
    port: Double,
    socket_options: js.UndefOr[NativeHandle],
    keep_alive_time: js.UndefOr[Double],
    ping_timeout: js.UndefOr[Double],
    protocol_operation_timeout: js.UndefOr[Double],
    clean_session: js.UndefOr[Boolean],
    on_connect: js.UndefOr[mqttOnConnect]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_connect")(connection.asInstanceOf[js.Any], client_id.asInstanceOf[js.Any], server_name.asInstanceOf[js.Any], port.asInstanceOf[js.Any], socket_options.asInstanceOf[js.Any], keep_alive_time.asInstanceOf[js.Any], ping_timeout.asInstanceOf[js.Any], protocol_operation_timeout.asInstanceOf[js.Any], clean_session.asInstanceOf[js.Any], on_connect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionDisconnect(connection: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_disconnect")(connection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mqttClientConnectionDisconnect(connection: NativeHandle, on_disconnect: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_disconnect")(connection.asInstanceOf[js.Any], on_disconnect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionNew(
    client: NativeHandle,
    on_interrupted: js.UndefOr[js.Function1[/* error_code */ Double, Unit]],
    on_resumed: js.UndefOr[js.Function2[/* return_code */ Double, /* session_present */ Boolean, Unit]],
    tls_ctx: js.UndefOr[NativeHandle],
    will: js.UndefOr[Payload],
    username: js.UndefOr[StringLike],
    password: js.UndefOr[StringLike],
    use_websocket: js.UndefOr[Boolean],
    proxy_options: js.UndefOr[NativeHandle],
    websocket_handshake_transform: js.UndefOr[
      js.Function2[
        /* request */ HttpRequest, 
        /* done */ js.Function1[/* error_code */ js.UndefOr[Double], Unit], 
        Unit
      ]
    ],
    reconnect_min_sec: js.UndefOr[Double],
    reconnect_max_sec: js.UndefOr[Double]
  ): NativeHandle = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_new")(client.asInstanceOf[js.Any], on_interrupted.asInstanceOf[js.Any], on_resumed.asInstanceOf[js.Any], tls_ctx.asInstanceOf[js.Any], will.asInstanceOf[js.Any], username.asInstanceOf[js.Any], password.asInstanceOf[js.Any], use_websocket.asInstanceOf[js.Any], proxy_options.asInstanceOf[js.Any], websocket_handshake_transform.asInstanceOf[js.Any], reconnect_min_sec.asInstanceOf[js.Any], reconnect_max_sec.asInstanceOf[js.Any])).asInstanceOf[NativeHandle]
  
  inline def mqttClientConnectionOnMessage(connection: NativeHandle): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_on_message")(connection.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def mqttClientConnectionOnMessage(connection: NativeHandle, on_publish: OnMessageCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_on_message")(connection.asInstanceOf[js.Any], on_publish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionPublish(connection: NativeHandle, topic: StringLike, payload: StringLike, qos: Double, retain: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_publish")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], qos.asInstanceOf[js.Any], retain.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mqttClientConnectionPublish(
    connection: NativeHandle,
    topic: StringLike,
    payload: StringLike,
    qos: Double,
    retain: Boolean,
    on_publish: js.Function2[/* packet_id */ Double, /* error_code */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_publish")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], payload.asInstanceOf[js.Any], qos.asInstanceOf[js.Any], retain.asInstanceOf[js.Any], on_publish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionReconnect(connection: NativeHandle, on_connect: mqttOnConnect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_reconnect")(connection.asInstanceOf[js.Any], on_connect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionSubscribe(connection: NativeHandle, topic: StringLike, qos: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_subscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], qos.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mqttClientConnectionSubscribe(
    connection: NativeHandle,
    topic: StringLike,
    qos: Double,
    on_publish: Unit,
    on_suback: js.Function4[/* packet_id */ Double, /* topic */ String, /* qos */ QoS, /* error_code */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_subscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], qos.asInstanceOf[js.Any], on_publish.asInstanceOf[js.Any], on_suback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mqttClientConnectionSubscribe(connection: NativeHandle, topic: StringLike, qos: Double, on_publish: OnMessageCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_subscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], qos.asInstanceOf[js.Any], on_publish.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mqttClientConnectionSubscribe(
    connection: NativeHandle,
    topic: StringLike,
    qos: Double,
    on_publish: OnMessageCallback,
    on_suback: js.Function4[/* packet_id */ Double, /* topic */ String, /* qos */ QoS, /* error_code */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_subscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], qos.asInstanceOf[js.Any], on_publish.asInstanceOf[js.Any], on_suback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientConnectionUnsubscribe(connection: NativeHandle, topic: StringLike): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_unsubscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def mqttClientConnectionUnsubscribe(
    connection: NativeHandle,
    topic: StringLike,
    on_unsuback: js.Function2[/* packet_id */ Double, /* error_code */ Double, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_connection_unsubscribe")(connection.asInstanceOf[js.Any], topic.asInstanceOf[js.Any], on_unsuback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mqttClientNew(): NativeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_new")().asInstanceOf[NativeHandle]
  inline def mqttClientNew(client_bootstrap: NativeHandle): NativeHandle = ^.asInstanceOf[js.Dynamic].applyDynamic("mqtt_client_new")(client_bootstrap.asInstanceOf[js.Any]).asInstanceOf[NativeHandle]
  
  inline def nativeMemory(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("native_memory")().asInstanceOf[Double]
  
  inline def nativeMemoryDump(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("native_memory_dump")().asInstanceOf[Unit]
  
  /**
    * Type used to store pointers to CRT native resources
    * @internal
    */
  type NativeHandle = Any
  
  type StringLike = String | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView
  
  type mqttOnConnect = js.Function3[/* error_code */ Double, /* return_code */ Double, /* session_present */ Boolean, Unit]
}
