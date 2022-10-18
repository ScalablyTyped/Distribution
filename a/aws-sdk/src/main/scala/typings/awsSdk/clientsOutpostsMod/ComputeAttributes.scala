package typings.awsSdk.clientsOutpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComputeAttributes extends StObject {
  
  /**
    *  The host ID of the Dedicated Host on the asset. 
    */
  var HostId: js.UndefOr[typings.awsSdk.clientsOutpostsMod.HostId] = js.undefined
  
  /**
    * The state.   ACTIVE - The asset is available and can provide capacity for new compute resources.   ISOLATED - The asset is undergoing maintenance and can't provide capacity for new compute resources. Existing compute resources on the asset are not affected.   RETIRING - The underlying hardware for the asset is degraded. Capacity for new compute resources is reduced. Amazon Web Services sends notifications for resources that must be stopped before the asset can be replaced.  
    */
  var State: js.UndefOr[ComputeAssetState] = js.undefined
}
object ComputeAttributes {
  
  inline def apply(): ComputeAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComputeAttributes]
  }
  
  extension [Self <: ComputeAttributes](x: Self) {
    
    inline def setHostId(value: HostId): Self = StObject.set(x, "HostId", value.asInstanceOf[js.Any])
    
    inline def setHostIdUndefined: Self = StObject.set(x, "HostId", js.undefined)
    
    inline def setState(value: ComputeAssetState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
  }
}
