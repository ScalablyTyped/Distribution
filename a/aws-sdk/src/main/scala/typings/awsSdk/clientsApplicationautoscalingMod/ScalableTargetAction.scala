package typings.awsSdk.clientsApplicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalableTargetAction extends StObject {
  
  /**
    * The maximum capacity. Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you can request an increase. For more information, consult the documentation for that service. For information about the default quotas for each service, see Service endpoints and quotas in the Amazon Web Services General Reference.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  
  /**
    * The minimum capacity. When the scheduled action runs, the resource will have at least this much capacity, but it might have more depending on other settings, such as the target utilization level of a target tracking scaling policy.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
}
object ScalableTargetAction {
  
  inline def apply(): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalableTargetAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalableTargetAction] (val x: Self) extends AnyVal {
    
    inline def setMaxCapacity(value: ResourceCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    inline def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    inline def setMinCapacity(value: ResourceCapacity): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    inline def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
  }
}
