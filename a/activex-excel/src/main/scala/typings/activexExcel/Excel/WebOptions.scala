package typings.activexExcel.Excel

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoScreenSize
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebOptions extends js.Object {
  var AllowPNG: Boolean
  val Application: typings.activexExcel.Excel.Application
  val Creator: XlCreator
  var DownloadComponents: Boolean
  var Encoding: MsoEncoding
  @JSName("Excel.WebOptions_typekey")
  var ExcelDotWebOptions_typekey: WebOptions
  val FolderSuffix: String
  var LocationOfComponents: String
  var OrganizeInFolder: Boolean
  val Parent: js.Any
  var PixelsPerInch: Double
  var RelyOnCSS: Boolean
  var RelyOnVML: Boolean
  var ScreenSize: MsoScreenSize
  var TargetBrowser: MsoTargetBrowser
  var UseLongFileNames: Boolean
  def UseDefaultFolderSuffix(): Unit
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
}

