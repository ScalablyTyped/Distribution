package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoTriState
import typings.activexPowerpoint.PowerPoint.MsoAnimFilterEffectSubtype
import typings.activexPowerpoint.PowerPoint.MsoAnimFilterEffectType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.FilterEffect")
@js.native
/* private */ class FilterEffect ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.FilterEffect {
  
  /* CompleteClass */
  override val Application: typings.activexPowerpoint.PowerPoint.Application = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.FilterEffect_typekey")
  var PowerPointDotFilterEffect_typekey: typings.activexPowerpoint.PowerPoint.FilterEffect = js.native
  
  /* CompleteClass */
  var Reveal: MsoTriState = js.native
  
  /* CompleteClass */
  var Subtype: MsoAnimFilterEffectSubtype = js.native
  
  /* CompleteClass */
  var Type: MsoAnimFilterEffectType = js.native
}
