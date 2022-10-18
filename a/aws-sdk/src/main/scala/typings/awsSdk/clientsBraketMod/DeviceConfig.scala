package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfig extends StObject {
  
  /**
    * The primary quantum processing unit (QPU) or simulator used to create and run an Amazon Braket job.
    */
  var device: String256
}
object DeviceConfig {
  
  inline def apply(device: String256): DeviceConfig = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceConfig]
  }
  
  extension [Self <: DeviceConfig](x: Self) {
    
    inline def setDevice(value: String256): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
  }
}
