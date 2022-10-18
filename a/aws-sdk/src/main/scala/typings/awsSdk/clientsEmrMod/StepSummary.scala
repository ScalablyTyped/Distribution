package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepSummary extends StObject {
  
  /**
    * The action to take when the cluster step fails. Possible values are TERMINATE_CLUSTER, CANCEL_AND_WAIT, and CONTINUE. TERMINATE_JOB_FLOW is available for backward compatibility.
    */
  var ActionOnFailure: js.UndefOr[typings.awsSdk.clientsEmrMod.ActionOnFailure] = js.undefined
  
  /**
    * The Hadoop job configuration of the cluster step.
    */
  var Config: js.UndefOr[HadoopStepConfig] = js.undefined
  
  /**
    * The identifier of the cluster step.
    */
  var Id: js.UndefOr[StepId] = js.undefined
  
  /**
    * The name of the cluster step.
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * The current execution status details of the cluster step.
    */
  var Status: js.UndefOr[StepStatus] = js.undefined
}
object StepSummary {
  
  inline def apply(): StepSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StepSummary]
  }
  
  extension [Self <: StepSummary](x: Self) {
    
    inline def setActionOnFailure(value: ActionOnFailure): Self = StObject.set(x, "ActionOnFailure", value.asInstanceOf[js.Any])
    
    inline def setActionOnFailureUndefined: Self = StObject.set(x, "ActionOnFailure", js.undefined)
    
    inline def setConfig(value: HadoopStepConfig): Self = StObject.set(x, "Config", value.asInstanceOf[js.Any])
    
    inline def setConfigUndefined: Self = StObject.set(x, "Config", js.undefined)
    
    inline def setId(value: StepId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: StepStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
