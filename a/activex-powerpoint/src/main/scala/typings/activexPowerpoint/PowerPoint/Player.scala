package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Player")
@js.native
class Player protected () extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var CurrentPosition: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: Player = js.native
  val State: PpPlayerState = js.native
  def GoToNextBookmark(): Unit = js.native
  def GoToPreviousBookmark(): Unit = js.native
  def Pause(): Unit = js.native
  def Play(): Unit = js.native
  def Stop(): Unit = js.native
}

