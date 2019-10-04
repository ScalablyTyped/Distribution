package typings.anyproxy.anyproxyMod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("anyproxy", "ProxyWebServer")
@js.native
class ProxyWebServer protected () extends EventEmitter {
  /**
    * Creates an instance of webInterface.
    *
    * @param config
    * @param config.webPort
    * @param recorder
    */
  def this(config: WebInterfaceOptions, recorder: ProxyRecorder) = this()
  def close(): Unit = js.native
  /**
    * get the express server
    */
  def getServer(): js.Any = js.native
  def start(): js.Promise[Unit] = js.native
}

