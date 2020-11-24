package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.SiteContext")
@js.native
class SiteContext () extends js.Object
/* static members */
@JSImport("akumina-core", "Digispace.SiteContext")
@js.native
object SiteContext extends js.Object {
  
  /** Stores current language ID */
  var CurrentLanguage: Double = js.native
  
  /** Relative URL to Employee Details page */
  var EmployeeDetailUrl: String = js.native
  
  var FrameworkLoadTime: Double = js.native
  
  /** @return Resolves with Language ID */
  def GetSiteLocaleId(): JQueryDeferred[_] = js.native
  
  var IsDashBoardPage: Boolean = js.native
  
  var IsExternalUser: Boolean = js.native
  
  var IsHeadlessMode: Boolean = js.native
  
  /**
    * Check if in design mode.
    */
  def IsInDesignMode(): String = js.native
  
  var IsLoaderComplete: Boolean = js.native
  
  var IsLogoutPage: Boolean = js.native
  
  var IsModernPage: Boolean = js.native
  
  var IsPageBuilderPage: Boolean = js.native
  
  var IsSPAPage: Boolean = js.native
  
  var IsSandboxPage: Boolean = js.native
  
  /** Check if Current user is site Admin */
  var IsSiteAdmin: Boolean = js.native
  
  /** Check if current page is a VPC */
  var IsVirtualPage: Boolean = js.native
  
  /** #MARK - it is not used as of now */
  var IsWidgetJSLoaded: Boolean = js.native
  
  /** Check if current page is a workspace page */
  var IsWorkspacePage: Boolean = js.native
  
  var ListPermissionsMask: js.Any = js.native
  
  /** #MARK - not used as of now. */
  var LoadedWidgets: js.Array[_] = js.native
  
  /** check if page not found */
  var PageNotFound: Boolean = js.native
  
  /** Lists queired till now
    */
  var QueriedLists: js.Array[String] = js.native
  
  var RootSiteId: String = js.native
  
  var RootSiteUrl: String = js.native
  
  /** Relative URL to current page */
  var ServerRequestPath: String = js.native
  
  /** Root Site URL */
  var SiteAbsoluteUrl: String = js.native
  
  /** SiteID with {} */
  var SiteId: String = js.native
  
  /** Relative URL for root site */
  var SiteServerRelativeUrl: String = js.native
  
  var TotalConnectTime: Double = js.native
  
  var TotalLoadTime: Double = js.native
  
  var TotalRenderTime: Double = js.native
  
  var UniqueId: String = js.native
  
  /** Lists of template views in use
    */
  var ViewsInUse: js.Array[String] = js.native
  
  /** Current site Absolute URL */
  var WebAbsoluteUrl: String = js.native
  
  /** Web ID (Root Site ID) */
  var WebId: String = js.native
  
  /** Current Site relative URL */
  var WebServerRelativeUrl: String = js.native
  
  /** WorkspaceDetails page absolute URL */
  var WorkspaceDetailsUrl: String = js.native
  
  /** Absolute URL to Workspace page */
  var WorkspaceListingUrl: String = js.native
}
