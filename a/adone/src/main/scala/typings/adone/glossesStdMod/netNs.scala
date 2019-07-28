package typings.adone.glossesStdMod

import typings.node.Anon_AllowHalfOpen
import typings.node.netMod.NetConnectOpts
import typings.node.netMod.SocketConstructorOpts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "net")
@js.native
object netNs extends js.Object {
  // https://github.com/nodejs/node/blob/master/lib/net.js
  @js.native
  class Server ()
    extends typings.node.netMod.Server {
    def this(connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]) = this()
    def this(options: Anon_AllowHalfOpen) = this()
    def this(
      options: Anon_AllowHalfOpen,
      connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]
    ) = this()
  }
  
  @js.native
  class Socket ()
    extends typings.node.netMod.Socket {
    def this(options: SocketConstructorOpts) = this()
  }
  
  def connect(options: NetConnectOpts): typings.node.netMod.Socket = js.native
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def connect(path: String): typings.node.netMod.Socket = js.native
  def connect(path: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def connect(port: Double): typings.node.netMod.Socket = js.native
  def connect(port: Double, host: String): typings.node.netMod.Socket = js.native
  def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def createConnection(options: NetConnectOpts): typings.node.netMod.Socket = js.native
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def createConnection(path: String): typings.node.netMod.Socket = js.native
  def createConnection(path: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def createConnection(port: Double): typings.node.netMod.Socket = js.native
  def createConnection(port: Double, host: String): typings.node.netMod.Socket = js.native
  def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): typings.node.netMod.Socket = js.native
  def createServer(): typings.node.netMod.Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]): typings.node.netMod.Server = js.native
  def createServer(options: Anon_AllowHalfOpen): typings.node.netMod.Server = js.native
  def createServer(
    options: Anon_AllowHalfOpen,
    connectionListener: js.Function1[/* socket */ typings.node.netMod.Socket, Unit]
  ): typings.node.netMod.Server = js.native
  def isIP(input: String): Double = js.native
  def isIPv4(input: String): Boolean = js.native
  def isIPv6(input: String): Boolean = js.native
}

