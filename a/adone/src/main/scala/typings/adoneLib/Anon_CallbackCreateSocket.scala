package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_CallbackCreateSocket extends js.Object {
  var Socket: org.scalablytyped.runtime.Instantiable0[adoneLib.glossesStdMod.dgramNs.Socket] = js.native
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

