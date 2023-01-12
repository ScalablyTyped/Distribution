package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicy extends StObject {
  
  /**
    * The identifier for the response headers policy.
    */
  var Id: String
  
  /**
    * The date and time when the response headers policy was last modified.
    */
  var LastModifiedTime: js.Date
  
  /**
    * A response headers policy configuration. A response headers policy contains information about a set of HTTP response headers and their values. CloudFront adds the headers in the policy to HTTP responses that it sends for requests that match a cache behavior that’s associated with the policy.
    */
  var ResponseHeadersPolicyConfig: typings.awsSdk.clientsCloudfrontMod.ResponseHeadersPolicyConfig
}
object ResponseHeadersPolicy {
  
  inline def apply(Id: String, LastModifiedTime: js.Date, ResponseHeadersPolicyConfig: ResponseHeadersPolicyConfig): ResponseHeadersPolicy = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], LastModifiedTime = LastModifiedTime.asInstanceOf[js.Any], ResponseHeadersPolicyConfig = ResponseHeadersPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicy] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyConfig(value: ResponseHeadersPolicyConfig): Self = StObject.set(x, "ResponseHeadersPolicyConfig", value.asInstanceOf[js.Any])
  }
}
