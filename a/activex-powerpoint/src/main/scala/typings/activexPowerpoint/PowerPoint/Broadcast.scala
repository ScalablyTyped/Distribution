package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Broadcast extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  val AttendeeUrl: String
  val IsBroadcasting: Boolean
  val Parent: js.Any
  @JSName("PowerPoint.Broadcast_typekey")
  var PowerPointDotBroadcast_typekey: Broadcast
  def End(): Unit
  def Start(serverUrl: String): Unit
}

object Broadcast {
  @scala.inline
  def apply(
    Application: Application,
    AttendeeUrl: String,
    End: () => Unit,
    IsBroadcasting: Boolean,
    Parent: js.Any,
    PowerPointDotBroadcast_typekey: Broadcast,
    Start: String => Unit
  ): Broadcast = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AttendeeUrl = AttendeeUrl.asInstanceOf[js.Any], End = js.Any.fromFunction0(End), IsBroadcasting = IsBroadcasting.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Start = js.Any.fromFunction1(Start))
    __obj.updateDynamic("PowerPoint.Broadcast_typekey")(PowerPointDotBroadcast_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Broadcast]
  }
}

