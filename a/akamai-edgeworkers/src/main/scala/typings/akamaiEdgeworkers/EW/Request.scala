package typings.akamaiEdgeworkers.EW

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Request extends js.Object {
  
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
  implicit class RequestOps[Self <: Request] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCpCode(value: Double): Self = this.set("cpCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheme(value: String): Self = this.set("scheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice(value: Device): Self = this.set("device", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDevice: Self = this.set("device", js.undefined)
    
    @scala.inline
    def setUserLocation(value: UserLocation): Self = this.set("userLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserLocation: Self = this.set("userLocation", js.undefined)
  }
}
