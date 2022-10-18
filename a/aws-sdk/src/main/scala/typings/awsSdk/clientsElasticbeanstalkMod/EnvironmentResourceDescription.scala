package typings.awsSdk.clientsElasticbeanstalkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnvironmentResourceDescription extends StObject {
  
  /**
    *  The AutoScalingGroups used by this environment. 
    */
  var AutoScalingGroups: js.UndefOr[AutoScalingGroupList] = js.undefined
  
  /**
    * The name of the environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  
  /**
    * The Amazon EC2 instances used by this environment.
    */
  var Instances: js.UndefOr[InstanceList] = js.undefined
  
  /**
    * The Auto Scaling launch configurations in use by this environment.
    */
  var LaunchConfigurations: js.UndefOr[LaunchConfigurationList] = js.undefined
  
  /**
    * The Amazon EC2 launch templates in use by this environment.
    */
  var LaunchTemplates: js.UndefOr[LaunchTemplateList] = js.undefined
  
  /**
    * The LoadBalancers in use by this environment.
    */
  var LoadBalancers: js.UndefOr[LoadBalancerList] = js.undefined
  
  /**
    * The queues used by this environment.
    */
  var Queues: js.UndefOr[QueueList] = js.undefined
  
  /**
    * The AutoScaling triggers in use by this environment. 
    */
  var Triggers: js.UndefOr[TriggerList] = js.undefined
}
object EnvironmentResourceDescription {
  
  inline def apply(): EnvironmentResourceDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentResourceDescription]
  }
  
  extension [Self <: EnvironmentResourceDescription](x: Self) {
    
    inline def setAutoScalingGroups(value: AutoScalingGroupList): Self = StObject.set(x, "AutoScalingGroups", value.asInstanceOf[js.Any])
    
    inline def setAutoScalingGroupsUndefined: Self = StObject.set(x, "AutoScalingGroups", js.undefined)
    
    inline def setAutoScalingGroupsVarargs(value: AutoScalingGroup*): Self = StObject.set(x, "AutoScalingGroups", js.Array(value*))
    
    inline def setEnvironmentName(value: EnvironmentName): Self = StObject.set(x, "EnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentNameUndefined: Self = StObject.set(x, "EnvironmentName", js.undefined)
    
    inline def setInstances(value: InstanceList): Self = StObject.set(x, "Instances", value.asInstanceOf[js.Any])
    
    inline def setInstancesUndefined: Self = StObject.set(x, "Instances", js.undefined)
    
    inline def setInstancesVarargs(value: Instance*): Self = StObject.set(x, "Instances", js.Array(value*))
    
    inline def setLaunchConfigurations(value: LaunchConfigurationList): Self = StObject.set(x, "LaunchConfigurations", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationsUndefined: Self = StObject.set(x, "LaunchConfigurations", js.undefined)
    
    inline def setLaunchConfigurationsVarargs(value: LaunchConfiguration*): Self = StObject.set(x, "LaunchConfigurations", js.Array(value*))
    
    inline def setLaunchTemplates(value: LaunchTemplateList): Self = StObject.set(x, "LaunchTemplates", value.asInstanceOf[js.Any])
    
    inline def setLaunchTemplatesUndefined: Self = StObject.set(x, "LaunchTemplates", js.undefined)
    
    inline def setLaunchTemplatesVarargs(value: LaunchTemplate*): Self = StObject.set(x, "LaunchTemplates", js.Array(value*))
    
    inline def setLoadBalancers(value: LoadBalancerList): Self = StObject.set(x, "LoadBalancers", value.asInstanceOf[js.Any])
    
    inline def setLoadBalancersUndefined: Self = StObject.set(x, "LoadBalancers", js.undefined)
    
    inline def setLoadBalancersVarargs(value: LoadBalancer*): Self = StObject.set(x, "LoadBalancers", js.Array(value*))
    
    inline def setQueues(value: QueueList): Self = StObject.set(x, "Queues", value.asInstanceOf[js.Any])
    
    inline def setQueuesUndefined: Self = StObject.set(x, "Queues", js.undefined)
    
    inline def setQueuesVarargs(value: Queue*): Self = StObject.set(x, "Queues", js.Array(value*))
    
    inline def setTriggers(value: TriggerList): Self = StObject.set(x, "Triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "Triggers", js.undefined)
    
    inline def setTriggersVarargs(value: Trigger*): Self = StObject.set(x, "Triggers", js.Array(value*))
  }
}
