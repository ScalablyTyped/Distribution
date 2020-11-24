package typings.activexAccess.Access

import typings.activexOffice.Office.MsoEncoding
import typings.activexOffice.Office.MsoTargetBrowser
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DefaultWebOptions extends js.Object {
  
  @JSName("Access.DefaultWebOptions_typekey")
  var AccessDotDefaultWebOptions_typekey: DefaultWebOptions = js.native
  
  var AlwaysSaveInDefaultEncoding: Boolean = js.native
  
  val Application: typings.activexAccess.Access.Application = js.native
  
  var CheckIfOfficeIsHTMLEditor: Boolean = js.native
  
  var DownloadComponents: Boolean = js.native
  
  var Encoding: MsoEncoding = js.native
  
  val FolderSuffix: String = js.native
  
  var FollowedHyperlinkColor: AcColorIndex = js.native
  
  var HyperlinkColor: AcColorIndex = js.native
  
  def IsMemberSafe(dispid: Double): Boolean = js.native
  
  var LocationOfComponents: String = js.native
  
  var OrganizeInFolder: Boolean = js.native
  
  val Parent: js.Any = js.native
  
  var TargetBrowser: MsoTargetBrowser = js.native
  
  var UnderlineHyperlinks: Boolean = js.native
  
  var UseLongFileNames: Boolean = js.native
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
  
  @scala.inline
  implicit class DefaultWebOptionsOps[Self <: DefaultWebOptions] (val x: Self) extends AnyVal {
    
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
    def setAccessDotDefaultWebOptions_typekey(value: DefaultWebOptions): Self = this.set("Access.DefaultWebOptions_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlwaysSaveInDefaultEncoding(value: Boolean): Self = this.set("AlwaysSaveInDefaultEncoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckIfOfficeIsHTMLEditor(value: Boolean): Self = this.set("CheckIfOfficeIsHTMLEditor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDownloadComponents(value: Boolean): Self = this.set("DownloadComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(value: MsoEncoding): Self = this.set("Encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolderSuffix(value: String): Self = this.set("FolderSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFollowedHyperlinkColor(value: AcColorIndex): Self = this.set("FollowedHyperlinkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHyperlinkColor(value: AcColorIndex): Self = this.set("HyperlinkColor", value.asInstanceOf[js.Any])
    
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
    def setUnderlineHyperlinks(value: Boolean): Self = this.set("UnderlineHyperlinks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseLongFileNames(value: Boolean): Self = this.set("UseLongFileNames", value.asInstanceOf[js.Any])
  }
}
