package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultWebOptions extends js.Object {
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: DefaultWebOptions
  var AlwaysSaveInDefaultEncoding: Boolean
  val Application: typings.activexAccess.Access.Application
  var CheckIfOfficeIsHTMLEditor: Boolean
  var DownloadComponents: Boolean
  var Encoding: MsoEncoding
  val FolderSuffix: String
  var FollowedHyperlinkColor: AcColorIndex
  var HyperlinkColor: AcColorIndex
  var LocationOfComponents: String
  var OrganizeInFolder: Boolean
  val Parent: js.Any
  var TargetBrowser: MsoTargetBrowser
  var UnderlineHyperlinks: Boolean
  var UseLongFileNames: Boolean
  def IsMemberSafe(dispid: Double): Boolean
}

object DefaultWebOptions {
  @scala.inline
  def apply(
    AccessDotDefaultWebOptions_typekey: DefaultWebOptions,
    AlwaysSaveInDefaultEncoding: Boolean,
    Application: Application,
    CheckIfOfficeIsHTMLEditor: Boolean,
    DownloadComponents: Boolean,
    Encoding: MsoEncoding,
    FolderSuffix: String,
    FollowedHyperlinkColor: AcColorIndex,
    HyperlinkColor: AcColorIndex,
    IsMemberSafe: Double => Boolean,
    LocationOfComponents: String,
    OrganizeInFolder: Boolean,
    Parent: js.Any,
    TargetBrowser: MsoTargetBrowser,
    UnderlineHyperlinks: Boolean,
    UseLongFileNames: Boolean
  ): DefaultWebOptions = {
    val __obj = js.Dynamic.literal(AlwaysSaveInDefaultEncoding = AlwaysSaveInDefaultEncoding.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], CheckIfOfficeIsHTMLEditor = CheckIfOfficeIsHTMLEditor.asInstanceOf[js.Any], DownloadComponents = DownloadComponents.asInstanceOf[js.Any], Encoding = Encoding.asInstanceOf[js.Any], FolderSuffix = FolderSuffix.asInstanceOf[js.Any], FollowedHyperlinkColor = FollowedHyperlinkColor.asInstanceOf[js.Any], HyperlinkColor = HyperlinkColor.asInstanceOf[js.Any], IsMemberSafe = js.Any.fromFunction1(IsMemberSafe), LocationOfComponents = LocationOfComponents.asInstanceOf[js.Any], OrganizeInFolder = OrganizeInFolder.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], TargetBrowser = TargetBrowser.asInstanceOf[js.Any], UnderlineHyperlinks = UnderlineHyperlinks.asInstanceOf[js.Any], UseLongFileNames = UseLongFileNames.asInstanceOf[js.Any])
    __obj.updateDynamic("Access.DefaultWebOptions_typekey")(AccessDotDefaultWebOptions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultWebOptions]
  }
}

