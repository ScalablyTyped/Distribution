package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.SiteContext")
@js.native
class SiteContext () extends StObject
object SiteContext {
  
  @JSImport("akumina-core", "Digispace.SiteContext")
  @js.native
  val ^ : js.Any = js.native
  
  /** Stores current language ID */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.CurrentLanguage")
  @js.native
  def CurrentLanguage: Double = js.native
  inline def CurrentLanguage_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CurrentLanguage")(x.asInstanceOf[js.Any])
  
  /** Relative URL to Employee Details page */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.EmployeeDetailUrl")
  @js.native
  def EmployeeDetailUrl: String = js.native
  inline def EmployeeDetailUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmployeeDetailUrl")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.FrameworkLoadTime")
  @js.native
  def FrameworkLoadTime: Double = js.native
  inline def FrameworkLoadTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FrameworkLoadTime")(x.asInstanceOf[js.Any])
  
  /** @return Resolves with Language ID */
  /* static member */
  inline def GetSiteLocaleId(): JQueryDeferred[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSiteLocaleId")().asInstanceOf[JQueryDeferred[js.Any]]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsDashBoardPage")
  @js.native
  def IsDashBoardPage: Boolean = js.native
  inline def IsDashBoardPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsDashBoardPage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsExternalUser")
  @js.native
  def IsExternalUser: Boolean = js.native
  inline def IsExternalUser_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsExternalUser")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsHeadlessMode")
  @js.native
  def IsHeadlessMode: Boolean = js.native
  inline def IsHeadlessMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsHeadlessMode")(x.asInstanceOf[js.Any])
  
  /**
    * Check if in design mode.
    */
  /* static member */
  inline def IsInDesignMode(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("IsInDesignMode")().asInstanceOf[String]
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsLoaderComplete")
  @js.native
  def IsLoaderComplete: Boolean = js.native
  inline def IsLoaderComplete_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsLoaderComplete")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsLogoutPage")
  @js.native
  def IsLogoutPage: Boolean = js.native
  inline def IsLogoutPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsLogoutPage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsModernPage")
  @js.native
  def IsModernPage: Boolean = js.native
  inline def IsModernPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsModernPage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsPageBuilderPage")
  @js.native
  def IsPageBuilderPage: Boolean = js.native
  inline def IsPageBuilderPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsPageBuilderPage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsSPAPage")
  @js.native
  def IsSPAPage: Boolean = js.native
  inline def IsSPAPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsSPAPage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsSandboxPage")
  @js.native
  def IsSandboxPage: Boolean = js.native
  inline def IsSandboxPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsSandboxPage")(x.asInstanceOf[js.Any])
  
  /** Check if Current user is site Admin */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsSiteAdmin")
  @js.native
  def IsSiteAdmin: Boolean = js.native
  inline def IsSiteAdmin_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsSiteAdmin")(x.asInstanceOf[js.Any])
  
  /** Check if current page is a VPC */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsVirtualPage")
  @js.native
  def IsVirtualPage: Boolean = js.native
  inline def IsVirtualPage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsVirtualPage")(x.asInstanceOf[js.Any])
  
  /** #MARK - it is not used as of now */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsWidgetJSLoaded")
  @js.native
  def IsWidgetJSLoaded: Boolean = js.native
  inline def IsWidgetJSLoaded_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWidgetJSLoaded")(x.asInstanceOf[js.Any])
  
  /** Check if current page is a workspace page */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.IsWorkspacePage")
  @js.native
  def IsWorkspacePage: Boolean = js.native
  inline def IsWorkspacePage_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IsWorkspacePage")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.ListPermissionsMask")
  @js.native
  def ListPermissionsMask: js.Any = js.native
  inline def ListPermissionsMask_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ListPermissionsMask")(x.asInstanceOf[js.Any])
  
  /** #MARK - not used as of now. */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.LoadedWidgets")
  @js.native
  def LoadedWidgets: js.Array[js.Any] = js.native
  inline def LoadedWidgets_=(x: js.Array[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LoadedWidgets")(x.asInstanceOf[js.Any])
  
  /** check if page not found */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.PageNotFound")
  @js.native
  def PageNotFound: Boolean = js.native
  inline def PageNotFound_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PageNotFound")(x.asInstanceOf[js.Any])
  
  /** Lists queired till now
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.QueriedLists")
  @js.native
  def QueriedLists: js.Array[String] = js.native
  inline def QueriedLists_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("QueriedLists")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.RootSiteId")
  @js.native
  def RootSiteId: String = js.native
  inline def RootSiteId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RootSiteId")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.RootSiteUrl")
  @js.native
  def RootSiteUrl: String = js.native
  inline def RootSiteUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RootSiteUrl")(x.asInstanceOf[js.Any])
  
  /** Relative URL to current page */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.ServerRequestPath")
  @js.native
  def ServerRequestPath: String = js.native
  inline def ServerRequestPath_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ServerRequestPath")(x.asInstanceOf[js.Any])
  
  /** Root Site URL */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.SiteAbsoluteUrl")
  @js.native
  def SiteAbsoluteUrl: String = js.native
  inline def SiteAbsoluteUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SiteAbsoluteUrl")(x.asInstanceOf[js.Any])
  
  /** SiteID with {} */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.SiteId")
  @js.native
  def SiteId: String = js.native
  inline def SiteId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SiteId")(x.asInstanceOf[js.Any])
  
  /** Relative URL for root site */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.SiteServerRelativeUrl")
  @js.native
  def SiteServerRelativeUrl: String = js.native
  inline def SiteServerRelativeUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SiteServerRelativeUrl")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.TotalConnectTime")
  @js.native
  def TotalConnectTime: Double = js.native
  inline def TotalConnectTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TotalConnectTime")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.TotalLoadTime")
  @js.native
  def TotalLoadTime: Double = js.native
  inline def TotalLoadTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TotalLoadTime")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.TotalRenderTime")
  @js.native
  def TotalRenderTime: Double = js.native
  inline def TotalRenderTime_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TotalRenderTime")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.UniqueId")
  @js.native
  def UniqueId: String = js.native
  inline def UniqueId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("UniqueId")(x.asInstanceOf[js.Any])
  
  /** Lists of template views in use
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.ViewsInUse")
  @js.native
  def ViewsInUse: js.Array[String] = js.native
  inline def ViewsInUse_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ViewsInUse")(x.asInstanceOf[js.Any])
  
  /** Current site Absolute URL */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.WebAbsoluteUrl")
  @js.native
  def WebAbsoluteUrl: String = js.native
  inline def WebAbsoluteUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebAbsoluteUrl")(x.asInstanceOf[js.Any])
  
  /** Web ID (Root Site ID) */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.WebId")
  @js.native
  def WebId: String = js.native
  inline def WebId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebId")(x.asInstanceOf[js.Any])
  
  /** Current Site relative URL */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.WebServerRelativeUrl")
  @js.native
  def WebServerRelativeUrl: String = js.native
  inline def WebServerRelativeUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WebServerRelativeUrl")(x.asInstanceOf[js.Any])
  
  /** WorkspaceDetails page absolute URL */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.WorkspaceDetailsUrl")
  @js.native
  def WorkspaceDetailsUrl: String = js.native
  inline def WorkspaceDetailsUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceDetailsUrl")(x.asInstanceOf[js.Any])
  
  /** Absolute URL to Workspace page */
  /* static member */
  @JSImport("akumina-core", "Digispace.SiteContext.WorkspaceListingUrl")
  @js.native
  def WorkspaceListingUrl: String = js.native
  inline def WorkspaceListingUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("WorkspaceListingUrl")(x.asInstanceOf[js.Any])
}
