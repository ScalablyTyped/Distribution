package typings.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodegroupUpdateConfig extends StObject {
  
  /**
    * The maximum number of nodes unavailable at once during a version update. Nodes will be updated in parallel. This value or maxUnavailablePercentage is required to have a value.The maximum number is 100.
    */
  var maxUnavailable: js.UndefOr[NonZeroInteger] = js.undefined
  
  /**
    * The maximum percentage of nodes unavailable during a version update. This percentage of nodes will be updated in parallel, up to 100 nodes at once. This value or maxUnavailable is required to have a value.
    */
  var maxUnavailablePercentage: js.UndefOr[PercentCapacity] = js.undefined
}
object NodegroupUpdateConfig {
  
  inline def apply(): NodegroupUpdateConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodegroupUpdateConfig]
  }
  
  extension [Self <: NodegroupUpdateConfig](x: Self) {
    
    inline def setMaxUnavailable(value: NonZeroInteger): Self = StObject.set(x, "maxUnavailable", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailablePercentage(value: PercentCapacity): Self = StObject.set(x, "maxUnavailablePercentage", value.asInstanceOf[js.Any])
    
    inline def setMaxUnavailablePercentageUndefined: Self = StObject.set(x, "maxUnavailablePercentage", js.undefined)
    
    inline def setMaxUnavailableUndefined: Self = StObject.set(x, "maxUnavailable", js.undefined)
  }
}
