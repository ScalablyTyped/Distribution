package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoCharacterSet
import typings.activexDashOffice.Office.MsoEncoding
import typings.activexDashOffice.Office.MsoScreenSize
import typings.activexDashOffice.Office.MsoTargetBrowser
import typings.activexDashOffice.Office.MsoTriState
import typings.activexDashOffice.Office.WebPageFont
import typings.activexDashOffice.Office.WebPageFonts
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.DefaultWebOptions")
@js.native
class DefaultWebOptions protected () extends js.Object {
  var AllowPNG: MsoTriState = js.native
  var AlwaysSaveInDefaultEncoding: MsoTriState = js.native
  var CheckIfOfficeIsHTMLEditor: MsoTriState = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  @JSName("Fonts")
  val Fonts_Original: WebPageFonts = js.native
  var FrameColors: PpFrameColors = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  var IncludeNavigation: MsoTriState = js.native
  var OrganizeInFolder: MsoTriState = js.native
  var `PowerPoint.DefaultWebOptions_typekey`: DefaultWebOptions = js.native
  var RelyOnVML: MsoTriState = js.native
  var ResizeGraphics: MsoTriState = js.native
  var SaveNewWebPagesAsWebArchives: MsoTriState = js.native
  var ScreenSize: MsoScreenSize = js.native
  var ShowSlideAnimation: MsoTriState = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UpdateLinksOnSave: MsoTriState = js.native
  var UseLongFileNames: MsoTriState = js.native
  def Fonts(Index: MsoCharacterSet): WebPageFont = js.native
}

