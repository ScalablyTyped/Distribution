package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Excel.WebOptions")
@js.native
/* private */ open class WebOptions ()
  extends StObject
     with typings.activexExcel.Excel.WebOptions {
  
  /* CompleteClass */
  var AllowPNG: Boolean = js.native
  
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  
  /* CompleteClass */
  var DownloadComponents: Boolean = js.native
  
  /* CompleteClass */
  var Encoding: MsoEncoding = js.native
  
  /* private */ /* CompleteClass */
  @JSName("Excel.WebOptions_typekey")
  var ExcelDotWebOptions_typekey: typings.activexExcel.Excel.WebOptions = js.native
  
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  
  /* CompleteClass */
  var LocationOfComponents: String = js.native
  
  /* CompleteClass */
  var OrganizeInFolder: Boolean = js.native
  
  /* CompleteClass */
  override val Parent: Any = js.native
  
  /* CompleteClass */
  var PixelsPerInch: Double = js.native
  
  /* CompleteClass */
  var RelyOnCSS: Boolean = js.native
  
  /* CompleteClass */
  var RelyOnVML: Boolean = js.native
  
  /* CompleteClass */
  var ScreenSize: MsoScreenSize = js.native
  
  /* CompleteClass */
  var TargetBrowser: MsoTargetBrowser = js.native
  
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
  
  /* CompleteClass */
  var UseLongFileNames: Boolean = js.native
}
