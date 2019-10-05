package typings.akuminaDashCore.akuminaDashCoreMod.Digispace

import typings.jquery.JQueryDeferred
import typings.std.Date
import typings.std.JSON
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.Utilities")
@js.native
class Utilities () extends js.Object

/* static members */
@JSImport("akumina-core", "Digispace.Utilities")
@js.native
object Utilities extends js.Object {
  /* Added */
  @js.native
  class DateTimeManager () extends js.Object
  
  def AllPermissionsNA(): Unit = js.native
  /**
    * Shows confirmation popup if all permissions are set as NA
    * It is called from add page tab and page properties update
    * @param isPagePropertisPopUp true if called from page properties.
    */
  def AllPermissionsNA(isPagePropertisPopUp: Boolean): Unit = js.native
  /**
    * Called to show confirmation pop up while exiting edit page mode.
    */
  def AttemptReset(): Unit = js.native
  /**
    * Check if iser is logged into appmanager and set the flag accordingly
    */
  def CheckAppManagerIsLoggedIn(): Unit = js.native
  /** Takes string or any value as input & can return it as boolean or JSON
    *  @param value Any value
    *  @param dataType Required retrun type "bool", "boolean", "json"
    */
  def ConvertValue(value: js.Any, dataType: String): Boolean | JSON = js.native
  /**
    * Removes duplicate entries from an array
    * @param array Array to be filter
    */
  def DeDupArray(array: js.Any): js.Any = js.native
  /**
    * @param result
    * @param isCurrent
    * @returns Returns value of key ListID or SiteTitle(in case of isCurrent true)
    */
  def FindSearchResultCategory(result: js.Array[_], isCurrent: Boolean): String = js.native
  /** Convert date string to jsformat date string
    *  Acceptable formats "mm/dd/yy", "dd/mm/yy", "dd-mm-yy", "mm/dd/yyyy", "dd/mm/yyyy", "dd-mm-yyyy"
    *  @param format
    *  @param date
    *  @returns Converted date string in format "dd/mm/yy" or "mm/dd/yyyy"
    */
  def FormatDateStringToJSFormat(format: String, date: String): String = js.native
  /** Returns an object with pageId property */
  def GetCurrentPageId(): js.Any = js.native
  def GetDashboardGridByInstance(instanceId: String): js.Array[String] = js.native
  /**Returns a deffered which will resolve with site specific date format object
    * @returns deffered resolved with object type: {
    "dateformat": "mm/dd/yy",
    "momentformat": "MM/DD/YY",
    "displayformat": "MM/DD/YYYY",
    "languagecode": "en-US"
    }
    */
  def GetDateFormatForSiteLocaleId(): JQueryDeferred[_] = js.native
   /* Added */ /**
    * Resolves with Employee Detail Url
    * @param id UserId
    */
  def GetEmployeeDetailUrl(id: String): JQueryDeferred[_] = js.native
  /**
    * Get new GUID
    */
  def GetGuid(): String = js.native
  def GetLinkForResult(itemUrl: String): String = js.native
  def GetLinkParameter(itemUrl: String, paramToRetrieve: String, defaultValue: String): String = js.native
  /**
    * relative path for manager script
    */
  def GetManagerUrl(): String = js.native
  /**
    * Returns Page Grid for workspace widget Instancce Id's
    * @param instanceId Widget Instance ID
    */
  def GetPageGridByInstance(instanceId: String): js.Array[String] = js.native
  def GetPropertyValue(requestIn: js.Any, key: String, defaultValue: String, dataType: String): Boolean | JSON = js.native
  /** Retrive search parameter value from results */
  def GetSearchParameter(itemResults: js.Array[_], paramToRetrieve: String, defaultValue: String): String = js.native
  /**
    * @returns element of sharepoint bar
    */
  def GetSharepointBarElement(): js.Any = js.native
  /**
    * @returns object with URL parameters
    */
  def GetUrlParameters(): js.Any = js.native
  def HandleSharepointBar(args: js.Any): Unit = js.native
  /**
    * Hide sharepoint bar
    * @param setCookie boolean
    */
  def HideSharepointBar(setCookie: Boolean): Unit = js.native
  def IsAppManagerLaguageCompatible(): JQueryDeferred[_] = js.native
  /** Convert object keys to lowercase
    *  @param data JSON String of Array of objects
    *  @returns Array of JSON objects with all keys in lowercase
    */
  def JsonArrayKeyToLower(data: String): js.Array[_] = js.native
  /**
    * Open interchange in new tab
    */
  def OpenInterchange(): Unit = js.native
  def PageBindCloseWidgets(args: js.Any, grid: js.Any): Unit = js.native
  def PageResizeWidgets(args: js.Any): Unit = js.native
  /**
    * Open link in new window/tab.
    * @param link Link to open
    */
  def PopUpLink(link: String): Unit = js.native
  /** This method will show confirmation pop-up if user try to exit page edit mode */
  def PromptExitEditMode(): Unit = js.native
  /** Register timer to check if user is logged into appmanager every minute */
  def RegisterAppManagerLoggedInCheckHandler(): Unit = js.native
  /**
    * To show message in alert box
    * @param message Message text to show
    * @param options Custome options {width}
    * @param actioncallback Method to be called when user click ok
    */
  def ShowAlertPopup(message: String, options: js.Any): Unit = js.native
  def ShowAlertPopup(message: String, options: js.Any, actioncallback: js.Any): Unit = js.native
  /**
    * Show sharepoint bar
    * @param setCookie boolean
    */
  def ShowSharepointBar(setCookie: Boolean): Unit = js.native
  /**
    * Toggle Debugger panel
    */
  def ToggleDebugger(): Unit = js.native
  def ToggleExistPageBuilderManager(): Unit = js.native
  /** Toggle Impersonator mode */
  def ToggleImpersonator(): Unit = js.native
  /** Toggle Widget properties edit mode */
  def ToggleItemManager(): Unit = js.native
  /** Toggle live preview mode */
  def ToggleLiveMode(): Unit = js.native
  /** Toggle page builder (Add new page) */
  def TogglePageBuilderManager(): Unit = js.native
  /** Toggle page edit mode */
  def TogglePageManager(): Unit = js.native
  /** Toggle widget edit mode */
  def ToggleWidgetManager(): Unit = js.native
  /* static members */
  @js.native
  object DateTimeManager extends js.Object {
    def LocalToUtc(data: js.Any): Date = js.native
    def UtcToLocal(Date: Date, format: String): String = js.native
  }
  
}

