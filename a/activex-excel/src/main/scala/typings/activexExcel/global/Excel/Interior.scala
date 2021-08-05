package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlPattern
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Interior")
@js.native
/* private */ class Interior ()
  extends StObject
     with typings.activexExcel.Excel.Interior {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Interior_typekey")
  var ExcelDotInterior_typekey: typings.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override val Gradient: js.Any = js.native
  
  /* CompleteClass */
  var InvertIfNegative: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Pattern: XlPattern = js.native
  
  /* CompleteClass */
  var PatternColor: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var PatternColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  var PatternThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var PatternTintAndShade: Double = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
}
