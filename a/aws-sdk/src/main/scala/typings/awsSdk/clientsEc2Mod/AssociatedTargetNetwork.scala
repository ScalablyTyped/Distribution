package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociatedTargetNetwork extends StObject {
  
  /**
    * The ID of the subnet.
    */
  var NetworkId: js.UndefOr[String] = js.undefined
  
  /**
    * The target network type.
    */
  var NetworkType: js.UndefOr[AssociatedNetworkType] = js.undefined
}
object AssociatedTargetNetwork {
  
  inline def apply(): AssociatedTargetNetwork = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociatedTargetNetwork]
  }
  
  extension [Self <: AssociatedTargetNetwork](x: Self) {
    
    inline def setNetworkId(value: String): Self = StObject.set(x, "NetworkId", value.asInstanceOf[js.Any])
    
    inline def setNetworkIdUndefined: Self = StObject.set(x, "NetworkId", js.undefined)
    
    inline def setNetworkType(value: AssociatedNetworkType): Self = StObject.set(x, "NetworkType", value.asInstanceOf[js.Any])
    
    inline def setNetworkTypeUndefined: Self = StObject.set(x, "NetworkType", js.undefined)
  }
}
