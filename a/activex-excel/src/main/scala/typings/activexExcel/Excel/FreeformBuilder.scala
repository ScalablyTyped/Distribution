package typings.activexExcel.Excel

import typings.activexExcel.activexExcelNumbers.`0`
import typings.activexExcel.activexExcelNumbers.`1`
import typings.activexOffice.Office.MsoSegmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FreeformBuilder extends StObject {
  
  @JSName("AddNodes")
  def AddNodes_0(SegmentType: MsoSegmentType, EditingType: `0`, X1: Double, Y1: Double): Unit = js.native
  @JSName("AddNodes")
  def AddNodes_1(
    SegmentType: `1`,
    EditingType: `1`,
    X1: Double,
    Y1: Double,
    X2: Double,
    Y2: Double,
    X3: Double,
    Y3: Double
  ): Unit = js.native
  
  val Application: typings.activexExcel.Excel.Application = js.native
  
  def ConvertToShape(): Shape = js.native
  
  val Creator: XlCreator = js.native
  
  /* private */ @JSName("Excel.FreeformBuilder_typekey")
  var ExcelDotFreeformBuilder_typekey: FreeformBuilder = js.native
  
  val Parent: js.Any = js.native
}
