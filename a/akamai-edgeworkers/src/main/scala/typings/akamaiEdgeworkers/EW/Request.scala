package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends StObject {
  
  /**
    * The cpcode used for reporting.
    */
  val cpCode: Double = js.native
  
  /**
    * Object containing properties specifying the device characteristics. This
    * value of this property will be null if the contract associated with the
    * request does not have entitlements for EDC.
    */
  val device: js.UndefOr[Device] = js.native
  
  /**
    * The Host header value of the incoming request.
    */
  val host: String = js.native
  
  /**
    * The HTTP method of the incoming request.
    */
  val method: String = js.native
  
  /**
    * The URL path of the incoming request, including the filename and
    * extension, but without any query string.
    */
  val path: String = js.native
  
  /**
    * The query string of the incoming request.
    */
  val query: String = js.native
  
  /**
    * The scheme of the incoming request ("http" or "https").
    */
  val scheme: String = js.native
  
  /**
    * The Relative URL of the incoming request. This includes the path as well
    * as the query string.
    */
  val url: String = js.native
  
  /**
    * Object containing properties specifying the end user's geographic
    * location. This value of this property will be null if the contract
    * associated with the request does not have the appropriate entitlements.
    */
  val userLocation: js.UndefOr[UserLocation] = js.native
}
object Request {
  
  @scala.inline
  def apply(
    cpCode: Double,
    host: String,
    method: String,
    path: String,
    query: String,
    scheme: String,
    url: String
  ): Request = {
    val __obj = js.Dynamic.literal(cpCode = cpCode.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
  
  @scala.inline
  implicit class RequestMutableBuilder[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCpCode(value: Double): Self = StObject.set(x, "cpCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocation(value: UserLocation): Self = StObject.set(x, "userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserLocationUndefined: Self = StObject.set(x, "userLocation", js.undefined)
  }
}
