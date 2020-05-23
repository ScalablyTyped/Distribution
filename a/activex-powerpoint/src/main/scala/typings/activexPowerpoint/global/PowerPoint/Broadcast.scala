package typings.activexPowerpoint.global.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Broadcast")
@js.native
class Broadcast protected ()
  extends typings.activexPowerpoint.PowerPoint.Broadcast {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override val AttendeeUrl: String = js.native
  /* CompleteClass */
  override val IsBroadcasting: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Broadcast_typekey")
  override var PowerPointDotBroadcast_typekey: typings.activexPowerpoint.PowerPoint.Broadcast = js.native
  /* CompleteClass */
  override def End(): Unit = js.native
  /* CompleteClass */
  override def Start(serverUrl: String): Unit = js.native
}

