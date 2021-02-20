package typings.amplitudeJs

import org.scalablytyped.runtime.Instantiable0
import typings.amplitudeJs.amplitudeJsStrings.DISABLE
import typings.amplitudeJs.amplitudeJsStrings.ERROR
import typings.amplitudeJs.amplitudeJsStrings.INFO
import typings.amplitudeJs.amplitudeJsStrings.Lax
import typings.amplitudeJs.amplitudeJsStrings.None
import typings.amplitudeJs.amplitudeJsStrings.Strict
import typings.amplitudeJs.amplitudeJsStrings.WARN
import typings.amplitudeJs.anon.Carrier
import typings.amplitudeJs.anon.Reason
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amplitude-js", "AmplitudeClient")
  @js.native
  class AmplitudeClient () extends StObject {
    def this(instanceName: String) = this()
    
    var Identify: Instantiable0[Identify_] = js.native
    
    var Revenue: Instantiable0[typings.amplitudeJs.mod.Revenue] = js.native
    
    def clearUserProperties(): Unit = js.native
    
    def getSessionId(): Double = js.native
    
    def identify(identify_obj: Identify_): Unit = js.native
    def identify(identify_obj: Identify_, opt_callback: Callback): Unit = js.native
    
    def init(apiKey: String): Unit = js.native
    def init(
      apiKey: String,
      userId: js.UndefOr[scala.Nothing],
      config: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: js.UndefOr[scala.Nothing], config: Config): Unit = js.native
    def init(
      apiKey: String,
      userId: js.UndefOr[scala.Nothing],
      config: Config,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: String): Unit = js.native
    def init(
      apiKey: String,
      userId: String,
      config: js.UndefOr[scala.Nothing],
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: String, config: Config): Unit = js.native
    def init(
      apiKey: String,
      userId: String,
      config: Config,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    
    def isNewSession(): Boolean = js.native
    
    def logEvent(event: String): LogReturn = js.native
    def logEvent(event: String, data: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
    def logEvent(event: String, data: js.Any): LogReturn = js.native
    def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = js.native
    
    def logEventWithGroups(event: String): LogReturn = js.native
    def logEventWithGroups(
      event: String,
      data: js.UndefOr[scala.Nothing],
      groups: js.UndefOr[scala.Nothing],
      callback: Callback
    ): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any, callback: Callback): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
    
    def logEventWithTimestamp(event: String): LogReturn = js.native
    def logEventWithTimestamp(
      event: String,
      data: js.UndefOr[scala.Nothing],
      timestamp: js.UndefOr[scala.Nothing],
      callback: Callback
    ): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = js.native
    
    def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = js.native
    
    def logRevenueV2(revenue_obj: Revenue): LogReturn = js.native
    
    var options: Config = js.native
    
    def regenerateDeviceId(): Unit = js.native
    
    def setDeviceId(id: String): Unit = js.native
    
    def setDomain(domain: String): Unit = js.native
    
    def setGlobalUserProperties(properties: js.Any): Unit = js.native
    
    def setGroup(groupType: String, groupName: String): Unit = js.native
    def setGroup(groupType: String, groupName: js.Array[String]): Unit = js.native
    
    def setOptOut(enable: Boolean): Unit = js.native
    
    def setSessionId(sessionId: Double): Unit = js.native
    
    def setUserId(): Unit = js.native
    def setUserId(userId: String): Unit = js.native
    
    def setUserProperties(properties: js.Any): Unit = js.native
    
    def setVersionName(versionName: String): Unit = js.native
  }
  
  @JSImport("amplitude-js", "Identify")
  @js.native
  class Identify_ () extends StObject {
    
    def add(key: String, value: String): Identify_ = js.native
    /** increment a user property by a given value (can also be negative to decrement). */
    def add(key: String, value: Double): Identify_ = js.native
    
    def append(key: String, value: String): Identify_ = js.native
    def append(key: String, value: js.Array[_]): Identify_ = js.native
    def append(key: String, value: js.Object): Identify_ = js.native
    /** Append a value or values to a user property */
    def append(key: String, value: Double): Identify_ = js.native
    
    def prepend(key: String, value: String): Identify_ = js.native
    def prepend(key: String, value: js.Array[_]): Identify_ = js.native
    def prepend(key: String, value: js.Object): Identify_ = js.native
    /** Prepend a value or values to a user property */
    def prepend(key: String, value: Boolean): Identify_ = js.native
    def prepend(key: String, value: Double): Identify_ = js.native
    
    def set(key: String, value: String): Identify_ = js.native
    def set(key: String, value: js.Array[_]): Identify_ = js.native
    def set(key: String, value: js.Object): Identify_ = js.native
    /** Sets the value of a given user property */
    def set(key: String, value: Boolean): Identify_ = js.native
    def set(key: String, value: Double): Identify_ = js.native
    
    def setOnce(key: String, value: String): Identify_ = js.native
    def setOnce(key: String, value: js.Array[_]): Identify_ = js.native
    def setOnce(key: String, value: js.Object): Identify_ = js.native
    /** Sets the value of a given user property only once */
    def setOnce(key: String, value: Boolean): Identify_ = js.native
    def setOnce(key: String, value: Double): Identify_ = js.native
    
    /** Unset and remove a user property */
    def unset(key: String): Identify_ = js.native
  }
  
  @JSImport("amplitude-js", "Revenue")
  @js.native
  class Revenue () extends StObject {
    
    def setEventProperties(eventProperties: js.Any): Revenue = js.native
    
    def setPrice(price: Double): Revenue = js.native
    
    def setProductId(productId: String): Revenue = js.native
    
    def setQuantity(quantity: Double): Revenue = js.native
    
    def setRevenueType(revenueType: String): Revenue = js.native
  }
  
  @JSImport("amplitude-js", "__VERSION__")
  @js.native
  val __VERSION__ : String = js.native
  
  @JSImport("amplitude-js", "clearUserProperties")
  @js.native
  def clearUserProperties(): Unit = js.native
  
  @JSImport("amplitude-js", "getInstance")
  @js.native
  def getInstance(): AmplitudeClient = js.native
  @JSImport("amplitude-js", "getInstance")
  @js.native
  def getInstance(instanceName: String): AmplitudeClient = js.native
  
  @JSImport("amplitude-js", "getSessionId")
  @js.native
  def getSessionId(): Double = js.native
  
  @JSImport("amplitude-js", "identify")
  @js.native
  def identify(identify: Identify_): Unit = js.native
  @JSImport("amplitude-js", "identify")
  @js.native
  def identify(identify: Identify_, callback: Callback): Unit = js.native
  
  @JSImport("amplitude-js", "init")
  @js.native
  def init(apiKey: String): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(
    apiKey: String,
    userId: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(apiKey: String, userId: js.UndefOr[scala.Nothing], options: Config): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(
    apiKey: String,
    userId: js.UndefOr[scala.Nothing],
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(apiKey: String, userId: String): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(
    apiKey: String,
    userId: String,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(apiKey: String, userId: String, options: Config): Unit = js.native
  @JSImport("amplitude-js", "init")
  @js.native
  def init(
    apiKey: String,
    userId: String,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = js.native
  
  @JSImport("amplitude-js", "isNewSession")
  @js.native
  def isNewSession(): Boolean = js.native
  
  @JSImport("amplitude-js", "logEvent")
  @js.native
  def logEvent(event: String): LogReturn = js.native
  @JSImport("amplitude-js", "logEvent")
  @js.native
  def logEvent(event: String, data: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
  @JSImport("amplitude-js", "logEvent")
  @js.native
  def logEvent(event: String, data: js.Any): LogReturn = js.native
  @JSImport("amplitude-js", "logEvent")
  @js.native
  def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = js.native
  
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(
    event: String,
    data: js.UndefOr[scala.Nothing],
    groups: js.UndefOr[scala.Nothing],
    callback: Callback
  ): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.UndefOr[scala.Nothing], groups: js.Any, callback: Callback): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.Any): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.Any, groups: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithGroups")
  @js.native
  def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
  
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(
    event: String,
    data: js.UndefOr[scala.Nothing],
    timestamp: js.UndefOr[scala.Nothing],
    callback: Callback
  ): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.UndefOr[scala.Nothing], timestamp: Double, callback: Callback): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.Any): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.Any, timestamp: js.UndefOr[scala.Nothing], callback: Callback): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = js.native
  @JSImport("amplitude-js", "logEventWithTimestamp")
  @js.native
  def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = js.native
  
  @JSImport("amplitude-js", "logRevenue")
  @js.native
  def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = js.native
  
  @JSImport("amplitude-js", "logRevenueV2")
  @js.native
  def logRevenueV2(revenue_obj: Revenue): LogReturn = js.native
  
  @JSImport("amplitude-js", "options")
  @js.native
  val options: Config = js.native
  
  @JSImport("amplitude-js", "regenerateDeviceId")
  @js.native
  def regenerateDeviceId(): Unit = js.native
  
  @JSImport("amplitude-js", "setDeviceId")
  @js.native
  def setDeviceId(id: String): Unit = js.native
  
  @JSImport("amplitude-js", "setDomain")
  @js.native
  def setDomain(domain: String): Unit = js.native
  
  @JSImport("amplitude-js", "setGlobalUserProperties")
  @js.native
  def setGlobalUserProperties(properties: js.Any): Unit = js.native
  
  @JSImport("amplitude-js", "setGroup")
  @js.native
  def setGroup(groupType: String, groupName: String): Unit = js.native
  @JSImport("amplitude-js", "setGroup")
  @js.native
  def setGroup(groupType: String, groupName: js.Array[String]): Unit = js.native
  
  @JSImport("amplitude-js", "setOptOut")
  @js.native
  def setOptOut(optOut: Boolean): Unit = js.native
  
  @JSImport("amplitude-js", "setUserId")
  @js.native
  def setUserId(): Unit = js.native
  @JSImport("amplitude-js", "setUserId")
  @js.native
  def setUserId(userId: String): Unit = js.native
  
  @JSImport("amplitude-js", "setUserProperties")
  @js.native
  def setUserProperties(properties: js.Any): Unit = js.native
  
  @JSImport("amplitude-js", "setVersionName")
  @js.native
  def setVersionName(version: String): Unit = js.native
  
  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Reason], 
    Unit
  ]
  
  @js.native
  trait Config extends StObject {
    
    var apiEndpoint: js.UndefOr[String] = js.native
    
    var batchEvents: js.UndefOr[Boolean] = js.native
    
    var cookieExpiration: js.UndefOr[Double] = js.native
    
    var cookieForceUpgrade: js.UndefOr[Boolean] = js.native
    
    var cookieName: js.UndefOr[String] = js.native
    
    var deferInitialization: js.UndefOr[Boolean] = js.native
    
    var deviceId: js.UndefOr[String] = js.native
    
    var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.native
    
    var disableCookies: js.UndefOr[Boolean] = js.native
    
    var domain: js.UndefOr[String] = js.native
    
    var eventUploadPeriodMillis: js.UndefOr[Double] = js.native
    
    var eventUploadThreshold: js.UndefOr[Double] = js.native
    
    var forceHttps: js.UndefOr[Boolean] = js.native
    
    var includeGclid: js.UndefOr[Boolean] = js.native
    
    var includeReferrer: js.UndefOr[Boolean] = js.native
    
    var includeUtm: js.UndefOr[Boolean] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.native
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.native
    
    var optOut: js.UndefOr[Boolean] = js.native
    
    var platform: js.UndefOr[String] = js.native
    
    var sameSiteCookie: js.UndefOr[Lax | Strict | None] = js.native
    
    var saveEvents: js.UndefOr[Boolean] = js.native
    
    var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.native
    
    var savedMaxCount: js.UndefOr[Double] = js.native
    
    var secureCookie: js.UndefOr[Boolean] = js.native
    
    var sessionTimeout: js.UndefOr[Double] = js.native
    
    var trackingOptions: js.UndefOr[Carrier] = js.native
    
    var unsentIdentifyKey: js.UndefOr[String] = js.native
    
    var unsentKey: js.UndefOr[String] = js.native
    
    var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.native
    
    var uploadBatchSize: js.UndefOr[Double] = js.native
    
    var useNativeDeviceInfo: js.UndefOr[Boolean] = js.native
    
    var userId: js.UndefOr[String] = js.native
  }
  object Config {
    
    @scala.inline
    def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      @scala.inline
      def setBatchEvents(value: Boolean): Self = StObject.set(x, "batchEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchEventsUndefined: Self = StObject.set(x, "batchEvents", js.undefined)
      
      @scala.inline
      def setCookieExpiration(value: Double): Self = StObject.set(x, "cookieExpiration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieExpirationUndefined: Self = StObject.set(x, "cookieExpiration", js.undefined)
      
      @scala.inline
      def setCookieForceUpgrade(value: Boolean): Self = StObject.set(x, "cookieForceUpgrade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieForceUpgradeUndefined: Self = StObject.set(x, "cookieForceUpgrade", js.undefined)
      
      @scala.inline
      def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      @scala.inline
      def setDeferInitialization(value: Boolean): Self = StObject.set(x, "deferInitialization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferInitializationUndefined: Self = StObject.set(x, "deferInitialization", js.undefined)
      
      @scala.inline
      def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdFromUrlParam(value: Boolean): Self = StObject.set(x, "deviceIdFromUrlParam", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceIdFromUrlParamUndefined: Self = StObject.set(x, "deviceIdFromUrlParam", js.undefined)
      
      @scala.inline
      def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      @scala.inline
      def setDisableCookies(value: Boolean): Self = StObject.set(x, "disableCookies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableCookiesUndefined: Self = StObject.set(x, "disableCookies", js.undefined)
      
      @scala.inline
      def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      @scala.inline
      def setEventUploadPeriodMillis(value: Double): Self = StObject.set(x, "eventUploadPeriodMillis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUploadPeriodMillisUndefined: Self = StObject.set(x, "eventUploadPeriodMillis", js.undefined)
      
      @scala.inline
      def setEventUploadThreshold(value: Double): Self = StObject.set(x, "eventUploadThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUploadThresholdUndefined: Self = StObject.set(x, "eventUploadThreshold", js.undefined)
      
      @scala.inline
      def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      @scala.inline
      def setIncludeGclid(value: Boolean): Self = StObject.set(x, "includeGclid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGclidUndefined: Self = StObject.set(x, "includeGclid", js.undefined)
      
      @scala.inline
      def setIncludeReferrer(value: Boolean): Self = StObject.set(x, "includeReferrer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeReferrerUndefined: Self = StObject.set(x, "includeReferrer", js.undefined)
      
      @scala.inline
      def setIncludeUtm(value: Boolean): Self = StObject.set(x, "includeUtm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeUtmUndefined: Self = StObject.set(x, "includeUtm", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLogLevel(value: DISABLE | ERROR | WARN | INFO): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      @scala.inline
      def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptOutUndefined: Self = StObject.set(x, "optOut", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setSameSiteCookie(value: Lax | Strict | None): Self = StObject.set(x, "sameSiteCookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSameSiteCookieUndefined: Self = StObject.set(x, "sameSiteCookie", js.undefined)
      
      @scala.inline
      def setSaveEvents(value: Boolean): Self = StObject.set(x, "saveEvents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveEventsUndefined: Self = StObject.set(x, "saveEvents", js.undefined)
      
      @scala.inline
      def setSaveParamsReferrerOncePerSession(value: Boolean): Self = StObject.set(x, "saveParamsReferrerOncePerSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaveParamsReferrerOncePerSessionUndefined: Self = StObject.set(x, "saveParamsReferrerOncePerSession", js.undefined)
      
      @scala.inline
      def setSavedMaxCount(value: Double): Self = StObject.set(x, "savedMaxCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSavedMaxCountUndefined: Self = StObject.set(x, "savedMaxCount", js.undefined)
      
      @scala.inline
      def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
      
      @scala.inline
      def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      @scala.inline
      def setTrackingOptions(value: Carrier): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
      
      @scala.inline
      def setUnsentIdentifyKey(value: String): Self = StObject.set(x, "unsentIdentifyKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsentIdentifyKeyUndefined: Self = StObject.set(x, "unsentIdentifyKey", js.undefined)
      
      @scala.inline
      def setUnsentKey(value: String): Self = StObject.set(x, "unsentKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsentKeyUndefined: Self = StObject.set(x, "unsentKey", js.undefined)
      
      @scala.inline
      def setUnsetParamsReferrerOnNewSession(value: Boolean): Self = StObject.set(x, "unsetParamsReferrerOnNewSession", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsetParamsReferrerOnNewSessionUndefined: Self = StObject.set(x, "unsetParamsReferrerOnNewSession", js.undefined)
      
      @scala.inline
      def setUploadBatchSize(value: Double): Self = StObject.set(x, "uploadBatchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUploadBatchSizeUndefined: Self = StObject.set(x, "uploadBatchSize", js.undefined)
      
      @scala.inline
      def setUseNativeDeviceInfo(value: Boolean): Self = StObject.set(x, "useNativeDeviceInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeDeviceInfoUndefined: Self = StObject.set(x, "useNativeDeviceInfo", js.undefined)
      
      @scala.inline
      def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  type LogReturn = js.UndefOr[Double]
}
