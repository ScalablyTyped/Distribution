package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Player extends StObject {
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var CurrentPosition: Double
  
  def GoToNextBookmark(): Unit
  
  def GoToPreviousBookmark(): Unit
  
  val Parent: js.Any
  
  def Pause(): Unit
  
  def Play(): Unit
  
  @JSName("PowerPoint.Player_typekey")
  var PowerPointDotPlayer_typekey: Player
  
  val State: PpPlayerState
  
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
  
  @scala.inline
  implicit class PlayerMutableBuilder[Self <: Player] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentPosition(value: Double): Self = StObject.set(x, "CurrentPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGoToNextBookmark(value: () => Unit): Self = StObject.set(x, "GoToNextBookmark", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGoToPreviousBookmark(value: () => Unit): Self = StObject.set(x, "GoToPreviousBookmark", js.Any.fromFunction0(value))
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "Pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "Play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPowerPointDotPlayer_typekey(value: Player): Self = StObject.set(x, "PowerPoint.Player_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PpPlayerState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "Stop", js.Any.fromFunction0(value))
  }
}
