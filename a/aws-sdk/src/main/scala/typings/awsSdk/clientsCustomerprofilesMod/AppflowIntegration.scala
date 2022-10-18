package typings.awsSdk.clientsCustomerprofilesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppflowIntegration extends StObject {
  
  /**
    * Batches in workflow of type APPFLOW_INTEGRATION.
    */
  var Batches: js.UndefOr[typings.awsSdk.clientsCustomerprofilesMod.Batches] = js.undefined
  
  var FlowDefinition: typings.awsSdk.clientsCustomerprofilesMod.FlowDefinition
}
object AppflowIntegration {
  
  inline def apply(FlowDefinition: FlowDefinition): AppflowIntegration = {
    val __obj = js.Dynamic.literal(FlowDefinition = FlowDefinition.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppflowIntegration]
  }
  
  extension [Self <: AppflowIntegration](x: Self) {
    
    inline def setBatches(value: Batches): Self = StObject.set(x, "Batches", value.asInstanceOf[js.Any])
    
    inline def setBatchesUndefined: Self = StObject.set(x, "Batches", js.undefined)
    
    inline def setBatchesVarargs(value: Batch*): Self = StObject.set(x, "Batches", js.Array(value*))
    
    inline def setFlowDefinition(value: FlowDefinition): Self = StObject.set(x, "FlowDefinition", value.asInstanceOf[js.Any])
  }
}
