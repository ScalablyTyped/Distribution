package typings.akuminaCore.mod.Digispace

import typings.akuminaCore.mod.IConstants
import typings.jquery.JQueryDeferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("akumina-core", "Digispace.ConfigurationContext")
@js.native
class ConfigurationContext () extends js.Object

/* static members */
@JSImport("akumina-core", "Digispace.ConfigurationContext")
@js.native
object ConfigurationContext extends js.Object {
  /** Currently Active languages {LanguageID, ID, FallBack, Name, Code, etc...} */
  var ActiveLanguages: js.Array[_] = js.native
  var AkTokenDuration: Double = js.native
  var AppManagerLoggedInTime: js.Any = js.native
  var ApplicationInsightsKey: String = js.native
  /** All confguratoin constants */
  var CONSTANTS: IConstants = js.native
  /** Caching strategy time */
  var CachingStrategyInterval: Double = js.native
  /** Site URL  */
  var ConfigurationSiteUrl: String = js.native
  /** All container layouts objects */
  var ContainerLayouts: js.Array[_] = js.native
  var DashboardEnableEditMode: Boolean = js.native
  var DashboardGridHeight: String = js.native
  var DashboardGridWidth: String = js.native
  /** Dashboard Instance Site URL */
  var DashboardInstanceSiteUrl: String = js.native
  var DashboardView: js.Array[String] = js.native
  var DashboardWidgetDefaultSize: String = js.native
  var DashboardZoneIds: String = js.native
  var DefaultLanguage: String = js.native
  /** Associative Array of objects */
  var DepartmentSiteMap: js.Array[_] = js.native
   /* Added */ /** Is site using AzureAD ID */
  var EnableAzureAD: Boolean = js.native
  /** Is in Debug mode */
  var EnableDebugMode: Boolean = js.native
  var EnableReusableContent: Boolean = js.native
  /**
    * #MARK - It is comming as Undefined
    */
  var ErrorRedirectUrl: String = js.native
  var GoogleMapKey: String = js.native
  var GraphClientId: String = js.native
  var GraphRedirectUrl: String = js.native
  var GraphSubscriptionId: String = js.native
  var GroupTagsExtension: js.Any = js.native
  var GroupTypeExtension: js.Any = js.native
  var InstanceRowLimit: Double = js.native
  /** Loing URL for login to interchange */
  var InterchangeLoginURL: String = js.native
  var InterchangeQueryKey: String = js.native
  /** URL to Interchange */
  var InterchangeURL: String = js.native
  /** Internal widget dependency map */
  var InternalWidgetDependencyMap: js.Array[_] = js.native
  /** Instance Ids for widgets */
  var InternalWidgetInstanceIds: js.Any = js.native
  /** Is user loggied into app manager */
  var IsAppManagerLoggedIn: Boolean = js.native
  /** Is Site multilingual  */
  var IsMultiLingualEnabled: Boolean = js.native
  var IsNotFoundPage: Boolean = js.native
  /** Is workspace is enabled or not */
  var IsWorkspacesEnabled: Boolean = js.native
  /** Language neutral Listsname  */
  var LanguageNeutralLists: js.Any = js.native
  /** HTML template for Loading */
  var LoadingTemplateHtml: String = js.native
  var NotFoundPage: String = js.native
  var PageBuilderDefaultLayoutId: Double = js.native
  /** All premade page layout objects */
  var PageLayouts: js.Array[_] = js.native
  var PageRouteInfo: js.Any = js.native
  /** Contains Array of pageTypes object */
  var PageTypes: js.Array[_] = js.native
  var PageWidgetDefaultSize: String = js.native
  /** SP Lists with persona enabled */
  var PersonaEnabledLists: js.Any = js.native
  var PersonaSelectionMode: String = js.native
   /* Added */ /** All personas */
  var Personas: js.Array[_] = js.native
  var RemoteListSiteUrl: String = js.native
  var ReusableContentList: String = js.native
  /** Time to wait for script loading */
  var ScriptTimeout: Double = js.native
  /** Pages to be excluded in search */
  var SearchPageExclusionList: js.Array[String] = js.native
  /** settings object */
  var Settings: js.Any = js.native
  var SiteImageObj: String = js.native
  /** JSON string */
  var SiteLogoObj: String = js.native
  var SiteVisibleLanguages: js.Any = js.native
  var SkypeApiKey: String = js.native
  var SkypeApiKeyCC: String = js.native
  var TemplateCoreFolderName: String = js.native
  /** Template Folder name */
  var TemplateFolderName: String = js.native
  var TemplateURLPrefix: String = js.native
  var TenantUrl: String = js.native
  /** Current Theme */
  var Theme: String = js.native
  var UseEncryption: Boolean = js.native
  var WidgetDependencyMap: js.Array[_] = js.native
  /** Widget Instance URL */
  var WidgetInstanceSiteUrl: String = js.native
  var WorkspaceThemesAvailable: js.Array[String] = js.native
  def GetAdditionalLoaderConfigurations(): Unit = js.native
  def GetDefaultLanguage(): js.Any = js.native
  /**
    * Get site visible languages
    * @param languages
    */
  def GetSiteVisibleLanguages(languages: js.Any): js.Any = js.native
  /**
    * Load Active Languages
    * @param activeLanguages
    */
  def LoadActiveLanguages(activeLanguages: js.Any): Unit = js.native
  /**
    * Map department objects to associative array
    * @param sitedepartments
    * @returns Associative array.
    */
  def MapDepartmentSites(sitedepartments: js.Any): js.Array[_] = js.native
  def PopulateTemplateURLPrefix(): Unit = js.native
  /**
    * Returns currect caching strategy
    * @param cachingStrategy
    */
  def ResolveCachingStrategy(cachingStrategy: js.Any): Double = js.native
  /**
    * Set default language
    * @param defaultLanguage
    */
  def SetDefaultLanguage(defaultLanguage: js.Any): Unit = js.native
  /**
    * Set Site visible Languages.
    * @param languages
    */
  def SetSiteVisibleLanguages(languages: js.Any): js.Any = js.native
  def clearCache(): Unit = js.native
  /**
    * GetCacheKey
    * @param attribute
    */
  def getCacheKey(attribute: String): String = js.native
  /**
    * Get Language Neutral cache key
    * @param key
    */
  def getCacheKeyLanguageNeutral(key: String): String = js.native
  def loadDigispaceConfiguration(): JQueryDeferred[_] = js.native
  /**
    * @param isLoggedIn
    * @param loggedInTime
    */
  def setAppManagerLogin(isLoggedIn: Boolean, loggedInTime: js.Any): Unit = js.native
  /**
    * Set configuration from digispace object passed.
    * @param digispaceConfiguration
    */
  def setDigispaceConfiguration(digispaceConfiguration: js.Any): Unit = js.native
}

