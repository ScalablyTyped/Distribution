package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetInstanceHealthQuery extends StObject {
  
  /**
    * The health status of the instance. Set to Healthy to have the instance remain in service. Set to Unhealthy to have the instance be out of service. Amazon EC2 Auto Scaling terminates and replaces the unhealthy instance.
    */
  var HealthStatus: XmlStringMaxLen32
  
  /**
    * The ID of the instance.
    */
  var InstanceId: XmlStringMaxLen19
  
  /**
    * If the Auto Scaling group of the specified instance has a HealthCheckGracePeriod specified for the group, by default, this call respects the grace period. Set this to False, to have the call not respect the grace period associated with the group. For more information about the health check grace period, see CreateAutoScalingGroup in the Amazon EC2 Auto Scaling API Reference.
    */
  var ShouldRespectGracePeriod: js.UndefOr[typings.awsSdk.autoscalingMod.ShouldRespectGracePeriod] = js.undefined
}
object SetInstanceHealthQuery {
  
  @scala.inline
  def apply(HealthStatus: XmlStringMaxLen32, InstanceId: XmlStringMaxLen19): SetInstanceHealthQuery = {
    val __obj = js.Dynamic.literal(HealthStatus = HealthStatus.asInstanceOf[js.Any], InstanceId = InstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetInstanceHealthQuery]
  }
  
  @scala.inline
  implicit class SetInstanceHealthQueryMutableBuilder[Self <: SetInstanceHealthQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHealthStatus(value: XmlStringMaxLen32): Self = StObject.set(x, "HealthStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceId(value: XmlStringMaxLen19): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRespectGracePeriod(value: ShouldRespectGracePeriod): Self = StObject.set(x, "ShouldRespectGracePeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldRespectGracePeriodUndefined: Self = StObject.set(x, "ShouldRespectGracePeriod", js.undefined)
  }
}
