package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookConnection extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  def Delete(): Unit = js.native
  
  var Description: String = js.native
  
  @JSName("Excel.WorkbookConnection_typekey")
  var ExcelDotWorkbookConnection_typekey: WorkbookConnection = js.native
  
  var Name: String = js.native
  
  val ODBCConnection: typings.activexExcel.Excel.ODBCConnection = js.native
  
  val OLEDBConnection: typings.activexExcel.Excel.OLEDBConnection = js.native
  
  val Parent: js.Any = js.native
  
  def Ranges(Index: js.Any): Range = js.native
  @JSName("Ranges")
  val Ranges_Original: Ranges = js.native
  
  def Refresh(): Unit = js.native
  
  val Type: XlConnectionType = js.native
  
  var _Default: String = js.native
}
