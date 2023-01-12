package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginRequestPolicySummary extends StObject {
  
  /**
    * The origin request policy.
    */
  var OriginRequestPolicy: typings.awsSdk.clientsCloudfrontMod.OriginRequestPolicy
  
  /**
    * The type of origin request policy, either managed (created by Amazon Web Services) or custom (created in this Amazon Web Services account).
    */
  var Type: OriginRequestPolicyType
}
object OriginRequestPolicySummary {
  
  inline def apply(OriginRequestPolicy: OriginRequestPolicy, Type: OriginRequestPolicyType): OriginRequestPolicySummary = {
    val __obj = js.Dynamic.literal(OriginRequestPolicy = OriginRequestPolicy.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginRequestPolicySummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OriginRequestPolicySummary] (val x: Self) extends AnyVal {
    
    inline def setOriginRequestPolicy(value: OriginRequestPolicy): Self = StObject.set(x, "OriginRequestPolicy", value.asInstanceOf[js.Any])
    
    inline def setType(value: OriginRequestPolicyType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
  }
}
