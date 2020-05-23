package typings.activexPowerpoint.global.PowerPoint

import typings.activexPowerpoint.PowerPoint.PpPlayerState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Player")
@js.native
class Player protected ()
  extends typings.activexPowerpoint.PowerPoint.Player {
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var CurrentPosition: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Player_typekey")
  override var PowerPointDotPlayer_typekey: typings.activexPowerpoint.PowerPoint.Player = js.native
  /* CompleteClass */
  override val State: PpPlayerState = js.native
  /* CompleteClass */
  override def GoToNextBookmark(): Unit = js.native
  /* CompleteClass */
  override def GoToPreviousBookmark(): Unit = js.native
  /* CompleteClass */
  override def Pause(): Unit = js.native
  /* CompleteClass */
  override def Play(): Unit = js.native
  /* CompleteClass */
  override def Stop(): Unit = js.native
}

