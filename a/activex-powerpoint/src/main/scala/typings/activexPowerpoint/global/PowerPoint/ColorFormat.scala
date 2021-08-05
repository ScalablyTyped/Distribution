package typings.activexPowerpoint.global.PowerPoint

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import typings.activexPowerpoint.PowerPoint.PpColorSchemeIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("PowerPoint.ColorFormat")
@js.native
/* private */ class ColorFormat ()
  extends StObject
     with typings.activexPowerpoint.PowerPoint.ColorFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* private */ /* CompleteClass */
  @JSName("PowerPoint.ColorFormat_typekey")
  var PowerPointDotColorFormat_typekey: typings.activexPowerpoint.PowerPoint.ColorFormat = js.native
  
  /* CompleteClass */
  var RGB: MsoRGBType = js.native
  
  /* CompleteClass */
  var SchemeColor: PpColorSchemeIndex = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}
