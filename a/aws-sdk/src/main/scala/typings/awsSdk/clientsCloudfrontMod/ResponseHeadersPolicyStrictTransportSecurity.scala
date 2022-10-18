package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyStrictTransportSecurity extends StObject {
  
  /**
    * A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
    */
  var AccessControlMaxAgeSec: integer
  
  /**
    * A Boolean that determines whether CloudFront includes the includeSubDomains directive in the Strict-Transport-Security HTTP response header.
    */
  var IncludeSubdomains: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A Boolean that determines whether CloudFront overrides the Strict-Transport-Security HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
  
  /**
    * A Boolean that determines whether CloudFront includes the preload directive in the Strict-Transport-Security HTTP response header.
    */
  var Preload: js.UndefOr[Boolean] = js.undefined
}
object ResponseHeadersPolicyStrictTransportSecurity {
  
  inline def apply(AccessControlMaxAgeSec: integer, Override: Boolean): ResponseHeadersPolicyStrictTransportSecurity = {
    val __obj = js.Dynamic.literal(AccessControlMaxAgeSec = AccessControlMaxAgeSec.asInstanceOf[js.Any], Override = Override.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyStrictTransportSecurity]
  }
  
  extension [Self <: ResponseHeadersPolicyStrictTransportSecurity](x: Self) {
    
    inline def setAccessControlMaxAgeSec(value: integer): Self = StObject.set(x, "AccessControlMaxAgeSec", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubdomains(value: Boolean): Self = StObject.set(x, "IncludeSubdomains", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubdomainsUndefined: Self = StObject.set(x, "IncludeSubdomains", js.undefined)
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setPreload(value: Boolean): Self = StObject.set(x, "Preload", value.asInstanceOf[js.Any])
    
    inline def setPreloadUndefined: Self = StObject.set(x, "Preload", js.undefined)
  }
}
