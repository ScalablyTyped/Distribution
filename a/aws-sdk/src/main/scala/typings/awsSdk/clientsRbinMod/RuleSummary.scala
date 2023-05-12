package typings.awsSdk.clientsRbinMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleSummary extends StObject {
  
  /**
    * The retention rule description.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsRbinMod.Description] = js.undefined
  
  /**
    * The unique ID of the retention rule.
    */
  var Identifier: js.UndefOr[RuleIdentifier] = js.undefined
  
  /**
    * The lock state for the retention rule.    locked - The retention rule is locked and can't be modified or deleted.    pending_unlock - The retention rule has been unlocked but it is still within the unlock delay period. The retention rule can be modified or deleted only after the unlock delay period has expired.    unlocked - The retention rule is unlocked and it can be modified or deleted by any user with the required permissions.    null - The retention rule has never been locked. Once a retention rule has been locked, it can transition between the locked and unlocked states only; it can never transition back to null.  
    */
  var LockState: js.UndefOr[typings.awsSdk.clientsRbinMod.LockState] = js.undefined
  
  /**
    * Information about the retention period for which the retention rule is to retain resources.
    */
  var RetentionPeriod: js.UndefOr[typings.awsSdk.clientsRbinMod.RetentionPeriod] = js.undefined
}
object RuleSummary {
  
  inline def apply(): RuleSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleSummary] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setIdentifier(value: RuleIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "Identifier", js.undefined)
    
    inline def setLockState(value: LockState): Self = StObject.set(x, "LockState", value.asInstanceOf[js.Any])
    
    inline def setLockStateUndefined: Self = StObject.set(x, "LockState", js.undefined)
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "RetentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "RetentionPeriod", js.undefined)
  }
}
