package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Timing extends StObject {
  
  var Accelerate: Double
  
  val Application: typings.activexPowerpoint.PowerPoint.Application
  
  var AutoReverse: MsoTriState
  
  var BounceEnd: MsoTriState
  
  var BounceEndIntensity: Double
  
  var Decelerate: Double
  
  var Duration: Double
  
  val Parent: js.Any
  
  @JSName("PowerPoint.Timing_typekey")
  var PowerPointDotTiming_typekey: Timing
  
  var RepeatCount: Double
  
  var RepeatDuration: Double
  
  var Restart: MsoAnimEffectRestart
  
  var RewindAtEnd: MsoTriState
  
  var SmoothEnd: MsoTriState
  
  var SmoothStart: MsoTriState
  
  var Speed: Double
  
  var TriggerBookmark: String
  
  var TriggerDelayTime: Double
  
  var TriggerShape: Shape
  
  var TriggerType: MsoAnimTriggerType
}
object Timing {
  
  @scala.inline
  def apply(
    Accelerate: Double,
    Application: Application,
    AutoReverse: MsoTriState,
    BounceEnd: MsoTriState,
    BounceEndIntensity: Double,
    Decelerate: Double,
    Duration: Double,
    Parent: js.Any,
    PowerPointDotTiming_typekey: Timing,
    RepeatCount: Double,
    RepeatDuration: Double,
    Restart: MsoAnimEffectRestart,
    RewindAtEnd: MsoTriState,
    SmoothEnd: MsoTriState,
    SmoothStart: MsoTriState,
    Speed: Double,
    TriggerBookmark: String,
    TriggerDelayTime: Double,
    TriggerShape: Shape,
    TriggerType: MsoAnimTriggerType
  ): Timing = {
    val __obj = js.Dynamic.literal(Accelerate = Accelerate.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoReverse = AutoReverse.asInstanceOf[js.Any], BounceEnd = BounceEnd.asInstanceOf[js.Any], BounceEndIntensity = BounceEndIntensity.asInstanceOf[js.Any], Decelerate = Decelerate.asInstanceOf[js.Any], Duration = Duration.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RepeatCount = RepeatCount.asInstanceOf[js.Any], RepeatDuration = RepeatDuration.asInstanceOf[js.Any], Restart = Restart.asInstanceOf[js.Any], RewindAtEnd = RewindAtEnd.asInstanceOf[js.Any], SmoothEnd = SmoothEnd.asInstanceOf[js.Any], SmoothStart = SmoothStart.asInstanceOf[js.Any], Speed = Speed.asInstanceOf[js.Any], TriggerBookmark = TriggerBookmark.asInstanceOf[js.Any], TriggerDelayTime = TriggerDelayTime.asInstanceOf[js.Any], TriggerShape = TriggerShape.asInstanceOf[js.Any], TriggerType = TriggerType.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.Timing_typekey")(PowerPointDotTiming_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Timing]
  }
  
  @scala.inline
  implicit class TimingMutableBuilder[Self <: Timing] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccelerate(value: Double): Self = StObject.set(x, "Accelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReverse(value: MsoTriState): Self = StObject.set(x, "AutoReverse", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceEnd(value: MsoTriState): Self = StObject.set(x, "BounceEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBounceEndIntensity(value: Double): Self = StObject.set(x, "BounceEndIntensity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecelerate(value: Double): Self = StObject.set(x, "Decelerate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotTiming_typekey(value: Timing): Self = StObject.set(x, "PowerPoint.Timing_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatCount(value: Double): Self = StObject.set(x, "RepeatCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatDuration(value: Double): Self = StObject.set(x, "RepeatDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestart(value: MsoAnimEffectRestart): Self = StObject.set(x, "Restart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRewindAtEnd(value: MsoTriState): Self = StObject.set(x, "RewindAtEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothEnd(value: MsoTriState): Self = StObject.set(x, "SmoothEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSmoothStart(value: MsoTriState): Self = StObject.set(x, "SmoothStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "Speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerBookmark(value: String): Self = StObject.set(x, "TriggerBookmark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerDelayTime(value: Double): Self = StObject.set(x, "TriggerDelayTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerShape(value: Shape): Self = StObject.set(x, "TriggerShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTriggerType(value: MsoAnimTriggerType): Self = StObject.set(x, "TriggerType", value.asInstanceOf[js.Any])
  }
}
