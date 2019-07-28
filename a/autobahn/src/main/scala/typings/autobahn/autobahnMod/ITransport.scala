package typings.autobahn.autobahnMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransport extends js.Object {
  var info: ITransportInfo = js.native
  def close(errorCode: Double): Unit = js.native
  def close(errorCode: Double, reason: String): Unit = js.native
  def onclose(details: ICloseEventDetails): Unit = js.native
  def onmessage(message: js.Array[_]): Unit = js.native
  def onopen(): Unit = js.native
  def send(message: js.Array[_]): Unit = js.native
}

