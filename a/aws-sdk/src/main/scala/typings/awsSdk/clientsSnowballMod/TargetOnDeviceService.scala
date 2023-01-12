package typings.awsSdk.clientsSnowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TargetOnDeviceService extends StObject {
  
  /**
    * Specifies the name of the service on the Snow Family device that your transferred data will be exported from or imported into.
    */
  var ServiceName: js.UndefOr[DeviceServiceName] = js.undefined
  
  /**
    * Specifies whether the data is being imported or exported. You can import or export the data, or use it locally on the device.
    */
  var TransferOption: js.UndefOr[typings.awsSdk.clientsSnowballMod.TransferOption] = js.undefined
}
object TargetOnDeviceService {
  
  inline def apply(): TargetOnDeviceService = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetOnDeviceService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TargetOnDeviceService] (val x: Self) extends AnyVal {
    
    inline def setServiceName(value: DeviceServiceName): Self = StObject.set(x, "ServiceName", value.asInstanceOf[js.Any])
    
    inline def setServiceNameUndefined: Self = StObject.set(x, "ServiceName", js.undefined)
    
    inline def setTransferOption(value: TransferOption): Self = StObject.set(x, "TransferOption", value.asInstanceOf[js.Any])
    
    inline def setTransferOptionUndefined: Self = StObject.set(x, "TransferOption", js.undefined)
  }
}
