package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Request extends StObject {
  
  /**
    * The body associated with the incoming request.
    */
  val body: ReadableStreamEW[Any]
  
  /**
    * The cpcode used for reporting.
    */
  val cpCode: Double
  
  /**
    * Object containing properties specifying the device characteristics. This
    * value of this property will be null if the contract associated with the
    * request does not have entitlements for EDC.
    */
  val device: js.UndefOr[Device] = js.undefined
  
  /**
    * The Host header value of the incoming request.
    */
  val host: String
  
  /**
    * The HTTP method of the incoming request.
    */
  val method: String
  
  /**
    * The URL path of the incoming request, including the filename and
    * extension, but without any query string.
    */
  val path: String
  
  /**
    * The query string of the incoming request.
    */
  val query: String
  
  /**
    * The scheme of the incoming request ("http" or "https").
    */
  val scheme: String
  
  /**
    * The Relative URL of the incoming request. This includes the path as well
    * as the query string.
    */
  val url: String
  
  /**
    * Object containing properties specifying the end user's geographic
    * location. This value of this property will be null if the contract
    * associated with the request does not have the appropriate entitlements.
    */
  val userLocation: js.UndefOr[UserLocation] = js.undefined
}
object Request {
  
  inline def apply(
    body: ReadableStreamEW[Any],
    cpCode: Double,
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], cpCode = cpCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  extension [Self <: Request](x: Self) {
    
    inline def setBody(value: ReadableStreamEW[Any]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setCpCode(value: Double): Self = StObject.set(x, "cpCode", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUserLocation(value: UserLocation): Self = StObject.set(x, "userLocation", value.asInstanceOf[js.Any])
    
    inline def setUserLocationUndefined: Self = StObject.set(x, "userLocation", js.undefined)
  }
}
