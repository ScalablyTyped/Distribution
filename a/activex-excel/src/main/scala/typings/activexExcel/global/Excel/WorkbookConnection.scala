package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.Ranges
import typings.activexExcel.Excel.XlConnectionType
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.WorkbookConnection")
@js.native
class WorkbookConnection protected ()
  extends StObject
     with typings.activexExcel.Excel.WorkbookConnection {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  var Description: String = js.native
  
  /* CompleteClass */
  @JSName("Excel.WorkbookConnection_typekey")
  var ExcelDotWorkbookConnection_typekey: typings.activexExcel.Excel.WorkbookConnection = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  override val ODBCConnection: typings.activexExcel.Excel.ODBCConnection = js.native
  
  /* CompleteClass */
  override val OLEDBConnection: typings.activexExcel.Excel.OLEDBConnection = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Ranges(Index: js.Any): Range = js.native
  /* CompleteClass */
  @JSName("Ranges")
  override val Ranges_Original: Ranges = js.native
  
  /* CompleteClass */
  override def Refresh(): Unit = js.native
  
  /* CompleteClass */
  override val Type: XlConnectionType = js.native
  
  /* CompleteClass */
  var _Default: String = js.native
}
