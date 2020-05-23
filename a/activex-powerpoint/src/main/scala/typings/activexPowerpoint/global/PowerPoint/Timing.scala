package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimEffectRestart
import typings.activexPowerpoint.PowerPoint.MsoAnimTriggerType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.Timing")
@js.native
class Timing protected ()
  extends typings.activexPowerpoint.PowerPoint.Timing {
  /* CompleteClass */
  override var Accelerate: Double = js.native
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  /* CompleteClass */
  override var AutoReverse: MsoTriState = js.native
  /* CompleteClass */
  override var BounceEnd: MsoTriState = js.native
  /* CompleteClass */
  override var BounceEndIntensity: Double = js.native
  /* CompleteClass */
  override var Decelerate: Double = js.native
  /* CompleteClass */
  override var Duration: Double = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  @JSName("PowerPoint.Timing_typekey")
  override var PowerPointDotTiming_typekey: typings.activexPowerpoint.PowerPoint.Timing = js.native
  /* CompleteClass */
  override var RepeatCount: Double = js.native
  /* CompleteClass */
  override var RepeatDuration: Double = js.native
  /* CompleteClass */
  override var Restart: MsoAnimEffectRestart = js.native
  /* CompleteClass */
  override var RewindAtEnd: MsoTriState = js.native
  /* CompleteClass */
  override var SmoothEnd: MsoTriState = js.native
  /* CompleteClass */
  override var SmoothStart: MsoTriState = js.native
  /* CompleteClass */
  override var Speed: Double = js.native
  /* CompleteClass */
  override var TriggerBookmark: String = js.native
  /* CompleteClass */
  override var TriggerDelayTime: Double = js.native
  /* CompleteClass */
  override var TriggerShape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  /* CompleteClass */
  override var TriggerType: MsoAnimTriggerType = js.native
}

