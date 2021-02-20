package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import typings.std.Date
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.Utilities")
@js.native
class Utilities () extends StObject
object Utilities {
  
  /**
    * Shows confirmation popup if all permissions are set as NA
    * It is called from add page tab and page properties update
    * @param isPagePropertisPopUp true if called from page properties.
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.AllPermissionsNA")
  @js.native
  def AllPermissionsNA(): Unit = js.native
  @JSImport("akumina-core", "Digispace.Utilities.AllPermissionsNA")
  @js.native
  def AllPermissionsNA(isPagePropertisPopUp: Boolean): Unit = js.native
  
  /**
    * Called to show confirmation pop up while exiting edit page mode.
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.AttemptReset")
  @js.native
  def AttemptReset(): Unit = js.native
  
  /**
    * Check if iser is logged into appmanager and set the flag accordingly
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.CheckAppManagerIsLoggedIn")
  @js.native
  def CheckAppManagerIsLoggedIn(): Unit = js.native
  
  /** Takes string or any value as input & can return it as boolean or JSON
    *  @param value Any value
    *  @param dataType Required retrun type "bool", "boolean", "json"
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ConvertValue")
  @js.native
  def ConvertValue(value: js.Any, dataType: String): Boolean | JSON = js.native
  
  /* Added */
  @JSImport("akumina-core", "Digispace.Utilities.DateTimeManager")
  @js.native
  class DateTimeManager () extends StObject
  object DateTimeManager {
    
    /* static member */
    @JSImport("akumina-core", "Digispace.Utilities.DateTimeManager.LocalToUtc")
    @js.native
    def LocalToUtc(data: js.Any): Date = js.native
    
    /* static member */
    @JSImport("akumina-core", "Digispace.Utilities.DateTimeManager.UtcToLocal")
    @js.native
    def UtcToLocal(Date: Date, format: String): String = js.native
  }
  
  /**
    * Removes duplicate entries from an array
    * @param array Array to be filter
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.DeDupArray")
  @js.native
  def DeDupArray(array: js.Any): js.Any = js.native
  
  /**
    * @param result
    * @param isCurrent
    * @returns Returns value of key ListID or SiteTitle(in case of isCurrent true)
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.FindSearchResultCategory")
  @js.native
  def FindSearchResultCategory(result: js.Array[_], isCurrent: Boolean): String = js.native
  
  /** Convert date string to jsformat date string
    *  Acceptable formats "mm/dd/yy", "dd/mm/yy", "dd-mm-yy", "mm/dd/yyyy", "dd/mm/yyyy", "dd-mm-yyyy"
    *  @param format
    *  @param date
    *  @returns Converted date string in format "dd/mm/yy" or "mm/dd/yyyy"
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.FormatDateStringToJSFormat")
  @js.native
  def FormatDateStringToJSFormat(format: String, date: String): String = js.native
  
  /** Returns an object with pageId property */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetCurrentPageId")
  @js.native
  def GetCurrentPageId(): js.Any = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetDashboardGridByInstance")
  @js.native
  def GetDashboardGridByInstance(instanceId: String): js.Array[String] = js.native
  
  /**Returns a deffered which will resolve with site specific date format object
    * @returns deffered resolved with object type: {
    "dateformat": "mm/dd/yy",
    "momentformat": "MM/DD/YY",
    "displayformat": "MM/DD/YYYY",
    "languagecode": "en-US"
    }
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetDateFormatForSiteLocaleId")
  @js.native
  def GetDateFormatForSiteLocaleId(): JQueryDeferred[_] = js.native
  
  /* Added */
  /**
    * Resolves with Employee Detail Url
    * @param id UserId
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetEmployeeDetailUrl")
  @js.native
  def GetEmployeeDetailUrl(id: String): JQueryDeferred[_] = js.native
  
  /**
    * Get new GUID
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetGuid")
  @js.native
  def GetGuid(): String = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetLinkForResult")
  @js.native
  def GetLinkForResult(itemUrl: String): String = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetLinkParameter")
  @js.native
  def GetLinkParameter(itemUrl: String, paramToRetrieve: String, defaultValue: String): String = js.native
  
  /**
    * relative path for manager script
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetManagerUrl")
  @js.native
  def GetManagerUrl(): String = js.native
  
  /**
    * Returns Page Grid for workspace widget Instancce Id's
    * @param instanceId Widget Instance ID
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetPageGridByInstance")
  @js.native
  def GetPageGridByInstance(instanceId: String): js.Array[String] = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetPropertyValue")
  @js.native
  def GetPropertyValue(requestIn: js.Any, key: String, defaultValue: String, dataType: String): Boolean | JSON = js.native
  
  /** Retrive search parameter value from results */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetSearchParameter")
  @js.native
  def GetSearchParameter(itemResults: js.Array[_], paramToRetrieve: String, defaultValue: String): String = js.native
  
  /**
    * @returns element of sharepoint bar
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetSharepointBarElement")
  @js.native
  def GetSharepointBarElement(): js.Any = js.native
  
  /**
    * @returns object with URL parameters
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.GetUrlParameters")
  @js.native
  def GetUrlParameters(): js.Any = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.HandleSharepointBar")
  @js.native
  def HandleSharepointBar(args: js.Any): Unit = js.native
  
  /**
    * Hide sharepoint bar
    * @param setCookie boolean
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.HideSharepointBar")
  @js.native
  def HideSharepointBar(setCookie: Boolean): Unit = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.IsAppManagerLaguageCompatible")
  @js.native
  def IsAppManagerLaguageCompatible(): JQueryDeferred[_] = js.native
  
  /** Convert object keys to lowercase
    *  @param data JSON String of Array of objects
    *  @returns Array of JSON objects with all keys in lowercase
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.JsonArrayKeyToLower")
  @js.native
  def JsonArrayKeyToLower(data: String): js.Array[_] = js.native
  
  /**
    * Open interchange in new tab
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.OpenInterchange")
  @js.native
  def OpenInterchange(): Unit = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.PageBindCloseWidgets")
  @js.native
  def PageBindCloseWidgets(args: js.Any, grid: js.Any): Unit = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.PageResizeWidgets")
  @js.native
  def PageResizeWidgets(args: js.Any): Unit = js.native
  
  /**
    * Open link in new window/tab.
    * @param link Link to open
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.PopUpLink")
  @js.native
  def PopUpLink(link: String): Unit = js.native
  
  /** This method will show confirmation pop-up if user try to exit page edit mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.PromptExitEditMode")
  @js.native
  def PromptExitEditMode(): Unit = js.native
  
  /** Register timer to check if user is logged into appmanager every minute */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.RegisterAppManagerLoggedInCheckHandler")
  @js.native
  def RegisterAppManagerLoggedInCheckHandler(): Unit = js.native
  
  /**
    * To show message in alert box
    * @param message Message text to show
    * @param options Custome options {width}
    * @param actioncallback Method to be called when user click ok
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ShowAlertPopup")
  @js.native
  def ShowAlertPopup(message: String, options: js.Any): Unit = js.native
  @JSImport("akumina-core", "Digispace.Utilities.ShowAlertPopup")
  @js.native
  def ShowAlertPopup(message: String, options: js.Any, actioncallback: js.Any): Unit = js.native
  
  /**
    * Show sharepoint bar
    * @param setCookie boolean
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ShowSharepointBar")
  @js.native
  def ShowSharepointBar(setCookie: Boolean): Unit = js.native
  
  /**
    * Toggle Debugger panel
    */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleDebugger")
  @js.native
  def ToggleDebugger(): Unit = js.native
  
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleExistPageBuilderManager")
  @js.native
  def ToggleExistPageBuilderManager(): Unit = js.native
  
  /** Toggle Impersonator mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleImpersonator")
  @js.native
  def ToggleImpersonator(): Unit = js.native
  
  /** Toggle Widget properties edit mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleItemManager")
  @js.native
  def ToggleItemManager(): Unit = js.native
  
  /** Toggle live preview mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleLiveMode")
  @js.native
  def ToggleLiveMode(): Unit = js.native
  
  /** Toggle page builder (Add new page) */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.TogglePageBuilderManager")
  @js.native
  def TogglePageBuilderManager(): Unit = js.native
  
  /** Toggle page edit mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.TogglePageManager")
  @js.native
  def TogglePageManager(): Unit = js.native
  
  /** Toggle widget edit mode */
  /* static member */
  @JSImport("akumina-core", "Digispace.Utilities.ToggleWidgetManager")
  @js.native
  def ToggleWidgetManager(): Unit = js.native
}
