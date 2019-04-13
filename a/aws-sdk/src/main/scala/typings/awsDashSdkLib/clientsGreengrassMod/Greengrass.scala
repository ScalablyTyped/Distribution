package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Greengrass
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Greengrass: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
    */
  def associateRoleToGroup(): awsDashSdkLib.libRequestMod.Request[AssociateRoleToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateRoleToGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateRoleToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateRoleToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a role with a group. Your Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
    */
  def associateRoleToGroup(params: AssociateRoleToGroupRequest): awsDashSdkLib.libRequestMod.Request[AssociateRoleToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateRoleToGroup(
    params: AssociateRoleToGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateRoleToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateRoleToGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
    */
  def associateServiceRoleToAccount(): awsDashSdkLib.libRequestMod.Request[AssociateServiceRoleToAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateServiceRoleToAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateServiceRoleToAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateServiceRoleToAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a role with your account. AWS IoT Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
    */
  def associateServiceRoleToAccount(params: AssociateServiceRoleToAccountRequest): awsDashSdkLib.libRequestMod.Request[AssociateServiceRoleToAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateServiceRoleToAccount(
    params: AssociateServiceRoleToAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateServiceRoleToAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateServiceRoleToAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connector definition. You may provide the initial version of the connector definition now or use ''CreateConnectorDefinitionVersion'' at a later time.
    */
  def createConnectorDefinition(): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnectorDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a connector definition. You may provide the initial version of the connector definition now or use ''CreateConnectorDefinitionVersion'' at a later time.
    */
  def createConnectorDefinition(params: CreateConnectorDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnectorDefinition(
    params: CreateConnectorDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a connector definition which has already been defined.
    */
  def createConnectorDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnectorDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectorDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a connector definition which has already been defined.
    */
  def createConnectorDefinitionVersion(params: CreateConnectorDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createConnectorDefinitionVersion(
    params: CreateConnectorDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateConnectorDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinition(): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinition(params: CreateCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCoreDefinition(
    params: CreateCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCoreDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a core definition that has already been defined. Greengrass groups must each contain exactly one Greengrass core.
    */
  def createCoreDefinitionVersion(params: CreateCoreDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createCoreDefinitionVersion(
    params: CreateCoreDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
    */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
    */
  def createDeployment(params: CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeployment(
    params: CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
    */
  def createDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
    */
  def createDeviceDefinition(params: CreateDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeviceDefinition(
    params: CreateDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a device definition that has already been defined.
    */
  def createDeviceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeviceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a device definition that has already been defined.
    */
  def createDeviceDefinitionVersion(params: CreateDeviceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createDeviceDefinitionVersion(
    params: CreateDeviceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
    */
  def createFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
    */
  def createFunctionDefinition(params: CreateFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunctionDefinition(
    params: CreateFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a Lambda function definition that has already been defined.
    */
  def createFunctionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunctionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a Lambda function definition that has already been defined.
    */
  def createFunctionDefinitionVersion(params: CreateFunctionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createFunctionDefinitionVersion(
    params: CreateFunctionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time. Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a library or command-line application to create and deploy Greengrass groups.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time. Tip: You can use the ''gg_group_setup'' package (https://github.com/awslabs/aws-greengrass-group-setup) as a library or command-line application to create and deploy Greengrass groups.
    */
  def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
    */
  def createGroupCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[CreateGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroupCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
    */
  def createGroupCertificateAuthority(params: CreateGroupCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroupCertificateAuthority(
    params: CreateGroupCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a group which has already been defined.
    */
  def createGroupVersion(): awsDashSdkLib.libRequestMod.Request[CreateGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroupVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a group which has already been defined.
    */
  def createGroupVersion(params: CreateGroupVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroupVersion(
    params: CreateGroupVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
    */
  def createLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
    */
  def createLoggerDefinition(params: CreateLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoggerDefinition(
    params: CreateLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a logger definition that has already been defined.
    */
  def createLoggerDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoggerDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a logger definition that has already been defined.
    */
  def createLoggerDefinitionVersion(params: CreateLoggerDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLoggerDefinitionVersion(
    params: CreateLoggerDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
    */
  def createResourceDefinition(): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
    */
  def createResourceDefinition(params: CreateResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDefinition(
    params: CreateResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a resource definition that has already been defined.
    */
  def createResourceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a resource definition that has already been defined.
    */
  def createResourceDefinitionVersion(params: CreateResourceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceDefinitionVersion(
    params: CreateResourceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
    */
  def createSoftwareUpdateJob(): awsDashSdkLib.libRequestMod.Request[CreateSoftwareUpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSoftwareUpdateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSoftwareUpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSoftwareUpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
    */
  def createSoftwareUpdateJob(params: CreateSoftwareUpdateJobRequest): awsDashSdkLib.libRequestMod.Request[CreateSoftwareUpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSoftwareUpdateJob(
    params: CreateSoftwareUpdateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSoftwareUpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSoftwareUpdateJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
    */
  def createSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
    */
  def createSubscriptionDefinition(params: CreateSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriptionDefinition(
    params: CreateSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a subscription definition which has already been defined.
    */
  def createSubscriptionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriptionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a version of a subscription definition which has already been defined.
    */
  def createSubscriptionDefinitionVersion(params: CreateSubscriptionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createSubscriptionDefinitionVersion(
    params: CreateSubscriptionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a connector definition.
    */
  def deleteConnectorDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnectorDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a connector definition.
    */
  def deleteConnectorDefinition(params: DeleteConnectorDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteConnectorDefinition(
    params: DeleteConnectorDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a core definition.
    */
  def deleteCoreDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a core definition.
    */
  def deleteCoreDefinition(params: DeleteCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteCoreDefinition(
    params: DeleteCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a device definition.
    */
  def deleteDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a device definition.
    */
  def deleteDeviceDefinition(params: DeleteDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteDeviceDefinition(
    params: DeleteDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Lambda function definition.
    */
  def deleteFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a Lambda function definition.
    */
  def deleteFunctionDefinition(params: DeleteFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteFunctionDefinition(
    params: DeleteFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group.
    */
  def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a logger definition.
    */
  def deleteLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a logger definition.
    */
  def deleteLoggerDefinition(params: DeleteLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLoggerDefinition(
    params: DeleteLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a resource definition.
    */
  def deleteResourceDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a resource definition.
    */
  def deleteResourceDefinition(params: DeleteResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceDefinition(
    params: DeleteResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subscription definition.
    */
  def deleteSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a subscription definition.
    */
  def deleteSubscriptionDefinition(params: DeleteSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteSubscriptionDefinition(
    params: DeleteSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the role from a group.
    */
  def disassociateRoleFromGroup(): awsDashSdkLib.libRequestMod.Request[DisassociateRoleFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateRoleFromGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateRoleFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateRoleFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the role from a group.
    */
  def disassociateRoleFromGroup(params: DisassociateRoleFromGroupRequest): awsDashSdkLib.libRequestMod.Request[DisassociateRoleFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateRoleFromGroup(
    params: DisassociateRoleFromGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateRoleFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateRoleFromGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the service role from your account. Without a service role, deployments will not work.
    */
  def disassociateServiceRoleFromAccount(): awsDashSdkLib.libRequestMod.Request[DisassociateServiceRoleFromAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateServiceRoleFromAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateServiceRoleFromAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the service role from your account. Without a service role, deployments will not work.
    */
  def disassociateServiceRoleFromAccount(params: DisassociateServiceRoleFromAccountRequest): awsDashSdkLib.libRequestMod.Request[DisassociateServiceRoleFromAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociateServiceRoleFromAccount(
    params: DisassociateServiceRoleFromAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociateServiceRoleFromAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociateServiceRoleFromAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the role associated with a particular group.
    */
  def getAssociatedRole(): awsDashSdkLib.libRequestMod.Request[GetAssociatedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAssociatedRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAssociatedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAssociatedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the role associated with a particular group.
    */
  def getAssociatedRole(params: GetAssociatedRoleRequest): awsDashSdkLib.libRequestMod.Request[GetAssociatedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAssociatedRole(
    params: GetAssociatedRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAssociatedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAssociatedRoleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of a bulk deployment.
    */
  def getBulkDeploymentStatus(): awsDashSdkLib.libRequestMod.Request[GetBulkDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBulkDeploymentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBulkDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBulkDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of a bulk deployment.
    */
  def getBulkDeploymentStatus(params: GetBulkDeploymentStatusRequest): awsDashSdkLib.libRequestMod.Request[GetBulkDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBulkDeploymentStatus(
    params: GetBulkDeploymentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetBulkDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetBulkDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the connectivity information for a core.
    */
  def getConnectivityInfo(): awsDashSdkLib.libRequestMod.Request[GetConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectivityInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the connectivity information for a core.
    */
  def getConnectivityInfo(params: GetConnectivityInfoRequest): awsDashSdkLib.libRequestMod.Request[GetConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectivityInfo(
    params: GetConnectivityInfoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a connector definition.
    */
  def getConnectorDefinition(): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectorDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a connector definition.
    */
  def getConnectorDefinition(params: GetConnectorDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectorDefinition(
    params: GetConnectorDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a connector definition version, including the connectors that the version contains. Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def getConnectorDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectorDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a connector definition version, including the connectors that the version contains. Connectors are prebuilt modules that interact with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def getConnectorDefinitionVersion(params: GetConnectorDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConnectorDefinitionVersion(
    params: GetConnectorDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConnectorDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConnectorDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinition(): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinition(params: GetCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCoreDefinition(
    params: GetCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCoreDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a core definition version.
    */
  def getCoreDefinitionVersion(params: GetCoreDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCoreDefinitionVersion(
    params: GetCoreDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCoreDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of a deployment.
    */
  def getDeploymentStatus(): awsDashSdkLib.libRequestMod.Request[GetDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the status of a deployment.
    */
  def getDeploymentStatus(params: GetDeploymentStatusRequest): awsDashSdkLib.libRequestMod.Request[GetDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeploymentStatus(
    params: GetDeploymentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeploymentStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a device definition.
    */
  def getDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a device definition.
    */
  def getDeviceDefinition(params: GetDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceDefinition(
    params: GetDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a device definition version.
    */
  def getDeviceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a device definition version.
    */
  def getDeviceDefinitionVersion(params: GetDeviceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getDeviceDefinitionVersion(
    params: GetDeviceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetDeviceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition, including its creation time and latest version.
    */
  def getFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition, including its creation time and latest version.
    */
  def getFunctionDefinition(params: GetFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunctionDefinition(
    params: GetFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
    */
  def getFunctionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunctionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
    */
  def getFunctionDefinitionVersion(params: GetFunctionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getFunctionDefinitionVersion(
    params: GetFunctionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetFunctionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a group.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a group.
    */
  def getGroup(params: GetGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retreives the CA associated with a group. Returns the public key of the CA.
    */
  def getGroupCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retreives the CA associated with a group. Returns the public key of the CA.
    */
  def getGroupCertificateAuthority(params: GetGroupCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupCertificateAuthority(
    params: GetGroupCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateAuthorityResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current configuration for the CA used by the group.
    */
  def getGroupCertificateConfiguration(): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupCertificateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current configuration for the CA used by the group.
    */
  def getGroupCertificateConfiguration(params: GetGroupCertificateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupCertificateConfiguration(
    params: GetGroupCertificateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a group version.
    */
  def getGroupVersion(): awsDashSdkLib.libRequestMod.Request[GetGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a group version.
    */
  def getGroupVersion(params: GetGroupVersionRequest): awsDashSdkLib.libRequestMod.Request[GetGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroupVersion(
    params: GetGroupVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a logger definition.
    */
  def getLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a logger definition.
    */
  def getLoggerDefinition(params: GetLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggerDefinition(
    params: GetLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a logger definition version.
    */
  def getLoggerDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggerDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a logger definition version.
    */
  def getLoggerDefinitionVersion(params: GetLoggerDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getLoggerDefinitionVersion(
    params: GetLoggerDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetLoggerDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a resource definition, including its creation time and latest version.
    */
  def getResourceDefinition(): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a resource definition, including its creation time and latest version.
    */
  def getResourceDefinition(params: GetResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceDefinition(
    params: GetResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a resource definition version, including which resources are included in the version.
    */
  def getResourceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a resource definition version, including which resources are included in the version.
    */
  def getResourceDefinitionVersion(params: GetResourceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getResourceDefinitionVersion(
    params: GetResourceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetResourceDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the service role that is attached to your account.
    */
  def getServiceRoleForAccount(): awsDashSdkLib.libRequestMod.Request[GetServiceRoleForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceRoleForAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceRoleForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceRoleForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the service role that is attached to your account.
    */
  def getServiceRoleForAccount(params: GetServiceRoleForAccountRequest): awsDashSdkLib.libRequestMod.Request[GetServiceRoleForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getServiceRoleForAccount(
    params: GetServiceRoleForAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetServiceRoleForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetServiceRoleForAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a subscription definition.
    */
  def getSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a subscription definition.
    */
  def getSubscriptionDefinition(params: GetSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSubscriptionDefinition(
    params: GetSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a subscription definition version.
    */
  def getSubscriptionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSubscriptionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about a subscription definition version.
    */
  def getSubscriptionDefinitionVersion(params: GetSubscriptionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSubscriptionDefinitionVersion(
    params: GetSubscriptionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSubscriptionDefinitionVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
    */
  def listBulkDeploymentDetailedReports(): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentDetailedReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBulkDeploymentDetailedReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBulkDeploymentDetailedReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentDetailedReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
    */
  def listBulkDeploymentDetailedReports(params: ListBulkDeploymentDetailedReportsRequest): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentDetailedReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBulkDeploymentDetailedReports(
    params: ListBulkDeploymentDetailedReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBulkDeploymentDetailedReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentDetailedReportsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of bulk deployments.
    */
  def listBulkDeployments(): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBulkDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBulkDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a list of bulk deployments.
    */
  def listBulkDeployments(params: ListBulkDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBulkDeployments(
    params: ListBulkDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBulkDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBulkDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a connector definition, which are containers for connectors. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def listConnectorDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConnectorDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConnectorDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a connector definition, which are containers for connectors. Connectors run on the Greengrass core and contain built-in integration with local infrastructure, device protocols, AWS, and other cloud services.
    */
  def listConnectorDefinitionVersions(params: ListConnectorDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConnectorDefinitionVersions(
    params: ListConnectorDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConnectorDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of connector definitions.
    */
  def listConnectorDefinitions(): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConnectorDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConnectorDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of connector definitions.
    */
  def listConnectorDefinitions(params: ListConnectorDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listConnectorDefinitions(
    params: ListConnectorDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListConnectorDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListConnectorDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a core definition.
    */
  def listCoreDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCoreDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCoreDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a core definition.
    */
  def listCoreDefinitionVersions(params: ListCoreDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCoreDefinitionVersions(
    params: ListCoreDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCoreDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of core definitions.
    */
  def listCoreDefinitions(): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCoreDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCoreDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of core definitions.
    */
  def listCoreDefinitions(params: ListCoreDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listCoreDefinitions(
    params: ListCoreDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListCoreDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListCoreDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a history of deployments for the group.
    */
  def listDeployments(): awsDashSdkLib.libRequestMod.Request[ListDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a history of deployments for the group.
    */
  def listDeployments(params: ListDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[ListDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeployments(
    params: ListDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a device definition.
    */
  def listDeviceDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a device definition.
    */
  def listDeviceDefinitionVersions(params: ListDeviceDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceDefinitionVersions(
    params: ListDeviceDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of device definitions.
    */
  def listDeviceDefinitions(): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of device definitions.
    */
  def listDeviceDefinitions(params: ListDeviceDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDeviceDefinitions(
    params: ListDeviceDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDeviceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDeviceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a Lambda function definition.
    */
  def listFunctionDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctionDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a Lambda function definition.
    */
  def listFunctionDefinitionVersions(params: ListFunctionDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctionDefinitionVersions(
    params: ListFunctionDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of Lambda function definitions.
    */
  def listFunctionDefinitions(): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctionDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of Lambda function definitions.
    */
  def listFunctionDefinitions(params: ListFunctionDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listFunctionDefinitions(
    params: ListFunctionDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListFunctionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListFunctionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current CAs for a group.
    */
  def listGroupCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[ListGroupCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupCertificateAuthorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the current CAs for a group.
    */
  def listGroupCertificateAuthorities(params: ListGroupCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[ListGroupCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupCertificateAuthorities(
    params: ListGroupCertificateAuthoritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupCertificateAuthoritiesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a group.
    */
  def listGroupVersions(): awsDashSdkLib.libRequestMod.Request[ListGroupVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a group.
    */
  def listGroupVersions(params: ListGroupVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroupVersions(
    params: ListGroupVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of groups.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of groups.
    */
  def listGroups(params: ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a logger definition.
    */
  def listLoggerDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLoggerDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLoggerDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a logger definition.
    */
  def listLoggerDefinitionVersions(params: ListLoggerDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLoggerDefinitionVersions(
    params: ListLoggerDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLoggerDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of logger definitions.
    */
  def listLoggerDefinitions(): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLoggerDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLoggerDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of logger definitions.
    */
  def listLoggerDefinitions(params: ListLoggerDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLoggerDefinitions(
    params: ListLoggerDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLoggerDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLoggerDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a resource definition.
    */
  def listResourceDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a resource definition.
    */
  def listResourceDefinitionVersions(params: ListResourceDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDefinitionVersions(
    params: ListResourceDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of resource definitions.
    */
  def listResourceDefinitions(): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of resource definitions.
    */
  def listResourceDefinitions(params: ListResourceDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceDefinitions(
    params: ListResourceDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a subscription definition.
    */
  def listSubscriptionDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscriptionDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscriptionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the versions of a subscription definition.
    */
  def listSubscriptionDefinitionVersions(params: ListSubscriptionDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscriptionDefinitionVersions(
    params: ListSubscriptionDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscriptionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionVersionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of subscription definitions.
    */
  def listSubscriptionDefinitions(): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscriptionDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscriptionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of subscription definitions.
    */
  def listSubscriptionDefinitions(params: ListSubscriptionDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listSubscriptionDefinitions(
    params: ListSubscriptionDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListSubscriptionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListSubscriptionDefinitionsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the tags for a resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the tags for a resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a group's deployments.
    */
  def resetDeployments(): awsDashSdkLib.libRequestMod.Request[ResetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets a group's deployments.
    */
  def resetDeployments(params: ResetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[ResetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetDeployments(
    params: ResetDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetDeploymentsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
    */
  def startBulkDeployment(): awsDashSdkLib.libRequestMod.Request[StartBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBulkDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
    */
  def startBulkDeployment(params: StartBulkDeploymentRequest): awsDashSdkLib.libRequestMod.Request[StartBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startBulkDeployment(
    params: StartBulkDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
    */
  def stopBulkDeployment(): awsDashSdkLib.libRequestMod.Request[StopBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBulkDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
    */
  def stopBulkDeployment(params: StopBulkDeploymentRequest): awsDashSdkLib.libRequestMod.Request[StopBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopBulkDeployment(
    params: StopBulkDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopBulkDeploymentResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a resource.
    */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Add tags to a resource.
    */
  def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags with specified keys from a resource.
    */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Remove tags with specified keys from a resource.
    */
  def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
    */
  def updateConnectivityInfo(): awsDashSdkLib.libRequestMod.Request[UpdateConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnectivityInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
    */
  def updateConnectivityInfo(params: UpdateConnectivityInfoRequest): awsDashSdkLib.libRequestMod.Request[UpdateConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnectivityInfo(
    params: UpdateConnectivityInfoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectivityInfoResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a connector definition.
    */
  def updateConnectorDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnectorDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a connector definition.
    */
  def updateConnectorDefinition(params: UpdateConnectorDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateConnectorDefinition(
    params: UpdateConnectorDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateConnectorDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateConnectorDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a core definition.
    */
  def updateCoreDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a core definition.
    */
  def updateCoreDefinition(params: UpdateCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateCoreDefinition(
    params: UpdateCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateCoreDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a device definition.
    */
  def updateDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a device definition.
    */
  def updateDeviceDefinition(params: UpdateDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceDefinition(
    params: UpdateDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Lambda function definition.
    */
  def updateFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a Lambda function definition.
    */
  def updateFunctionDefinition(params: UpdateFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateFunctionDefinition(
    params: UpdateFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateFunctionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a group.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a group.
    */
  def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Certificate expiry time for a group.
    */
  def updateGroupCertificateConfiguration(): awsDashSdkLib.libRequestMod.Request[UpdateGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroupCertificateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Certificate expiry time for a group.
    */
  def updateGroupCertificateConfiguration(params: UpdateGroupCertificateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroupCertificateConfiguration(
    params: UpdateGroupCertificateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupCertificateConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a logger definition.
    */
  def updateLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a logger definition.
    */
  def updateLoggerDefinition(params: UpdateLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateLoggerDefinition(
    params: UpdateLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateLoggerDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a resource definition.
    */
  def updateResourceDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a resource definition.
    */
  def updateResourceDefinition(params: UpdateResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceDefinition(
    params: UpdateResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a subscription definition.
    */
  def updateSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates a subscription definition.
    */
  def updateSubscriptionDefinition(params: UpdateSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateSubscriptionDefinition(
    params: UpdateSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateSubscriptionDefinitionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

