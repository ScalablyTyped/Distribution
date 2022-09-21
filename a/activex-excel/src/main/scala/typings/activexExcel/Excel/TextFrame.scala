package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoTextOrientation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextFrame extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  var AutoMargins: Boolean = js.native
  
  var AutoSize: Boolean = js.native
  
  def Characters(): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Double, Length: Double): typings.activexExcel.Excel.Characters = js.native
  def Characters(Start: Unit, Length: Double): typings.activexExcel.Excel.Characters = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.TextFrame_typekey")
  var ExcelDotTextFrame_typekey: TextFrame = js.native
  
  var HorizontalAlignment: XlHAlign = js.native
  
  var HorizontalOverflow: XlOartHorizontalOverflow = js.native
  
  var MarginBottom: Double = js.native
  
  var MarginLeft: Double = js.native
  
  var MarginRight: Double = js.native
  
  var MarginTop: Double = js.native
  
  var Orientation: MsoTextOrientation = js.native
  
  val Parent: Any = js.native
  
  var ReadingOrder: Double = js.native
  
  var VerticalAlignment: XlVAlign = js.native
  
  var VerticalOverflow: XlOartVerticalOverflow = js.native
}
