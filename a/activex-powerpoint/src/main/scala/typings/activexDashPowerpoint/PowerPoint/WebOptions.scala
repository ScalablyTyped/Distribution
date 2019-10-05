package typings.activexDashPowerpoint.PowerPoint

import typings.activexDashOffice.Office.MsoEncoding
import typings.activexDashOffice.Office.MsoScreenSize
import typings.activexDashOffice.Office.MsoTargetBrowser
import typings.activexDashOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("PowerPoint.WebOptions")
@js.native
class WebOptions protected () extends js.Object {
  var AllowPNG: MsoTriState = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var FrameColors: PpFrameColors = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  var IncludeNavigation: MsoTriState = js.native
  var OrganizeInFolder: MsoTriState = js.native
  var `PowerPoint.WebOptions_typekey`: WebOptions = js.native
  var RelyOnVML: MsoTriState = js.native
  var ResizeGraphics: MsoTriState = js.native
  var ScreenSize: MsoScreenSize = js.native
  var ShowSlideAnimation: MsoTriState = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: MsoTriState = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

