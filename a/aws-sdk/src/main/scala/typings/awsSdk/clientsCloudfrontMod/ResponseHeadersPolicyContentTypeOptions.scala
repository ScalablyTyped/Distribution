package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseHeadersPolicyContentTypeOptions extends StObject {
  
  /**
    * A Boolean that determines whether CloudFront overrides the X-Content-Type-Options HTTP response header received from the origin with the one specified in this response headers policy.
    */
  var Override: Boolean
}
object ResponseHeadersPolicyContentTypeOptions {
  
  inline def apply(Override: Boolean): ResponseHeadersPolicyContentTypeOptions = {
    val __obj = js.Dynamic.literal(Override = Override.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseHeadersPolicyContentTypeOptions]
  }
  
  extension [Self <: ResponseHeadersPolicyContentTypeOptions](x: Self) {
    
    inline def setOverride(value: Boolean): Self = StObject.set(x, "Override", value.asInstanceOf[js.Any])
  }
}
