package typings.angularGoogleAnalytics

import org.scalablytyped.runtime.StringDictionary
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
@JSImport("angular", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object google extends js.Object {
    
    @js.native
    object analytics extends js.Object {
      
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
      
      /**
        * @summary Interface for {@link AnalyticsService}.
        * @interface
        */
      @js.native
      trait AnalyticsService extends js.Object {
        
        /**
          * @summary Manually create universal analytics (analytics.js) script tag
          */
        def createAnalyticsScriptTag(): Unit = js.native
        
        /**
          * @summary Manually create classic analytics (ga.js) script tag
          */
        def createScriptTag(): Unit = js.native
        
        /**
          * @summary Returns the current URL that would be sent if a `trackPage` call was made.
          * @return {string} The URL
          */
        def getUrl(): String = js.native
        
        /**
          * @summary If logging is enabled then all outbound calls are accessible via an in-memory array.
          * This is useful for troubleshooting and seeing the order of outbound calls with parameters.
          */
        var log: js.Array[js.Object] = js.native
        
        /**
          * @summary While in offline mode, no calls to the ga function or pushes to the gaq array are made.
          * This will queue all calls for later sending once offline mode is reset to false.
          */
        def offline(offlineMode: Boolean): Unit = js.native
        
        /**
          * @summary If in offline mode then all calls are queued to an in-memory array for future processing.
          * All calls queued to the offlineQueue are not outbound calls yet and hence do not show up in the log.
          */
        var offlineQueue: js.Array[js.Object] = js.native
        
        /**
          * @summary If delayScriptTag(true) was set during configuration then manual script tag injection is required. 
          * @return {boolean} True if scripts were registered.
          */
        def registerScriptTags(): Boolean = js.native
        
        /**
          * @summary If delayScriptTag(true) was set during configuration then manual tracker setup is required.
          * @return {boolean} True if trackers were registered.
          */
        def registerTrackers(): Boolean = js.native
        
        /**
          * @summary Allows for advanced configuration and definitions in univeral analytics only. This is a no-op when using classic analytics.
          */
        def set(key: String, value: js.Any): Unit = js.native
        def set(key: String, value: js.Any, accountName: String): Unit = js.native
        
        /**
          * @summary Create a new event
          */
        def trackEvent(category: String, action: String, label: String): Unit = js.native
        def trackEvent(
          category: String,
          action: String,
          label: String,
          value: js.UndefOr[scala.Nothing],
          nonInteractionFlag: js.UndefOr[scala.Nothing],
          dimensions: StringDictionary[js.Any]
        ): Unit = js.native
        def trackEvent(
          category: String,
          action: String,
          label: String,
          value: js.UndefOr[scala.Nothing],
          nonInteractionFlag: Boolean
        ): Unit = js.native
        def trackEvent(
          category: String,
          action: String,
          label: String,
          value: js.UndefOr[scala.Nothing],
          nonInteractionFlag: Boolean,
          dimensions: StringDictionary[js.Any]
        ): Unit = js.native
        def trackEvent(category: String, action: String, label: String, value: js.Any): Unit = js.native
        def trackEvent(
          category: String,
          action: String,
          label: String,
          value: js.Any,
          nonInteractionFlag: js.UndefOr[scala.Nothing],
          dimensions: StringDictionary[js.Any]
        ): Unit = js.native
        def trackEvent(category: String, action: String, label: String, value: js.Any, nonInteractionFlag: Boolean): Unit = js.native
        def trackEvent(
          category: String,
          action: String,
          label: String,
          value: js.Any,
          nonInteractionFlag: Boolean,
          dimensions: StringDictionary[js.Any]
        ): Unit = js.native
        
        def trackException(descrption: String, isFatal: Boolean): Unit = js.native
        
        /**
          * @summary Creates a new page view event
          * @param  {string} pageURL URL of page view
          * @param  {string} title Page Title
          * @param  {Object}  dimensions Additional dimensions and metrics
          */
        def trackPage(pageURL: String): Unit = js.native
        def trackPage(pageURL: String, title: js.UndefOr[scala.Nothing], dimensions: StringDictionary[js.Any]): Unit = js.native
        def trackPage(pageURL: String, title: String): Unit = js.native
        def trackPage(pageURL: String, title: String, dimensions: StringDictionary[js.Any]): Unit = js.native
      }
    }
  }
}
