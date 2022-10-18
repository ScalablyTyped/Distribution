package typings.awsSdk.clientsOrganizationsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EffectivePolicy extends StObject {
  
  /**
    * The time of the last update to this policy.
    */
  var LastUpdatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The text content of the policy.
    */
  var PolicyContent: js.UndefOr[typings.awsSdk.clientsOrganizationsMod.PolicyContent] = js.undefined
  
  /**
    * The policy type.
    */
  var PolicyType: js.UndefOr[EffectivePolicyType] = js.undefined
  
  /**
    * The account ID of the policy target. 
    */
  var TargetId: js.UndefOr[PolicyTargetId] = js.undefined
}
object EffectivePolicy {
  
  inline def apply(): EffectivePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EffectivePolicy]
  }
  
  extension [Self <: EffectivePolicy](x: Self) {
    
    inline def setLastUpdatedTimestamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimestampUndefined: Self = StObject.set(x, "LastUpdatedTimestamp", js.undefined)
    
    inline def setPolicyContent(value: PolicyContent): Self = StObject.set(x, "PolicyContent", value.asInstanceOf[js.Any])
    
    inline def setPolicyContentUndefined: Self = StObject.set(x, "PolicyContent", js.undefined)
    
    inline def setPolicyType(value: EffectivePolicyType): Self = StObject.set(x, "PolicyType", value.asInstanceOf[js.Any])
    
    inline def setPolicyTypeUndefined: Self = StObject.set(x, "PolicyType", js.undefined)
    
    inline def setTargetId(value: PolicyTargetId): Self = StObject.set(x, "TargetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "TargetId", js.undefined)
  }
}
