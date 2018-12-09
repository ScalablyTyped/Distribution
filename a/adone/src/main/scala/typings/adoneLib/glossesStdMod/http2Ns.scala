package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "http2")
@js.native
object http2Ns extends js.Object {
  @js.native
  class Http2ServerRequest protected ()
    extends nodeLib.http2Mod.Http2ServerRequest
  
  @js.native
  class Http2ServerResponse protected ()
    extends nodeLib.http2Mod.Http2ServerResponse
  
  def connect(authority: java.lang.String): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: nodeLib.http2Mod.ClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: nodeLib.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: java.lang.String, options: nodeLib.http2Mod.SecureClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: java.lang.String,
    options: nodeLib.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: nodeLib.http2Mod.ClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: nodeLib.http2Mod.ClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(authority: nodeLib.urlMod.URL, options: nodeLib.http2Mod.SecureClientSessionOptions): nodeLib.http2Mod.ClientHttp2Session = js.native
  def connect(
    authority: nodeLib.urlMod.URL,
    options: nodeLib.http2Mod.SecureClientSessionOptions,
    listener: js.Function2[
      /* session */ nodeLib.http2Mod.ClientHttp2Session, 
      /* socket */ nodeLib.netMod.Socket | nodeLib.tlsMod.TLSSocket, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.ClientHttp2Session = js.native
  def createSecureServer(): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(options: nodeLib.http2Mod.SecureServerOptions): nodeLib.http2Mod.Http2SecureServer = js.native
  def createSecureServer(
    options: nodeLib.http2Mod.SecureServerOptions,
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2SecureServer = js.native
  def createServer(): nodeLib.http2Mod.Http2Server = js.native
  def createServer(
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2Server = js.native
  def createServer(options: nodeLib.http2Mod.ServerOptions): nodeLib.http2Mod.Http2Server = js.native
  def createServer(
    options: nodeLib.http2Mod.ServerOptions,
    onRequestHandler: js.Function2[
      /* request */ nodeLib.http2Mod.Http2ServerRequest, 
      /* response */ nodeLib.http2Mod.Http2ServerResponse, 
      scala.Unit
    ]
  ): nodeLib.http2Mod.Http2Server = js.native
  def getDefaultSettings(): nodeLib.http2Mod.Settings = js.native
  def getPackedSettings(settings: nodeLib.http2Mod.Settings): nodeLib.http2Mod.Settings = js.native
  def getUnpackedSettings(buf: nodeLib.Buffer): nodeLib.http2Mod.Settings = js.native
  def getUnpackedSettings(buf: stdLib.Uint8Array): nodeLib.http2Mod.Settings = js.native
  @JSName("constants")
  @js.native
  object constantsNs extends js.Object {
    val DEFAULT_SETTINGS_ENABLE_PUSH: scala.Double = js.native
    val DEFAULT_SETTINGS_HEADER_TABLE_SIZE: scala.Double = js.native
    val DEFAULT_SETTINGS_INITIAL_WINDOW_SIZE: scala.Double = js.native
    val DEFAULT_SETTINGS_MAX_FRAME_SIZE: scala.Double = js.native
    val HTTP2_HEADER_ACCEPT: java.lang.String = js.native
    val HTTP2_HEADER_ACCEPT_CHARSET: java.lang.String = js.native
    val HTTP2_HEADER_ACCEPT_ENCODING: java.lang.String = js.native
    val HTTP2_HEADER_ACCEPT_LANGUAGE: java.lang.String = js.native
    val HTTP2_HEADER_ACCEPT_RANGES: java.lang.String = js.native
    val HTTP2_HEADER_ACCESS_CONTROL_ALLOW_ORIGIN: java.lang.String = js.native
    val HTTP2_HEADER_AGE: java.lang.String = js.native
    val HTTP2_HEADER_ALLOW: java.lang.String = js.native
    val HTTP2_HEADER_AUTHORITY: java.lang.String = js.native
    val HTTP2_HEADER_AUTHORIZATION: java.lang.String = js.native
    val HTTP2_HEADER_CACHE_CONTROL: java.lang.String = js.native
    val HTTP2_HEADER_CONNECTION: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_DISPOSITION: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_ENCODING: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_LANGUAGE: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_LENGTH: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_LOCATION: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_MD5: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_RANGE: java.lang.String = js.native
    val HTTP2_HEADER_CONTENT_TYPE: java.lang.String = js.native
    val HTTP2_HEADER_COOKIE: java.lang.String = js.native
    val HTTP2_HEADER_DATE: java.lang.String = js.native
    val HTTP2_HEADER_ETAG: java.lang.String = js.native
    val HTTP2_HEADER_EXPECT: java.lang.String = js.native
    val HTTP2_HEADER_EXPIRES: java.lang.String = js.native
    val HTTP2_HEADER_FROM: java.lang.String = js.native
    val HTTP2_HEADER_HOST: java.lang.String = js.native
    val HTTP2_HEADER_HTTP2_SETTINGS: java.lang.String = js.native
    val HTTP2_HEADER_IF_MATCH: java.lang.String = js.native
    val HTTP2_HEADER_IF_MODIFIED_SINCE: java.lang.String = js.native
    val HTTP2_HEADER_IF_NONE_MATCH: java.lang.String = js.native
    val HTTP2_HEADER_IF_RANGE: java.lang.String = js.native
    val HTTP2_HEADER_IF_UNMODIFIED_SINCE: java.lang.String = js.native
    val HTTP2_HEADER_KEEP_ALIVE: java.lang.String = js.native
    val HTTP2_HEADER_LAST_MODIFIED: java.lang.String = js.native
    val HTTP2_HEADER_LINK: java.lang.String = js.native
    val HTTP2_HEADER_LOCATION: java.lang.String = js.native
    val HTTP2_HEADER_MAX_FORWARDS: java.lang.String = js.native
    val HTTP2_HEADER_METHOD: java.lang.String = js.native
    val HTTP2_HEADER_PATH: java.lang.String = js.native
    val HTTP2_HEADER_PREFER: java.lang.String = js.native
    val HTTP2_HEADER_PROXY_AUTHENTICATE: java.lang.String = js.native
    val HTTP2_HEADER_PROXY_AUTHORIZATION: java.lang.String = js.native
    val HTTP2_HEADER_PROXY_CONNECTION: java.lang.String = js.native
    val HTTP2_HEADER_RANGE: java.lang.String = js.native
    val HTTP2_HEADER_REFERER: java.lang.String = js.native
    val HTTP2_HEADER_REFRESH: java.lang.String = js.native
    val HTTP2_HEADER_RETRY_AFTER: java.lang.String = js.native
    val HTTP2_HEADER_SCHEME: java.lang.String = js.native
    val HTTP2_HEADER_SERVER: java.lang.String = js.native
    val HTTP2_HEADER_SET_COOKIE: java.lang.String = js.native
    val HTTP2_HEADER_STATUS: java.lang.String = js.native
    val HTTP2_HEADER_STRICT_TRANSPORT_SECURITY: java.lang.String = js.native
    val HTTP2_HEADER_TE: java.lang.String = js.native
    val HTTP2_HEADER_TRANSFER_ENCODING: java.lang.String = js.native
    val HTTP2_HEADER_UPGRADE: java.lang.String = js.native
    val HTTP2_HEADER_USER_AGENT: java.lang.String = js.native
    val HTTP2_HEADER_VARY: java.lang.String = js.native
    val HTTP2_HEADER_VIA: java.lang.String = js.native
    val HTTP2_HEADER_WWW_AUTHENTICATE: java.lang.String = js.native
    val HTTP2_METHOD_ACL: java.lang.String = js.native
    val HTTP2_METHOD_BASELINE_CONTROL: java.lang.String = js.native
    val HTTP2_METHOD_BIND: java.lang.String = js.native
    val HTTP2_METHOD_CHECKIN: java.lang.String = js.native
    val HTTP2_METHOD_CHECKOUT: java.lang.String = js.native
    val HTTP2_METHOD_CONNECT: java.lang.String = js.native
    val HTTP2_METHOD_COPY: java.lang.String = js.native
    val HTTP2_METHOD_DELETE: java.lang.String = js.native
    val HTTP2_METHOD_GET: java.lang.String = js.native
    val HTTP2_METHOD_HEAD: java.lang.String = js.native
    val HTTP2_METHOD_LABEL: java.lang.String = js.native
    val HTTP2_METHOD_LINK: java.lang.String = js.native
    val HTTP2_METHOD_LOCK: java.lang.String = js.native
    val HTTP2_METHOD_MERGE: java.lang.String = js.native
    val HTTP2_METHOD_MKACTIVITY: java.lang.String = js.native
    val HTTP2_METHOD_MKCALENDAR: java.lang.String = js.native
    val HTTP2_METHOD_MKCOL: java.lang.String = js.native
    val HTTP2_METHOD_MKREDIRECTREF: java.lang.String = js.native
    val HTTP2_METHOD_MKWORKSPACE: java.lang.String = js.native
    val HTTP2_METHOD_MOVE: java.lang.String = js.native
    val HTTP2_METHOD_OPTIONS: java.lang.String = js.native
    val HTTP2_METHOD_ORDERPATCH: java.lang.String = js.native
    val HTTP2_METHOD_PATCH: java.lang.String = js.native
    val HTTP2_METHOD_POST: java.lang.String = js.native
    val HTTP2_METHOD_PRI: java.lang.String = js.native
    val HTTP2_METHOD_PROPFIND: java.lang.String = js.native
    val HTTP2_METHOD_PROPPATCH: java.lang.String = js.native
    val HTTP2_METHOD_PUT: java.lang.String = js.native
    val HTTP2_METHOD_REBIND: java.lang.String = js.native
    val HTTP2_METHOD_REPORT: java.lang.String = js.native
    val HTTP2_METHOD_SEARCH: java.lang.String = js.native
    val HTTP2_METHOD_TRACE: java.lang.String = js.native
    val HTTP2_METHOD_UNBIND: java.lang.String = js.native
    val HTTP2_METHOD_UNCHECKOUT: java.lang.String = js.native
    val HTTP2_METHOD_UNLINK: java.lang.String = js.native
    val HTTP2_METHOD_UNLOCK: java.lang.String = js.native
    val HTTP2_METHOD_UPDATE: java.lang.String = js.native
    val HTTP2_METHOD_UPDATEREDIRECTREF: java.lang.String = js.native
    val HTTP2_METHOD_VERSION_CONTROL: java.lang.String = js.native
    val HTTP_STATUS_ACCEPTED: scala.Double = js.native
    val HTTP_STATUS_ALREADY_REPORTED: scala.Double = js.native
    val HTTP_STATUS_BAD_GATEWAY: scala.Double = js.native
    val HTTP_STATUS_BAD_REQUEST: scala.Double = js.native
    val HTTP_STATUS_BANDWIDTH_LIMIT_EXCEEDED: scala.Double = js.native
    val HTTP_STATUS_CONFLICT: scala.Double = js.native
    val HTTP_STATUS_CONTINUE: scala.Double = js.native
    val HTTP_STATUS_CREATED: scala.Double = js.native
    val HTTP_STATUS_EXPECTATION_FAILED: scala.Double = js.native
    val HTTP_STATUS_FAILED_DEPENDENCY: scala.Double = js.native
    val HTTP_STATUS_FORBIDDEN: scala.Double = js.native
    val HTTP_STATUS_FOUND: scala.Double = js.native
    val HTTP_STATUS_GATEWAY_TIMEOUT: scala.Double = js.native
    val HTTP_STATUS_GONE: scala.Double = js.native
    val HTTP_STATUS_HTTP_VERSION_NOT_SUPPORTED: scala.Double = js.native
    val HTTP_STATUS_IM_USED: scala.Double = js.native
    val HTTP_STATUS_INSUFFICIENT_STORAGE: scala.Double = js.native
    val HTTP_STATUS_INTERNAL_SERVER_ERROR: scala.Double = js.native
    val HTTP_STATUS_LENGTH_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_LOCKED: scala.Double = js.native
    val HTTP_STATUS_LOOP_DETECTED: scala.Double = js.native
    val HTTP_STATUS_METHOD_NOT_ALLOWED: scala.Double = js.native
    val HTTP_STATUS_MISDIRECTED_REQUEST: scala.Double = js.native
    val HTTP_STATUS_MOVED_PERMANENTLY: scala.Double = js.native
    val HTTP_STATUS_MULTIPLE_CHOICES: scala.Double = js.native
    val HTTP_STATUS_MULTI_STATUS: scala.Double = js.native
    val HTTP_STATUS_NETWORK_AUTHENTICATION_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_NON_AUTHORITATIVE_INFORMATION: scala.Double = js.native
    val HTTP_STATUS_NOT_ACCEPTABLE: scala.Double = js.native
    val HTTP_STATUS_NOT_EXTENDED: scala.Double = js.native
    val HTTP_STATUS_NOT_FOUND: scala.Double = js.native
    val HTTP_STATUS_NOT_IMPLEMENTED: scala.Double = js.native
    val HTTP_STATUS_NOT_MODIFIED: scala.Double = js.native
    val HTTP_STATUS_NO_CONTENT: scala.Double = js.native
    val HTTP_STATUS_OK: scala.Double = js.native
    val HTTP_STATUS_PARTIAL_CONTENT: scala.Double = js.native
    val HTTP_STATUS_PAYLOAD_TOO_LARGE: scala.Double = js.native
    val HTTP_STATUS_PAYMENT_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_PERMANENT_REDIRECT: scala.Double = js.native
    val HTTP_STATUS_PRECONDITION_FAILED: scala.Double = js.native
    val HTTP_STATUS_PRECONDITION_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_PROCESSING: scala.Double = js.native
    val HTTP_STATUS_PROXY_AUTHENTICATION_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_RANGE_NOT_SATISFIABLE: scala.Double = js.native
    val HTTP_STATUS_REQUEST_HEADER_FIELDS_TOO_LARGE: scala.Double = js.native
    val HTTP_STATUS_REQUEST_TIMEOUT: scala.Double = js.native
    val HTTP_STATUS_RESET_CONTENT: scala.Double = js.native
    val HTTP_STATUS_SEE_OTHER: scala.Double = js.native
    val HTTP_STATUS_SERVICE_UNAVAILABLE: scala.Double = js.native
    val HTTP_STATUS_SWITCHING_PROTOCOLS: scala.Double = js.native
    val HTTP_STATUS_TEAPOT: scala.Double = js.native
    val HTTP_STATUS_TEMPORARY_REDIRECT: scala.Double = js.native
    val HTTP_STATUS_TOO_MANY_REQUESTS: scala.Double = js.native
    val HTTP_STATUS_UNAUTHORIZED: scala.Double = js.native
    val HTTP_STATUS_UNAVAILABLE_FOR_LEGAL_REASONS: scala.Double = js.native
    val HTTP_STATUS_UNORDERED_COLLECTION: scala.Double = js.native
    val HTTP_STATUS_UNPROCESSABLE_ENTITY: scala.Double = js.native
    val HTTP_STATUS_UNSUPPORTED_MEDIA_TYPE: scala.Double = js.native
    val HTTP_STATUS_UPGRADE_REQUIRED: scala.Double = js.native
    val HTTP_STATUS_URI_TOO_LONG: scala.Double = js.native
    val HTTP_STATUS_USE_PROXY: scala.Double = js.native
    val HTTP_STATUS_VARIANT_ALSO_NEGOTIATES: scala.Double = js.native
    val MAX_INITIAL_WINDOW_SIZE: scala.Double = js.native
    val MAX_MAX_FRAME_SIZE: scala.Double = js.native
    val MIN_MAX_FRAME_SIZE: scala.Double = js.native
    val NGHTTP2_CANCEL: scala.Double = js.native
    val NGHTTP2_COMPRESSION_ERROR: scala.Double = js.native
    val NGHTTP2_CONNECT_ERROR: scala.Double = js.native
    val NGHTTP2_DEFAULT_WEIGHT: scala.Double = js.native
    val NGHTTP2_ENHANCE_YOUR_CALM: scala.Double = js.native
    val NGHTTP2_ERR_FRAME_SIZE_ERROR: scala.Double = js.native
    val NGHTTP2_FLAG_ACK: scala.Double = js.native
    val NGHTTP2_FLAG_END_HEADERS: scala.Double = js.native
    val NGHTTP2_FLAG_END_STREAM: scala.Double = js.native
    val NGHTTP2_FLAG_NONE: scala.Double = js.native
    val NGHTTP2_FLAG_PADDED: scala.Double = js.native
    val NGHTTP2_FLAG_PRIORITY: scala.Double = js.native
    val NGHTTP2_FLOW_CONTROL_ERROR: scala.Double = js.native
    val NGHTTP2_FRAME_SIZE_ERROR: scala.Double = js.native
    val NGHTTP2_HTTP_1_1_REQUIRED: scala.Double = js.native
    val NGHTTP2_INADEQUATE_SECURITY: scala.Double = js.native
    val NGHTTP2_INTERNAL_ERROR: scala.Double = js.native
    val NGHTTP2_NO_ERROR: scala.Double = js.native
    val NGHTTP2_PROTOCOL_ERROR: scala.Double = js.native
    val NGHTTP2_REFUSED_STREAM: scala.Double = js.native
    val NGHTTP2_SESSION_CLIENT: scala.Double = js.native
    val NGHTTP2_SESSION_SERVER: scala.Double = js.native
    val NGHTTP2_SETTINGS_ENABLE_PUSH: scala.Double = js.native
    val NGHTTP2_SETTINGS_HEADER_TABLE_SIZE: scala.Double = js.native
    val NGHTTP2_SETTINGS_INITIAL_WINDOW_SIZE: scala.Double = js.native
    val NGHTTP2_SETTINGS_MAX_CONCURRENT_STREAMS: scala.Double = js.native
    val NGHTTP2_SETTINGS_MAX_FRAME_SIZE: scala.Double = js.native
    val NGHTTP2_SETTINGS_MAX_HEADER_LIST_SIZE: scala.Double = js.native
    val NGHTTP2_SETTINGS_TIMEOUT: scala.Double = js.native
    val NGHTTP2_STREAM_CLOSED: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_CLOSED: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_LOCAL: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_HALF_CLOSED_REMOTE: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_IDLE: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_OPEN: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_RESERVED_LOCAL: scala.Double = js.native
    val NGHTTP2_STREAM_STATE_RESERVED_REMOTE: scala.Double = js.native
    val PADDING_STRATEGY_CALLBACK: scala.Double = js.native
    val PADDING_STRATEGY_MAX: scala.Double = js.native
    val PADDING_STRATEGY_NONE: scala.Double = js.native
  }
  
}

