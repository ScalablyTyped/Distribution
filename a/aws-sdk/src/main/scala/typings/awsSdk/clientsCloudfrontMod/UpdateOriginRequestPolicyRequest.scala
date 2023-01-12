package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateOriginRequestPolicyRequest extends StObject {
  
  /**
    * The unique identifier for the origin request policy that you are updating. The identifier is returned in a cache behavior’s OriginRequestPolicyId field in the response to GetDistributionConfig.
    */
  var Id: String
  
  /**
    * The version of the origin request policy that you are updating. The version is returned in the origin request policy’s ETag field in the response to GetOriginRequestPolicyConfig.
    */
  var IfMatch: js.UndefOr[String] = js.undefined
  
  /**
    * An origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typings.awsSdk.clientsCloudfrontMod.OriginRequestPolicyConfig
}
object UpdateOriginRequestPolicyRequest {
  
  inline def apply(Id: String, OriginRequestPolicyConfig: OriginRequestPolicyConfig): UpdateOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any], OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOriginRequestPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIfMatch(value: String): Self = StObject.set(x, "IfMatch", value.asInstanceOf[js.Any])
    
    inline def setIfMatchUndefined: Self = StObject.set(x, "IfMatch", js.undefined)
    
    inline def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
}
