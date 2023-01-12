package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteResponseHeadersPolicyRequest extends StObject {
  
  /**
    * The identifier for the response headers policy that you are deleting. To get the identifier, you can use ListResponseHeadersPolicies.
    */
  var Id: String
  
  /**
    * The version of the response headers policy that you are deleting. The version is the response headers policy’s ETag value, which you can get using ListResponseHeadersPolicies, GetResponseHeadersPolicy, or GetResponseHeadersPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteResponseHeadersPolicyRequest {
  
  inline def apply(Id: String): DeleteResponseHeadersPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteResponseHeadersPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteResponseHeadersPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
