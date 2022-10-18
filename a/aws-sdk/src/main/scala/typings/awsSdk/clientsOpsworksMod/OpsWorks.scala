package typings.awsSdk.clientsOpsworksMod

import typings.awsSdk.anon.DescribeAppsRequestwaiter
import typings.awsSdk.anon.DescribeDeploymentsReques
import typings.awsSdk.anon.DescribeInstancesRequestwInstanceIds
import typings.awsSdk.awsSdkStrings.appExists
import typings.awsSdk.awsSdkStrings.deploymentSuccessful
import typings.awsSdk.awsSdkStrings.instanceOnline
import typings.awsSdk.awsSdkStrings.instanceRegistered
import typings.awsSdk.awsSdkStrings.instanceStopped
import typings.awsSdk.awsSdkStrings.instanceTerminated
import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpsWorks extends Service {
  
  /**
    * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def assignInstance(): Request[js.Object, AWSError] = js.native
  def assignInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def assignInstance(params: AssignInstanceRequest): Request[js.Object, AWSError] = js.native
  def assignInstance(
    params: AssignInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def assignVolume(): Request[js.Object, AWSError] = js.native
  def assignVolume(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def assignVolume(params: AssignVolumeRequest): Request[js.Object, AWSError] = js.native
  def assignVolume(
    params: AssignVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def associateElasticIp(): Request[js.Object, AWSError] = js.native
  def associateElasticIp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def associateElasticIp(params: AssociateElasticIpRequest): Request[js.Object, AWSError] = js.native
  def associateElasticIp(
    params: AssociateElasticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def attachElasticLoadBalancer(): Request[js.Object, AWSError] = js.native
  def attachElasticLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def attachElasticLoadBalancer(params: AttachElasticLoadBalancerRequest): Request[js.Object, AWSError] = js.native
  def attachElasticLoadBalancer(
    params: AttachElasticLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def cloneStack(): Request[CloneStackResult, AWSError] = js.native
  def cloneStack(callback: js.Function2[/* err */ AWSError, /* data */ CloneStackResult, Unit]): Request[CloneStackResult, AWSError] = js.native
  /**
    * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def cloneStack(params: CloneStackRequest): Request[CloneStackResult, AWSError] = js.native
  def cloneStack(
    params: CloneStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CloneStackResult, Unit]
  ): Request[CloneStackResult, AWSError] = js.native
  
  @JSName("config")
  var config_OpsWorks: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createApp(): Request[CreateAppResult, AWSError] = js.native
  def createApp(callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]): Request[CreateAppResult, AWSError] = js.native
  /**
    * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createApp(params: CreateAppRequest): Request[CreateAppResult, AWSError] = js.native
  def createApp(
    params: CreateAppRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAppResult, Unit]
  ): Request[CreateAppResult, AWSError] = js.native
  
  /**
    * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createDeployment(): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]): Request[CreateDeploymentResult, AWSError] = js.native
  /**
    * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createDeployment(params: CreateDeploymentRequest): Request[CreateDeploymentResult, AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateDeploymentResult, Unit]
  ): Request[CreateDeploymentResult, AWSError] = js.native
  
  /**
    * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createInstance(): Request[CreateInstanceResult, AWSError] = js.native
  def createInstance(callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResult, Unit]): Request[CreateInstanceResult, AWSError] = js.native
  /**
    * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createInstance(params: CreateInstanceRequest): Request[CreateInstanceResult, AWSError] = js.native
  def createInstance(
    params: CreateInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateInstanceResult, Unit]
  ): Request[CreateInstanceResult, AWSError] = js.native
  
  /**
    * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createLayer(): Request[CreateLayerResult, AWSError] = js.native
  def createLayer(callback: js.Function2[/* err */ AWSError, /* data */ CreateLayerResult, Unit]): Request[CreateLayerResult, AWSError] = js.native
  /**
    * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def createLayer(params: CreateLayerRequest): Request[CreateLayerResult, AWSError] = js.native
  def createLayer(
    params: CreateLayerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateLayerResult, Unit]
  ): Request[CreateLayerResult, AWSError] = js.native
  
  /**
    * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def createStack(): Request[CreateStackResult, AWSError] = js.native
  def createStack(callback: js.Function2[/* err */ AWSError, /* data */ CreateStackResult, Unit]): Request[CreateStackResult, AWSError] = js.native
  /**
    * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def createStack(params: CreateStackRequest): Request[CreateStackResult, AWSError] = js.native
  def createStack(
    params: CreateStackRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateStackResult, Unit]
  ): Request[CreateStackResult, AWSError] = js.native
  
  /**
    * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def createUserProfile(): Request[CreateUserProfileResult, AWSError] = js.native
  def createUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResult, Unit]): Request[CreateUserProfileResult, AWSError] = js.native
  /**
    * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def createUserProfile(params: CreateUserProfileRequest): Request[CreateUserProfileResult, AWSError] = js.native
  def createUserProfile(
    params: CreateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserProfileResult, Unit]
  ): Request[CreateUserProfileResult, AWSError] = js.native
  
  /**
    * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteApp(): Request[js.Object, AWSError] = js.native
  def deleteApp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteApp(params: DeleteAppRequest): Request[js.Object, AWSError] = js.native
  def deleteApp(params: DeleteAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteInstance(): Request[js.Object, AWSError] = js.native
  def deleteInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteInstance(params: DeleteInstanceRequest): Request[js.Object, AWSError] = js.native
  def deleteInstance(
    params: DeleteInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteLayer(): Request[js.Object, AWSError] = js.native
  def deleteLayer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteLayer(params: DeleteLayerRequest): Request[js.Object, AWSError] = js.native
  def deleteLayer(params: DeleteLayerRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteStack(): Request[js.Object, AWSError] = js.native
  def deleteStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deleteStack(params: DeleteStackRequest): Request[js.Object, AWSError] = js.native
  def deleteStack(params: DeleteStackRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def deleteUserProfile(): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def deleteUserProfile(params: DeleteUserProfileRequest): Request[js.Object, AWSError] = js.native
  def deleteUserProfile(
    params: DeleteUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
    */
  def deregisterEcsCluster(): Request[js.Object, AWSError] = js.native
  def deregisterEcsCluster(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see https://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
    */
  def deregisterEcsCluster(params: DeregisterEcsClusterRequest): Request[js.Object, AWSError] = js.native
  def deregisterEcsCluster(
    params: DeregisterEcsClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterElasticIp(): Request[js.Object, AWSError] = js.native
  def deregisterElasticIp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterElasticIp(params: DeregisterElasticIpRequest): Request[js.Object, AWSError] = js.native
  def deregisterElasticIp(
    params: DeregisterElasticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterInstance(): Request[js.Object, AWSError] = js.native
  def deregisterInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterInstance(params: DeregisterInstanceRequest): Request[js.Object, AWSError] = js.native
  def deregisterInstance(
    params: DeregisterInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterRdsDbInstance(): Request[js.Object, AWSError] = js.native
  def deregisterRdsDbInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterRdsDbInstance(params: DeregisterRdsDbInstanceRequest): Request[js.Object, AWSError] = js.native
  def deregisterRdsDbInstance(
    params: DeregisterRdsDbInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterVolume(): Request[js.Object, AWSError] = js.native
  def deregisterVolume(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def deregisterVolume(params: DeregisterVolumeRequest): Request[js.Object, AWSError] = js.native
  def deregisterVolume(
    params: DeregisterVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
    */
  def describeAgentVersions(): Request[DescribeAgentVersionsResult, AWSError] = js.native
  def describeAgentVersions(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentVersionsResult, Unit]): Request[DescribeAgentVersionsResult, AWSError] = js.native
  /**
    * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
    */
  def describeAgentVersions(params: DescribeAgentVersionsRequest): Request[DescribeAgentVersionsResult, AWSError] = js.native
  def describeAgentVersions(
    params: DescribeAgentVersionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAgentVersionsResult, Unit]
  ): Request[DescribeAgentVersionsResult, AWSError] = js.native
  
  /**
    * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeApps(): Request[DescribeAppsResult, AWSError] = js.native
  def describeApps(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppsResult, Unit]): Request[DescribeAppsResult, AWSError] = js.native
  /**
    * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeApps(params: DescribeAppsRequest): Request[DescribeAppsResult, AWSError] = js.native
  def describeApps(
    params: DescribeAppsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppsResult, Unit]
  ): Request[DescribeAppsResult, AWSError] = js.native
  
  /**
    * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeCommands(): Request[DescribeCommandsResult, AWSError] = js.native
  def describeCommands(callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommandsResult, Unit]): Request[DescribeCommandsResult, AWSError] = js.native
  /**
    * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeCommands(params: DescribeCommandsRequest): Request[DescribeCommandsResult, AWSError] = js.native
  def describeCommands(
    params: DescribeCommandsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeCommandsResult, Unit]
  ): Request[DescribeCommandsResult, AWSError] = js.native
  
  /**
    * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeDeployments(): Request[DescribeDeploymentsResult, AWSError] = js.native
  def describeDeployments(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentsResult, Unit]): Request[DescribeDeploymentsResult, AWSError] = js.native
  /**
    * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeDeployments(params: DescribeDeploymentsRequest): Request[DescribeDeploymentsResult, AWSError] = js.native
  def describeDeployments(
    params: DescribeDeploymentsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentsResult, Unit]
  ): Request[DescribeDeploymentsResult, AWSError] = js.native
  
  /**
    * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeEcsClusters(): Request[DescribeEcsClustersResult, AWSError] = js.native
  def describeEcsClusters(callback: js.Function2[/* err */ AWSError, /* data */ DescribeEcsClustersResult, Unit]): Request[DescribeEcsClustersResult, AWSError] = js.native
  /**
    * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeEcsClusters(params: DescribeEcsClustersRequest): Request[DescribeEcsClustersResult, AWSError] = js.native
  def describeEcsClusters(
    params: DescribeEcsClustersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeEcsClustersResult, Unit]
  ): Request[DescribeEcsClustersResult, AWSError] = js.native
  
  /**
    * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeElasticIps(): Request[DescribeElasticIpsResult, AWSError] = js.native
  def describeElasticIps(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticIpsResult, Unit]): Request[DescribeElasticIpsResult, AWSError] = js.native
  /**
    * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeElasticIps(params: DescribeElasticIpsRequest): Request[DescribeElasticIpsResult, AWSError] = js.native
  def describeElasticIps(
    params: DescribeElasticIpsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticIpsResult, Unit]
  ): Request[DescribeElasticIpsResult, AWSError] = js.native
  
  /**
    * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeElasticLoadBalancers(): Request[DescribeElasticLoadBalancersResult, AWSError] = js.native
  def describeElasticLoadBalancers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticLoadBalancersResult, Unit]): Request[DescribeElasticLoadBalancersResult, AWSError] = js.native
  /**
    * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeElasticLoadBalancers(params: DescribeElasticLoadBalancersRequest): Request[DescribeElasticLoadBalancersResult, AWSError] = js.native
  def describeElasticLoadBalancers(
    params: DescribeElasticLoadBalancersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeElasticLoadBalancersResult, Unit]
  ): Request[DescribeElasticLoadBalancersResult, AWSError] = js.native
  
  /**
    * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeInstances(): Request[DescribeInstancesResult, AWSError] = js.native
  def describeInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeInstances(params: DescribeInstancesRequest): Request[DescribeInstancesResult, AWSError] = js.native
  def describeInstances(
    params: DescribeInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  
  /**
    * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeLayers(): Request[DescribeLayersResult, AWSError] = js.native
  def describeLayers(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLayersResult, Unit]): Request[DescribeLayersResult, AWSError] = js.native
  /**
    * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeLayers(params: DescribeLayersRequest): Request[DescribeLayersResult, AWSError] = js.native
  def describeLayers(
    params: DescribeLayersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLayersResult, Unit]
  ): Request[DescribeLayersResult, AWSError] = js.native
  
  /**
    * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeLoadBasedAutoScaling(): Request[DescribeLoadBasedAutoScalingResult, AWSError] = js.native
  def describeLoadBasedAutoScaling(callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBasedAutoScalingResult, Unit]): Request[DescribeLoadBasedAutoScalingResult, AWSError] = js.native
  /**
    * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeLoadBasedAutoScaling(params: DescribeLoadBasedAutoScalingRequest): Request[DescribeLoadBasedAutoScalingResult, AWSError] = js.native
  def describeLoadBasedAutoScaling(
    params: DescribeLoadBasedAutoScalingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeLoadBasedAutoScalingResult, Unit]
  ): Request[DescribeLoadBasedAutoScalingResult, AWSError] = js.native
  
  /**
    * Describes a user's SSH information.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeMyUserProfile(): Request[DescribeMyUserProfileResult, AWSError] = js.native
  def describeMyUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ DescribeMyUserProfileResult, Unit]): Request[DescribeMyUserProfileResult, AWSError] = js.native
  
  /**
    * Describes the operating systems that are supported by AWS OpsWorks Stacks.
    */
  def describeOperatingSystems(): Request[DescribeOperatingSystemsResponse, AWSError] = js.native
  def describeOperatingSystems(callback: js.Function2[/* err */ AWSError, /* data */ DescribeOperatingSystemsResponse, Unit]): Request[DescribeOperatingSystemsResponse, AWSError] = js.native
  
  /**
    * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def describePermissions(): Request[DescribePermissionsResult, AWSError] = js.native
  def describePermissions(callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionsResult, Unit]): Request[DescribePermissionsResult, AWSError] = js.native
  /**
    * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def describePermissions(params: DescribePermissionsRequest): Request[DescribePermissionsResult, AWSError] = js.native
  def describePermissions(
    params: DescribePermissionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribePermissionsResult, Unit]
  ): Request[DescribePermissionsResult, AWSError] = js.native
  
  /**
    * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeRaidArrays(): Request[DescribeRaidArraysResult, AWSError] = js.native
  def describeRaidArrays(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRaidArraysResult, Unit]): Request[DescribeRaidArraysResult, AWSError] = js.native
  /**
    * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeRaidArrays(params: DescribeRaidArraysRequest): Request[DescribeRaidArraysResult, AWSError] = js.native
  def describeRaidArrays(
    params: DescribeRaidArraysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRaidArraysResult, Unit]
  ): Request[DescribeRaidArraysResult, AWSError] = js.native
  
  /**
    * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeRdsDbInstances(): Request[DescribeRdsDbInstancesResult, AWSError] = js.native
  def describeRdsDbInstances(callback: js.Function2[/* err */ AWSError, /* data */ DescribeRdsDbInstancesResult, Unit]): Request[DescribeRdsDbInstancesResult, AWSError] = js.native
  /**
    * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeRdsDbInstances(params: DescribeRdsDbInstancesRequest): Request[DescribeRdsDbInstancesResult, AWSError] = js.native
  def describeRdsDbInstances(
    params: DescribeRdsDbInstancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeRdsDbInstancesResult, Unit]
  ): Request[DescribeRdsDbInstancesResult, AWSError] = js.native
  
  /**
    * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeServiceErrors(): Request[DescribeServiceErrorsResult, AWSError] = js.native
  def describeServiceErrors(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceErrorsResult, Unit]): Request[DescribeServiceErrorsResult, AWSError] = js.native
  /**
    * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
    */
  def describeServiceErrors(params: DescribeServiceErrorsRequest): Request[DescribeServiceErrorsResult, AWSError] = js.native
  def describeServiceErrors(
    params: DescribeServiceErrorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServiceErrorsResult, Unit]
  ): Request[DescribeServiceErrorsResult, AWSError] = js.native
  
  /**
    * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStackProvisioningParameters(): Request[DescribeStackProvisioningParametersResult, AWSError] = js.native
  def describeStackProvisioningParameters(
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackProvisioningParametersResult, Unit]
  ): Request[DescribeStackProvisioningParametersResult, AWSError] = js.native
  /**
    * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStackProvisioningParameters(params: DescribeStackProvisioningParametersRequest): Request[DescribeStackProvisioningParametersResult, AWSError] = js.native
  def describeStackProvisioningParameters(
    params: DescribeStackProvisioningParametersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackProvisioningParametersResult, Unit]
  ): Request[DescribeStackProvisioningParametersResult, AWSError] = js.native
  
  /**
    * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStackSummary(): Request[DescribeStackSummaryResult, AWSError] = js.native
  def describeStackSummary(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSummaryResult, Unit]): Request[DescribeStackSummaryResult, AWSError] = js.native
  /**
    * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStackSummary(params: DescribeStackSummaryRequest): Request[DescribeStackSummaryResult, AWSError] = js.native
  def describeStackSummary(
    params: DescribeStackSummaryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStackSummaryResult, Unit]
  ): Request[DescribeStackSummaryResult, AWSError] = js.native
  
  /**
    * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStacks(): Request[DescribeStacksResult, AWSError] = js.native
  def describeStacks(callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksResult, Unit]): Request[DescribeStacksResult, AWSError] = js.native
  /**
    * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeStacks(params: DescribeStacksRequest): Request[DescribeStacksResult, AWSError] = js.native
  def describeStacks(
    params: DescribeStacksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeStacksResult, Unit]
  ): Request[DescribeStacksResult, AWSError] = js.native
  
  /**
    * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeTimeBasedAutoScaling(): Request[DescribeTimeBasedAutoScalingResult, AWSError] = js.native
  def describeTimeBasedAutoScaling(callback: js.Function2[/* err */ AWSError, /* data */ DescribeTimeBasedAutoScalingResult, Unit]): Request[DescribeTimeBasedAutoScalingResult, AWSError] = js.native
  /**
    * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeTimeBasedAutoScaling(params: DescribeTimeBasedAutoScalingRequest): Request[DescribeTimeBasedAutoScalingResult, AWSError] = js.native
  def describeTimeBasedAutoScaling(
    params: DescribeTimeBasedAutoScalingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeTimeBasedAutoScalingResult, Unit]
  ): Request[DescribeTimeBasedAutoScalingResult, AWSError] = js.native
  
  /**
    * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeUserProfiles(): Request[DescribeUserProfilesResult, AWSError] = js.native
  def describeUserProfiles(callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfilesResult, Unit]): Request[DescribeUserProfilesResult, AWSError] = js.native
  /**
    * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeUserProfiles(params: DescribeUserProfilesRequest): Request[DescribeUserProfilesResult, AWSError] = js.native
  def describeUserProfiles(
    params: DescribeUserProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeUserProfilesResult, Unit]
  ): Request[DescribeUserProfilesResult, AWSError] = js.native
  
  /**
    * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeVolumes(): Request[DescribeVolumesResult, AWSError] = js.native
  def describeVolumes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]): Request[DescribeVolumesResult, AWSError] = js.native
  /**
    * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def describeVolumes(params: DescribeVolumesRequest): Request[DescribeVolumesResult, AWSError] = js.native
  def describeVolumes(
    params: DescribeVolumesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeVolumesResult, Unit]
  ): Request[DescribeVolumesResult, AWSError] = js.native
  
  /**
    * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def detachElasticLoadBalancer(): Request[js.Object, AWSError] = js.native
  def detachElasticLoadBalancer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def detachElasticLoadBalancer(params: DetachElasticLoadBalancerRequest): Request[js.Object, AWSError] = js.native
  def detachElasticLoadBalancer(
    params: DetachElasticLoadBalancerRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def disassociateElasticIp(): Request[js.Object, AWSError] = js.native
  def disassociateElasticIp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def disassociateElasticIp(params: DisassociateElasticIpRequest): Request[js.Object, AWSError] = js.native
  def disassociateElasticIp(
    params: DisassociateElasticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def getHostnameSuggestion(): Request[GetHostnameSuggestionResult, AWSError] = js.native
  def getHostnameSuggestion(callback: js.Function2[/* err */ AWSError, /* data */ GetHostnameSuggestionResult, Unit]): Request[GetHostnameSuggestionResult, AWSError] = js.native
  /**
    * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def getHostnameSuggestion(params: GetHostnameSuggestionRequest): Request[GetHostnameSuggestionResult, AWSError] = js.native
  def getHostnameSuggestion(
    params: GetHostnameSuggestionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetHostnameSuggestionResult, Unit]
  ): Request[GetHostnameSuggestionResult, AWSError] = js.native
  
  /**
    *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
    */
  def grantAccess(): Request[GrantAccessResult, AWSError] = js.native
  def grantAccess(callback: js.Function2[/* err */ AWSError, /* data */ GrantAccessResult, Unit]): Request[GrantAccessResult, AWSError] = js.native
  /**
    *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
    */
  def grantAccess(params: GrantAccessRequest): Request[GrantAccessResult, AWSError] = js.native
  def grantAccess(
    params: GrantAccessRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GrantAccessResult, Unit]
  ): Request[GrantAccessResult, AWSError] = js.native
  
  /**
    * Returns a list of tags that are applied to the specified stack or layer.
    */
  def listTags(): Request[ListTagsResult, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResult, Unit]): Request[ListTagsResult, AWSError] = js.native
  /**
    * Returns a list of tags that are applied to the specified stack or layer.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResult, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResult, Unit]
  ): Request[ListTagsResult, AWSError] = js.native
  
  /**
    * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def rebootInstance(): Request[js.Object, AWSError] = js.native
  def rebootInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def rebootInstance(params: RebootInstanceRequest): Request[js.Object, AWSError] = js.native
  def rebootInstance(
    params: RebootInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
    */
  def registerEcsCluster(): Request[RegisterEcsClusterResult, AWSError] = js.native
  def registerEcsCluster(callback: js.Function2[/* err */ AWSError, /* data */ RegisterEcsClusterResult, Unit]): Request[RegisterEcsClusterResult, AWSError] = js.native
  /**
    * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
    */
  def registerEcsCluster(params: RegisterEcsClusterRequest): Request[RegisterEcsClusterResult, AWSError] = js.native
  def registerEcsCluster(
    params: RegisterEcsClusterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterEcsClusterResult, Unit]
  ): Request[RegisterEcsClusterResult, AWSError] = js.native
  
  /**
    * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerElasticIp(): Request[RegisterElasticIpResult, AWSError] = js.native
  def registerElasticIp(callback: js.Function2[/* err */ AWSError, /* data */ RegisterElasticIpResult, Unit]): Request[RegisterElasticIpResult, AWSError] = js.native
  /**
    * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerElasticIp(params: RegisterElasticIpRequest): Request[RegisterElasticIpResult, AWSError] = js.native
  def registerElasticIp(
    params: RegisterElasticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterElasticIpResult, Unit]
  ): Request[RegisterElasticIpResult, AWSError] = js.native
  
  /**
    * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerInstance(): Request[RegisterInstanceResult, AWSError] = js.native
  def registerInstance(callback: js.Function2[/* err */ AWSError, /* data */ RegisterInstanceResult, Unit]): Request[RegisterInstanceResult, AWSError] = js.native
  /**
    * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerInstance(params: RegisterInstanceRequest): Request[RegisterInstanceResult, AWSError] = js.native
  def registerInstance(
    params: RegisterInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterInstanceResult, Unit]
  ): Request[RegisterInstanceResult, AWSError] = js.native
  
  /**
    * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerRdsDbInstance(): Request[js.Object, AWSError] = js.native
  def registerRdsDbInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerRdsDbInstance(params: RegisterRdsDbInstanceRequest): Request[js.Object, AWSError] = js.native
  def registerRdsDbInstance(
    params: RegisterRdsDbInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerVolume(): Request[RegisterVolumeResult, AWSError] = js.native
  def registerVolume(callback: js.Function2[/* err */ AWSError, /* data */ RegisterVolumeResult, Unit]): Request[RegisterVolumeResult, AWSError] = js.native
  /**
    * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def registerVolume(params: RegisterVolumeRequest): Request[RegisterVolumeResult, AWSError] = js.native
  def registerVolume(
    params: RegisterVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterVolumeResult, Unit]
  ): Request[RegisterVolumeResult, AWSError] = js.native
  
  /**
    * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setLoadBasedAutoScaling(): Request[js.Object, AWSError] = js.native
  def setLoadBasedAutoScaling(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setLoadBasedAutoScaling(params: SetLoadBasedAutoScalingRequest): Request[js.Object, AWSError] = js.native
  def setLoadBasedAutoScaling(
    params: SetLoadBasedAutoScalingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setPermission(): Request[js.Object, AWSError] = js.native
  def setPermission(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setPermission(params: SetPermissionRequest): Request[js.Object, AWSError] = js.native
  def setPermission(
    params: SetPermissionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setTimeBasedAutoScaling(): Request[js.Object, AWSError] = js.native
  def setTimeBasedAutoScaling(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def setTimeBasedAutoScaling(params: SetTimeBasedAutoScalingRequest): Request[js.Object, AWSError] = js.native
  def setTimeBasedAutoScaling(
    params: SetTimeBasedAutoScalingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def startInstance(): Request[js.Object, AWSError] = js.native
  def startInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def startInstance(params: StartInstanceRequest): Request[js.Object, AWSError] = js.native
  def startInstance(
    params: StartInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def startStack(): Request[js.Object, AWSError] = js.native
  def startStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def startStack(params: StartStackRequest): Request[js.Object, AWSError] = js.native
  def startStack(params: StartStackRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def stopInstance(): Request[js.Object, AWSError] = js.native
  def stopInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def stopInstance(params: StopInstanceRequest): Request[js.Object, AWSError] = js.native
  def stopInstance(
    params: StopInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def stopStack(): Request[js.Object, AWSError] = js.native
  def stopStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def stopStack(params: StopStackRequest): Request[js.Object, AWSError] = js.native
  def stopStack(params: StopStackRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
    */
  def tagResource(): Request[js.Object, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
    */
  def tagResource(params: TagResourceRequest): Request[js.Object, AWSError] = js.native
  def tagResource(params: TagResourceRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def unassignInstance(): Request[js.Object, AWSError] = js.native
  def unassignInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def unassignInstance(params: UnassignInstanceRequest): Request[js.Object, AWSError] = js.native
  def unassignInstance(
    params: UnassignInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def unassignVolume(): Request[js.Object, AWSError] = js.native
  def unassignVolume(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def unassignVolume(params: UnassignVolumeRequest): Request[js.Object, AWSError] = js.native
  def unassignVolume(
    params: UnassignVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Removes tags from a specified stack or layer.
    */
  def untagResource(): Request[js.Object, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes tags from a specified stack or layer.
    */
  def untagResource(params: UntagResourceRequest): Request[js.Object, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateApp(): Request[js.Object, AWSError] = js.native
  def updateApp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateApp(params: UpdateAppRequest): Request[js.Object, AWSError] = js.native
  def updateApp(params: UpdateAppRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateElasticIp(): Request[js.Object, AWSError] = js.native
  def updateElasticIp(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateElasticIp(params: UpdateElasticIpRequest): Request[js.Object, AWSError] = js.native
  def updateElasticIp(
    params: UpdateElasticIpRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateInstance(): Request[js.Object, AWSError] = js.native
  def updateInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateInstance(params: UpdateInstanceRequest): Request[js.Object, AWSError] = js.native
  def updateInstance(
    params: UpdateInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateLayer(): Request[js.Object, AWSError] = js.native
  def updateLayer(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateLayer(params: UpdateLayerRequest): Request[js.Object, AWSError] = js.native
  def updateLayer(params: UpdateLayerRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def updateMyUserProfile(): Request[js.Object, AWSError] = js.native
  def updateMyUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def updateMyUserProfile(params: UpdateMyUserProfileRequest): Request[js.Object, AWSError] = js.native
  def updateMyUserProfile(
    params: UpdateMyUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateRdsDbInstance(): Request[js.Object, AWSError] = js.native
  def updateRdsDbInstance(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateRdsDbInstance(params: UpdateRdsDbInstanceRequest): Request[js.Object, AWSError] = js.native
  def updateRdsDbInstance(
    params: UpdateRdsDbInstanceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateStack(): Request[js.Object, AWSError] = js.native
  def updateStack(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateStack(params: UpdateStackRequest): Request[js.Object, AWSError] = js.native
  def updateStack(params: UpdateStackRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def updateUserProfile(): Request[js.Object, AWSError] = js.native
  def updateUserProfile(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
    */
  def updateUserProfile(params: UpdateUserProfileRequest): Request[js.Object, AWSError] = js.native
  def updateUserProfile(
    params: UpdateUserProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateVolume(): Request[js.Object, AWSError] = js.native
  def updateVolume(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
    */
  def updateVolume(params: UpdateVolumeRequest): Request[js.Object, AWSError] = js.native
  def updateVolume(
    params: UpdateVolumeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  
  /**
    * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_appExists(state: appExists): Request[DescribeAppsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_appExists(state: appExists, callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppsResult, Unit]): Request[DescribeAppsResult, AWSError] = js.native
  /**
    * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
    */
  @JSName("waitFor")
  def waitFor_appExists(state: appExists, params: DescribeAppsRequestwaiter): Request[DescribeAppsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_appExists(
    state: appExists,
    params: DescribeAppsRequestwaiter,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAppsResult, Unit]
  ): Request[DescribeAppsResult, AWSError] = js.native
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: deploymentSuccessful): Request[DescribeDeploymentsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: deploymentSuccessful,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentsResult, Unit]
  ): Request[DescribeDeploymentsResult, AWSError] = js.native
  /**
    * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
    */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: deploymentSuccessful, params: DescribeDeploymentsReques): Request[DescribeDeploymentsResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: deploymentSuccessful,
    params: DescribeDeploymentsReques,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDeploymentsResult, Unit]
  ): Request[DescribeDeploymentsResult, AWSError] = js.native
  /**
    * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
    */
  @JSName("waitFor")
  def waitFor_instanceOnline(state: instanceOnline): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceOnline(
    state: instanceOnline,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
    */
  @JSName("waitFor")
  def waitFor_instanceOnline(state: instanceOnline, params: DescribeInstancesRequestwInstanceIds): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceOnline(
    state: instanceOnline,
    params: DescribeInstancesRequestwInstanceIds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
    */
  @JSName("waitFor")
  def waitFor_instanceRegistered(state: instanceRegistered): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceRegistered(
    state: instanceRegistered,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
    */
  @JSName("waitFor")
  def waitFor_instanceRegistered(state: instanceRegistered, params: DescribeInstancesRequestwInstanceIds): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceRegistered(
    state: instanceRegistered,
    params: DescribeInstancesRequestwInstanceIds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: instanceStopped): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: instanceStopped,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
    */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: instanceStopped, params: DescribeInstancesRequestwInstanceIds): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: instanceStopped,
    params: DescribeInstancesRequestwInstanceIds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: instanceTerminated): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: instanceTerminated,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
  /**
    * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
    */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: instanceTerminated, params: DescribeInstancesRequestwInstanceIds): Request[DescribeInstancesResult, AWSError] = js.native
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: instanceTerminated,
    params: DescribeInstancesRequestwInstanceIds,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeInstancesResult, Unit]
  ): Request[DescribeInstancesResult, AWSError] = js.native
}
