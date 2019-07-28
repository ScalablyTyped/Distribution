package typings.activexDashExcel.ExcelNs

import typings.activexDashOffice.OfficeNs.MsoEncoding
import typings.activexDashOffice.OfficeNs.MsoScreenSize
import typings.activexDashOffice.OfficeNs.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.WebOptions")
@js.native
class WebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  var `Excel.WebOptions_typekey`: WebOptions = js.native
  val FolderSuffix: String = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

