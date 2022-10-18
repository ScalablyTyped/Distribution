package typings.awsSdk.clientsGlobalacceleratorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAcceleratorResponse extends StObject {
  
  /**
    * Information about the updated accelerator.
    */
  var Accelerator: js.UndefOr[typings.awsSdk.clientsGlobalacceleratorMod.Accelerator] = js.undefined
}
object UpdateAcceleratorResponse {
  
  inline def apply(): UpdateAcceleratorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateAcceleratorResponse]
  }
  
  extension [Self <: UpdateAcceleratorResponse](x: Self) {
    
    inline def setAccelerator(value: Accelerator): Self = StObject.set(x, "Accelerator", value.asInstanceOf[js.Any])
    
    inline def setAcceleratorUndefined: Self = StObject.set(x, "Accelerator", js.undefined)
  }
}
