package typings.adone.glossesStdMod

import typings.node.Error
import typings.node.netMod.Socket
import typings.node.tlsMod.ConnectionOptions
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureContextOptions
import typings.node.tlsMod.SecurePair
import typings.node.tlsMod.TLSSocketOptions
import typings.node.tlsMod.TlsOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "tls")
@js.native
object tlsNs extends js.Object {
  @js.native
  class Server ()
    extends typings.node.tlsMod.Server
  
  @js.native
  class TLSSocket protected ()
    extends typings.node.tlsMod.TLSSocket {
    /**
      * Construct a new tls.TLSSocket object from an existing TCP socket.
      */
    def this(socket: Socket) = this()
    def this(socket: Socket, options: TLSSocketOptions) = this()
  }
  
  val CLIENT_RENEG_LIMIT: Double = js.native
  val CLIENT_RENEG_WINDOW: Double = js.native
  val DEFAULT_ECDH_CURVE: String = js.native
  val rootCertificates: js.Array[String] = js.native
  /*
    * Verifies the certificate `cert` is issued to host `host`.
    * @host The hostname to verify the certificate against
    * @cert PeerCertificate representing the peer's certificate
    *
    * Returns Error object, populating it with the reason, host and cert on failure.  On success, returns undefined.
    */
  def checkServerIdentity(host: String, cert: PeerCertificate): js.UndefOr[Error] = js.native
  def connect(options: ConnectionOptions): typings.node.tlsMod.TLSSocket = js.native
  def connect(options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double, host: String): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double, host: String, options: ConnectionOptions): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double, host: String, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions): typings.node.tlsMod.TLSSocket = js.native
  def connect(port: Double, options: ConnectionOptions, secureConnectListener: js.Function0[Unit]): typings.node.tlsMod.TLSSocket = js.native
  def createSecureContext(details: SecureContextOptions): SecureContext = js.native
  /**
    * @deprecated
    */
  def createSecurePair(): SecurePair = js.native
  def createSecurePair(credentials: SecureContext): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean): SecurePair = js.native
  def createSecurePair(credentials: SecureContext, isServer: Boolean, requestCert: Boolean, rejectUnauthorized: Boolean): SecurePair = js.native
  def createServer(): typings.node.tlsMod.Server = js.native
  def createServer(options: TlsOptions): typings.node.tlsMod.Server = js.native
  def createServer(
    options: TlsOptions,
    secureConnectionListener: js.Function1[/* socket */ typings.node.tlsMod.TLSSocket, Unit]
  ): typings.node.tlsMod.Server = js.native
  def createServer(secureConnectionListener: js.Function1[/* socket */ typings.node.tlsMod.TLSSocket, Unit]): typings.node.tlsMod.Server = js.native
  def getCiphers(): js.Array[String] = js.native
}

