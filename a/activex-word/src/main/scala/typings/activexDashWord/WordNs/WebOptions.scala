package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoEncoding
import typings.activexDashOffice.OfficeNs.MsoScreenSize
import typings.activexDashOffice.OfficeNs.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.WebOptions")
@js.native
class WebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var BrowserLevel: WdBrowserLevel = js.native
  val Creator: Double = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var OptimizeForBrowser: Boolean = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  var `Word.WebOptions_typekey`: WebOptions = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

