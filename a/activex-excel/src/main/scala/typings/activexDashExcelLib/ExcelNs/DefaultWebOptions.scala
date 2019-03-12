package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: scala.Boolean = js.native
  var AlwaysSaveInDefaultEncoding: scala.Boolean = js.native
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  var CheckIfOfficeIsHTMLEditor: scala.Boolean = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: scala.Boolean = js.native
  var Encoding: activexDashOfficeLib.OfficeNs.MsoEncoding = js.native
  var `Excel.DefaultWebOptions_typekey`: DefaultWebOptions = js.native
  val FolderSuffix: java.lang.String = js.native
  @JSName("Fonts")
  val Fonts_Original: activexDashOfficeLib.OfficeNs.WebPageFonts = js.native
  var LoadPictures: scala.Boolean = js.native
  var LocationOfComponents: java.lang.String = js.native
  var OrganizeInFolder: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: scala.Double = js.native
  var RelyOnCSS: scala.Boolean = js.native
  var RelyOnVML: scala.Boolean = js.native
  var SaveHiddenData: scala.Boolean = js.native
  var SaveNewWebPagesAsWebArchives: scala.Boolean = js.native
  var ScreenSize: activexDashOfficeLib.OfficeNs.MsoScreenSize = js.native
  var TargetBrowser: activexDashOfficeLib.OfficeNs.MsoTargetBrowser = js.native
  var UpdateLinksOnSave: scala.Boolean = js.native
  var UseLongFileNames: scala.Boolean = js.native
  def Fonts(Index: activexDashOfficeLib.OfficeNs.MsoCharacterSet): activexDashOfficeLib.OfficeNs.WebPageFont = js.native
}

