package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VolumeiSCSIAttributes extends StObject {
  
  /**
    * Indicates whether mutual CHAP is enabled for the iSCSI target.
    */
  var ChapEnabled: js.UndefOr[scala.Boolean] = js.undefined
  
  /**
    * The logical disk number.
    */
  var LunNumber: js.UndefOr[PositiveIntObject] = js.undefined
  
  /**
    * The network interface identifier.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.NetworkInterfaceId] = js.undefined
  
  /**
    * The port used to communicate with iSCSI targets.
    */
  var NetworkInterfacePort: js.UndefOr[integer] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the volume target.
    */
  var TargetARN: js.UndefOr[typings.awsSdk.clientsStoragegatewayMod.TargetARN] = js.undefined
}
object VolumeiSCSIAttributes {
  
  inline def apply(): VolumeiSCSIAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeiSCSIAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VolumeiSCSIAttributes] (val x: Self) extends AnyVal {
    
    inline def setChapEnabled(value: scala.Boolean): Self = StObject.set(x, "ChapEnabled", value.asInstanceOf[js.Any])
    
    inline def setChapEnabledUndefined: Self = StObject.set(x, "ChapEnabled", js.undefined)
    
    inline def setLunNumber(value: PositiveIntObject): Self = StObject.set(x, "LunNumber", value.asInstanceOf[js.Any])
    
    inline def setLunNumberUndefined: Self = StObject.set(x, "LunNumber", js.undefined)
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setNetworkInterfacePort(value: integer): Self = StObject.set(x, "NetworkInterfacePort", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfacePortUndefined: Self = StObject.set(x, "NetworkInterfacePort", js.undefined)
    
    inline def setTargetARN(value: TargetARN): Self = StObject.set(x, "TargetARN", value.asInstanceOf[js.Any])
    
    inline def setTargetARNUndefined: Self = StObject.set(x, "TargetARN", js.undefined)
  }
}
