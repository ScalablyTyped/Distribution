package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Player extends js.Object {
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
  @scala.inline
  implicit class PlayerOps[Self <: Player] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentPosition(value: Double): Self = this.set("CurrentPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoToNextBookmark(value: () => Unit): Self = this.set("GoToNextBookmark", js.Any.fromFunction0(value))
    @scala.inline
    def setGoToPreviousBookmark(value: () => Unit): Self = this.set("GoToPreviousBookmark", js.Any.fromFunction0(value))
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("Pause", js.Any.fromFunction0(value))
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("Play", js.Any.fromFunction0(value))
    @scala.inline
    def setPowerPointDotPlayer_typekey(value: Player): Self = this.set("PowerPoint.Player_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: PpPlayerState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def setStop(value: () => Unit): Self = this.set("Stop", js.Any.fromFunction0(value))
  }
  
}

