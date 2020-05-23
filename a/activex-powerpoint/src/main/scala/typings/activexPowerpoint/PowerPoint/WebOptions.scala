package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebOptions extends js.Object {
  var AllowPNG: MsoTriState
  var Encoding: MsoEncoding
  val FolderSuffix: String
  var FrameColors: PpFrameColors
  var HTMLVersion: PpHTMLVersion
  var IncludeNavigation: MsoTriState
  var OrganizeInFolder: MsoTriState
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: WebOptions
  var RelyOnVML: MsoTriState
  var ResizeGraphics: MsoTriState
  var ScreenSize: MsoScreenSize
  var ShowSlideAnimation: MsoTriState
  var TargetBrowser: MsoTargetBrowser
  var UseLongFileNames: MsoTriState
  def UseDefaultFolderSuffix(): Unit
}

object WebOptions {
  @scala.inline
  def apply(
    AllowPNG: MsoTriState,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FrameColors: PpFrameColors,
    HTMLVersion: PpHTMLVersion,
    IncludeNavigation: MsoTriState,
    OrganizeInFolder: MsoTriState,
    PowerPointDotWebOptions_typekey: WebOptions,
    RelyOnVML: MsoTriState,
    ResizeGraphics: MsoTriState,
    ScreenSize: MsoScreenSize,
    ShowSlideAnimation: MsoTriState,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: MsoTriState
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FrameColors = FrameColors.asInstanceOf[js.Any], HTMLVersion = HTMLVersion.asInstanceOf[js.Any], IncludeNavigation = IncludeNavigation.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ResizeGraphics = ResizeGraphics.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], ShowSlideAnimation = ShowSlideAnimation.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.WebOptions_typekey")(PowerPointDotWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebOptions]
  }
}

