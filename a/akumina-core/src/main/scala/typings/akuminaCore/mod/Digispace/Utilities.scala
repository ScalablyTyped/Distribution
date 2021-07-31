package typings.akuminaCore.mod.Digispace

import typings.jquery.JQueryDeferred
import typings.std.Date
import typings.std.JSON
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("akumina-core", "Digispace.Utilities")
@js.native
class Utilities () extends StObject
object Utilities {
  
  @JSImport("akumina-core", "Digispace.Utilities")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Shows confirmation popup if all permissions are set as NA
    * It is called from add page tab and page properties update
    * @param isPagePropertisPopUp true if called from page properties.
    */
  /* static member */
  @scala.inline
  def AllPermissionsNA(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AllPermissionsNA")().asInstanceOf[Unit]
  @scala.inline
  def AllPermissionsNA(isPagePropertisPopUp: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AllPermissionsNA")(isPagePropertisPopUp.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Called to show confirmation pop up while exiting edit page mode.
    */
  /* static member */
  @scala.inline
  def AttemptReset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("AttemptReset")().asInstanceOf[Unit]
  
  /**
    * Check if iser is logged into appmanager and set the flag accordingly
    */
  /* static member */
  @scala.inline
  def CheckAppManagerIsLoggedIn(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckAppManagerIsLoggedIn")().asInstanceOf[Unit]
  
  /** Takes string or any value as input & can return it as boolean or JSON
    *  @param value Any value
    *  @param dataType Required retrun type "bool", "boolean", "json"
    */
  /* static member */
  @scala.inline
  def ConvertValue(value: js.Any, dataType: String): Boolean | JSON = (^.asInstanceOf[js.Dynamic].applyDynamic("ConvertValue")(value.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Boolean | JSON]
  
  /* Added */
  @JSImport("akumina-core", "Digispace.Utilities.DateTimeManager")
  @js.native
  class DateTimeManager () extends StObject
  object DateTimeManager {
    
    @JSImport("akumina-core", "Digispace.Utilities.DateTimeManager")
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def LocalToUtc(data: js.Any): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("LocalToUtc")(data.asInstanceOf[js.Any]).asInstanceOf[Date]
    
    /* static member */
    @scala.inline
    def UtcToLocal(Date: Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("UtcToLocal")(Date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  /**
    * Removes duplicate entries from an array
    * @param array Array to be filter
    */
  /* static member */
  @scala.inline
  def DeDupArray(array: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("DeDupArray")(array.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  /**
    * @param result
    * @param isCurrent
    * @returns Returns value of key ListID or SiteTitle(in case of isCurrent true)
    */
  /* static member */
  @scala.inline
  def FindSearchResultCategory(result: js.Array[js.Any], isCurrent: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FindSearchResultCategory")(result.asInstanceOf[js.Any], isCurrent.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** Convert date string to jsformat date string
    *  Acceptable formats "mm/dd/yy", "dd/mm/yy", "dd-mm-yy", "mm/dd/yyyy", "dd/mm/yyyy", "dd-mm-yyyy"
    *  @param format
    *  @param date
    *  @returns Converted date string in format "dd/mm/yy" or "mm/dd/yyyy"
    */
  /* static member */
  @scala.inline
  def FormatDateStringToJSFormat(format: String, date: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("FormatDateStringToJSFormat")(format.asInstanceOf[js.Any], date.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** Returns an object with pageId property */
  /* static member */
  @scala.inline
  def GetCurrentPageId(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetCurrentPageId")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def GetDashboardGridByInstance(instanceId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDashboardGridByInstance")(instanceId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /**Returns a deffered which will resolve with site specific date format object
    * @returns deffered resolved with object type: {
    "dateformat": "mm/dd/yy",
    "momentformat": "MM/DD/YY",
    "displayformat": "MM/DD/YYYY",
    "languagecode": "en-US"
    }
    */
  /* static member */
  @scala.inline
  def GetDateFormatForSiteLocaleId(): JQueryDeferred[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetDateFormatForSiteLocaleId")().asInstanceOf[JQueryDeferred[js.Any]]
  
  /* Added */
  /**
    * Resolves with Employee Detail Url
    * @param id UserId
    */
  /* static member */
  @scala.inline
  def GetEmployeeDetailUrl(id: String): JQueryDeferred[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetEmployeeDetailUrl")(id.asInstanceOf[js.Any]).asInstanceOf[JQueryDeferred[js.Any]]
  
  /**
    * Get new GUID
    */
  /* static member */
  @scala.inline
  def GetGuid(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetGuid")().asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def GetLinkForResult(itemUrl: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetLinkForResult")(itemUrl.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* static member */
  @scala.inline
  def GetLinkParameter(itemUrl: String, paramToRetrieve: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetLinkParameter")(itemUrl.asInstanceOf[js.Any], paramToRetrieve.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * relative path for manager script
    */
  /* static member */
  @scala.inline
  def GetManagerUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("GetManagerUrl")().asInstanceOf[String]
  
  /**
    * Returns Page Grid for workspace widget Instancce Id's
    * @param instanceId Widget Instance ID
    */
  /* static member */
  @scala.inline
  def GetPageGridByInstance(instanceId: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("GetPageGridByInstance")(instanceId.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  /* static member */
  @scala.inline
  def GetPropertyValue(requestIn: js.Any, key: String, defaultValue: String, dataType: String): Boolean | JSON = (^.asInstanceOf[js.Dynamic].applyDynamic("GetPropertyValue")(requestIn.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], dataType.asInstanceOf[js.Any])).asInstanceOf[Boolean | JSON]
  
  /** Retrive search parameter value from results */
  /* static member */
  @scala.inline
  def GetSearchParameter(itemResults: js.Array[js.Any], paramToRetrieve: String, defaultValue: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("GetSearchParameter")(itemResults.asInstanceOf[js.Any], paramToRetrieve.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * @returns element of sharepoint bar
    */
  /* static member */
  @scala.inline
  def GetSharepointBarElement(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSharepointBarElement")().asInstanceOf[js.Any]
  
  /**
    * @returns object with URL parameters
    */
  /* static member */
  @scala.inline
  def GetUrlParameters(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("GetUrlParameters")().asInstanceOf[js.Any]
  
  /* static member */
  @scala.inline
  def HandleSharepointBar(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HandleSharepointBar")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Hide sharepoint bar
    * @param setCookie boolean
    */
  /* static member */
  @scala.inline
  def HideSharepointBar(setCookie: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("HideSharepointBar")(setCookie.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def IsAppManagerLaguageCompatible(): JQueryDeferred[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("IsAppManagerLaguageCompatible")().asInstanceOf[JQueryDeferred[js.Any]]
  
  /** Convert object keys to lowercase
    *  @param data JSON String of Array of objects
    *  @returns Array of JSON objects with all keys in lowercase
    */
  /* static member */
  @scala.inline
  def JsonArrayKeyToLower(data: String): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("JsonArrayKeyToLower")(data.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  
  /**
    * Open interchange in new tab
    */
  /* static member */
  @scala.inline
  def OpenInterchange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("OpenInterchange")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def PageBindCloseWidgets(args: js.Any, grid: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PageBindCloseWidgets")(args.asInstanceOf[js.Any], grid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def PageResizeWidgets(args: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PageResizeWidgets")(args.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Open link in new window/tab.
    * @param link Link to open
    */
  /* static member */
  @scala.inline
  def PopUpLink(link: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PopUpLink")(link.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /** This method will show confirmation pop-up if user try to exit page edit mode */
  /* static member */
  @scala.inline
  def PromptExitEditMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PromptExitEditMode")().asInstanceOf[Unit]
  
  /** Register timer to check if user is logged into appmanager every minute */
  /* static member */
  @scala.inline
  def RegisterAppManagerLoggedInCheckHandler(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("RegisterAppManagerLoggedInCheckHandler")().asInstanceOf[Unit]
  
  /**
    * To show message in alert box
    * @param message Message text to show
    * @param options Custome options {width}
    * @param actioncallback Method to be called when user click ok
    */
  /* static member */
  @scala.inline
  def ShowAlertPopup(message: String, options: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ShowAlertPopup")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def ShowAlertPopup(message: String, options: js.Any, actioncallback: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("ShowAlertPopup")(message.asInstanceOf[js.Any], options.asInstanceOf[js.Any], actioncallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Show sharepoint bar
    * @param setCookie boolean
    */
  /* static member */
  @scala.inline
  def ShowSharepointBar(setCookie: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ShowSharepointBar")(setCookie.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Toggle Debugger panel
    */
  /* static member */
  @scala.inline
  def ToggleDebugger(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleDebugger")().asInstanceOf[Unit]
  
  /* static member */
  @scala.inline
  def ToggleExistPageBuilderManager(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleExistPageBuilderManager")().asInstanceOf[Unit]
  
  /** Toggle Impersonator mode */
  /* static member */
  @scala.inline
  def ToggleImpersonator(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleImpersonator")().asInstanceOf[Unit]
  
  /** Toggle Widget properties edit mode */
  /* static member */
  @scala.inline
  def ToggleItemManager(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleItemManager")().asInstanceOf[Unit]
  
  /** Toggle live preview mode */
  /* static member */
  @scala.inline
  def ToggleLiveMode(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleLiveMode")().asInstanceOf[Unit]
  
  /** Toggle page builder (Add new page) */
  /* static member */
  @scala.inline
  def TogglePageBuilderManager(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("TogglePageBuilderManager")().asInstanceOf[Unit]
  
  /** Toggle page edit mode */
  /* static member */
  @scala.inline
  def TogglePageManager(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("TogglePageManager")().asInstanceOf[Unit]
  
  /** Toggle widget edit mode */
  /* static member */
  @scala.inline
  def ToggleWidgetManager(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ToggleWidgetManager")().asInstanceOf[Unit]
}
