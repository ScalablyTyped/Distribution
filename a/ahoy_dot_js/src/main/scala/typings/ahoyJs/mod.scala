package typings.ahoyJs

import typings.ahoyJs.anon.PartialConfig
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ahoy.js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("ahoy.js", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Modify Ahoy configuration. Must be called before ahoy.start() (or before DOMContentLoaded if startOnReady is set
      * to true).
      */
    inline def configure(options: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Enable or disable debug logging.
      *
      * @param [enabled=true]
      */
    inline def debug(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Boolean]
    inline def debug(enabled: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(enabled.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def getVisitId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitId")().asInstanceOf[String]
    
    inline def getVisitToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitToken")().asInstanceOf[String]
    
    inline def getVisitorId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorId")().asInstanceOf[String]
    
    inline def getVisitorToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorToken")().asInstanceOf[String]
    
    /** Call callback when Ahoy.js has been initialized. */
    inline def ready(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Force a new visit. */
    inline def reset(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Boolean]
    
    /** Initialize Ahoy.js if it has not yet been. */
    inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
    
    /** Send a single Ahoy tracking event. */
    inline def track(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def track(name: String, properties: EventProperties): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    /**
      * Track form control changes.
      * @deprecated trackChanges is deprecated and will be removed in 0.5.0
      */
    inline def trackChanges(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackChanges")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Track link and button clicks. */
    inline def trackClicks(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackClicks")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Track form submits. */
    inline def trackSubmits(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackSubmits")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /** Send a view event for the current page. */
    inline def trackView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackView")().asInstanceOf[Unit]
    inline def trackView(additionalProperties: EventProperties): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackView")(additionalProperties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def configure(options: PartialConfig): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("configure")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def debug(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")().asInstanceOf[Boolean]
  inline def debug(enabled: Boolean): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(enabled.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def getVisitId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitId")().asInstanceOf[String]
  
  inline def getVisitToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitToken")().asInstanceOf[String]
  
  inline def getVisitorId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorId")().asInstanceOf[String]
  
  inline def getVisitorToken(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getVisitorToken")().asInstanceOf[String]
  
  inline def ready(callback: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ready")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def reset(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Boolean]
  
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  inline def track(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def track(name: String, properties: EventProperties): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("track")(name.asInstanceOf[js.Any], properties.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def trackChanges(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackChanges")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackClicks(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackClicks")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackSubmits(selector: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackSubmits")(selector.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def trackView(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackView")().asInstanceOf[Unit]
  inline def trackView(additionalProperties: EventProperties): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackView")(additionalProperties.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait Config extends StObject {
    
    /** Domain of the generated cookies. */
    var cookieDomain: String | Null
    
    /** Use cookies to store visit and visitor IDs. */
    var cookies: Boolean
    
    /** @deprecated same as cookieDomain */
    var domain: js.UndefOr[String] = js.undefined
    
    var eventsUrl: String
    
    var headers: Record[String, String]
    
    var page: String | Null
    
    var platform: String
    
    /** Call ahoy.start() upon the document's DOMContentLoaded event. */
    var startOnReady: Boolean
    
    /** @deprecated same as useBeacon */
    var trackNow: js.UndefOr[Boolean] = js.undefined
    
    /** Send a visit to visitsUrl upon ahoy.start(). */
    var trackVisits: Boolean
    
    var urlPrefix: String
    
    /** Use navigator.sendBeacon to send events. */
    var useBeacon: Boolean
    
    /** Expiry of the visit cookie in minutes. */
    var visitDuration: Double
    
    var visitParams: Record[String, Any]
    
    /** Expiry of the visitor cookie in minutes. */
    var visitorDuration: Double
    
    var visitsUrl: String
    
    var withCredentials: Boolean
  }
  object Config {
    
    inline def apply(
      cookies: Boolean,
      eventsUrl: String,
      headers: Record[String, String],
      platform: String,
      startOnReady: Boolean,
      trackVisits: Boolean,
      urlPrefix: String,
      useBeacon: Boolean,
      visitDuration: Double,
      visitParams: Record[String, Any],
      visitorDuration: Double,
      visitsUrl: String,
      withCredentials: Boolean
    ): Config = {
      val __obj = js.Dynamic.literal(cookies = cookies.asInstanceOf[js.Any], eventsUrl = eventsUrl.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], startOnReady = startOnReady.asInstanceOf[js.Any], trackVisits = trackVisits.asInstanceOf[js.Any], urlPrefix = urlPrefix.asInstanceOf[js.Any], useBeacon = useBeacon.asInstanceOf[js.Any], visitDuration = visitDuration.asInstanceOf[js.Any], visitParams = visitParams.asInstanceOf[js.Any], visitorDuration = visitorDuration.asInstanceOf[js.Any], visitsUrl = visitsUrl.asInstanceOf[js.Any], withCredentials = withCredentials.asInstanceOf[js.Any], cookieDomain = null, page = null)
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainNull: Self = StObject.set(x, "cookieDomain", null)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventsUrl(value: String): Self = StObject.set(x, "eventsUrl", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageNull: Self = StObject.set(x, "page", null)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setStartOnReady(value: Boolean): Self = StObject.set(x, "startOnReady", value.asInstanceOf[js.Any])
      
      inline def setTrackNow(value: Boolean): Self = StObject.set(x, "trackNow", value.asInstanceOf[js.Any])
      
      inline def setTrackNowUndefined: Self = StObject.set(x, "trackNow", js.undefined)
      
      inline def setTrackVisits(value: Boolean): Self = StObject.set(x, "trackVisits", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUseBeacon(value: Boolean): Self = StObject.set(x, "useBeacon", value.asInstanceOf[js.Any])
      
      inline def setVisitDuration(value: Double): Self = StObject.set(x, "visitDuration", value.asInstanceOf[js.Any])
      
      inline def setVisitParams(value: Record[String, Any]): Self = StObject.set(x, "visitParams", value.asInstanceOf[js.Any])
      
      inline def setVisitorDuration(value: Double): Self = StObject.set(x, "visitorDuration", value.asInstanceOf[js.Any])
      
      inline def setVisitsUrl(value: String): Self = StObject.set(x, "visitsUrl", value.asInstanceOf[js.Any])
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    }
  }
  
  type EventProperties = Record[String, Any]
}
