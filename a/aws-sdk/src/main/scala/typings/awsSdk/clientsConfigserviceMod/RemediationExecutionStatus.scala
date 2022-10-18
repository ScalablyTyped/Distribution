package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationExecutionStatus extends StObject {
  
  /**
    * Start time when the remediation was executed.
    */
  var InvocationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time when the remediation execution was last updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  var ResourceKey: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceKey] = js.undefined
  
  /**
    * ENUM of the values.
    */
  var State: js.UndefOr[RemediationExecutionState] = js.undefined
  
  /**
    * Details of every step.
    */
  var StepDetails: js.UndefOr[RemediationExecutionSteps] = js.undefined
}
object RemediationExecutionStatus {
  
  inline def apply(): RemediationExecutionStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationExecutionStatus]
  }
  
  extension [Self <: RemediationExecutionStatus](x: Self) {
    
    inline def setInvocationTime(value: js.Date): Self = StObject.set(x, "InvocationTime", value.asInstanceOf[js.Any])
    
    inline def setInvocationTimeUndefined: Self = StObject.set(x, "InvocationTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setResourceKey(value: ResourceKey): Self = StObject.set(x, "ResourceKey", value.asInstanceOf[js.Any])
    
    inline def setResourceKeyUndefined: Self = StObject.set(x, "ResourceKey", js.undefined)
    
    inline def setState(value: RemediationExecutionState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setStepDetails(value: RemediationExecutionSteps): Self = StObject.set(x, "StepDetails", value.asInstanceOf[js.Any])
    
    inline def setStepDetailsUndefined: Self = StObject.set(x, "StepDetails", js.undefined)
    
    inline def setStepDetailsVarargs(value: RemediationExecutionStep*): Self = StObject.set(x, "StepDetails", js.Array(value*))
  }
}
