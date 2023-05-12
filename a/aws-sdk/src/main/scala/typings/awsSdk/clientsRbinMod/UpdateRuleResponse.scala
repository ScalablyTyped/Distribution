package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRuleResponse extends StObject {
  
  /**
    * The retention rule description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsRbinMod.Description] = js.undefined
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: js.UndefOr[RuleIdentifier] = js.undefined
  
  /**
    * The date and time at which the unlock delay is set to expire. Only returned for retention rules that have been unlocked and that are still within the unlock delay period.
    */
  var LockEndTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The lock state for the retention rule.    locked - The retention rule is locked and can't be modified or deleted.    pending_unlock - The retention rule has been unlocked but it is still within the unlock delay period. The retention rule can be modified or deleted only after the unlock delay period has expired.    unlocked - The retention rule is unlocked and it can be modified or deleted by any user with the required permissions.    null - The retention rule has never been locked. Once a retention rule has been locked, it can transition between the locked and unlocked states only; it can never transition back to null.  
    */
  var LockState: js.UndefOr[typings.awsSdk.clientsRbinMod.LockState] = js.undefined
  
  /**
    * Information about the resource tags used to identify resources that are retained by the retention rule.
    */
  var ResourceTags: js.UndefOr[typings.awsSdk.clientsRbinMod.ResourceTags] = js.undefined
  
  /**
    * The resource type retained by the retention rule.
    */
  var ResourceType: js.UndefOr[typings.awsSdk.clientsRbinMod.ResourceType] = js.undefined
  
  var RetentionPeriod: js.UndefOr[typings.awsSdk.clientsRbinMod.RetentionPeriod] = js.undefined
  
  /**
    * The state of the retention rule. Only retention rules that are in the available state retain resources.
    */
  var Status: js.UndefOr[RuleStatus] = js.undefined
}
object UpdateRuleResponse {
  
  inline def apply(): UpdateRuleResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateRuleResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateRuleResponse] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setLockEndTime(value: js.Date): Self = StObject.set(x, "LockEndTime", value.asInstanceOf[js.Any])
    
    inline def setLockEndTimeUndefined: Self = StObject.set(x, "LockEndTime", js.undefined)
    
    inline def setLockState(value: LockState): Self = StObject.set(x, "LockState", value.asInstanceOf[js.Any])
    
    inline def setLockStateUndefined: Self = StObject.set(x, "LockState", js.undefined)
    
    inline def setResourceTags(value: ResourceTags): Self = StObject.set(x, "ResourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "ResourceTags", js.undefined)
    
    inline def setResourceTagsVarargs(value: ResourceTag*): Self = StObject.set(x, "ResourceTags", js.Array(value*))
    
    inline def setResourceType(value: ResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
    
    inline def setStatus(value: RuleStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
