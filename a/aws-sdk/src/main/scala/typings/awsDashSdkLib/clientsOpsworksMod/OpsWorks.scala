package typings
package awsDashSdkLib.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsWorks
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_OpsWorks: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ClientConfiguration = js.native
  /**
     * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssignInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assign a registered instance to a layer.   You can assign registered on-premises instances to any layer type.   You can assign registered Amazon EC2 instances only to custom layers.   You cannot use this action with instances that were created with AWS OpsWorks Stacks.    Required Permissions: To use this action, an AWS Identity and Access Management (IAM) user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssignInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignVolume(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignVolume(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssignVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Assigns one of the stack's registered Amazon EBS volumes to a specified instance. The volume must first be registered with the stack by calling RegisterVolume. After you register the volume, you must call UpdateVolume to specify a mount point before calling AssignVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def assignVolume(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssignVolumeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def associateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def associateElasticIp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def associateElasticIp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssociateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Associates one of the stack's registered Elastic IP addresses with a specified instance. The address must first be registered with the stack by calling RegisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def associateElasticIp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AssociateElasticIpRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def attachElasticLoadBalancer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def attachElasticLoadBalancer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def attachElasticLoadBalancer(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AttachElasticLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Attaches an Elastic Load Balancing load balancer to a specified layer. AWS OpsWorks Stacks does not support Application Load Balancer. You can only use Classic Load Balancer with AWS OpsWorks Stacks. For more information, see Elastic Load Balancing.  You must create the Elastic Load Balancing instance separately, by using the Elastic Load Balancing console, API, or CLI. For more information, see  Elastic Load Balancing Developer Guide.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def attachElasticLoadBalancer(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.AttachElasticLoadBalancerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def cloneStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def cloneStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def cloneStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a clone of a specified stack. For more information, see Clone a Stack. By default, all parameters are set to the values used by the parent stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def cloneStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CloneStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createApp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createApp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createApp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an app for a specified stack. For more information, see Creating Apps.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createApp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateAppResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createDeployment(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Runs deployment or stack commands. For more information, see Deploying Apps and Run Stack Commands.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createDeployment(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateDeploymentResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an instance in a specified stack. For more information, see Adding an Instance to a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createLayer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createLayer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createLayer(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a layer. For more information, see How to Create a Layer.  You should use CreateLayer for noncustom layer types such as PHP App Server only if the stack does not have an existing layer of that type. A stack can have at most one instance of each noncustom layer; if you attempt to create a second instance, CreateLayer fails. A stack can have an arbitrary number of custom layers, so you can call CreateLayer as many times as you like for that layer type.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def createLayer(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateLayerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createStack(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createStack(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new stack. For more information, see Create a New Stack.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateStackResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createUserProfile(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def createUserProfile(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.CreateUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteApp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteApp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteAppRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified app.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteApp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified instance, which terminates the associated Amazon EC2 instance. You must stop an instance before you can delete it. For more information, see Deleting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteLayer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteLayer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteLayer(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteLayerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified layer. You must first stop and then delete all associated instances or unassign registered instances. For more information, see How to Delete a Layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteLayer(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteLayerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a specified stack. You must first delete all instances, layers, and apps or deregister registered instances. For more information, see Shut Down a Stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deleteStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteStackRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def deleteUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def deleteUserProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def deleteUserProfile(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deletes a user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def deleteUserProfile(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeleteUserProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
     */
  def deregisterEcsCluster(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
     */
  def deregisterEcsCluster(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
     */
  def deregisterEcsCluster(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterEcsClusterRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Amazon ECS cluster from a stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see http://docs.aws.amazon.com/opsworks/latest/userguide/opsworks-security-users.html.
     */
  def deregisterEcsCluster(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterEcsClusterRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterElasticIp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterElasticIp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters a specified Elastic IP address. The address can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterElasticIp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterElasticIpRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregister a registered Amazon EC2 or on-premises instance. This action removes the instance from the stack and returns it to your control. This action cannot be used with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterRdsDbInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterRdsDbInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterRdsDbInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterRdsDbInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterVolume(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterVolume(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Deregisters an Amazon EBS volume. The volume can then be registered by another stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def deregisterVolume(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DeregisterVolumeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
     */
  def describeAgentVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
     */
  def describeAgentVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
     */
  def describeAgentVersions(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the available AWS OpsWorks Stacks agent versions. You must specify a stack ID or a configuration manager. DescribeAgentVersions returns a list of available agent versions for the specified stack or configuration manager.
     */
  def describeAgentVersions(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAgentVersionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeApps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeApps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeApps(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of apps.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeApps(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeCommands(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeCommands(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeCommands(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the results of specified commands.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeCommands(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeCommandsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeDeployments(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a specified set of deployments.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeDeployments(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeEcsClusters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeEcsClusters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeEcsClusters(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon ECS clusters that are registered with a stack. If you specify only a stack ID, you can use the MaxResults and NextToken parameters to paginate the response. However, AWS OpsWorks Stacks currently supports only one cluster per layer, so the result set has a maximum of one element.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permission. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeEcsClusters(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeEcsClustersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticIps(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticIps(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticIps(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Elastic IP addresses.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticIps(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticIpsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticLoadBalancers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticLoadBalancers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticLoadBalancers(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a stack's Elastic Load Balancing instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeElasticLoadBalancers(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeElasticLoadBalancersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeInstances(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a set of instances.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeInstances(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLayers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLayers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLayers(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more layers in a specified stack.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLayers(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLayersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLoadBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLoadBasedAutoScaling(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLoadBasedAutoScaling(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes load-based auto scaling configurations for specified layers.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeLoadBasedAutoScaling(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeLoadBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user's SSH information.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeMyUserProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeMyUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes a user's SSH information.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeMyUserProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeMyUserProfileResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeMyUserProfileResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the operating systems that are supported by AWS OpsWorks Stacks.
     */
  def describeOperatingSystems(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeOperatingSystemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the operating systems that are supported by AWS OpsWorks Stacks.
     */
  def describeOperatingSystems(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeOperatingSystemsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeOperatingSystemsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def describePermissions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def describePermissions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def describePermissions(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the permissions for a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def describePermissions(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribePermissionsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeRaidArrays(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeRaidArrays(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeRaidArrays(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe an instance's RAID arrays.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeRaidArrays(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRaidArraysResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeRdsDbInstances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeRdsDbInstances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeRdsDbInstances(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes Amazon RDS instances.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeRdsDbInstances(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeRdsDbInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeServiceErrors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeServiceErrors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeServiceErrors(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes AWS OpsWorks Stacks service errors.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions. This call accepts only one resource-identifying parameter.
     */
  def describeServiceErrors(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeServiceErrorsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackProvisioningParameters(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackProvisioningParameters(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackProvisioningParameters(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of a stack's provisioning parameters.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackProvisioningParameters(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackProvisioningParametersResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackSummary(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackSummary(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackSummary(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes the number of layers and apps in a specified stack, and the number of instances in each state, such as running_setup or online.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStackSummary(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStackSummaryResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStacks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStacks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStacks(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Requests a description of one or more stacks.  Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeStacks(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeStacksResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeTimeBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeTimeBasedAutoScaling(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeTimeBasedAutoScaling(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes time-based auto scaling configurations for specified instances.  You must specify at least one of the parameters.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeTimeBasedAutoScaling(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeTimeBasedAutoScalingResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeUserProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeUserProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeUserProfiles(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describe specified users.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeUserProfiles(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeUserProfilesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeVolumes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeVolumes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeVolumes(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Describes an instance's Amazon EBS volumes.  This call accepts only one resource-identifying parameter.   Required Permissions: To use this action, an IAM user must have a Show, Deploy, or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def describeVolumes(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeVolumesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def detachElasticLoadBalancer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def detachElasticLoadBalancer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def detachElasticLoadBalancer(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DetachElasticLoadBalancerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Detaches a specified Elastic Load Balancing instance from its layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def detachElasticLoadBalancer(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DetachElasticLoadBalancerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def disassociateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def disassociateElasticIp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def disassociateElasticIp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DisassociateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Disassociates an Elastic IP address from its instance. The address remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def disassociateElasticIp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DisassociateElasticIpRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def getHostnameSuggestion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def getHostnameSuggestion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def getHostnameSuggestion(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a generated host name for the specified layer, based on the current host name theme.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def getHostnameSuggestion(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GetHostnameSuggestionResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
     */
  def grantAccess(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
     */
  def grantAccess(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
     */
  def grantAccess(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     *  This action can be used only with Windows stacks.  Grants RDP access to a Windows instance for a specified time period.
     */
  def grantAccess(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.GrantAccessResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags that are applied to the specified stack or layer.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags that are applied to the specified stack or layer.
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags that are applied to the specified stack or layer.
     */
  def listTags(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of tags that are applied to the specified stack or layer.
     */
  def listTags(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.ListTagsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def rebootInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def rebootInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def rebootInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RebootInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Reboots a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def rebootInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RebootInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
     */
  def registerEcsCluster(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
     */
  def registerEcsCluster(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
     */
  def registerEcsCluster(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers a specified Amazon ECS cluster with a stack. You can register only one cluster with a stack. A cluster can be registered with only one stack. For more information, see  Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see  Managing User Permissions.
     */
  def registerEcsCluster(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterEcsClusterResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerElasticIp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerElasticIp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerElasticIp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Elastic IP address with a specified stack. An address can be registered with only one stack at a time. If the address is already registered, you must first deregister it by calling DeregisterElasticIp. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerElasticIp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterElasticIpResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerInstance(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerInstance(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers instances that were created outside of AWS OpsWorks Stacks with a specified stack.  We do not recommend using this action to register instances. The complete registration operation includes two tasks: installing the AWS OpsWorks Stacks agent on the instance, and registering the instance with the stack. RegisterInstance handles only the second step. You should instead use the AWS CLI register command, which performs the entire registration operation. For more information, see  Registering an Instance with an AWS OpsWorks Stacks Stack.  Registered instances have the same requirements as instances that are created by using the CreateInstance API. For example, registered instances must be running a supported Linux-based operating system, and they must have a supported instance type. For more information about requirements for instances that you want to register, see  Preparing the Instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterInstanceResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerRdsDbInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerRdsDbInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an Amazon RDS instance with a stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerRdsDbInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterRdsDbInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerVolume(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerVolume(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerVolume(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Amazon EBS volume with a specified stack. A volume can be registered with only one stack at a time. If the volume is already registered, you must first deregister it by calling DeregisterVolume. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def registerVolume(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.RegisterVolumeResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setLoadBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setLoadBasedAutoScaling(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setLoadBasedAutoScaling(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetLoadBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the load-based auto scaling configuration for a specified layer. For more information, see Managing Load with Time-based and Load-based Instances.  To use load-based auto scaling, you must create a set of load-based auto scaling instances. Load-based auto scaling operates only on the instances from that set, so you must ensure that you have created enough instances to handle the maximum anticipated load.   Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setLoadBasedAutoScaling(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetLoadBasedAutoScalingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setPermission(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setPermission(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setPermission(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetPermissionRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specifies a user's permissions. For more information, see Security and Permissions.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setPermission(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetPermissionRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setTimeBasedAutoScaling(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setTimeBasedAutoScaling(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setTimeBasedAutoScaling(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetTimeBasedAutoScalingRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Specify the time-based auto scaling configuration for a specified instance. For more information, see Managing Load with Time-based and Load-based Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def setTimeBasedAutoScaling(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.SetTimeBasedAutoScalingRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StartInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a specified instance. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StartInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StartStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Starts a stack's instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def startStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StartStackRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StopInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified instance. When you stop a standard instance, the data disappears and must be reinstalled when you restart the instance. You can stop an Amazon EBS-backed instance without losing data. For more information, see Starting, Stopping, and Rebooting Instances.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StopInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StopStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Stops a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def stopStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.StopStackRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
     */
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
     */
  def tagResource(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Apply cost-allocation tags to a specified stack or layer in AWS OpsWorks Stacks. For more information about how tagging works, see Tags in the AWS OpsWorks User Guide.
     */
  def tagResource(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def unassignInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def unassignInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def unassignInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UnassignInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns a registered instance from all layers that are using the instance. The instance remains in the stack as an unassigned instance, and can be assigned to another layer as needed. You cannot use this action with instances that were created with AWS OpsWorks Stacks.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def unassignInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UnassignInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def unassignVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def unassignVolume(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def unassignVolume(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UnassignVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Unassigns an assigned Amazon EBS volume. The volume remains registered with the stack. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def unassignVolume(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UnassignVolumeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes tags from a specified stack or layer.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes tags from a specified stack or layer.
     */
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes tags from a specified stack or layer.
     */
  def untagResource(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Removes tags from a specified stack or layer.
     */
  def untagResource(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateApp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateApp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateApp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateAppRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified app.  Required Permissions: To use this action, an IAM user must have a Deploy or Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateApp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateAppRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateElasticIp(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateElasticIp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateElasticIp(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateElasticIpRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a registered Elastic IP address's name. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateElasticIp(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateElasticIpRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateLayer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateLayer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateLayer(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateLayerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified layer.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateLayer(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateLayerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateMyUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateMyUserProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateMyUserProfile(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateMyUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a user's SSH public key.  Required Permissions: To use this action, an IAM user must have self-management enabled or an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateMyUserProfile(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateMyUserProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateRdsDbInstance(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateRdsDbInstance(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateRdsDbInstance(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateRdsDbInstanceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon RDS instance.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateRdsDbInstance(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateRdsDbInstanceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateStack(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateStack(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateStack(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateStackRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified stack.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateStack(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateStackRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateUserProfile(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateUserProfile(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateUserProfile(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateUserProfileRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates a specified user profile.  Required Permissions: To use this action, an IAM user must have an attached policy that explicitly grants permissions. For more information about user permissions, see Managing User Permissions.
     */
  def updateUserProfile(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateUserProfileRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateVolume(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateVolume(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateVolume(params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateVolumeRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Updates an Amazon EBS volume's name or mount point. For more information, see Resource Management.  Required Permissions: To use this action, an IAM user must have a Manage permissions level for the stack, or an attached policy that explicitly grants permissions. For more information on user permissions, see Managing User Permissions.
     */
  def updateVolume(
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.UpdateVolumeRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
     * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_appExists(state: awsDashSdkLib.awsDashSdkLibStrings.appExists): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_appExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_appExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the appExists state by periodically calling the underlying OpsWorks.describeAppsoperation every 1 seconds (at most 40 times).
     */
  @JSName("waitFor")
  def waitFor_appExists(
    state: awsDashSdkLib.awsDashSdkLibStrings.appExists,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeAppsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the deploymentSuccessful state by periodically calling the underlying OpsWorks.describeDeploymentsoperation every 15 seconds (at most 40 times). Wait until a deployment has completed successfully.
     */
  @JSName("waitFor")
  def waitFor_deploymentSuccessful(
    state: awsDashSdkLib.awsDashSdkLibStrings.deploymentSuccessful,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeDeploymentsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
     */
  @JSName("waitFor")
  def waitFor_instanceOnline(state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
     */
  @JSName("waitFor")
  def waitFor_instanceOnline(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
     */
  @JSName("waitFor")
  def waitFor_instanceOnline(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceOnline state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is online.
     */
  @JSName("waitFor")
  def waitFor_instanceOnline(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceOnline,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
     */
  @JSName("waitFor")
  def waitFor_instanceRegistered(state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
     */
  @JSName("waitFor")
  def waitFor_instanceRegistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
     */
  @JSName("waitFor")
  def waitFor_instanceRegistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceRegistered state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is registered.
     */
  @JSName("waitFor")
  def waitFor_instanceRegistered(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceRegistered,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
     */
  @JSName("waitFor")
  def waitFor_instanceStopped(state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
     */
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
     */
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceStopped state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is stopped.
     */
  @JSName("waitFor")
  def waitFor_instanceStopped(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceStopped,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
     */
  @JSName("waitFor")
  def waitFor_instanceTerminated(state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
     */
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
     */
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Waits for the instanceTerminated state by periodically calling the underlying OpsWorks.describeInstancesoperation every 15 seconds (at most 40 times). Wait until OpsWorks instance is terminated.
     */
  @JSName("waitFor")
  def waitFor_instanceTerminated(
    state: awsDashSdkLib.awsDashSdkLibStrings.instanceTerminated,
    params: awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesRequest with awsDashSdkLib.Anon_Waiter,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsOpsworksMod.OpsWorksNs.DescribeInstancesResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

