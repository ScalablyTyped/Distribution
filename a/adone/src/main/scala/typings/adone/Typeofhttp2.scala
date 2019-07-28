package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.http2Mod.ClientHttp2Session
import typings.node.http2Mod.ClientSessionOptions
import typings.node.http2Mod.Http2SecureServer
import typings.node.http2Mod.Http2Server
import typings.node.http2Mod.Http2ServerRequest
import typings.node.http2Mod.Http2ServerResponse
import typings.node.http2Mod.SecureClientSessionOptions
import typings.node.http2Mod.SecureServerOptions
import typings.node.http2Mod.ServerOptions
import typings.node.http2Mod.Settings
import typings.node.netMod.Socket
import typings.node.tlsMod.TLSSocket
import typings.node.urlMod.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhttp2 extends js.Object {
  var ClientHttp2Session: Instantiable0[typings.adone.glossesStdMod.http2Ns.ClientHttp2Session] = js.native
  var ClientHttp2Stream: Instantiable0[typings.adone.glossesStdMod.http2Ns.ClientHttp2Stream] = js.native
  var Http2SecureServer: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2SecureServer] = js.native
  var Http2Server: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2Server] = js.native
  var Http2ServerRequest: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2ServerRequest] = js.native
  var Http2ServerResponse: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2ServerResponse] = js.native
  var Http2Session: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2Session] = js.native
  var Http2Stream: Instantiable0[typings.adone.glossesStdMod.http2Ns.Http2Stream] = js.native
  var ServerHttp2Session: Instantiable0[typings.adone.glossesStdMod.http2Ns.ServerHttp2Session] = js.native
  var ServerHttp2Stream: Instantiable0[typings.adone.glossesStdMod.http2Ns.ServerHttp2Stream] = js.native
  val constantsNs: TypeofconstantsDEFAULTSETTINGSENABLEPUSH = js.native
  def connect(authority: String): ClientHttp2Session = js.native
  def connect(
    authority: String,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: String, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: String,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: String, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: String,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL, options: ClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    options: ClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def connect(authority: URL, options: SecureClientSessionOptions): ClientHttp2Session = js.native
  def connect(
    authority: URL,
    options: SecureClientSessionOptions,
    listener: js.Function2[/* session */ ClientHttp2Session, /* socket */ Socket | TLSSocket, Unit]
  ): ClientHttp2Session = js.native
  def createSecureServer(): Http2SecureServer = js.native
  def createSecureServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
  def createSecureServer(options: SecureServerOptions): Http2SecureServer = js.native
  def createSecureServer(
    options: SecureServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2SecureServer = js.native
  def createServer(): Http2Server = js.native
  def createServer(
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
  def createServer(options: ServerOptions): Http2Server = js.native
  def createServer(
    options: ServerOptions,
    onRequestHandler: js.Function2[/* request */ Http2ServerRequest, /* response */ Http2ServerResponse, Unit]
  ): Http2Server = js.native
  def getDefaultSettings(): Settings = js.native
  def getPackedSettings(settings: Settings): Buffer = js.native
  def getUnpackedSettings(buf: Uint8Array): Settings = js.native
}

