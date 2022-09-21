package typings.ahoyJs

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<ahoy.js.ahoy.js.Config> */
  trait PartialConfig extends StObject {
    
    var cookieDomain: js.UndefOr[String | Null] = js.undefined
    
    var cookies: js.UndefOr[Boolean] = js.undefined
    
    var domain: js.UndefOr[String] = js.undefined
    
    var eventsUrl: js.UndefOr[String] = js.undefined
    
    var headers: js.UndefOr[Record[String, String]] = js.undefined
    
    var page: js.UndefOr[String | Null] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var startOnReady: js.UndefOr[Boolean] = js.undefined
    
    var trackNow: js.UndefOr[Boolean] = js.undefined
    
    var trackVisits: js.UndefOr[Boolean] = js.undefined
    
    var urlPrefix: js.UndefOr[String] = js.undefined
    
    var useBeacon: js.UndefOr[Boolean] = js.undefined
    
    var visitDuration: js.UndefOr[Double] = js.undefined
    
    var visitParams: js.UndefOr[Record[String, Any]] = js.undefined
    
    var visitorDuration: js.UndefOr[Double] = js.undefined
    
    var visitsUrl: js.UndefOr[String] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setCookieDomain(value: String): Self = StObject.set(x, "cookieDomain", value.asInstanceOf[js.Any])
      
      inline def setCookieDomainNull: Self = StObject.set(x, "cookieDomain", null)
      
      inline def setCookieDomainUndefined: Self = StObject.set(x, "cookieDomain", js.undefined)
      
      inline def setCookies(value: Boolean): Self = StObject.set(x, "cookies", value.asInstanceOf[js.Any])
      
      inline def setCookiesUndefined: Self = StObject.set(x, "cookies", js.undefined)
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setEventsUrl(value: String): Self = StObject.set(x, "eventsUrl", value.asInstanceOf[js.Any])
      
      inline def setEventsUrlUndefined: Self = StObject.set(x, "eventsUrl", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setPage(value: String): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      inline def setPageNull: Self = StObject.set(x, "page", null)
      
      inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setStartOnReady(value: Boolean): Self = StObject.set(x, "startOnReady", value.asInstanceOf[js.Any])
      
      inline def setStartOnReadyUndefined: Self = StObject.set(x, "startOnReady", js.undefined)
      
      inline def setTrackNow(value: Boolean): Self = StObject.set(x, "trackNow", value.asInstanceOf[js.Any])
      
      inline def setTrackNowUndefined: Self = StObject.set(x, "trackNow", js.undefined)
      
      inline def setTrackVisits(value: Boolean): Self = StObject.set(x, "trackVisits", value.asInstanceOf[js.Any])
      
      inline def setTrackVisitsUndefined: Self = StObject.set(x, "trackVisits", js.undefined)
      
      inline def setUrlPrefix(value: String): Self = StObject.set(x, "urlPrefix", value.asInstanceOf[js.Any])
      
      inline def setUrlPrefixUndefined: Self = StObject.set(x, "urlPrefix", js.undefined)
      
      inline def setUseBeacon(value: Boolean): Self = StObject.set(x, "useBeacon", value.asInstanceOf[js.Any])
      
      inline def setUseBeaconUndefined: Self = StObject.set(x, "useBeacon", js.undefined)
      
      inline def setVisitDuration(value: Double): Self = StObject.set(x, "visitDuration", value.asInstanceOf[js.Any])
      
      inline def setVisitDurationUndefined: Self = StObject.set(x, "visitDuration", js.undefined)
      
      inline def setVisitParams(value: Record[String, Any]): Self = StObject.set(x, "visitParams", value.asInstanceOf[js.Any])
      
      inline def setVisitParamsUndefined: Self = StObject.set(x, "visitParams", js.undefined)
      
      inline def setVisitorDuration(value: Double): Self = StObject.set(x, "visitorDuration", value.asInstanceOf[js.Any])
      
      inline def setVisitorDurationUndefined: Self = StObject.set(x, "visitorDuration", js.undefined)
      
      inline def setVisitsUrl(value: String): Self = StObject.set(x, "visitsUrl", value.asInstanceOf[js.Any])
      
      inline def setVisitsUrlUndefined: Self = StObject.set(x, "visitsUrl", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
}
