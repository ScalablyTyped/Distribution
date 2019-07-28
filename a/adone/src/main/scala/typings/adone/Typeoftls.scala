package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.node.Error
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecurePair
import typings.node.tlsMod.Server
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeoftls extends js.Object {
  val CLIENT_RENEG_LIMIT: Double = js.native
  val CLIENT_RENEG_WINDOW: Double = js.native
  val DEFAULT_ECDH_CURVE: String = js.native
  var Server: Instantiable0[typings.adone.glossesStdMod.tlsNs.Server] = js.native
  var TLSSocket: Instantiable1[/* socket */ Socket, typings.adone.glossesStdMod.tlsNs.TLSSocket] = js.native
  val rootCertificates: js.Array[String] = js.native
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  def checkServerIdentity(host: String, cert: PeerCertificate): js.UndefOr[Error] = js.native
  def connect(options: ConnectionOptions): TLSSocket = js.native
  def connect(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def connect(port: Double): TLSSocket = js.native
  def connect(port: Double, host: String): TLSSocket = js.native
  def connect(port: Double, host: String, options: ConnectionOptions): TLSSocket = js.native
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions): TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): TLSSocket = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  /**
    * @deprecated
    */
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: SecureContext): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
  def createServer(): Server = js.native
  def createServer(options: TlsOptions): Server = js.native
  def createServer(options: TlsOptions, secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
  def createServer(secureConnectionListener: js.Function1[/* socket */ TLSSocket, Unit]): Server = js.native
  def getCiphers(): js.Array[String] = js.native
}

