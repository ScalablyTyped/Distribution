package typings
package autobahnLib.autobahnMod.autobahnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITransport extends js.Object {
  var info: ITransportInfo = js.native
  def close(errorCode: scala.Double): scala.Unit = js.native
  def close(errorCode: scala.Double, reason: java.lang.String): scala.Unit = js.native
  def onclose(details: ICloseEventDetails): scala.Unit = js.native
  def onmessage(message: js.Array[_]): scala.Unit = js.native
  def onopen(): scala.Unit = js.native
  def send(message: js.Array[_]): scala.Unit = js.native
}

