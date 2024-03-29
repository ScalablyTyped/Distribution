package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.PlaySettings")
@js.native
/* private */ open class PlaySettings ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.PlaySettings {
  
  /* CompleteClass */
  var ActionVerb: String = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var HideWhileNotPlaying: MsoTriState = js.native
  
  /* CompleteClass */
  var LoopUntilStopped: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PauseAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var PlayOnEntry: MsoTriState = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.PlaySettings_typekey")
  var PowerPointDotPlaySettings_typekey: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  /* CompleteClass */
  var RewindMovie: MsoTriState = js.native
  
  /* CompleteClass */
  var StopAfterSlides: Double = js.native
}
