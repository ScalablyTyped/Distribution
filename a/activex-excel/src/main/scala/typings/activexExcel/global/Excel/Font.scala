package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlBackground
import typings.activexExcel.Excel.XlColorIndex
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlRgbColor
import typings.activexExcel.Excel.XlThemeColor
import typings.activexExcel.Excel.XlThemeFont
import typings.activexExcel.Excel.XlUnderlineStyle
import typings.activexExcel.activexExcelStrings.Bold
import typings.activexExcel.activexExcelStrings.Italic
import typings.activexExcel.activexExcelStrings.Regular
import typings.activexExcel.activexExcelStrings.`Bold Italic`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Font")
@js.native
class Font protected ()
  extends StObject
     with typings.activexExcel.Excel.Font {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Background: XlBackground = js.native
  
  /* CompleteClass */
  var Bold: Boolean = js.native
  
  /* CompleteClass */
  var Color: XlRgbColor | Double = js.native
  
  /* CompleteClass */
  var ColorIndex: Double | XlColorIndex = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  @JSName("Excel.Font_typekey")
  var ExcelDotFont_typekey: typings.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  var FontStyle: Regular | Italic | Bold | (`Bold Italic`) = js.native
  
  /* CompleteClass */
  var Italic: Boolean = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var OutlineFont: js.Any = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var Shadow: js.Any = js.native
  
  /* CompleteClass */
  var Size: Double = js.native
  
  /* CompleteClass */
  var Strikethrough: Boolean = js.native
  
  /* CompleteClass */
  var Subscript: Boolean = js.native
  
  /* CompleteClass */
  var Superscript: Boolean = js.native
  
  /* CompleteClass */
  var ThemeColor: XlThemeColor = js.native
  
  /* CompleteClass */
  var ThemeFont: XlThemeFont = js.native
  
  /* CompleteClass */
  var TintAndShade: Double = js.native
  
  /* CompleteClass */
  var Underline: XlUnderlineStyle = js.native
}
