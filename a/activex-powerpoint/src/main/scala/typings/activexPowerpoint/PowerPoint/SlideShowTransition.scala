package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideShowTransition extends StObject {
  
  var AdvanceOnClick: MsoTriState
  
  var AdvanceOnTime: MsoTriState
  
  var AdvanceTime: Double
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var Duration: Double
  
  var EntryEffect: PpEntryEffect
  
  var Hidden: MsoTriState
  
  var LoopSoundUntilNext: MsoTriState
  
  val Parent: js.Any
  
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: SlideShowTransition
  
  val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect
  
  var Speed: PpTransitionSpeed
}
object SlideShowTransition {
  
  @scala.inline
  def apply(
    AdvanceOnClick: MsoTriState,
    AdvanceOnTime: MsoTriState,
    AdvanceTime: Double,
    Application: Application,
    Duration: Double,
    EntryEffect: PpEntryEffect,
    Hidden: MsoTriState,
    LoopSoundUntilNext: MsoTriState,
    Parent: js.Any,
    PowerPointDotSlideShowTransition_typekey: SlideShowTransition,
    SoundEffect: SoundEffect,
    Speed: PpTransitionSpeed
  ): SlideShowTransition = {
    val __obj = js.Dynamic.literal(AdvanceOnClick = AdvanceOnClick.asInstanceOf[js.Any], AdvanceOnTime = AdvanceOnTime.asInstanceOf[js.Any], AdvanceTime = AdvanceTime.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], EntryEffect = EntryEffect.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], LoopSoundUntilNext = LoopSoundUntilNext.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SoundEffect = SoundEffect.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.SlideShowTransition_typekey")(PowerPointDotSlideShowTransition_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideShowTransition]
  }
  
  @scala.inline
  implicit class SlideShowTransitionMutableBuilder[Self <: SlideShowTransition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvanceOnClick(value: MsoTriState): Self = StObject.set(x, "AdvanceOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvanceOnTime(value: MsoTriState): Self = StObject.set(x, "AdvanceOnTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvanceTime(value: Double): Self = StObject.set(x, "AdvanceTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryEffect(value: PpEntryEffect): Self = StObject.set(x, "EntryEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHidden(value: MsoTriState): Self = StObject.set(x, "Hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopSoundUntilNext(value: MsoTriState): Self = StObject.set(x, "LoopSoundUntilNext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotSlideShowTransition_typekey(value: SlideShowTransition): Self = StObject.set(x, "PowerPoint.SlideShowTransition_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoundEffect(value: SoundEffect): Self = StObject.set(x, "SoundEffect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: PpTransitionSpeed): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
  }
}
