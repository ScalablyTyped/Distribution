package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebOptions extends js.Object {
  @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: WebOptions = js.native
  val Application: typings.activexAccess.Access.Application = js.native
  var DownloadComponents: Boolean = js.native
  var Encoding: MsoEncoding = js.native
  val FolderSuffix: String = js.native
  var LocationOfComponents: String = js.native
  var OrganizeInFolder: Boolean = js.native
  val Parent: js.Any = js.native
  var TargetBrowser: MsoTargetBrowser = js.native
  var UseLongFileNames: Boolean = js.native
  def IsMemberSafe(dispid: Double): Boolean = js.native
  def UseDefaultFolderSuffix(): Unit = js.native
}

object WebOptions {
  @scala.inline
  def apply(
    AccessDotWebOptions_typekey: WebOptions,
    Application: Application,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UseDefaultFolderSuffix: () => Unit,
    UseLongFileNames: Boolean
  ): WebOptions = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UseDefaultFolderSuffix = js.Any.fromFunction0(UseDefaultFolderSuffix), UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.WebOptions_typekey")(AccessDotWebOptions_typekey.asInstanceOf[js.Any])
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
    def setAccessDotWebOptions_typekey(value: WebOptions): Self = this.set("Access.WebOptions_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setDownloadComponents(value: Boolean): Self = this.set("DownloadComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolderSuffix(value: String): Self = this.set("FolderSuffix", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMemberSafe(value: Double => Boolean): Self = this.set("IsMemberSafe", js.Any.fromFunction1(value))
    @scala.inline
    def setLocationOfComponents(value: String): Self = this.set("LocationOfComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrganizeInFolder(value: Boolean): Self = this.set("OrganizeInFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setTargetBrowser(value: MsoTargetBrowser): Self = this.set("TargetBrowser", value.asInstanceOf[js.Any])
    @scala.inline
    def setUseDefaultFolderSuffix(value: () => Unit): Self = this.set("UseDefaultFolderSuffix", js.Any.fromFunction0(value))
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = this.set("UseLongFileNames", value.asInstanceOf[js.Any])
  }
  
}

