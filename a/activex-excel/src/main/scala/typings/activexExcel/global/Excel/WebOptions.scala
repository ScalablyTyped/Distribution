package typings.activexExcel.global.Excel

import typings.activexExcel.Excel.XlCreator
import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WebOptions")
@js.native
class WebOptions protected ()
  extends typings.activexExcel.Excel.WebOptions {
  /* CompleteClass */
  override var AllowPNG: Boolean = js.native
  /* CompleteClass */
  override val Application: typings.activexExcel.Excel.Application = js.native
  /* CompleteClass */
  override val Creator: XlCreator = js.native
  /* CompleteClass */
  override var DownloadComponents: Boolean = js.native
  /* CompleteClass */
  override var Encoding: MsoEncoding = js.native
  /* CompleteClass */
  @JSName("Excel.WebOptions_typekey")
  override var ExcelDotWebOptions_typekey: typings.activexExcel.Excel.WebOptions = js.native
  /* CompleteClass */
  override val FolderSuffix: String = js.native
  /* CompleteClass */
  override var LocationOfComponents: String = js.native
  /* CompleteClass */
  override var OrganizeInFolder: Boolean = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override var PixelsPerInch: Double = js.native
  /* CompleteClass */
  override var RelyOnCSS: Boolean = js.native
  /* CompleteClass */
  override var RelyOnVML: Boolean = js.native
  /* CompleteClass */
  override var ScreenSize: MsoScreenSize = js.native
  /* CompleteClass */
  override var TargetBrowser: MsoTargetBrowser = js.native
  /* CompleteClass */
  override var UseLongFileNames: Boolean = js.native
  /* CompleteClass */
  override def UseDefaultFolderSuffix(): Unit = js.native
}

