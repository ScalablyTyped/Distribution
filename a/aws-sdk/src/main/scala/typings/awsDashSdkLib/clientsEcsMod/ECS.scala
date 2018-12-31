package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ECS
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_ECS: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsEcsMod.ECSNs.ClientConfiguration = js.native
  /**
    * Creates a new Amazon ECS cluster. By default, your account receives a default cluster when you launch your first container instance. However, you can create your own cluster with a unique name with the CreateCluster action.  When you call the CreateCluster API operation, Amazon ECS attempts to create the service-linked role for your account so that required resources in other AWS services can be managed on your behalf. However, if the IAM user that makes the call does not have permissions to create the service-linked role, it is not created. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide. 
    */
  def createCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon ECS cluster. By default, your account receives a default cluster when you launch your first container instance. However, you can create your own cluster with a unique name with the CreateCluster action.  When you call the CreateCluster API operation, Amazon ECS attempts to create the service-linked role for your account so that required resources in other AWS services can be managed on your behalf. However, if the IAM user that makes the call does not have permissions to create the service-linked role, it is not created. For more information, see Using Service-Linked Roles for Amazon ECS in the Amazon Elastic Container Service Developer Guide. 
    */
  def createCluster(params: awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createCluster(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in a service drops below desiredCount, Amazon ECS spawns another copy of the task in the specified cluster. To update an existing service, see UpdateService. In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind a load balancer. The load balancer distributes traffic across the tasks that are associated with the service. For more information, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. You can optionally specify a deployment configuration for your service. The deployment is triggered by changing properties, such as the task definition or the desired count of a service, with an UpdateService operation. If a service is using the ECS deployment controller, the minimum healthy percent represents a lower limit on the number of tasks in a service that must remain in the RUNNING state during a deployment, as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to deploy without using additional cluster capacity. For example, if your service has a desired number of four tasks and a minimum healthy percent of 50%, the scheduler may stop two existing tasks to free up cluster capacity before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state; tasks for services that do use a load balancer are considered healthy if they are in the RUNNING state and they are reported as healthy by the load balancer. The default value for minimum healthy percent is 100%. If a service is using the ECS deployment controller, the maximum percent parameter represents an upper limit on the number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, as a percentage of the desired number of tasks (rounded down to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available). The default value for maximum percent is 200%. If a service is using the CODE_DEPLOY deployment controller and tasks that use the EC2 launch type, the minimum healthy percent and maximum percent values are only used to define the lower and upper limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the minimum healthy percent and maximum percent values are not used, although they are currently visible when describing your service. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer. The default value for a replica service for minimumHealthyPercent is 100%. The default value for a daemon service for minimumHealthyPercent is 0%. When the service scheduler launches new tasks, it determines task placement in your cluster using the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy) with the placementStrategy parameter):   Sort the valid container instances, giving priority to instances that have the fewest number of running tasks for this service in their respective Availability Zone. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.    
    */
  def createService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Runs and maintains a desired number of tasks from a specified task definition. If the number of tasks running in a service drops below desiredCount, Amazon ECS spawns another copy of the task in the specified cluster. To update an existing service, see UpdateService. In addition to maintaining the desired count of tasks in your service, you can optionally run your service behind a load balancer. The load balancer distributes traffic across the tasks that are associated with the service. For more information, see Service Load Balancing in the Amazon Elastic Container Service Developer Guide. You can optionally specify a deployment configuration for your service. The deployment is triggered by changing properties, such as the task definition or the desired count of a service, with an UpdateService operation. If a service is using the ECS deployment controller, the minimum healthy percent represents a lower limit on the number of tasks in a service that must remain in the RUNNING state during a deployment, as a percentage of the desired number of tasks (rounded up to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to deploy without using additional cluster capacity. For example, if your service has a desired number of four tasks and a minimum healthy percent of 50%, the scheduler may stop two existing tasks to free up cluster capacity before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state; tasks for services that do use a load balancer are considered healthy if they are in the RUNNING state and they are reported as healthy by the load balancer. The default value for minimum healthy percent is 100%. If a service is using the ECS deployment controller, the maximum percent parameter represents an upper limit on the number of tasks in a service that are allowed in the RUNNING or PENDING state during a deployment, as a percentage of the desired number of tasks (rounded down to the nearest integer), and while any container instances are in the DRAINING state if the service contains tasks using the EC2 launch type. This parameter enables you to define the deployment batch size. For example, if your service has a desired number of four tasks and a maximum percent value of 200%, the scheduler may start four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available). The default value for maximum percent is 200%. If a service is using the CODE_DEPLOY deployment controller and tasks that use the EC2 launch type, the minimum healthy percent and maximum percent values are only used to define the lower and upper limit on the number of the tasks in the service that remain in the RUNNING state while the container instances are in the DRAINING state. If the tasks in the service use the Fargate launch type, the minimum healthy percent and maximum percent values are not used, although they are currently visible when describing your service. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that do use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer. The default value for a replica service for minimumHealthyPercent is 100%. The default value for a daemon service for minimumHealthyPercent is 0%. When the service scheduler launches new tasks, it determines task placement in your cluster using the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy) with the placementStrategy parameter):   Sort the valid container instances, giving priority to instances that have the fewest number of running tasks for this service in their respective Availability Zone. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.    
    */
  def createService(params: awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createService(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.CreateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the ARN and resource ID format of a resource for a specified IAM user, IAM role, or the root user for an account. You can specify whether the new ARN and resource ID format are disabled for new resources that are created.
    */
  def deleteAccountSetting(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAccountSetting(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the ARN and resource ID format of a resource for a specified IAM user, IAM role, or the root user for an account. You can specify whether the new ARN and resource ID format are disabled for new resources that are created.
    */
  def deleteAccountSetting(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAccountSetting(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more custom attributes from an Amazon ECS resource.
    */
  def deleteAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes one or more custom attributes from an Amazon ECS resource.
    */
  def deleteAttributes(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAttributes(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified cluster. You must deregister all container instances from this cluster before you may delete it. You can list the container instances in a cluster with ListContainerInstances and deregister them with DeregisterContainerInstance.
    */
  def deleteCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified cluster. You must deregister all container instances from this cluster before you may delete it. You can list the container instances in a cluster with ListContainerInstances and deregister them with DeregisterContainerInstance.
    */
  def deleteCluster(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteCluster(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteClusterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified service within a cluster. You can delete a service if you have no running tasks in it and the desired task count is zero. If the service is actively maintaining tasks, you cannot delete it, and you must update the service to a desired task count of zero. For more information, see UpdateService.  When you delete a service, if there are still running tasks that require cleanup, the service status moves from ACTIVE to DRAINING, and the service is no longer visible in the console or in the ListServices API operation. After the tasks have stopped, then the service status moves from DRAINING to INACTIVE. Services in the DRAINING or INACTIVE status can still be viewed with the DescribeServices API operation. However, in the future, INACTIVE services may be cleaned up and purged from Amazon ECS record keeping, and DescribeServices calls on those services return a ServiceNotFoundException error.   If you attempt to create a new service with the same name as an existing service in either ACTIVE or DRAINING status, you receive an error. 
    */
  def deleteService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a specified service within a cluster. You can delete a service if you have no running tasks in it and the desired task count is zero. If the service is actively maintaining tasks, you cannot delete it, and you must update the service to a desired task count of zero. For more information, see UpdateService.  When you delete a service, if there are still running tasks that require cleanup, the service status moves from ACTIVE to DRAINING, and the service is no longer visible in the console or in the ListServices API operation. After the tasks have stopped, then the service status moves from DRAINING to INACTIVE. Services in the DRAINING or INACTIVE status can still be viewed with the DescribeServices API operation. However, in the future, INACTIVE services may be cleaned up and purged from Amazon ECS record keeping, and DescribeServices calls on those services return a ServiceNotFoundException error.   If you attempt to create a new service with the same name as an existing service in either ACTIVE or DRAINING status, you receive an error. 
    */
  def deleteService(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteService(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeleteServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to run tasks. If you intend to use the container instance for some other purpose after deregistration, you should stop all of the tasks running on the container instance before deregistration. That prevents any orphaned tasks from consuming resources. Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2 instance. If you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop billing.  If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your cluster (stopped container instances or instances with disconnected agents are not automatically deregistered when terminated). 
    */
  def deregisterContainerInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterContainerInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters an Amazon ECS container instance from the specified cluster. This instance is no longer available to run tasks. If you intend to use the container instance for some other purpose after deregistration, you should stop all of the tasks running on the container instance before deregistration. That prevents any orphaned tasks from consuming resources. Deregistering a container instance removes the instance from a cluster, but it does not terminate the EC2 instance. If you are finished using the instance, be sure to terminate it in the Amazon EC2 console to stop billing.  If you terminate a running container instance, Amazon ECS automatically deregisters the instance from your cluster (stopped container instances or instances with disconnected agents are not automatically deregistered when terminated). 
    */
  def deregisterContainerInstance(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterContainerInstance(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters the specified task definition by family and revision. Upon deregistration, the task definition is marked as INACTIVE. Existing tasks and services that reference an INACTIVE task definition continue to run without disruption. Existing services that reference an INACTIVE task definition can still scale up or down by modifying the service's desired count. You cannot use an INACTIVE task definition to run new tasks or create new services, and you cannot update an existing service to reference an INACTIVE task definition. However, there may be up to a 10-minute window following deregistration where these restrictions have not yet taken effect.  At this time, INACTIVE task definitions remain discoverable in your account indefinitely. However, this behavior is subject to change in the future, so you should not rely on INACTIVE task definitions persisting beyond the lifecycle of any associated tasks and services. 
    */
  def deregisterTaskDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterTaskDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deregisters the specified task definition by family and revision. Upon deregistration, the task definition is marked as INACTIVE. Existing tasks and services that reference an INACTIVE task definition continue to run without disruption. Existing services that reference an INACTIVE task definition can still scale up or down by modifying the service's desired count. You cannot use an INACTIVE task definition to run new tasks or create new services, and you cannot update an existing service to reference an INACTIVE task definition. However, there may be up to a 10-minute window following deregistration where these restrictions have not yet taken effect.  At this time, INACTIVE task definitions remain discoverable in your account indefinitely. However, this behavior is subject to change in the future, so you should not rely on INACTIVE task definitions persisting beyond the lifecycle of any associated tasks and services. 
    */
  def deregisterTaskDefinition(params: awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deregisterTaskDefinition(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DeregisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your clusters.
    */
  def describeClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes one or more of your clusters.
    */
  def describeClusters(params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeClusters(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes Amazon Elastic Container Service container instances. Returns metadata about registered and remaining resources on each container instance requested.
    */
  def describeContainerInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContainerInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes Amazon Elastic Container Service container instances. Returns metadata about registered and remaining resources on each container instance requested.
    */
  def describeContainerInstances(params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeContainerInstances(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified services running in your cluster.
    */
  def describeServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the specified services running in your cluster.
    */
  def describeServices(params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServices(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a task definition. You can specify a family and revision to find information about a specific task definition, or you can simply specify the family to find the latest ACTIVE revision in that family.  You can only describe INACTIVE task definitions while an active task or service references them. 
    */
  def describeTaskDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTaskDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a task definition. You can specify a family and revision to find information about a specific task definition, or you can simply specify the family to find the latest ACTIVE revision in that family.  You can only describe INACTIVE task definitions while an active task or service references them. 
    */
  def describeTaskDefinition(params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTaskDefinition(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a specified task or tasks.
    */
  def describeTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a specified task or tasks.
    */
  def describeTasks(params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeTasks(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Returns an endpoint for the Amazon ECS agent to poll for updates.
    */
  def discoverPollEndpoint(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverPollEndpoint(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Returns an endpoint for the Amazon ECS agent to poll for updates.
    */
  def discoverPollEndpoint(params: awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def discoverPollEndpoint(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DiscoverPollEndpointResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the account settings for an Amazon ECS resource for a specified principal.
    */
  def listAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the account settings for an Amazon ECS resource for a specified principal.
    */
  def listAccountSettings(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccountSettings(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the attributes for Amazon ECS resources within a specified target type and cluster. When you specify a target type and cluster, ListAttributes returns a list of attribute objects, one for each attribute on each resource. You can filter the list of results to a single attribute name to only return results that have that name. You can also filter the results by attribute name and value, for example, to see which container instances in a cluster are running a Linux AMI (ecs.os-type=linux). 
    */
  def listAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the attributes for Amazon ECS resources within a specified target type and cluster. When you specify a target type and cluster, ListAttributes returns a list of attribute objects, one for each attribute on each resource. You can filter the list of results to a single attribute name to only return results that have that name. You can also filter the results by attribute name and value, for example, to see which container instances in a cluster are running a Linux AMI (ecs.os-type=linux). 
    */
  def listAttributes(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAttributes(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing clusters.
    */
  def listClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of existing clusters.
    */
  def listClusters(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listClusters(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListClustersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of container instances in a specified cluster. You can filter the results of a ListContainerInstances operation with cluster query language statements inside the filter parameter. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  def listContainerInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listContainerInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of container instances in a specified cluster. You can filter the results of a ListContainerInstances operation with cluster query language statements inside the filter parameter. For more information, see Cluster Query Language in the Amazon Elastic Container Service Developer Guide.
    */
  def listContainerInstances(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listContainerInstances(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListContainerInstancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the services that are running in a specified cluster.
    */
  def listServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the services that are running in a specified cluster.
    */
  def listServices(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listServices(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for an Amazon ECS resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * List the tags for an Amazon ECS resource.
    */
  def listTagsForResource(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTagsForResource(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of task definition families that are registered to your account (which may include task definition families that no longer have any ACTIVE task definition revisions). You can filter out task definition families that do not contain any ACTIVE task definition revisions by setting the status parameter to ACTIVE. You can also filter the results with the familyPrefix parameter.
    */
  def listTaskDefinitionFamilies(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTaskDefinitionFamilies(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of task definition families that are registered to your account (which may include task definition families that no longer have any ACTIVE task definition revisions). You can filter out task definition families that do not contain any ACTIVE task definition revisions by setting the status parameter to ACTIVE. You can also filter the results with the familyPrefix parameter.
    */
  def listTaskDefinitionFamilies(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTaskDefinitionFamilies(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionFamiliesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of task definitions that are registered to your account. You can filter the results by family name with the familyPrefix parameter or by status with the status parameter.
    */
  def listTaskDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTaskDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of task definitions that are registered to your account. You can filter the results by family name with the familyPrefix parameter or by status with the status parameter.
    */
  def listTaskDefinitions(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTaskDefinitions(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTaskDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of tasks for a specified cluster. You can filter the results by family name, by a particular container instance, or by the desired status of the task with the family, containerInstance, and desiredStatus parameters. Recently stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned results for at least one hour. 
    */
  def listTasks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTasks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of tasks for a specified cluster. You can filter the results by family name, by a particular container instance, or by the desired status of the task with the family, containerInstance, and desiredStatus parameters. Recently stopped tasks might appear in the returned results. Currently, stopped tasks appear in the returned results for at least one hour. 
    */
  def listTasks(params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listTasks(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.ListTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the ARN and resource ID format of a resource for a specified IAM user, IAM role, or the root user for an account. You can specify whether the new ARN and resource ID format are enabled for new resources that are created. Enabling this setting is required to use new Amazon ECS features such as resource tagging.
    */
  def putAccountSetting(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAccountSetting(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the ARN and resource ID format of a resource for a specified IAM user, IAM role, or the root user for an account. You can specify whether the new ARN and resource ID format are enabled for new resources that are created. Enabling this setting is required to use new Amazon ECS features such as resource tagging.
    */
  def putAccountSetting(params: awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAccountSetting(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAccountSettingResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create or update an attribute on an Amazon ECS resource. If the attribute does not exist, it is created. If the attribute exists, its value is replaced with the specified value. To delete an attribute, use DeleteAttributes. For more information, see Attributes in the Amazon Elastic Container Service Developer Guide.
    */
  def putAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Create or update an attribute on an Amazon ECS resource. If the attribute does not exist, it is created. If the attribute exists, its value is replaced with the specified value. To delete an attribute, use DeleteAttributes. For more information, see Attributes in the Amazon Elastic Container Service Developer Guide.
    */
  def putAttributes(params: awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putAttributes(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.PutAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Registers an EC2 instance into the specified cluster. This instance becomes available to place containers on.
    */
  def registerContainerInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerContainerInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Registers an EC2 instance into the specified cluster. This instance becomes available to place containers on.
    */
  def registerContainerInstance(params: awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerContainerInstance(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterContainerInstanceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers a new task definition from the supplied family and containerDefinitions. Optionally, you can add data volumes to your containers with the volumes parameter. For more information about task definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide. You can specify an IAM role for your task with the taskRoleArn parameter. When you specify an IAM role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to the AWS services that are specified in the IAM policy associated with the role. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide. You can specify a Docker networking mode for the containers in your task definition with the networkMode parameter. The available network modes correspond to those described in Network settings in the Docker run reference. If you specify the awsvpc network mode, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  def registerTaskDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerTaskDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers a new task definition from the supplied family and containerDefinitions. Optionally, you can add data volumes to your containers with the volumes parameter. For more information about task definition parameters and defaults, see Amazon ECS Task Definitions in the Amazon Elastic Container Service Developer Guide. You can specify an IAM role for your task with the taskRoleArn parameter. When you specify an IAM role for a task, its containers can then use the latest versions of the AWS CLI or SDKs to make API requests to the AWS services that are specified in the IAM policy associated with the role. For more information, see IAM Roles for Tasks in the Amazon Elastic Container Service Developer Guide. You can specify a Docker networking mode for the containers in your task definition with the networkMode parameter. The available network modes correspond to those described in Network settings in the Docker run reference. If you specify the awsvpc network mode, the task is allocated an elastic network interface, and you must specify a NetworkConfiguration when you create a service or run a task with the task definition. For more information, see Task Networking in the Amazon Elastic Container Service Developer Guide.
    */
  def registerTaskDefinition(params: awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def registerTaskDefinition(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RegisterTaskDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a new task using the specified task definition. You can allow Amazon ECS to place tasks for you, or you can customize how Amazon ECS places tasks using placement constraints and placement strategies. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide. Alternatively, you can use StartTask to use your own scheduler or place tasks manually on specific container instances. The Amazon ECS API follows an eventual consistency model, due to the distributed nature of the system supporting the API. This means that the result of an API command you run that affects your Amazon ECS resources might not be immediately visible to all subsequent commands you run. Keep this in mind when you carry out an API command that immediately follows a previous API command. To manage eventual consistency, you can do the following:   Confirm the state of the resource before you run a command to modify it. Run the DescribeTasks command using an exponential backoff algorithm to ensure that you allow enough time for the previous command to propagate through the system. To do this, run the DescribeTasks command repeatedly, starting with a couple of seconds of wait time and increasing gradually up to five minutes of wait time.   Add wait time between subsequent commands, even if the DescribeTasks command returns an accurate response. Apply an exponential backoff algorithm starting with a couple of seconds of wait time, and increase gradually up to about five minutes of wait time.  
    */
  def runTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a new task using the specified task definition. You can allow Amazon ECS to place tasks for you, or you can customize how Amazon ECS places tasks using placement constraints and placement strategies. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide. Alternatively, you can use StartTask to use your own scheduler or place tasks manually on specific container instances. The Amazon ECS API follows an eventual consistency model, due to the distributed nature of the system supporting the API. This means that the result of an API command you run that affects your Amazon ECS resources might not be immediately visible to all subsequent commands you run. Keep this in mind when you carry out an API command that immediately follows a previous API command. To manage eventual consistency, you can do the following:   Confirm the state of the resource before you run a command to modify it. Run the DescribeTasks command using an exponential backoff algorithm to ensure that you allow enough time for the previous command to propagate through the system. To do this, run the DescribeTasks command repeatedly, starting with a couple of seconds of wait time and increasing gradually up to five minutes of wait time.   Add wait time between subsequent commands, even if the DescribeTasks command returns an accurate response. Apply an exponential backoff algorithm starting with a couple of seconds of wait time, and increase gradually up to about five minutes of wait time.  
    */
  def runTask(params: awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def runTask(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.RunTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a new task from the specified task definition on the specified container instance or instances. Alternatively, you can use RunTask to place tasks for you. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  def startTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts a new task from the specified task definition on the specified container instance or instances. Alternatively, you can use RunTask to place tasks for you. For more information, see Scheduling Tasks in the Amazon Elastic Container Service Developer Guide.
    */
  def startTask(params: awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startTask(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StartTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running task. Any tags associated with the task will be deleted. When StopTask is called on a task, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM value and a default 30-second timeout, after which the SIGKILL value is sent and the containers are forcibly stopped. If the container handles the SIGTERM value gracefully and exits within 30 seconds from receiving it, no SIGKILL value is sent.  The default 30-second timeout can be configured on the Amazon ECS container agent with the ECS_CONTAINER_STOP_TIMEOUT variable. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  def stopTask(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTask(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops a running task. Any tags associated with the task will be deleted. When StopTask is called on a task, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM value and a default 30-second timeout, after which the SIGKILL value is sent and the containers are forcibly stopped. If the container handles the SIGTERM value gracefully and exits within 30 seconds from receiving it, no SIGKILL value is sent.  The default 30-second timeout can be configured on the Amazon ECS container agent with the ECS_CONTAINER_STOP_TIMEOUT variable. For more information, see Amazon ECS Container Agent Configuration in the Amazon Elastic Container Service Developer Guide. 
    */
  def stopTask(params: awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopTask(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.StopTaskResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a container changed states.
    */
  def submitContainerStateChange(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitContainerStateChange(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a container changed states.
    */
  def submitContainerStateChange(params: awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitContainerStateChange(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitContainerStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a task changed states.
    */
  def submitTaskStateChange(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitTaskStateChange(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    *  This action is only used by the Amazon ECS agent, and it is not intended for use outside of the agent.  Sent to acknowledge that a task changed states.
    */
  def submitTaskStateChange(params: awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def submitTaskStateChange(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.SubmitTaskStateChangeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates the specified tags to a resource with the specified resourceArn. If existing tags on a resource are not specified in the request parameters, they are not changed. When a resource is deleted, the tags associated with that resource are deleted as well.
    */
  def tagResource(params: awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def tagResource(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes specified tags from a resource.
    */
  def untagResource(params: awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def untagResource(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent does not interrupt running tasks or services on the container instance. The process for updating the agent differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another operating system.  UpdateContainerAgent requires the Amazon ECS-optimized AMI or Amazon Linux with the ecs-init service installed and running. For help updating the Amazon ECS container agent on other operating systems, see Manually Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide.
    */
  def updateContainerAgent(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateContainerAgent(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Amazon ECS container agent on a specified container instance. Updating the Amazon ECS container agent does not interrupt running tasks or services on the container instance. The process for updating the agent differs depending on whether your container instance was launched with the Amazon ECS-optimized AMI or another operating system.  UpdateContainerAgent requires the Amazon ECS-optimized AMI or Amazon Linux with the ecs-init service installed and running. For help updating the Amazon ECS container agent on other operating systems, see Manually Updating the Amazon ECS Container Agent in the Amazon Elastic Container Service Developer Guide.
    */
  def updateContainerAgent(params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateContainerAgent(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerAgentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the status of an Amazon ECS container instance. You can change the status of a container instance to DRAINING to manually remove an instance from a cluster, for example to perform system updates, update the Docker daemon, or scale down the cluster size.  When you set a container instance to DRAINING, Amazon ECS prevents new tasks from being scheduled for placement on the container instance and replacement service tasks are started on other container instances in the cluster if the resources are available. Service tasks on the container instance that are in the PENDING state are stopped immediately. Service tasks on the container instance that are in the RUNNING state are stopped and replaced according to the service's deployment configuration parameters, minimumHealthyPercent and maximumPercent. You can change the deployment configuration of your service using UpdateService.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during task replacement. For example, desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. If the minimum is 100%, the service scheduler can't remove existing tasks until the replacement tasks are considered healthy. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during task replacement, which enables you to define the replacement batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four tasks to be drained, provided that the cluster resources required to do this are available. If the maximum is 100%, then replacement tasks can't start until the draining tasks have stopped.   Any PENDING or RUNNING tasks that do not belong to a service are not affected. You must wait for them to finish or stop them manually. A container instance has completed draining when it has no more RUNNING tasks. You can verify this using ListTasks. When you set a container instance to ACTIVE, the Amazon ECS scheduler can begin scheduling tasks on the instance again.
    */
  def updateContainerInstancesState(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateContainerInstancesState(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the status of an Amazon ECS container instance. You can change the status of a container instance to DRAINING to manually remove an instance from a cluster, for example to perform system updates, update the Docker daemon, or scale down the cluster size.  When you set a container instance to DRAINING, Amazon ECS prevents new tasks from being scheduled for placement on the container instance and replacement service tasks are started on other container instances in the cluster if the resources are available. Service tasks on the container instance that are in the PENDING state are stopped immediately. Service tasks on the container instance that are in the RUNNING state are stopped and replaced according to the service's deployment configuration parameters, minimumHealthyPercent and maximumPercent. You can change the deployment configuration of your service using UpdateService.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during task replacement. For example, desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. If the minimum is 100%, the service scheduler can't remove existing tasks until the replacement tasks are considered healthy. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during task replacement, which enables you to define the replacement batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four tasks to be drained, provided that the cluster resources required to do this are available. If the maximum is 100%, then replacement tasks can't start until the draining tasks have stopped.   Any PENDING or RUNNING tasks that do not belong to a service are not affected. You must wait for them to finish or stop them manually. A container instance has completed draining when it has no more RUNNING tasks. You can verify this using ListTasks. When you set a container instance to ACTIVE, the Amazon ECS scheduler can begin scheduling tasks on the instance again.
    */
  def updateContainerInstancesState(params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateContainerInstancesState(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateContainerInstancesStateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a service. For services using the rolling update (ECS) deployment controller, the desired count, deployment configuration, network configuration, or task definition used can be updated. For services using the blue/green (CODE_DEPLOY) deployment controller, only the desired count, deployment configuration, and health check grace period can be updated using this API. If the network configuration, platform version, or task definition need to be updated, a new AWS CodeDeploy deployment should be created. For more information, see CreateDeployment in the AWS CodeDeploy API Reference. You can add to or subtract from the number of instantiations of a task definition in a service by specifying the cluster that the service is running in and a new desiredCount parameter. If you have updated the Docker image of your application, you can create a new task definition with that image and deploy it to your service. The service scheduler uses the minimum healthy percent and maximum percent parameters (in the service's deployment configuration) to determine the deployment strategy.  If your updated Docker image uses the same tag as what is in the existing task definition for your service (for example, my_image:latest), you do not need to create a new revision of your task definition. You can update the service using the forceNewDeployment option. The new tasks launched by the deployment pull the current image/tag combination from your repository when they start.  You can also update the deployment configuration of a service. When a deployment is triggered by updating the task definition of a service, the service scheduler uses the deployment configuration parameters, minimumHealthyPercent and maximumPercent, to determine the deployment strategy.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during a deployment. For example, if desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during a deployment, which enables you to define the deployment batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available).   When UpdateService stops a task during a deployment, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM and a 30-second timeout, after which SIGKILL is sent and the containers are forcibly stopped. If the container handles the SIGTERM gracefully and exits within 30 seconds from receiving it, no SIGKILL is sent. When the service scheduler launches new tasks, it determines task placement in your cluster with the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy):   Sort the valid container instances by the fewest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.     When the service scheduler stops running tasks, it attempts to maintain balance across the Availability Zones in your cluster using the following logic:    Sort the container instances by the largest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have two, container instances in either zone B or C are considered optimal for termination.   Stop the task on a container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the largest number of running tasks for this service.  
    */
  def updateService(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateService(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Modifies the parameters of a service. For services using the rolling update (ECS) deployment controller, the desired count, deployment configuration, network configuration, or task definition used can be updated. For services using the blue/green (CODE_DEPLOY) deployment controller, only the desired count, deployment configuration, and health check grace period can be updated using this API. If the network configuration, platform version, or task definition need to be updated, a new AWS CodeDeploy deployment should be created. For more information, see CreateDeployment in the AWS CodeDeploy API Reference. You can add to or subtract from the number of instantiations of a task definition in a service by specifying the cluster that the service is running in and a new desiredCount parameter. If you have updated the Docker image of your application, you can create a new task definition with that image and deploy it to your service. The service scheduler uses the minimum healthy percent and maximum percent parameters (in the service's deployment configuration) to determine the deployment strategy.  If your updated Docker image uses the same tag as what is in the existing task definition for your service (for example, my_image:latest), you do not need to create a new revision of your task definition. You can update the service using the forceNewDeployment option. The new tasks launched by the deployment pull the current image/tag combination from your repository when they start.  You can also update the deployment configuration of a service. When a deployment is triggered by updating the task definition of a service, the service scheduler uses the deployment configuration parameters, minimumHealthyPercent and maximumPercent, to determine the deployment strategy.   If minimumHealthyPercent is below 100%, the scheduler can ignore desiredCount temporarily during a deployment. For example, if desiredCount is four tasks, a minimum of 50% allows the scheduler to stop two existing tasks before starting two new tasks. Tasks for services that do not use a load balancer are considered healthy if they are in the RUNNING state. Tasks for services that use a load balancer are considered healthy if they are in the RUNNING state and the container instance they are hosted on is reported as healthy by the load balancer.   The maximumPercent parameter represents an upper limit on the number of running tasks during a deployment, which enables you to define the deployment batch size. For example, if desiredCount is four tasks, a maximum of 200% starts four new tasks before stopping the four older tasks (provided that the cluster resources required to do this are available).   When UpdateService stops a task during a deployment, the equivalent of docker stop is issued to the containers running in the task. This results in a SIGTERM and a 30-second timeout, after which SIGKILL is sent and the containers are forcibly stopped. If the container handles the SIGTERM gracefully and exits within 30 seconds from receiving it, no SIGKILL is sent. When the service scheduler launches new tasks, it determines task placement in your cluster with the following logic:   Determine which of the container instances in your cluster can support your service's task definition (for example, they have the required CPU, memory, ports, and container instance attributes).   By default, the service scheduler attempts to balance tasks across Availability Zones in this manner (although you can choose a different placement strategy):   Sort the valid container instances by the fewest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have zero, valid container instances in either zone B or C are considered optimal for placement.   Place the new service task on a valid container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the fewest number of running tasks for this service.     When the service scheduler stops running tasks, it attempts to maintain balance across the Availability Zones in your cluster using the following logic:    Sort the container instances by the largest number of running tasks for this service in the same Availability Zone as the instance. For example, if zone A has one running service task and zones B and C each have two, container instances in either zone B or C are considered optimal for termination.   Stop the task on a container instance in an optimal Availability Zone (based on the previous steps), favoring container instances with the largest number of running tasks for this service.  
    */
  def updateService(params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateService(
    params: awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.UpdateServiceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the servicesInactive state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesInactive(state: awsDashSdkLib.awsDashSdkLibStrings.servicesInactive): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_servicesInactive(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesInactive,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the servicesInactive state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesInactive(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesInactive,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_servicesInactive(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesInactive,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the servicesStable state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesStable(state: awsDashSdkLib.awsDashSdkLibStrings.servicesStable): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_servicesStable(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesStable,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the servicesStable state by periodically calling the underlying ECS.describeServicesoperation every 15 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_servicesStable(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesStable,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_servicesStable(
    state: awsDashSdkLib.awsDashSdkLibStrings.servicesStable,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the tasksRunning state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksRunning(state: awsDashSdkLib.awsDashSdkLibStrings.tasksRunning): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_tasksRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksRunning,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the tasksRunning state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksRunning,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_tasksRunning(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksRunning,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the tasksStopped state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksStopped(state: awsDashSdkLib.awsDashSdkLibStrings.tasksStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_tasksStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Waits for the tasksStopped state by periodically calling the underlying ECS.describeTasksoperation every 6 seconds (at most 100 times).
    */
  @JSName("waitFor")
  def waitFor_tasksStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksStopped,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  @JSName("waitFor")
  def waitFor_tasksStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.tasksStopped,
    params: awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsEcsMod.ECSNs.DescribeTasksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

