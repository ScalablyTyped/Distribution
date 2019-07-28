package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.node.Anon_AllowHalfOpen
import typings.node.netMod.NetConnectOpts
import typings.node.netMod.Server
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofnet extends js.Object {
  // https://github.com/nodejs/node/blob/master/lib/net.js
  var Server: Instantiable0[typings.adone.glossesStdMod.netNs.Server] = js.native
  var Socket: Instantiable0[typings.adone.glossesStdMod.netNs.Socket] = js.native
  def connect(options: NetConnectOpts): Socket = js.native
  def connect(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def connect(path: String): Socket = js.native
  def connect(path: String, connectionListener: js.Function0[Unit]): Socket = js.native
  def connect(port: Double): Socket = js.native
  def connect(port: Double, host: String): Socket = js.native
  def connect(port: Double, host: String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(options: NetConnectOpts): Socket = js.native
  def createConnection(options: NetConnectOpts, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(path: String): Socket = js.native
  def createConnection(path: String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createConnection(port: Double): Socket = js.native
  def createConnection(port: Double, host: String): Socket = js.native
  def createConnection(port: Double, host: String, connectionListener: js.Function0[Unit]): Socket = js.native
  def createServer(): Server = js.native
  def createServer(connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def createServer(options: Anon_AllowHalfOpen): Server = js.native
  def createServer(options: Anon_AllowHalfOpen, connectionListener: js.Function1[/* socket */ Socket, Unit]): Server = js.native
  def isIP(input: String): Double = js.native
  def isIPv4(input: String): Boolean = js.native
  def isIPv6(input: String): Boolean = js.native
}

