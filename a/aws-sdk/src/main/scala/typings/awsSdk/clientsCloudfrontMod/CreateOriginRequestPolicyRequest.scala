package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOriginRequestPolicyRequest extends StObject {
  
  /**
    * An origin request policy configuration.
    */
  var OriginRequestPolicyConfig: typings.awsSdk.clientsCloudfrontMod.OriginRequestPolicyConfig
}
object CreateOriginRequestPolicyRequest {
  
  inline def apply(OriginRequestPolicyConfig: OriginRequestPolicyConfig): CreateOriginRequestPolicyRequest = {
    val __obj = js.Dynamic.literal(OriginRequestPolicyConfig = OriginRequestPolicyConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOriginRequestPolicyRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateOriginRequestPolicyRequest] (val x: Self) extends AnyVal {
    
    inline def setOriginRequestPolicyConfig(value: OriginRequestPolicyConfig): Self = StObject.set(x, "OriginRequestPolicyConfig", value.asInstanceOf[js.Any])
  }
}
