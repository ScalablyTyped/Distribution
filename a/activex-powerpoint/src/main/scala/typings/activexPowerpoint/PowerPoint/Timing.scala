package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timing extends js.Object {
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
}

