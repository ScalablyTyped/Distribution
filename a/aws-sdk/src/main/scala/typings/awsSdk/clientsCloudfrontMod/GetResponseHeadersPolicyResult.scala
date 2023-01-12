package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetResponseHeadersPolicyResult extends StObject {
  
  /**
    * The version identifier for the current version of the response headers policy.
    */
  var ETag: js.UndefOr[String] = js.undefined
  
  /**
    * Contains a response headers policy.
    */
  var ResponseHeadersPolicy: js.UndefOr[typings.awsSdk.clientsCloudfrontMod.ResponseHeadersPolicy] = js.undefined
}
object GetResponseHeadersPolicyResult {
  
  inline def apply(): GetResponseHeadersPolicyResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetResponseHeadersPolicyResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetResponseHeadersPolicyResult] (val x: Self) extends AnyVal {
    
    inline def setETag(value: String): Self = StObject.set(x, "ETag", value.asInstanceOf[js.Any])
    
    inline def setETagUndefined: Self = StObject.set(x, "ETag", js.undefined)
    
    inline def setResponseHeadersPolicy(value: ResponseHeadersPolicy): Self = StObject.set(x, "ResponseHeadersPolicy", value.asInstanceOf[js.Any])
    
    inline def setResponseHeadersPolicyUndefined: Self = StObject.set(x, "ResponseHeadersPolicy", js.undefined)
  }
}
