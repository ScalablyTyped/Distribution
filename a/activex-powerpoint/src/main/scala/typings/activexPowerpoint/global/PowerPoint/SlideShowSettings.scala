package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpSlideShowAdvanceMode
import typings.activexPowerpoint.PowerPoint.PpSlideShowRangeType
import typings.activexPowerpoint.PowerPoint.PpSlideShowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.SlideShowSettings")
@js.native
/* private */ class SlideShowSettings ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.SlideShowSettings {
  
  /* CompleteClass */
  var AdvanceMode: PpSlideShowAdvanceMode = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var EndingSlide: Double = js.native
  
  /* CompleteClass */
  var LoopUntilStopped: MsoTriState = js.native
  
  /* CompleteClass */
  override val NamedSlideShows: typings.activexPowerpoint.PowerPoint.NamedSlideShows = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PointerColor: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.SlideShowSettings_typekey")
  var PowerPointDotSlideShowSettings_typekey: typings.activexPowerpoint.PowerPoint.SlideShowSettings = js.native
  
  /* CompleteClass */
  var RangeType: PpSlideShowRangeType = js.native
  
  /* CompleteClass */
  override def Run(): typings.activexPowerpoint.PowerPoint.SlideShowWindow = js.native
  
  /* CompleteClass */
  var ShowMediaControls: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowPresenterView: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowScrollbar: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowType: PpSlideShowType = js.native
  
  /* CompleteClass */
  var ShowWithAnimation: MsoTriState = js.native
  
  /* CompleteClass */
  var ShowWithNarration: MsoTriState = js.native
  
  /* CompleteClass */
  var SlideShowName: String = js.native
  
  /* CompleteClass */
  var StartingSlide: Double = js.native
}
