package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Tab")
@js.native
class Tab protected ()
  extends StObject
     with typings.activexExcel.Excel.Tab {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  @JSName("Excel.Tab_typekey")
  var ExcelDotTab_typekey: typings.activexExcel.Excel.Tab = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
}
