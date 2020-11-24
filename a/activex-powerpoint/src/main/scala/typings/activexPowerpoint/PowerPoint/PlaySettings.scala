package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlaySettings extends js.Object {
  
  var ActionVerb: String = js.native
  
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  var HideWhileNotPlaying: MsoTriState = js.native
  
  var LoopUntilStopped: MsoTriState = js.native
  
  val Parent: js.Any = js.native
  
  var PauseAnimation: MsoTriState = js.native
  
  var PlayOnEntry: MsoTriState = js.native
  
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: PlaySettings = js.native
  
  var RewindMovie: MsoTriState = js.native
  
  var StopAfterSlides: Double = js.native
}
object PlaySettings {
  
  @scala.inline
  def apply(
    ActionVerb: String,
    Application: Application,
    HideWhileNotPlaying: MsoTriState,
    LoopUntilStopped: MsoTriState,
    Parent: js.Any,
    PauseAnimation: MsoTriState,
    PlayOnEntry: MsoTriState,
    PowerPointDotPlaySettings_typekey: PlaySettings,
    RewindMovie: MsoTriState,
    StopAfterSlides: Double
  ): PlaySettings = {
    val __obj = js.Dynamic.literal(ActionVerb = ActionVerb.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], HideWhileNotPlaying = HideWhileNotPlaying.asInstanceOf[js.Any], LoopUntilStopped = LoopUntilStopped.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PauseAnimation = PauseAnimation.asInstanceOf[js.Any], PlayOnEntry = PlayOnEntry.asInstanceOf[js.Any], RewindMovie = RewindMovie.asInstanceOf[js.Any], StopAfterSlides = StopAfterSlides.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PlaySettings_typekey")(PowerPointDotPlaySettings_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaySettings]
  }
  
  @scala.inline
  implicit class PlaySettingsOps[Self <: PlaySettings] (val x: Self) extends AnyVal {
    
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
    def setActionVerb(value: String): Self = this.set("ActionVerb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideWhileNotPlaying(value: MsoTriState): Self = this.set("HideWhileNotPlaying", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUntilStopped(value: MsoTriState): Self = this.set("LoopUntilStopped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPauseAnimation(value: MsoTriState): Self = this.set("PauseAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlayOnEntry(value: MsoTriState): Self = this.set("PlayOnEntry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotPlaySettings_typekey(value: PlaySettings): Self = this.set("PowerPoint.PlaySettings_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewindMovie(value: MsoTriState): Self = this.set("RewindMovie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopAfterSlides(value: Double): Self = this.set("StopAfterSlides", value.asInstanceOf[js.Any])
  }
}
