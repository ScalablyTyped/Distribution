package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyReferrerPolicy extends StObject {
  
  /**
    * A Boolean that determines whether CloudFront overrides the Referrer-Policy HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
  
  /**
    * The value of the Referrer-Policy HTTP response header. Valid values are:    no-referrer     no-referrer-when-downgrade     origin     origin-when-cross-origin     same-origin     strict-origin     strict-origin-when-cross-origin     unsafe-url    For more information about these values, see Referrer-Policy in the MDN Web Docs.
    */
  var ReferrerPolicy: ReferrerPolicyList
}
object ResponseHeadersPolicyReferrerPolicy {
  
  inline def apply(Override: Boolean, ReferrerPolicy: ReferrerPolicyList): ResponseHeadersPolicyReferrerPolicy = {
    val __obj = js.Dynamic.literal(Override = Override.asInstanceOf[js.Any], ReferrerPolicy = ReferrerPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyReferrerPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseHeadersPolicyReferrerPolicy] (val x: Self) extends AnyVal {
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicyList): Self = StObject.set(x, "ReferrerPolicy", value.asInstanceOf[js.Any])
  }
}
