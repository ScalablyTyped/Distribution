package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimEffectRestart
import typings.activexPowerpoint.PowerPoint.MsoAnimTriggerType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.Timing")
@js.native
class Timing protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.Timing {
  
  /* CompleteClass */
  var Accelerate: Double = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var AutoReverse: MsoTriState = js.native
  
  /* CompleteClass */
  var BounceEnd: MsoTriState = js.native
  
  /* CompleteClass */
  var BounceEndIntensity: Double = js.native
  
  /* CompleteClass */
  var Decelerate: Double = js.native
  
  /* CompleteClass */
  var Duration: Double = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.Timing_typekey")
  var PowerPointDotTiming_typekey: typings.activexPowerpoint.PowerPoint.Timing = js.native
  
  /* CompleteClass */
  var RepeatCount: Double = js.native
  
  /* CompleteClass */
  var RepeatDuration: Double = js.native
  
  /* CompleteClass */
  var Restart: MsoAnimEffectRestart = js.native
  
  /* CompleteClass */
  var RewindAtEnd: MsoTriState = js.native
  
  /* CompleteClass */
  var SmoothEnd: MsoTriState = js.native
  
  /* CompleteClass */
  var SmoothStart: MsoTriState = js.native
  
  /* CompleteClass */
  var Speed: Double = js.native
  
  /* CompleteClass */
  var TriggerBookmark: String = js.native
  
  /* CompleteClass */
  var TriggerDelayTime: Double = js.native
  
  /* CompleteClass */
  var TriggerShape: typings.activexPowerpoint.PowerPoint.Shape = js.native
  
  /* CompleteClass */
  var TriggerType: MsoAnimTriggerType = js.native
}
