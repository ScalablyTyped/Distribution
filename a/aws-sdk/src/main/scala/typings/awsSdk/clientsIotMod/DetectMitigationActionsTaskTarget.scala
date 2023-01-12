package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectMitigationActionsTaskTarget extends StObject {
  
  /**
    *  The name of the behavior. 
    */
  var behaviorName: js.UndefOr[BehaviorName] = js.undefined
  
  /**
    *  The name of the security profile. 
    */
  var securityProfileName: js.UndefOr[SecurityProfileName] = js.undefined
  
  /**
    *  The unique identifiers of the violations. 
    */
  var violationIds: js.UndefOr[TargetViolationIdsForDetectMitigationActions] = js.undefined
}
object DetectMitigationActionsTaskTarget {
  
  inline def apply(): DetectMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectMitigationActionsTaskTarget]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DetectMitigationActionsTaskTarget] (val x: Self) extends AnyVal {
    
    inline def setBehaviorName(value: BehaviorName): Self = StObject.set(x, "behaviorName", value.asInstanceOf[js.Any])
    
    inline def setBehaviorNameUndefined: Self = StObject.set(x, "behaviorName", js.undefined)
    
    inline def setSecurityProfileName(value: SecurityProfileName): Self = StObject.set(x, "securityProfileName", value.asInstanceOf[js.Any])
    
    inline def setSecurityProfileNameUndefined: Self = StObject.set(x, "securityProfileName", js.undefined)
    
    inline def setViolationIds(value: TargetViolationIdsForDetectMitigationActions): Self = StObject.set(x, "violationIds", value.asInstanceOf[js.Any])
    
    inline def setViolationIdsUndefined: Self = StObject.set(x, "violationIds", js.undefined)
    
    inline def setViolationIdsVarargs(value: ViolationId*): Self = StObject.set(x, "violationIds", js.Array(value*))
  }
}
