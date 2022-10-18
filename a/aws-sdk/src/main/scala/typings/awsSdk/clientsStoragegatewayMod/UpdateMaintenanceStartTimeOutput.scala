package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateMaintenanceStartTimeOutput extends StObject {
  
  var GatewayARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
}
object UpdateMaintenanceStartTimeOutput {
  
  inline def apply(): UpdateMaintenanceStartTimeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateMaintenanceStartTimeOutput]
  }
  
  extension [Self <: UpdateMaintenanceStartTimeOutput](x: Self) {
    
    inline def setGatewayARN(value: GatewayARN): Self = StObject.set(x, "GatewayARN", value.asInstanceOf[js.Any])
    
    inline def setGatewayARNUndefined: Self = StObject.set(x, "GatewayARN", js.undefined)
  }
}
