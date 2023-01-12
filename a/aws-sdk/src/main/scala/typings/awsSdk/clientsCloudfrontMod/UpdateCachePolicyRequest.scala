package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCachePolicyRequest extends StObject {
  
  /**
    * A cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.clientsCloudfrontMod.CachePolicyConfig
  
  /**
    * The unique identifier for the cache policy that you are updating. The identifier is returned in a cache behavior’s CachePolicyId field in the response to GetDistributionConfig.
    */
  var Id: String
  
  /**
    * The version of the cache policy that you are updating. The version is returned in the cache policy’s ETag field in the response to GetCachePolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
}
object UpdateCachePolicyRequest {
  
  inline def apply(CachePolicyConfig: CachePolicyConfig, Id: String): UpdateCachePolicyRequest = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCachePolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCachePolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
  }
}
