package typings.anyproxy.anyproxyMod

import typings.node.eventsMod.EventEmitter
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anyproxy", "ProxyCore")
@js.native
/**
  * Creates an instance of ProxyCore.
  * @param config - configs
  */
class ProxyCore () extends EventEmitter {
  def this(config: ProxyOptions) = this()
  /** Close the proxy server */
  def close(): js.Promise[Unit] = js.native
  /**
    * Manage all created socket
    * for each new socket, we put them to a map;
    * if the socket is closed itself, we remove it from the map
    * when the `close` method is called, we'll close the sockes before the server closed
    *
    * @param socket the http socket that is creating
    */
  def handleExistConnections(socket: Socket): Unit = js.native
  /** Start the proxy server */
  def start(): this.type = js.native
}

