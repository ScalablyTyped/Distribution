package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofhttp2 extends js.Object {
  var ClientHttp2Session: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.ClientHttp2Session] = js.native
  var ClientHttp2Stream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.ClientHttp2Stream] = js.native
  var Http2SecureServer: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2SecureServer] = js.native
  var Http2Server: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2Server] = js.native
  var Http2ServerRequest: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2ServerRequest] = js.native
  var Http2ServerResponse: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2ServerResponse] = js.native
  var Http2Session: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2Session] = js.native
  var Http2Stream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.Http2Stream] = js.native
  var ServerHttp2Session: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.ServerHttp2Session] = js.native
  var ServerHttp2Stream: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.http2Ns.ServerHttp2Stream] = js.native
  val constantsNs: TypeofconstantsDEFAULTSETTINGSENABLEPUSH = js.native
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
  def getPackedSettings(settings: nodeLib.http2Mod.Settings): nodeLib.Buffer = js.native
  def getUnpackedSettings(buf: stdLib.Uint8Array): nodeLib.http2Mod.Settings = js.native
}

