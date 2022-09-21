package typings.activexExcel.global.Excel

import typings.activexOffice.Office.MsoArrowheadLength
import typings.activexOffice.Office.MsoArrowheadStyle
import typings.activexOffice.Office.MsoArrowheadWidth
import typings.activexOffice.Office.MsoLineDashStyle
import typings.activexOffice.Office.MsoLineStyle
import typings.activexOffice.Office.MsoPatternType
import typings.activexOffice.Office.MsoTriState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.LineFormat")
@js.native
/* private */ open class LineFormat ()
  extends StObject
     with typings.activexExcel.Excel.LineFormat {
  
  /* CompleteClass */
  override val Application: Any = js.native
  
  /* CompleteClass */
  var BackColor: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  var BeginArrowheadLength: MsoArrowheadLength = js.native
  
  /* CompleteClass */
  var BeginArrowheadStyle: MsoArrowheadStyle = js.native
  
  /* CompleteClass */
  var BeginArrowheadWidth: MsoArrowheadWidth = js.native
  
  /* CompleteClass */
  override val Creator: Double = js.native
  
  /* CompleteClass */
  var DashStyle: MsoLineDashStyle = js.native
  
  /* CompleteClass */
  var EndArrowheadLength: MsoArrowheadLength = js.native
  
  /* CompleteClass */
  var EndArrowheadStyle: MsoArrowheadStyle = js.native
  
  /* CompleteClass */
  var EndArrowheadWidth: MsoArrowheadWidth = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.LineFormat_typekey")
  var ExcelDotLineFormat_typekey: typings.activexExcel.Excel.LineFormat = js.native
  
  /* CompleteClass */
  var ForeColor: typings.activexExcel.Excel.ColorFormat = js.native
  
  /* CompleteClass */
  var InsetPen: MsoTriState = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var Pattern: MsoPatternType = js.native
  
  /* CompleteClass */
  var Style: MsoLineStyle = js.native
  
  /* CompleteClass */
  var Transparency: Double = js.native
  
  /* CompleteClass */
  var Visible: MsoTriState = js.native
  
  /* CompleteClass */
  var Weight: Double = js.native
}
