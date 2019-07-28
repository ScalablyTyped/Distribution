package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.node.Buffer
import typings.node.dgramMod.RemoteInfo
import typings.node.dgramMod.Socket
import typings.node.dgramMod.SocketOptions
import typings.node.dgramMod.SocketType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Typeofdgram extends js.Object {
  var Socket: Instantiable0[typings.adone.glossesStdMod.dgramNs.Socket] = js.native
  def createSocket(options: SocketOptions): Socket = js.native
  def createSocket(options: SocketOptions, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
  def createSocket(`type`: SocketType): Socket = js.native
  def createSocket(`type`: SocketType, callback: js.Function2[/* msg */ Buffer, /* rinfo */ RemoteInfo, Unit]): Socket = js.native
}

