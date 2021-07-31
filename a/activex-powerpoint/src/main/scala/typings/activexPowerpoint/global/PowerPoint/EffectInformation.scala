package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimAfterEffect
import typings.activexPowerpoint.PowerPoint.MsoAnimTextUnitEffect
import typings.activexPowerpoint.PowerPoint.MsoAnimateByLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.EffectInformation")
@js.native
class EffectInformation protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.EffectInformation {
  
  /* CompleteClass */
  override val AfterEffect: MsoAnimAfterEffect = js.native
  
  /* CompleteClass */
  override val AnimateBackground: MsoTriState = js.native
  
  /* CompleteClass */
  override val AnimateTextInReverse: MsoTriState = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val BuildByLevelEffect: MsoAnimateByLevel = js.native
  
  /* CompleteClass */
  override val Dim: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override val PlaySettings: typings.activexPowerpoint.PowerPoint.PlaySettings = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.EffectInformation_typekey")
  var PowerPointDotEffectInformation_typekey: typings.activexPowerpoint.PowerPoint.EffectInformation = js.native
  
  /* CompleteClass */
  override val SoundEffect: typings.activexPowerpoint.PowerPoint.SoundEffect = js.native
  
  /* CompleteClass */
  override val TextUnitEffect: MsoAnimTextUnitEffect = js.native
}
