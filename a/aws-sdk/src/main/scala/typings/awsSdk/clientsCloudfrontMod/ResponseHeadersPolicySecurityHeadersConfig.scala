package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicySecurityHeadersConfig extends StObject {
  
  /**
    * The policy directives and their values that CloudFront includes as values for the Content-Security-Policy HTTP response header. For more information about the Content-Security-Policy HTTP response header, see Content-Security-Policy in the MDN Web Docs.
    */
  var ContentSecurityPolicy: js.UndefOr[ResponseHeadersPolicyContentSecurityPolicy] = js.undefined
  
  /**
    * Determines whether CloudFront includes the X-Content-Type-Options HTTP response header with its value set to nosniff. For more information about the X-Content-Type-Options HTTP response header, see X-Content-Type-Options in the MDN Web Docs.
    */
  var ContentTypeOptions: js.UndefOr[ResponseHeadersPolicyContentTypeOptions] = js.undefined
  
  /**
    * Determines whether CloudFront includes the X-Frame-Options HTTP response header and the header’s value. For more information about the X-Frame-Options HTTP response header, see X-Frame-Options in the MDN Web Docs.
    */
  var FrameOptions: js.UndefOr[ResponseHeadersPolicyFrameOptions] = js.undefined
  
  /**
    * Determines whether CloudFront includes the Referrer-Policy HTTP response header and the header’s value. For more information about the Referrer-Policy HTTP response header, see Referrer-Policy in the MDN Web Docs.
    */
  var ReferrerPolicy: js.UndefOr[ResponseHeadersPolicyReferrerPolicy] = js.undefined
  
  /**
    * Determines whether CloudFront includes the Strict-Transport-Security HTTP response header and the header’s value. For more information about the Strict-Transport-Security HTTP response header, see Strict-Transport-Security in the MDN Web Docs.
    */
  var StrictTransportSecurity: js.UndefOr[ResponseHeadersPolicyStrictTransportSecurity] = js.undefined
  
  /**
    * Determines whether CloudFront includes the X-XSS-Protection HTTP response header and the header’s value. For more information about the X-XSS-Protection HTTP response header, see X-XSS-Protection in the MDN Web Docs.
    */
  var XSSProtection: js.UndefOr[ResponseHeadersPolicyXSSProtection] = js.undefined
}
object ResponseHeadersPolicySecurityHeadersConfig {
  
  inline def apply(): ResponseHeadersPolicySecurityHeadersConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseHeadersPolicySecurityHeadersConfig]
  }
  
  extension [Self <: ResponseHeadersPolicySecurityHeadersConfig](x: Self) {
    
    inline def setContentSecurityPolicy(value: ResponseHeadersPolicyContentSecurityPolicy): Self = StObject.set(x, "ContentSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setContentSecurityPolicyUndefined: Self = StObject.set(x, "ContentSecurityPolicy", js.undefined)
    
    inline def setContentTypeOptions(value: ResponseHeadersPolicyContentTypeOptions): Self = StObject.set(x, "ContentTypeOptions", value.asInstanceOf[js.Any])
    
    inline def setContentTypeOptionsUndefined: Self = StObject.set(x, "ContentTypeOptions", js.undefined)
    
    inline def setFrameOptions(value: ResponseHeadersPolicyFrameOptions): Self = StObject.set(x, "FrameOptions", value.asInstanceOf[js.Any])
    
    inline def setFrameOptionsUndefined: Self = StObject.set(x, "FrameOptions", js.undefined)
    
    inline def setReferrerPolicy(value: ResponseHeadersPolicyReferrerPolicy): Self = StObject.set(x, "ReferrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "ReferrerPolicy", js.undefined)
    
    inline def setStrictTransportSecurity(value: ResponseHeadersPolicyStrictTransportSecurity): Self = StObject.set(x, "StrictTransportSecurity", value.asInstanceOf[js.Any])
    
    inline def setStrictTransportSecurityUndefined: Self = StObject.set(x, "StrictTransportSecurity", js.undefined)
    
    inline def setXSSProtection(value: ResponseHeadersPolicyXSSProtection): Self = StObject.set(x, "XSSProtection", value.asInstanceOf[js.Any])
    
    inline def setXSSProtectionUndefined: Self = StObject.set(x, "XSSProtection", js.undefined)
  }
}
