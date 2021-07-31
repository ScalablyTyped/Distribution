package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlXLMMacroType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.Name")
@js.native
class Name protected ()
  extends StObject
     with typings.activexExcel.Excel.Name {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  var Category: String = js.native
  
  /* CompleteClass */
  var CategoryLocal: String = js.native
  
  /* CompleteClass */
  var Comment: String = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  @JSName("Excel.Name_typekey")
  var ExcelDotName_typekey: typings.activexExcel.Excel.Name = js.native
  
  /* CompleteClass */
  override val Index: Double = js.native
  
  /* CompleteClass */
  var MacroType: XlXLMMacroType = js.native
  
  /* CompleteClass */
  var Name: String = js.native
  
  /* CompleteClass */
  var NameLocal: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  var RefersTo: String = js.native
  
  /* CompleteClass */
  var RefersToLocal: String = js.native
  
  /* CompleteClass */
  var RefersToR1C1: String = js.native
  
  /* CompleteClass */
  var RefersToR1C1Local: String = js.native
  
  /* CompleteClass */
  override def RefersToRange(Address: String): Range = js.native
  /* CompleteClass */
  override def RefersToRange(RowIndex: Double): Range = js.native
  /* CompleteClass */
  override def RefersToRange(RowIndex: Double, ColumnIndex: Double): Range = js.native
  /* CompleteClass */
  @JSName("RefersToRange")
  override val RefersToRange_Original: Range = js.native
  
  /* CompleteClass */
  var ShortcutKey: String = js.native
  
  /* CompleteClass */
  override val ValidWorkbookParameter: Boolean = js.native
  
  /* CompleteClass */
  var Value: String = js.native
  
  /* CompleteClass */
  var Visible: Boolean = js.native
  
  /* CompleteClass */
  var WorkbookParameter: Boolean = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
