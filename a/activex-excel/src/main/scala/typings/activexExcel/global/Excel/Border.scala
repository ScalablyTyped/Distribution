package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlBorderWeight
import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Border")
@js.native
/* private */ open class Border ()
  extends StObject
     with typings.activexExcel.Excel.Border {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.Border_typekey")
  var ExcelDotBorder_typekey: typings.activexExcel.Excel.Border = js.native
  
  /* CompleteClass */
  var LineStyle: typings.activexExcel.Excel.LineStyle = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  var Weight: XlBorderWeight = js.native
}
