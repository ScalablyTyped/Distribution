package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpEntryEffect
import typings.activexPowerpoint.PowerPoint.PpTransitionSpeed
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SlideShowTransition")
@js.native
class SlideShowTransition protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.SlideShowTransition {
  
  /* CompleteClass */
  var AdvanceOnClick: MsoTriState = js.native
  
  /* CompleteClass */
  var AdvanceOnTime: MsoTriState = js.native
  
  /* CompleteClass */
  var AdvanceTime: Double = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var Duration: Double = js.native
  
  /* CompleteClass */
  var EntryEffect: PpEntryEffect = js.native
  
  /* CompleteClass */
  var Hidden: MsoTriState = js.native
  
  /* CompleteClass */
  var LoopSoundUntilNext: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.SlideShowTransition_typekey")
  var PowerPointDotSlideShowTransition_typekey: typings.activexPowerpoint.PowerPoint.SlideShowTransition = js.native
  
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var Speed: PpTransitionSpeed = js.native
}
