package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoColorType
import typings.activexOffice.Office.MsoRGBType
import typings.activexOffice.Office.MsoThemeColorIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.ColorFormat")
@js.native
class ColorFormat protected ()
  extends StObject
     with typings.activexExcel.Excel.ColorFormat {
  
  /* CompleteClass */
  override val Application: js.Any = js.native
  
  /* CompleteClass */
  var Brightness: Double = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  @JSName("Excel.ColorFormat_typekey")
  var ExcelDotColorFormat_typekey: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  var ObjectThemeColor: MsoThemeColorIndex = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RGB: MsoRGBType = js.native
  
  /* CompleteClass */
  var SchemeColor: Double = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  override val Type: MsoColorType = js.native
}
