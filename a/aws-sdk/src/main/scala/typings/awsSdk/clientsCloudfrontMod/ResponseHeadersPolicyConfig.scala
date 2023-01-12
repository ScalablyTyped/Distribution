package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyConfig extends StObject {
  
  /**
    * A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
    */
  var Comment: js.UndefOr[String] = js.undefined
  
  /**
    * A configuration for a set of HTTP response headers that are used for cross-origin resource sharing (CORS).
    */
  var CorsConfig: js.UndefOr[ResponseHeadersPolicyCorsConfig] = js.undefined
  
  /**
    * A configuration for a set of custom HTTP response headers.
    */
  var CustomHeadersConfig: js.UndefOr[ResponseHeadersPolicyCustomHeadersConfig] = js.undefined
  
  /**
    * A name to identify the response headers policy. The name must be unique for response headers policies in this Amazon Web Services account.
    */
  var Name: String
  
  /**
    * A configuration for a set of security-related HTTP response headers.
    */
  var SecurityHeadersConfig: js.UndefOr[ResponseHeadersPolicySecurityHeadersConfig] = js.undefined
  
  /**
    * A configuration for enabling the Server-Timing header in HTTP responses sent from CloudFront.
    */
  var ServerTimingHeadersConfig: js.UndefOr[ResponseHeadersPolicyServerTimingHeadersConfig] = js.undefined
}
object ResponseHeadersPolicyConfig {
  
  inline def apply(Name: String): ResponseHeadersPolicyConfig = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyConfig] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCorsConfig(value: ResponseHeadersPolicyCorsConfig): Self = StObject.set(x, "CorsConfig", value.asInstanceOf[js.Any])
    
    inline def setCorsConfigUndefined: Self = StObject.set(x, "CorsConfig", js.undefined)
    
    inline def setCustomHeadersConfig(value: ResponseHeadersPolicyCustomHeadersConfig): Self = StObject.set(x, "CustomHeadersConfig", value.asInstanceOf[js.Any])
    
    inline def setCustomHeadersConfigUndefined: Self = StObject.set(x, "CustomHeadersConfig", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setSecurityHeadersConfig(value: ResponseHeadersPolicySecurityHeadersConfig): Self = StObject.set(x, "SecurityHeadersConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityHeadersConfigUndefined: Self = StObject.set(x, "SecurityHeadersConfig", js.undefined)
    
    inline def setServerTimingHeadersConfig(value: ResponseHeadersPolicyServerTimingHeadersConfig): Self = StObject.set(x, "ServerTimingHeadersConfig", value.asInstanceOf[js.Any])
    
    inline def setServerTimingHeadersConfigUndefined: Self = StObject.set(x, "ServerTimingHeadersConfig", js.undefined)
  }
}
