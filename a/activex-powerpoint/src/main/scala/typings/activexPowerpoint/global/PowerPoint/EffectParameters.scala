package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.EffectParameters")
@js.native
class EffectParameters protected ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.EffectParameters {
  
  /* CompleteClass */
  var Amount: Double = js.native
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Color2: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  var Direction: MsoAnimDirection = js.native
  
  /* CompleteClass */
  var FontName: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  @JSName("PowerPoint.EffectParameters_typekey")
  var PowerPointDotEffectParameters_typekey: typings.activexPowerpoint.PowerPoint.EffectParameters = js.native
  
  /* CompleteClass */
  var Relative: MsoTriState = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
}
