package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVTLDeviceTypeOutput extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the medium changer you have selected.
    */
  var VTLDeviceARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.VTLDeviceARN] = js.undefined
}
object UpdateVTLDeviceTypeOutput {
  
  inline def apply(): UpdateVTLDeviceTypeOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateVTLDeviceTypeOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVTLDeviceTypeOutput] (val x: Self) extends AnyVal {
    
    inline def setVTLDeviceARN(value: VTLDeviceARN): Self = StObject.set(x, "VTLDeviceARN", value.asInstanceOf[js.Any])
    
    inline def setVTLDeviceARNUndefined: Self = StObject.set(x, "VTLDeviceARN", js.undefined)
  }
}
