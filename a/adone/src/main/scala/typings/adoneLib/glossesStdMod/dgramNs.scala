package typings
package adoneLib.glossesStdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("adone/glosses/std", "dgram")
@js.native
object dgramNs extends js.Object {
  @js.native
  class Socket ()
    extends nodeLib.dgramMod.Socket
  
  def createSocket(options: nodeLib.dgramMod.SocketOptions): nodeLib.dgramMod.Socket = js.native
  def createSocket(
    options: nodeLib.dgramMod.SocketOptions,
    callback: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.dgramMod.RemoteInfo, scala.Unit]
  ): nodeLib.dgramMod.Socket = js.native
  def createSocket(`type`: nodeLib.dgramMod.SocketType): nodeLib.dgramMod.Socket = js.native
  def createSocket(
    `type`: nodeLib.dgramMod.SocketType,
    callback: js.Function2[/* msg */ nodeLib.Buffer, /* rinfo */ nodeLib.dgramMod.RemoteInfo, scala.Unit]
  ): nodeLib.dgramMod.Socket = js.native
}

