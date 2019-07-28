package typings.activexDashPowerpoint.PowerPointNs

import typings.activexDashOffice.OfficeNs.MsoEncoding
import typings.activexDashOffice.OfficeNs.MsoScreenSize
import typings.activexDashOffice.OfficeNs.MsoTargetBrowser
import typings.activexDashOffice.OfficeNs.MsoTriState
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

