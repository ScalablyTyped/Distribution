package typings.activexExcel.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PivotAxis extends StObject {
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  val Creator: XlCreator = js.native
  
  @JSName("Excel.PivotAxis_typekey")
  var ExcelDotPivotAxis_typekey: PivotAxis = js.native
  
  val Parent: js.Any = js.native
  
  def PivotLines(Index: Double): PivotLine = js.native
  @JSName("PivotLines")
  val PivotLines_Original: PivotLines = js.native
}
