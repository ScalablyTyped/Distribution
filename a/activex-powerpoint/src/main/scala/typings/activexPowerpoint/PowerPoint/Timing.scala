package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Timing extends js.Object {
  var Accelerate: Double = js.native
  val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  var AutoReverse: MsoTriState = js.native
  var BounceEnd: MsoTriState = js.native
  var BounceEndIntensity: Double = js.native
  var Decelerate: Double = js.native
  var Duration: Double = js.native
  val Parent: js.Any = js.native
  @JSName("PowerPoint.Timing_typekey")
  var PowerPointDotTiming_typekey: Timing = js.native
  var RepeatCount: Double = js.native
  var RepeatDuration: Double = js.native
  var Restart: MsoAnimEffectRestart = js.native
  var RewindAtEnd: MsoTriState = js.native
  var SmoothEnd: MsoTriState = js.native
  var SmoothStart: MsoTriState = js.native
  var Speed: Double = js.native
  var TriggerBookmark: String = js.native
  var TriggerDelayTime: Double = js.native
  var TriggerShape: Shape = js.native
  var TriggerType: MsoAnimTriggerType = js.native
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
  implicit class TimingOps[Self <: Timing] (val x: Self) extends AnyVal {
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
    def setAccelerate(value: Double): Self = this.set("Accelerate", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoReverse(value: MsoTriState): Self = this.set("AutoReverse", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceEnd(value: MsoTriState): Self = this.set("BounceEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setBounceEndIntensity(value: Double): Self = this.set("BounceEndIntensity", value.asInstanceOf[js.Any])
    @scala.inline
    def setDecelerate(value: Double): Self = this.set("Decelerate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("Duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotTiming_typekey(value: Timing): Self = this.set("PowerPoint.Timing_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatCount(value: Double): Self = this.set("RepeatCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatDuration(value: Double): Self = this.set("RepeatDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def setRestart(value: MsoAnimEffectRestart): Self = this.set("Restart", value.asInstanceOf[js.Any])
    @scala.inline
    def setRewindAtEnd(value: MsoTriState): Self = this.set("RewindAtEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmoothEnd(value: MsoTriState): Self = this.set("SmoothEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmoothStart(value: MsoTriState): Self = this.set("SmoothStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("Speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerBookmark(value: String): Self = this.set("TriggerBookmark", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerDelayTime(value: Double): Self = this.set("TriggerDelayTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerShape(value: Shape): Self = this.set("TriggerShape", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerType(value: MsoAnimTriggerType): Self = this.set("TriggerType", value.asInstanceOf[js.Any])
  }
  
}

