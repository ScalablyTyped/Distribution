package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCachePolicyRequest extends StObject {
  
  /**
    * The unique identifier for the cache policy that you are deleting. To get the identifier, you can use ListCachePolicies.
    */
  var Id: String
  
  /**
    * The version of the cache policy that you are deleting. The version is the cache policy's ETag value, which you can get using ListCachePolicies, GetCachePolicy, or GetCachePolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object DeleteCachePolicyRequest {
  
  inline def apply(Id: String): DeleteCachePolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCachePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCachePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
