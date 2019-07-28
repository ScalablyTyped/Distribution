package typings.angularDashGoogleDashAnalytics.angularMod.googleNs.analyticsNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @summary Interface for {@link AnalysticsProvider}.
  * @interface
  */
@js.native
trait AnalyticsProvider extends js.Object {
  /**
    * @summary Use Delay Script Tag Insertion.
    * @param {boolean} val If true, the delay script tag is inserted.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def delayScriptTag(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Activates the test mode.
    */
  def enterTestMode(): Unit = js.native
  /**
    * @summary Gets the global cookie configuration.
    * @return {Object} The global cookie configuration.
    */
  def getCookieConfig(): js.Object = js.native
  /**
    * @summary Ignore first page view.
    * @param {boolean} val If true, the first page view is ignored.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def ignoreFirstPageLoad(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Enable Service Logging.
    * @param {boolean} val If true, log all outbound calls to an in-memory array accessible.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def logAllCalls(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Activate reading custom tracking urls from $routeProvider config (default is false)
    * This is more flexible than using RegExp and easier to maintain for multiple parameters.
    * It also reduces tracked pages to routes (only those with a templateUrl) defined in the
    * $routeProvider and therefore reduces bounce rate created by redirects.
    * See https://github.com/revolunet/angular-google-analytics#set-route-tracking-behaviors for details
    * @param {boolean} val If true, the module tries to read tracking information from the 
    * $routeProvider config.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def readFromRoute(useRoute: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Set Google Analytics Accounts.
    * @param {Object} tracker The account identifier(s).
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setAccount(tracker: String): AnalyticsProvider = js.native
  def setAccount(tracker: js.Array[js.Object]): AnalyticsProvider = js.native
  def setAccount(tracker: js.Object): AnalyticsProvider = js.native
  /**
    * @summary Set Cookie Configuration.
    * @param {Object} config The custom cookie parameters.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    * @deprecated
    */
  def setCookieConfig(config: js.Object): AnalyticsProvider = js.native
  /**
    * @summary Set cross-linked domains.
    * @param {Array<string>} domains The domains.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setCrossLinkDomains(domains: js.Array[String]): AnalyticsProvider = js.native
  /**
    * @summary Set currency.
    * @param {string} currencyCode The currency code.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setCurrency(currencyCode: String): AnalyticsProvider = js.native
  /**
    * @summary Set Domain Name.
    * @param {string} domain The domain name.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setDomainName(domain: String): AnalyticsProvider = js.native
  /**
    * @summary Enable Experiment (universal analytics only).
    * @param {string} id The experiment identifier.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setExperimentId(id: String): AnalyticsProvider = js.native
  /**
    * @summary Support Hybrid Mobile Applications.
    * @param {boolean} val If true, each account object will disable protocol checking and all injected scripts will use the HTTPS protocol.
    */
  def setHybridMobileSupport(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Set the default page event name.
    * @param {string} name The default page event name.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def setPageEvent(name: String): AnalyticsProvider = js.native
  /**
    * @summary Sets the regex to scrub location before sending to analytics.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    * @param {RegExp} regex The regex.
    */
  def setRemoveRegExp(regex: RegExp): AnalyticsProvider = js.native
  /**
    * @summary Starts the offline mode.
    * @param {boolean} val If true, the offline mode is started.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def startOffline(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Track all routes.
    * @param {boolean} val If true, all routes are tracked.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def trackPages(doTrack: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Sets the URL prefix.
    * @param {string} prefix The URL prefix.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def trackPrefix(prefix: String): AnalyticsProvider = js.native
  /**
    * @summary Track all URL query parameters.
    * @param {boolean} val If true, all URL query parameters are tracked.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def trackUrlParams(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Use Classic Analytics.
    * @param {boolean} val If true, use classic analytics.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def useAnalytics(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Use Cross Domain Linking.
    * @param {boolean} val If true, the cross-linked domains are registered with Google Analytics.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def useCrossDomainLinker(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Use Display Features.
    * @param {boolean} val If true, the display features module is loaded with Google Analytics.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def useDisplayFeatures(`val`: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Enable enhanced e-commerce module.
    * @param {boolean} val If true, the enhanced e-commerce module is enabled.
    * @param {boolean} enhanced If true, the "ec.js" file is used, otherwises, the "ecommerce.js" is used.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def useECommerce(`val`: Boolean, enhanced: Boolean): AnalyticsProvider = js.native
  /**
    * @summary Use Enhanced Link Attribution.
    * @param {boolean} val If true, the enhanced link attribution module is loaded with Google Analytics.
    * @return {angular.google.analytics.IAnalyticsProvider} The object instance.
    */
  def useEnhancedLinkAttribution(`val`: Boolean): AnalyticsProvider = js.native
}

