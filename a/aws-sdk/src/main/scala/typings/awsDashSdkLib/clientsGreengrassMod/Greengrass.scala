package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Greengrass
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Greengrass: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ClientConfiguration = js.native
  /**
     * Associates a role with a group. Your AWS Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
     */
  def associateRoleToGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with a group. Your AWS Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
     */
  def associateRoleToGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with a group. Your AWS Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
     */
  def associateRoleToGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with a group. Your AWS Greengrass core will use the role to access AWS cloud services. The role's permissions should allow Greengrass core Lambda functions to perform actions against the cloud.
     */
  def associateRoleToGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateRoleToGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with your account. AWS Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
     */
  def associateServiceRoleToAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with your account. AWS Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
     */
  def associateServiceRoleToAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with your account. AWS Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
     */
  def associateServiceRoleToAccount(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a role with your account. AWS Greengrass will use the role to access your Lambda functions and AWS IoT resources. This is necessary for deployments to succeed. The role must have at least minimum permissions in the policy ''AWSGreengrassResourceAccessRolePolicy''.
     */
  def associateServiceRoleToAccount(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.AssociateServiceRoleToAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a core definition. You may provide the initial version of the core definition now or use ''CreateCoreDefinitionVersion'' at a later time. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a core definition that has already been defined. AWS Greengrass groups must each contain exactly one AWS Greengrass core.
     */
  def createCoreDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
     */
  def createDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
     */
  def createDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
     */
  def createDeployment(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a deployment. ''CreateDeployment'' requests are idempotent with respect to the ''X-Amzn-Client-Token'' token and the request parameters.
     */
  def createDeployment(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
     */
  def createDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
     */
  def createDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
     */
  def createDeviceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a device definition. You may provide the initial version of the device definition now or use ''CreateDeviceDefinitionVersion'' at a later time.
     */
  def createDeviceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a device definition that has already been defined.
     */
  def createDeviceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a device definition that has already been defined.
     */
  def createDeviceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a device definition that has already been defined.
     */
  def createDeviceDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a device definition that has already been defined.
     */
  def createDeviceDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
     */
  def createFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
     */
  def createFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
     */
  def createFunctionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a Lambda function definition which contains a list of Lambda functions and their configurations to be used in a group. You can create an initial version of the definition by providing a list of Lambda functions and their configurations now, or use ''CreateFunctionDefinitionVersion'' later.
     */
  def createFunctionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a Lambda function definition that has already been defined.
     */
  def createFunctionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a Lambda function definition that has already been defined.
     */
  def createFunctionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a Lambda function definition that has already been defined.
     */
  def createFunctionDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a Lambda function definition that has already been defined.
     */
  def createFunctionDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
     */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
     */
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
     */
  def createGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a group. You may provide the initial version of the group or use ''CreateGroupVersion'' at a later time.
     */
  def createGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     */
  def createGroupCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     */
  def createGroupCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     */
  def createGroupCertificateAuthority(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a CA for the group. If a CA already exists, it will rotate the existing CA.
     */
  def createGroupCertificateAuthority(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a group which has already been defined.
     */
  def createGroupVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a group which has already been defined.
     */
  def createGroupVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a group which has already been defined.
     */
  def createGroupVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a group which has already been defined.
     */
  def createGroupVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
     */
  def createLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
     */
  def createLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
     */
  def createLoggerDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a logger definition. You may provide the initial version of the logger definition now or use ''CreateLoggerDefinitionVersion'' at a later time.
     */
  def createLoggerDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a logger definition that has already been defined.
     */
  def createLoggerDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a logger definition that has already been defined.
     */
  def createLoggerDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a logger definition that has already been defined.
     */
  def createLoggerDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a logger definition that has already been defined.
     */
  def createLoggerDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
     */
  def createResourceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
     */
  def createResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
     */
  def createResourceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a resource definition which contains a list of resources to be used in a group. You can create an initial version of the definition by providing a list of resources now, or use ''CreateResourceDefinitionVersion'' later.
     */
  def createResourceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a resource definition that has already been defined.
     */
  def createResourceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a resource definition that has already been defined.
     */
  def createResourceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a resource definition that has already been defined.
     */
  def createResourceDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a resource definition that has already been defined.
     */
  def createResourceDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
     */
  def createSoftwareUpdateJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
     */
  def createSoftwareUpdateJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
     */
  def createSoftwareUpdateJob(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a software update for a core or group of cores (specified as an IoT thing group.) Use this to update the OTA Agent as well as the Greengrass core software. It makes use of the IoT Jobs feature which provides additional commands to manage a Greengrass core software update job.
     */
  def createSoftwareUpdateJob(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSoftwareUpdateJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
     */
  def createSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
     */
  def createSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
     */
  def createSubscriptionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a subscription definition. You may provide the initial version of the subscription definition now or use ''CreateSubscriptionDefinitionVersion'' at a later time.
     */
  def createSubscriptionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a subscription definition which has already been defined.
     */
  def createSubscriptionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a subscription definition which has already been defined.
     */
  def createSubscriptionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a subscription definition which has already been defined.
     */
  def createSubscriptionDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a version of a subscription definition which has already been defined.
     */
  def createSubscriptionDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.CreateSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a core definition.
     */
  def deleteCoreDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a core definition.
     */
  def deleteCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a core definition.
     */
  def deleteCoreDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a core definition.
     */
  def deleteCoreDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device definition.
     */
  def deleteDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device definition.
     */
  def deleteDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device definition.
     */
  def deleteDeviceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a device definition.
     */
  def deleteDeviceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Lambda function definition.
     */
  def deleteFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Lambda function definition.
     */
  def deleteFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Lambda function definition.
     */
  def deleteFunctionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a Lambda function definition.
     */
  def deleteFunctionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a group.
     */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a group.
     */
  def deleteGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a group.
     */
  def deleteGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a group.
     */
  def deleteGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a logger definition.
     */
  def deleteLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a logger definition.
     */
  def deleteLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a logger definition.
     */
  def deleteLoggerDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a logger definition.
     */
  def deleteLoggerDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resource definition.
     */
  def deleteResourceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resource definition.
     */
  def deleteResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resource definition.
     */
  def deleteResourceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a resource definition.
     */
  def deleteResourceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subscription definition.
     */
  def deleteSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subscription definition.
     */
  def deleteSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subscription definition.
     */
  def deleteSubscriptionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a subscription definition.
     */
  def deleteSubscriptionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DeleteSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the role from a group.
     */
  def disassociateRoleFromGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the role from a group.
     */
  def disassociateRoleFromGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the role from a group.
     */
  def disassociateRoleFromGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the role from a group.
     */
  def disassociateRoleFromGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateRoleFromGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the service role from your account. Without a service role, deployments will not work.
     */
  def disassociateServiceRoleFromAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the service role from your account. Without a service role, deployments will not work.
     */
  def disassociateServiceRoleFromAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the service role from your account. Without a service role, deployments will not work.
     */
  def disassociateServiceRoleFromAccount(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates the service role from your account. Without a service role, deployments will not work.
     */
  def disassociateServiceRoleFromAccount(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.DisassociateServiceRoleFromAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the role associated with a particular group.
     */
  def getAssociatedRole(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the role associated with a particular group.
     */
  def getAssociatedRole(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the role associated with a particular group.
     */
  def getAssociatedRole(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the role associated with a particular group.
     */
  def getAssociatedRole(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetAssociatedRoleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a bulk deployment.
     */
  def getBulkDeploymentStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a bulk deployment.
     */
  def getBulkDeploymentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a bulk deployment.
     */
  def getBulkDeploymentStatus(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a bulk deployment.
     */
  def getBulkDeploymentStatus(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetBulkDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the connectivity information for a core.
     */
  def getConnectivityInfo(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the connectivity information for a core.
     */
  def getConnectivityInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the connectivity information for a core.
     */
  def getConnectivityInfo(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the connectivity information for a core.
     */
  def getConnectivityInfo(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a core definition version.
     */
  def getCoreDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetCoreDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a deployment.
     */
  def getDeploymentStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a deployment.
     */
  def getDeploymentStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a deployment.
     */
  def getDeploymentStatus(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns the status of a deployment.
     */
  def getDeploymentStatus(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeploymentStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition.
     */
  def getDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition.
     */
  def getDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition.
     */
  def getDeviceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition.
     */
  def getDeviceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition version.
     */
  def getDeviceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition version.
     */
  def getDeviceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition version.
     */
  def getDeviceDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a device definition version.
     */
  def getDeviceDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetDeviceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition, including its creation time and latest version.
     */
  def getFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition, including its creation time and latest version.
     */
  def getFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition, including its creation time and latest version.
     */
  def getFunctionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition, including its creation time and latest version.
     */
  def getFunctionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
     */
  def getFunctionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
     */
  def getFunctionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
     */
  def getFunctionDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a Lambda function definition version, including which Lambda functions are included in the version and their configurations.
     */
  def getFunctionDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetFunctionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group.
     */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group.
     */
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group.
     */
  def getGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group.
     */
  def getGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     */
  def getGroupCertificateAuthority(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     */
  def getGroupCertificateAuthority(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     */
  def getGroupCertificateAuthority(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retreives the CA associated with a group. Returns the public key of the CA.
     */
  def getGroupCertificateAuthority(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateAuthorityResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current configuration for the CA used by the group.
     */
  def getGroupCertificateConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current configuration for the CA used by the group.
     */
  def getGroupCertificateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current configuration for the CA used by the group.
     */
  def getGroupCertificateConfiguration(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current configuration for the CA used by the group.
     */
  def getGroupCertificateConfiguration(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group version.
     */
  def getGroupVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group version.
     */
  def getGroupVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group version.
     */
  def getGroupVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a group version.
     */
  def getGroupVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetGroupVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition.
     */
  def getLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition.
     */
  def getLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition.
     */
  def getLoggerDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition.
     */
  def getLoggerDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition version.
     */
  def getLoggerDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition version.
     */
  def getLoggerDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition version.
     */
  def getLoggerDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a logger definition version.
     */
  def getLoggerDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetLoggerDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition, including its creation time and latest version.
     */
  def getResourceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition, including its creation time and latest version.
     */
  def getResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition, including its creation time and latest version.
     */
  def getResourceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition, including its creation time and latest version.
     */
  def getResourceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition version, including which resources are included in the version.
     */
  def getResourceDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition version, including which resources are included in the version.
     */
  def getResourceDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition version, including which resources are included in the version.
     */
  def getResourceDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a resource definition version, including which resources are included in the version.
     */
  def getResourceDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetResourceDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the service role that is attached to your account.
     */
  def getServiceRoleForAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the service role that is attached to your account.
     */
  def getServiceRoleForAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the service role that is attached to your account.
     */
  def getServiceRoleForAccount(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the service role that is attached to your account.
     */
  def getServiceRoleForAccount(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetServiceRoleForAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition.
     */
  def getSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition.
     */
  def getSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition.
     */
  def getSubscriptionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition.
     */
  def getSubscriptionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition version.
     */
  def getSubscriptionDefinitionVersion(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition version.
     */
  def getSubscriptionDefinitionVersion(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition version.
     */
  def getSubscriptionDefinitionVersion(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves information about a subscription definition version.
     */
  def getSubscriptionDefinitionVersion(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.GetSubscriptionDefinitionVersionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
     */
  def listBulkDeploymentDetailedReports(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
     */
  def listBulkDeploymentDetailedReports(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
     */
  def listBulkDeploymentDetailedReports(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets a paginated list of the deployments that have been started in a bulk deployment operation, and their current deployment status.
     */
  def listBulkDeploymentDetailedReports(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentDetailedReportsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of bulk deployments.
     */
  def listBulkDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of bulk deployments.
     */
  def listBulkDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of bulk deployments.
     */
  def listBulkDeployments(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a list of bulk deployments.
     */
  def listBulkDeployments(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListBulkDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a core definition.
     */
  def listCoreDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a core definition.
     */
  def listCoreDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a core definition.
     */
  def listCoreDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a core definition.
     */
  def listCoreDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of core definitions.
     */
  def listCoreDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of core definitions.
     */
  def listCoreDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of core definitions.
     */
  def listCoreDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of core definitions.
     */
  def listCoreDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListCoreDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a history of deployments for the group.
     */
  def listDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a history of deployments for the group.
     */
  def listDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a history of deployments for the group.
     */
  def listDeployments(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Returns a history of deployments for the group.
     */
  def listDeployments(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a device definition.
     */
  def listDeviceDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a device definition.
     */
  def listDeviceDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a device definition.
     */
  def listDeviceDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a device definition.
     */
  def listDeviceDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of device definitions.
     */
  def listDeviceDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of device definitions.
     */
  def listDeviceDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of device definitions.
     */
  def listDeviceDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of device definitions.
     */
  def listDeviceDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListDeviceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a Lambda function definition.
     */
  def listFunctionDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a Lambda function definition.
     */
  def listFunctionDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a Lambda function definition.
     */
  def listFunctionDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a Lambda function definition.
     */
  def listFunctionDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of Lambda function definitions.
     */
  def listFunctionDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of Lambda function definitions.
     */
  def listFunctionDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of Lambda function definitions.
     */
  def listFunctionDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of Lambda function definitions.
     */
  def listFunctionDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListFunctionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current CAs for a group.
     */
  def listGroupCertificateAuthorities(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current CAs for a group.
     */
  def listGroupCertificateAuthorities(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current CAs for a group.
     */
  def listGroupCertificateAuthorities(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the current CAs for a group.
     */
  def listGroupCertificateAuthorities(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupCertificateAuthoritiesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a group.
     */
  def listGroupVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a group.
     */
  def listGroupVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a group.
     */
  def listGroupVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a group.
     */
  def listGroupVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of groups.
     */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of groups.
     */
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of groups.
     */
  def listGroups(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of groups.
     */
  def listGroups(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a logger definition.
     */
  def listLoggerDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a logger definition.
     */
  def listLoggerDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a logger definition.
     */
  def listLoggerDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a logger definition.
     */
  def listLoggerDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of logger definitions.
     */
  def listLoggerDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of logger definitions.
     */
  def listLoggerDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of logger definitions.
     */
  def listLoggerDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of logger definitions.
     */
  def listLoggerDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListLoggerDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a resource definition.
     */
  def listResourceDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a resource definition.
     */
  def listResourceDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a resource definition.
     */
  def listResourceDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a resource definition.
     */
  def listResourceDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of resource definitions.
     */
  def listResourceDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of resource definitions.
     */
  def listResourceDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of resource definitions.
     */
  def listResourceDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of resource definitions.
     */
  def listResourceDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListResourceDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a subscription definition.
     */
  def listSubscriptionDefinitionVersions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a subscription definition.
     */
  def listSubscriptionDefinitionVersions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a subscription definition.
     */
  def listSubscriptionDefinitionVersions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the versions of a subscription definition.
     */
  def listSubscriptionDefinitionVersions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionVersionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of subscription definitions.
     */
  def listSubscriptionDefinitions(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of subscription definitions.
     */
  def listSubscriptionDefinitions(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of subscription definitions.
     */
  def listSubscriptionDefinitions(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves a list of subscription definitions.
     */
  def listSubscriptionDefinitions(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ListSubscriptionDefinitionsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a group's deployments.
     */
  def resetDeployments(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a group's deployments.
     */
  def resetDeployments(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a group's deployments.
     */
  def resetDeployments(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a group's deployments.
     */
  def resetDeployments(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.ResetDeploymentsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
     */
  def startBulkDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
     */
  def startBulkDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
     */
  def startBulkDeployment(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deploys multiple groups in one operation. This action starts the bulk deployment of a specified set of group versions. Each group version deployment will be triggered with an adaptive rate that has a fixed upper limit. We recommend that you include an ''X-Amzn-Client-Token'' token in every ''StartBulkDeployment'' request. These requests are idempotent with respect to the token and the request parameters.
     */
  def startBulkDeployment(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StartBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
     */
  def stopBulkDeployment(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
     */
  def stopBulkDeployment(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
     */
  def stopBulkDeployment(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Stops the execution of a bulk deployment. This action returns a status of ''Stopping'' until the deployment is stopped. You cannot start a new bulk deployment while a previous deployment is in the ''Stopping'' state. This action doesn't rollback completed deployments or cancel pending deployments.
     */
  def stopBulkDeployment(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.StopBulkDeploymentResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
     */
  def updateConnectivityInfo(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
     */
  def updateConnectivityInfo(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
     */
  def updateConnectivityInfo(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the connectivity information for the core. Any devices that belong to the group which has this core will receive this information in order to find the location of the core and connect to it.
     */
  def updateConnectivityInfo(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateConnectivityInfoResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a core definition.
     */
  def updateCoreDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a core definition.
     */
  def updateCoreDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a core definition.
     */
  def updateCoreDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a core definition.
     */
  def updateCoreDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateCoreDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a device definition.
     */
  def updateDeviceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a device definition.
     */
  def updateDeviceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a device definition.
     */
  def updateDeviceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a device definition.
     */
  def updateDeviceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateDeviceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Lambda function definition.
     */
  def updateFunctionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Lambda function definition.
     */
  def updateFunctionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Lambda function definition.
     */
  def updateFunctionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a Lambda function definition.
     */
  def updateFunctionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateFunctionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a group.
     */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a group.
     */
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a group.
     */
  def updateGroup(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a group.
     */
  def updateGroup(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the Certificate expiry time for a group.
     */
  def updateGroupCertificateConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the Certificate expiry time for a group.
     */
  def updateGroupCertificateConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the Certificate expiry time for a group.
     */
  def updateGroupCertificateConfiguration(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the Certificate expiry time for a group.
     */
  def updateGroupCertificateConfiguration(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateGroupCertificateConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a logger definition.
     */
  def updateLoggerDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a logger definition.
     */
  def updateLoggerDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a logger definition.
     */
  def updateLoggerDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a logger definition.
     */
  def updateLoggerDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateLoggerDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a resource definition.
     */
  def updateResourceDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a resource definition.
     */
  def updateResourceDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a resource definition.
     */
  def updateResourceDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a resource definition.
     */
  def updateResourceDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateResourceDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a subscription definition.
     */
  def updateSubscriptionDefinition(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a subscription definition.
     */
  def updateSubscriptionDefinition(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a subscription definition.
     */
  def updateSubscriptionDefinition(params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates a subscription definition.
     */
  def updateSubscriptionDefinition(
    params: awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsGreengrassMod.GreengrassNs.UpdateSubscriptionDefinitionResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

