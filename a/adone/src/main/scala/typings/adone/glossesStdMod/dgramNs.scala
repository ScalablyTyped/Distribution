package typings.adone.glossesStdMod

import typings.node.Buffer
import typings.node.dgramMod.RemoteInfo
import typings.node.dgramMod.SocketOptions
import typings.node.dgramMod.SocketType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "dgram")
@js.native
object dgramNs extends js.Object {
  @js.native
  class Socket ()
    extends typings.node.dgramMod.Socket
  
  def createSocket(options: SocketOptions): typings.node.dgramMod.Socket = js.native
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): typings.node.dgramMod.Socket = js.native
  def createSocket(`type`: SocketType): typings.node.dgramMod.Socket = js.native
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): typings.node.dgramMod.Socket = js.native
}

