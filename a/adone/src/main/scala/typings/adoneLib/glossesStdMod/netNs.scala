package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "net")
@js.native
object netNs extends js.Object {
  // https://github.com/nodejs/node/blob/master/lib/net.js
  @js.native
  class Server ()
    extends nodeLib.netMod.Server {
    def this(connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]) = this()
    def this(options: nodeLib.Anon_AllowHalfOpen) = this()
    def this(options: nodeLib.Anon_AllowHalfOpen, connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]) = this()
  }
  
  @js.native
  class Socket ()
    extends nodeLib.netMod.Socket {
    def this(options: nodeLib.netMod.SocketConstructorOpts) = this()
  }
  
  def connect(options: nodeLib.netMod.NetConnectOpts): nodeLib.netMod.Socket = js.native
  def connect(options: nodeLib.netMod.NetConnectOpts, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def connect(path: java.lang.String): nodeLib.netMod.Socket = js.native
  def connect(path: java.lang.String, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String): nodeLib.netMod.Socket = js.native
  def connect(port: scala.Double, host: java.lang.String, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def createConnection(options: nodeLib.netMod.NetConnectOpts): nodeLib.netMod.Socket = js.native
  def createConnection(options: nodeLib.netMod.NetConnectOpts, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String): nodeLib.netMod.Socket = js.native
  def createConnection(path: java.lang.String, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String): nodeLib.netMod.Socket = js.native
  def createConnection(port: scala.Double, host: java.lang.String, connectionListener: js.Function0[scala.Unit]): nodeLib.netMod.Socket = js.native
  def createServer(): nodeLib.netMod.Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]): nodeLib.netMod.Server = js.native
  def createServer(options: nodeLib.Anon_AllowHalfOpen): nodeLib.netMod.Server = js.native
  def createServer(
    options: nodeLib.Anon_AllowHalfOpen,
    connectionListener: js.Function1[/* socket */ nodeLib.netMod.Socket, scala.Unit]
  ): nodeLib.netMod.Server = js.native
  def isIP(input: java.lang.String): scala.Double = js.native
  def isIPv4(input: java.lang.String): scala.Boolean = js.native
  def isIPv6(input: java.lang.String): scala.Boolean = js.native
}

