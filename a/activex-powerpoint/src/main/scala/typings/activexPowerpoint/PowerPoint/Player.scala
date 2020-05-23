package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Player extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var CurrentPosition: Double
  val Parent: js.Any
  @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: Player
  val State: PpPlayerState
  def GoToNextBookmark(): Unit
  def GoToPreviousBookmark(): Unit
  def Pause(): Unit
  def Play(): Unit
  def Stop(): Unit
}

object Player {
  @scala.inline
  def apply(
    Application: Application,
    CurrentPosition: Double,
    GoToNextBookmark: () => Unit,
    GoToPreviousBookmark: () => Unit,
    Parent: js.Any,
    Pause: () => Unit,
    Play: () => Unit,
    PowerPointDotPlayer_typekey: Player,
    State: PpPlayerState,
    Stop: () => Unit
  ): Player = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], CurrentPosition = CurrentPosition.asInstanceOf[js.Any], GoToNextBookmark = js.Any.fromFunction0(GoToNextBookmark), GoToPreviousBookmark = js.Any.fromFunction0(GoToPreviousBookmark), Parent = Parent.asInstanceOf[js.Any], Pause = js.Any.fromFunction0(Pause), Play = js.Any.fromFunction0(Play), State = State.asInstanceOf[js.Any], Stop = js.Any.fromFunction0(Stop))
    __obj.updateDynamic("PowerPoint.Player_typekey")(PowerPointDotPlayer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Player]
  }
}

