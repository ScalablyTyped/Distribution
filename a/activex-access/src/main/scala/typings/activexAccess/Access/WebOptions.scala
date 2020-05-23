package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebOptions extends js.Object {
  @JSName("Access.WebOptions_typekey")
  var AccessDotWebOptions_typekey: WebOptions
  val Application: typings.activexAccess.Access.Application
  var DownloadComponents: Boolean
  var Encoding: MsoEncoding
  val FolderSuffix: String
  var LocationOfComponents: String
  var OrganizeInFolder: Boolean
  val Parent: js.Any
  var TargetBrowser: MsoTargetBrowser
  var UseLongFileNames: Boolean
  def IsMemberSafe(dispid: Double): Boolean
  def UseDefaultFolderSuffix(): Unit
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
}

