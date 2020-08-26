package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  var AllowPNG: Boolean = js.native
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  @JSName("Excel.WebOptions_typekey")
  var ExcelDotWebOptions_typekey: WebOptions = js.native
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

object WebOptions {
  @scala.inline
  def apply(
    AllowPNG: Boolean,
    Application: Application,
    Creator: XlCreator,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    ExcelDotWebOptions_typekey: WebOptions,
    FolderSuffix: String,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    PixelsPerInch: Double,
    RelyOnCSS: Boolean,
    RelyOnVML: Boolean,
    ScreenSize: MsoScreenSize,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean
  ): WebOptions = {
    val __obj = js.Dynamic.literal(AllowPNG = AllowPNG.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PixelsPerInch = PixelsPerInch.asInstanceOf[js.Any], RelyOnCSS = RelyOnCSS.asInstanceOf[js.Any], RelyOnVML = RelyOnVML.asInstanceOf[js.Any], ScreenSize = ScreenSize.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Excel.WebOptions_typekey")(ExcelDotWebOptions_typekey.asInstanceOf[js.Any])
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
    def setAllowPNG(value: Boolean): Self = this.set("AllowPNG", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: XlCreator): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadComponents(value: Boolean): Self = this.set("DownloadComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setExcelDotWebOptions_typekey(value: WebOptions): Self = this.set("Excel.WebOptions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderSuffix(value: String): Self = this.set("FolderSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocationOfComponents(value: String): Self = this.set("LocationOfComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizeInFolder(value: Boolean): Self = this.set("OrganizeInFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPixelsPerInch(value: Double): Self = this.set("PixelsPerInch", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelyOnCSS(value: Boolean): Self = this.set("RelyOnCSS", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelyOnVML(value: Boolean): Self = this.set("RelyOnVML", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenSize(value: MsoScreenSize): Self = this.set("ScreenSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = this.set("TargetBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDefaultFolderSuffix(value: () => Unit): Self = this.set("UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = this.set("UseLongFileNames", value.asInstanceOf[js.Any])
  }
  
}

