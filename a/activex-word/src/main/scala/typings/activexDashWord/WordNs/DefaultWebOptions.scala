package typings.activexDashWord.WordNs

import typings.activexDashOffice.OfficeNs.MsoCharacterSet
import typings.activexDashOffice.OfficeNs.MsoEncoding
import typings.activexDashOffice.OfficeNs.MsoScreenSize
import typings.activexDashOffice.OfficeNs.MsoTargetBrowser
import typings.activexDashOffice.OfficeNs.WebPageFont
import typings.activexDashOffice.OfficeNs.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: Boolean = js.native
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var BrowserLevel: WdBrowserLevel = js.native
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  var CheckIfWordIsDefaultHTMLEditor: Boolean = js.native
  val Creator: Double = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var OptimizeForBrowser: Boolean = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var PixelsPerInch: Double = js.native
  var RelyOnCSS: Boolean = js.native
  var RelyOnVML: Boolean = js.native
  var SaveNewWebPagesAsWebArchives: Boolean = js.native
  var ScreenSize: MsoScreenSize = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: Boolean = js.native
  var UseLongFileNames: Boolean = js.native
  var `Word.DefaultWebOptions_typekey`: DefaultWebOptions = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

