package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexExcel.Excel.XlXmlImportResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.XmlDataBinding")
@js.native
/* private */ open class XmlDataBinding ()
  extends StObject
     with typings.activexExcel.Excel.XmlDataBinding {
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override def ClearSettings(): Unit = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.XmlDataBinding_typekey")
  var ExcelDotXmlDataBinding_typekey: typings.activexExcel.Excel.XmlDataBinding = js.native
  
  /* CompleteClass */
  override def LoadSettings(Url: String): Unit = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  override def Refresh(): XlXmlImportResult = js.native
  
  /* CompleteClass */
  override val SourceUrl: String = js.native
  
  /* CompleteClass */
  override val _Default: String = js.native
}
