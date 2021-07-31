package typings.awsSdk.applicationautoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalableTargetAction extends StObject {
  
  /**
    * The maximum capacity. Although you can specify a large maximum capacity, note that service quotas may impose lower limits. Each service has its own default quotas for the maximum capacity of the resource. If you want to specify a higher limit, you can request an increase. For more information, consult the documentation for that service. For information about the default quotas for each service, see Service Endpoints and Quotas in the Amazon Web Services General Reference.
    */
  var MaxCapacity: js.UndefOr[ResourceCapacity] = js.undefined
  
  /**
    * The minimum capacity. For certain resources, the minimum value allowed is 0. This includes Lambda provisioned concurrency, Spot Fleet, ECS services, Aurora DB clusters, EMR clusters, and custom resources. For all other resources, the minimum value allowed is 1.
    */
  var MinCapacity: js.UndefOr[ResourceCapacity] = js.undefined
}
object ScalableTargetAction {
  
  @scala.inline
  def apply(): ScalableTargetAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalableTargetAction]
  }
  
  @scala.inline
  implicit class ScalableTargetActionMutableBuilder[Self <: ScalableTargetAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxCapacity(value: ResourceCapacity): Self = StObject.set(x, "MaxCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxCapacityUndefined: Self = StObject.set(x, "MaxCapacity", js.undefined)
    
    @scala.inline
    def setMinCapacity(value: ResourceCapacity): Self = StObject.set(x, "MinCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinCapacityUndefined: Self = StObject.set(x, "MinCapacity", js.undefined)
  }
}
