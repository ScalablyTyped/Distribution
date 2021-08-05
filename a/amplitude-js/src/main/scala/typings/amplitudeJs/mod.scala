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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amplitude-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    def init(apiKey: String, userId: String): Unit = js.native
    def init(apiKey: String, userId: String, config: Unit, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    def init(apiKey: String, userId: String, config: Config): Unit = js.native
    def init(
      apiKey: String,
      userId: String,
      config: Config,
      callback: js.Function1[/* client */ this.type, Unit]
    ): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Unit, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Config): Unit = js.native
    def init(apiKey: String, userId: Unit, config: Config, callback: js.Function1[/* client */ this.type, Unit]): Unit = js.native
    
    def isNewSession(): Boolean = js.native
    
    def logEvent(event: String): LogReturn = js.native
    def logEvent(event: String, data: js.Any): LogReturn = js.native
    def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = js.native
    def logEvent(event: String, data: Unit, callback: Callback): LogReturn = js.native
    
    def logEventWithGroups(event: String): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = js.native
    def logEventWithGroups(event: String, data: js.Any, groups: Unit, callback: Callback): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: js.Any): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: js.Any, callback: Callback): LogReturn = js.native
    def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback): LogReturn = js.native
    
    def logEventWithTimestamp(event: String): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: js.Any, timestamp: Unit, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback): LogReturn = js.native
    def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback): LogReturn = js.native
    
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
    def append(key: String, value: js.Array[js.Any]): Identify_ = js.native
    def append(key: String, value: js.Object): Identify_ = js.native
    /** Append a value or values to a user property */
    def append(key: String, value: Double): Identify_ = js.native
    
    def prepend(key: String, value: String): Identify_ = js.native
    def prepend(key: String, value: js.Array[js.Any]): Identify_ = js.native
    def prepend(key: String, value: js.Object): Identify_ = js.native
    /** Prepend a value or values to a user property */
    def prepend(key: String, value: Boolean): Identify_ = js.native
    def prepend(key: String, value: Double): Identify_ = js.native
    
    def set(key: String, value: String): Identify_ = js.native
    def set(key: String, value: js.Array[js.Any]): Identify_ = js.native
    def set(key: String, value: js.Object): Identify_ = js.native
    /** Sets the value of a given user property */
    def set(key: String, value: Boolean): Identify_ = js.native
    def set(key: String, value: Double): Identify_ = js.native
    
    def setOnce(key: String, value: String): Identify_ = js.native
    def setOnce(key: String, value: js.Array[js.Any]): Identify_ = js.native
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
  
  inline def clearUserProperties(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearUserProperties")().asInstanceOf[Unit]
  
  inline def getInstance(): AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[AmplitudeClient]
  inline def getInstance(instanceName: String): AmplitudeClient = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(instanceName.asInstanceOf[js.Any]).asInstanceOf[AmplitudeClient]
  
  inline def getSessionId(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getSessionId")().asInstanceOf[Double]
  
  inline def identify(identify: Identify_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def identify(identify: Identify_, callback: Callback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("identify")(identify.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def init(apiKey: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: String,
    options: Unit,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: String, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: String,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: Unit,
    options: Unit,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(apiKey: String, userId: Unit, options: Config): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def init(
    apiKey: String,
    userId: Unit,
    options: Config,
    callback: js.Function1[/* client */ AmplitudeClient, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("init")(apiKey.asInstanceOf[js.Any], userId.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isNewSession(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNewSession")().asInstanceOf[Boolean]
  
  inline def logEvent(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEvent(event: String, data: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEvent")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logEventWithGroups(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: js.Any, groups: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: js.Any, groups: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: js.Any, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: js.Any, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithGroups(event: String, data: Unit, groups: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithGroups")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], groups.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logEventWithTimestamp(event: String): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: js.Any): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: js.Any, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Double, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  inline def logEventWithTimestamp(event: String, data: Unit, timestamp: Unit, callback: Callback): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logEventWithTimestamp")(event.asInstanceOf[js.Any], data.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logRevenue(pric: Double, quantity: Double, product: String): LogReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("logRevenue")(pric.asInstanceOf[js.Any], quantity.asInstanceOf[js.Any], product.asInstanceOf[js.Any])).asInstanceOf[LogReturn]
  
  inline def logRevenueV2(revenue_obj: Revenue): LogReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("logRevenueV2")(revenue_obj.asInstanceOf[js.Any]).asInstanceOf[LogReturn]
  
  @JSImport("amplitude-js", "options")
  @js.native
  val options: Config = js.native
  
  inline def regenerateDeviceId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("regenerateDeviceId")().asInstanceOf[Unit]
  
  inline def setDeviceId(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDeviceId")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setDomain(domain: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDomain")(domain.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGlobalUserProperties(properties: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGlobalUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setGroup(groupType: String, groupName: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def setGroup(groupType: String, groupName: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setGroup")(groupType.asInstanceOf[js.Any], groupName.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setOptOut(optOut: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setOptOut")(optOut.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserId(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")().asInstanceOf[Unit]
  inline def setUserId(userId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserId")(userId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setUserProperties(properties: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setUserProperties")(properties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setVersionName(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVersionName")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type Callback = js.Function3[
    /* responseCode */ Double, 
    /* responseBody */ String, 
    /* details */ js.UndefOr[Reason], 
    Unit
  ]
  
  trait Config extends StObject {
    
    var apiEndpoint: js.UndefOr[String] = js.undefined
    
    var batchEvents: js.UndefOr[Boolean] = js.undefined
    
    var cookieExpiration: js.UndefOr[Double] = js.undefined
    
    var cookieForceUpgrade: js.UndefOr[Boolean] = js.undefined
    
    var cookieName: js.UndefOr[String] = js.undefined
    
    var deferInitialization: js.UndefOr[Boolean] = js.undefined
    
    var deviceId: js.UndefOr[String] = js.undefined
    
    var deviceIdFromUrlParam: js.UndefOr[Boolean] = js.undefined
    
    var disableCookies: js.UndefOr[Boolean] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var eventUploadPeriodMillis: js.UndefOr[Double] = js.undefined
    
    var eventUploadThreshold: js.UndefOr[Double] = js.undefined
    
    var forceHttps: js.UndefOr[Boolean] = js.undefined
    
    var includeGclid: js.UndefOr[Boolean] = js.undefined
    
    var includeReferrer: js.UndefOr[Boolean] = js.undefined
    
    var includeUtm: js.UndefOr[Boolean] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var logLevel: js.UndefOr[DISABLE | ERROR | WARN | INFO] = js.undefined
    
    var onError: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var optOut: js.UndefOr[Boolean] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var sameSiteCookie: js.UndefOr[Lax | Strict | None] = js.undefined
    
    var saveEvents: js.UndefOr[Boolean] = js.undefined
    
    var saveParamsReferrerOncePerSession: js.UndefOr[Boolean] = js.undefined
    
    var savedMaxCount: js.UndefOr[Double] = js.undefined
    
    var secureCookie: js.UndefOr[Boolean] = js.undefined
    
    var sessionTimeout: js.UndefOr[Double] = js.undefined
    
    var trackingOptions: js.UndefOr[Carrier] = js.undefined
    
    var unsentIdentifyKey: js.UndefOr[String] = js.undefined
    
    var unsentKey: js.UndefOr[String] = js.undefined
    
    var unsetParamsReferrerOnNewSession: js.UndefOr[Boolean] = js.undefined
    
    var uploadBatchSize: js.UndefOr[Double] = js.undefined
    
    var useNativeDeviceInfo: js.UndefOr[Boolean] = js.undefined
    
    var userId: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setApiEndpoint(value: String): Self = StObject.set(x, "apiEndpoint", value.asInstanceOf[js.Any])
      
      inline def setApiEndpointUndefined: Self = StObject.set(x, "apiEndpoint", js.undefined)
      
      inline def setBatchEvents(value: Boolean): Self = StObject.set(x, "batchEvents", value.asInstanceOf[js.Any])
      
      inline def setBatchEventsUndefined: Self = StObject.set(x, "batchEvents", js.undefined)
      
      inline def setCookieExpiration(value: Double): Self = StObject.set(x, "cookieExpiration", value.asInstanceOf[js.Any])
      
      inline def setCookieExpirationUndefined: Self = StObject.set(x, "cookieExpiration", js.undefined)
      
      inline def setCookieForceUpgrade(value: Boolean): Self = StObject.set(x, "cookieForceUpgrade", value.asInstanceOf[js.Any])
      
      inline def setCookieForceUpgradeUndefined: Self = StObject.set(x, "cookieForceUpgrade", js.undefined)
      
      inline def setCookieName(value: String): Self = StObject.set(x, "cookieName", value.asInstanceOf[js.Any])
      
      inline def setCookieNameUndefined: Self = StObject.set(x, "cookieName", js.undefined)
      
      inline def setDeferInitialization(value: Boolean): Self = StObject.set(x, "deferInitialization", value.asInstanceOf[js.Any])
      
      inline def setDeferInitializationUndefined: Self = StObject.set(x, "deferInitialization", js.undefined)
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdFromUrlParam(value: Boolean): Self = StObject.set(x, "deviceIdFromUrlParam", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdFromUrlParamUndefined: Self = StObject.set(x, "deviceIdFromUrlParam", js.undefined)
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setDisableCookies(value: Boolean): Self = StObject.set(x, "disableCookies", value.asInstanceOf[js.Any])
      
      inline def setDisableCookiesUndefined: Self = StObject.set(x, "disableCookies", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventUploadPeriodMillis(value: Double): Self = StObject.set(x, "eventUploadPeriodMillis", value.asInstanceOf[js.Any])
      
      inline def setEventUploadPeriodMillisUndefined: Self = StObject.set(x, "eventUploadPeriodMillis", js.undefined)
      
      inline def setEventUploadThreshold(value: Double): Self = StObject.set(x, "eventUploadThreshold", value.asInstanceOf[js.Any])
      
      inline def setEventUploadThresholdUndefined: Self = StObject.set(x, "eventUploadThreshold", js.undefined)
      
      inline def setForceHttps(value: Boolean): Self = StObject.set(x, "forceHttps", value.asInstanceOf[js.Any])
      
      inline def setForceHttpsUndefined: Self = StObject.set(x, "forceHttps", js.undefined)
      
      inline def setIncludeGclid(value: Boolean): Self = StObject.set(x, "includeGclid", value.asInstanceOf[js.Any])
      
      inline def setIncludeGclidUndefined: Self = StObject.set(x, "includeGclid", js.undefined)
      
      inline def setIncludeReferrer(value: Boolean): Self = StObject.set(x, "includeReferrer", value.asInstanceOf[js.Any])
      
      inline def setIncludeReferrerUndefined: Self = StObject.set(x, "includeReferrer", js.undefined)
      
      inline def setIncludeUtm(value: Boolean): Self = StObject.set(x, "includeUtm", value.asInstanceOf[js.Any])
      
      inline def setIncludeUtmUndefined: Self = StObject.set(x, "includeUtm", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLogLevel(value: DISABLE | ERROR | WARN | INFO): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
      
      inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
      
      inline def setOnError(value: () => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction0(value))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOptOut(value: Boolean): Self = StObject.set(x, "optOut", value.asInstanceOf[js.Any])
      
      inline def setOptOutUndefined: Self = StObject.set(x, "optOut", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setSameSiteCookie(value: Lax | Strict | None): Self = StObject.set(x, "sameSiteCookie", value.asInstanceOf[js.Any])
      
      inline def setSameSiteCookieUndefined: Self = StObject.set(x, "sameSiteCookie", js.undefined)
      
      inline def setSaveEvents(value: Boolean): Self = StObject.set(x, "saveEvents", value.asInstanceOf[js.Any])
      
      inline def setSaveEventsUndefined: Self = StObject.set(x, "saveEvents", js.undefined)
      
      inline def setSaveParamsReferrerOncePerSession(value: Boolean): Self = StObject.set(x, "saveParamsReferrerOncePerSession", value.asInstanceOf[js.Any])
      
      inline def setSaveParamsReferrerOncePerSessionUndefined: Self = StObject.set(x, "saveParamsReferrerOncePerSession", js.undefined)
      
      inline def setSavedMaxCount(value: Double): Self = StObject.set(x, "savedMaxCount", value.asInstanceOf[js.Any])
      
      inline def setSavedMaxCountUndefined: Self = StObject.set(x, "savedMaxCount", js.undefined)
      
      inline def setSecureCookie(value: Boolean): Self = StObject.set(x, "secureCookie", value.asInstanceOf[js.Any])
      
      inline def setSecureCookieUndefined: Self = StObject.set(x, "secureCookie", js.undefined)
      
      inline def setSessionTimeout(value: Double): Self = StObject.set(x, "sessionTimeout", value.asInstanceOf[js.Any])
      
      inline def setSessionTimeoutUndefined: Self = StObject.set(x, "sessionTimeout", js.undefined)
      
      inline def setTrackingOptions(value: Carrier): Self = StObject.set(x, "trackingOptions", value.asInstanceOf[js.Any])
      
      inline def setTrackingOptionsUndefined: Self = StObject.set(x, "trackingOptions", js.undefined)
      
      inline def setUnsentIdentifyKey(value: String): Self = StObject.set(x, "unsentIdentifyKey", value.asInstanceOf[js.Any])
      
      inline def setUnsentIdentifyKeyUndefined: Self = StObject.set(x, "unsentIdentifyKey", js.undefined)
      
      inline def setUnsentKey(value: String): Self = StObject.set(x, "unsentKey", value.asInstanceOf[js.Any])
      
      inline def setUnsentKeyUndefined: Self = StObject.set(x, "unsentKey", js.undefined)
      
      inline def setUnsetParamsReferrerOnNewSession(value: Boolean): Self = StObject.set(x, "unsetParamsReferrerOnNewSession", value.asInstanceOf[js.Any])
      
      inline def setUnsetParamsReferrerOnNewSessionUndefined: Self = StObject.set(x, "unsetParamsReferrerOnNewSession", js.undefined)
      
      inline def setUploadBatchSize(value: Double): Self = StObject.set(x, "uploadBatchSize", value.asInstanceOf[js.Any])
      
      inline def setUploadBatchSizeUndefined: Self = StObject.set(x, "uploadBatchSize", js.undefined)
      
      inline def setUseNativeDeviceInfo(value: Boolean): Self = StObject.set(x, "useNativeDeviceInfo", value.asInstanceOf[js.Any])
      
      inline def setUseNativeDeviceInfoUndefined: Self = StObject.set(x, "useNativeDeviceInfo", js.undefined)
      
      inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  type LogReturn = js.UndefOr[Double]
}
