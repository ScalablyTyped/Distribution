package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.CustomProperties
import typings.activexExcel.Excel.Range
import typings.activexExcel.Excel.SmartTagActions
import typings.activexExcel.Excel.XlCreator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.SmartTag")
@js.native
/* private */ class SmartTag ()
  extends StObject
     with typings.activexExcel.Excel.SmartTag {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  override def Delete(): Unit = js.native
  
  /* CompleteClass */
  override val DownloadURL: String = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.SmartTag_typekey")
  var ExcelDotSmartTag_typekey: typings.activexExcel.Excel.SmartTag = js.native
  
  /* CompleteClass */
  override val Name: String = js.native
  
  /* CompleteClass */
  override val Parent: js.Any = js.native
  
  /* CompleteClass */
  override def Properties(Index: String): typings.activexExcel.Excel.CustomProperty = js.native
  /* CompleteClass */
  override def Properties(Index: Double): typings.activexExcel.Excel.CustomProperty = js.native
  /* CompleteClass */
  @JSName("Properties")
  override val Properties_Original: CustomProperties = js.native
  
  /* CompleteClass */
  override def Range(Address: String): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  override def Range(RowIndex: Double, ColumnIndex: Double): typings.activexExcel.Excel.Range = js.native
  /* CompleteClass */
  @JSName("Range")
  override val Range_Original: Range = js.native
  
  /* CompleteClass */
  override def SmartTagActions(Index: js.Any): typings.activexExcel.Excel.SmartTagAction = js.native
  /* CompleteClass */
  @JSName("SmartTagActions")
  override val SmartTagActions_Original: SmartTagActions = js.native
  
  /* CompleteClass */
  override val XML: String = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
