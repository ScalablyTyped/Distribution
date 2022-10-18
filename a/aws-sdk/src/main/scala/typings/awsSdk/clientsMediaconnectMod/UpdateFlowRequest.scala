package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFlowRequest extends StObject {
  
  /**
    * The flow that you want to update.
    */
  var FlowArn: string
  
  var Maintenance: js.UndefOr[UpdateMaintenance] = js.undefined
  
  var SourceFailoverConfig: js.UndefOr[UpdateFailoverConfig] = js.undefined
}
object UpdateFlowRequest {
  
  inline def apply(FlowArn: string): UpdateFlowRequest = {
    val __obj = js.Dynamic.literal(FlowArn = FlowArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFlowRequest]
  }
  
  extension [Self <: UpdateFlowRequest](x: Self) {
    
    inline def setFlowArn(value: string): Self = StObject.set(x, "FlowArn", value.asInstanceOf[js.Any])
    
    inline def setMaintenance(value: UpdateMaintenance): Self = StObject.set(x, "Maintenance", value.asInstanceOf[js.Any])
    
    inline def setMaintenanceUndefined: Self = StObject.set(x, "Maintenance", js.undefined)
    
    inline def setSourceFailoverConfig(value: UpdateFailoverConfig): Self = StObject.set(x, "SourceFailoverConfig", value.asInstanceOf[js.Any])
    
    inline def setSourceFailoverConfigUndefined: Self = StObject.set(x, "SourceFailoverConfig", js.undefined)
  }
}
