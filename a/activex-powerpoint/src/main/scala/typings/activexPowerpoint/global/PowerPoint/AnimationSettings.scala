package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.PpAdvanceMode
import typings.activexPowerpoint.PowerPoint.PpAfterEffect
import typings.activexPowerpoint.PowerPoint.PpChartUnitEffect
import typings.activexPowerpoint.PowerPoint.PpEntryEffect
import typings.activexPowerpoint.PowerPoint.PpTextLevelEffect
import typings.activexPowerpoint.PowerPoint.PpTextUnitEffect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.AnimationSettings")
@js.native
/* private */ open class AnimationSettings ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.AnimationSettings {
  
  /* CompleteClass */
  var AdvanceMode: PpAdvanceMode = js.native
  
  /* CompleteClass */
  var AdvanceTime: Double = js.native
  
  /* CompleteClass */
  var AfterEffect: PpAfterEffect = js.native
  
  /* CompleteClass */
  var Animate: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimateBackground: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimateTextInReverse: MsoTriState = js.native
  
  /* CompleteClass */
  var AnimationOrder: Double = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  var ChartUnitEffect: PpChartUnitEffect = js.native
  
  /* CompleteClass */
  override val DimColor: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  var EntryEffect: PpEntryEffect = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.AnimationSettings_typekey")
  var PowerPointDotAnimationSettings_typekey: typings.activexPowerpoint.PowerPoint.AnimationSettings = js.native
  
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  var TextLevelEffect: PpTextLevelEffect = js.native
  
  /* CompleteClass */
  var TextUnitEffect: PpTextUnitEffect = js.native
}
