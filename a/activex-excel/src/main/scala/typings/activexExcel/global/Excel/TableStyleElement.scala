package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Borders
import typings.activexExcel.Excel.XlBordersIndex
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.TableStyleElement")
@js.native
class TableStyleElement protected ()
  extends StObject
     with typings.activexExcel.Excel.TableStyleElement {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def Borders(Index: XlBordersIndex): typings.activexExcel.Excel.Border = js.native
  /* CompleteClass */
  @JSName("Borders")
  override val Borders_Original: Borders = js.native
  
  /* CompleteClass */
  override def Clear(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  @JSName("Excel.TableStyleElement_typekey")
  var ExcelDotTableStyleElement_typekey: typings.activexExcel.Excel.TableStyleElement = js.native
  
  /* CompleteClass */
  override val Font: typings.activexExcel.Excel.Font = js.native
  
  /* CompleteClass */
  override val HasFormat: Boolean = js.native
  
  /* CompleteClass */
  override val Interior: typings.activexExcel.Excel.Interior = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var StripeSize: Double = js.native
}
