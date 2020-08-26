package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  var AllowPNG: MsoTriState = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var FrameColors: PpFrameColors = js.native
  var HTMLVersion: PpHTMLVersion = js.native
  var IncludeNavigation: MsoTriState = js.native
  var OrganizeInFolder: MsoTriState = js.native
  @JSName("PowerPoint.WebOptions_typekey")
  var PowerPointDotWebOptions_typekey: WebOptions = js.native
  var RelyOnVML: MsoTriState = js.native
  var ResizeGraphics: MsoTriState = js.native
  var ScreenSize: MsoScreenSize = js.native
  var ShowSlideAnimation: MsoTriState = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: MsoTriState = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
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
  @scala.inline
  implicit class WebOptionsOps[Self <: WebOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowPNG(value: MsoTriState): Self = this.set("AllowPNG", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderSuffix(value: String): Self = this.set("FolderSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameColors(value: PpFrameColors): Self = this.set("FrameColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setHTMLVersion(value: PpHTMLVersion): Self = this.set("HTMLVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeNavigation(value: MsoTriState): Self = this.set("IncludeNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizeInFolder(value: MsoTriState): Self = this.set("OrganizeInFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setPowerPointDotWebOptions_typekey(value: WebOptions): Self = this.set("PowerPoint.WebOptions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelyOnVML(value: MsoTriState): Self = this.set("RelyOnVML", value.asInstanceOf[js.Any])
    @scala.inline
    def setResizeGraphics(value: MsoTriState): Self = this.set("ResizeGraphics", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenSize(value: MsoScreenSize): Self = this.set("ScreenSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowSlideAnimation(value: MsoTriState): Self = this.set("ShowSlideAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = this.set("TargetBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDefaultFolderSuffix(value: () => Unit): Self = this.set("UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    @scala.inline
    def setUseLongFileNames(value: MsoTriState): Self = this.set("UseLongFileNames", value.asInstanceOf[js.Any])
  }
  
}

