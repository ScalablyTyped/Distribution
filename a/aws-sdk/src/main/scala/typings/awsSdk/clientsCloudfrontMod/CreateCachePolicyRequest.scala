package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCachePolicyRequest extends StObject {
  
  /**
    * A cache policy configuration.
    */
  var CachePolicyConfig: typings.awsSdk.clientsCloudfrontMod.CachePolicyConfig
}
object CreateCachePolicyRequest {
  
  inline def apply(CachePolicyConfig: CachePolicyConfig): CreateCachePolicyRequest = {
    val __obj = js.Dynamic.literal(CachePolicyConfig = CachePolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCachePolicyRequest]
  }
  
  extension [Self <: CreateCachePolicyRequest](x: Self) {
    
    inline def setCachePolicyConfig(value: CachePolicyConfig): Self = StObject.set(x, "CachePolicyConfig", value.asInstanceOf[js.Any])
  }
}
