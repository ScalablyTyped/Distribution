package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Broadcast")
@js.native
class Broadcast protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  val AttendeeUrl: String = js.native
  val IsBroadcasting: Boolean = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Broadcast_typekey")
  var PowerPointDotBroadcast_typekey: Broadcast = js.native
  def End(): Unit = js.native
  def Start(serverUrl: String): Unit = js.native
}

