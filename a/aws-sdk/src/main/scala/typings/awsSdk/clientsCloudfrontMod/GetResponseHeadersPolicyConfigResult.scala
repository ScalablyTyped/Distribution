package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseHeadersPolicyConfigResult extends StObject {
  
  /**
    * The version identifier for the current version of the response headers policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a response headers policy.
    */
  var ResponseHeadersPolicyConfig: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ResponseHeadersPolicyConfig] = js.undefined
}
object GetResponseHeadersPolicyConfigResult {
  
  inline def apply(): GetResponseHeadersPolicyConfigResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResponseHeadersPolicyConfigResult]
  }
  
  extension [Self <: GetResponseHeadersPolicyConfigResult](x: Self) {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setResponseHeadersPolicyConfig(value: ResponseHeadersPolicyConfig): Self = StObject.set(x, "ResponseHeadersPolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyConfigUndefined: Self = StObject.set(x, "ResponseHeadersPolicyConfig", js.undefined)
  }
}
