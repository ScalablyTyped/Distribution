package typings
package awsDashSdkLib.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/greengrass", "Greengrass")
@js.native
object GreengrassNs extends js.Object {
  trait AssociateRoleToGroupRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The ARN of the role you wish to associate with this group.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait AssociateRoleToGroupResponse extends js.Object {
    /**
      * The time, in milliseconds since the epoch, when the role ARN was associated with the group.
      */
    var AssociatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait AssociateServiceRoleToAccountRequest extends js.Object {
    /**
      * The ARN of the service role you wish to associate with your account.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait AssociateServiceRoleToAccountResponse extends js.Object {
    /**
      * The time when the service role was associated with the account.
      */
    var AssociatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait BulkDeployment extends js.Object {
    /**
      * The ARN of the bulk deployment.
      */
    var BulkDeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the bulk deployment.
      */
    var BulkDeploymentId: js.UndefOr[__string] = js.undefined
    /**
      * The time, in ISO format, when the deployment was created.
      */
    var CreatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait BulkDeploymentMetrics extends js.Object {
    /**
      * The total number of records that returned a non-retryable error. For example, this can occur if a group record from the input file uses an invalid format or specifies a nonexistent group version, or if the execution role doesn't grant permission to deploy a group or group version.
      */
    var InvalidInputRecords: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of group records from the input file that have been processed so far, or attempted.
      */
    var RecordsProcessed: js.UndefOr[__integer] = js.undefined
    /**
      * The total number of deployment attempts that returned a retryable error. For example, a retry is triggered if the attempt to deploy a group returns a throttling error. ''StartBulkDeployment'' retries a group deployment up to five times.
      */
    var RetryAttempts: js.UndefOr[__integer] = js.undefined
  }
  
  trait BulkDeploymentResult extends js.Object {
    /**
      * The time, in ISO format, when the deployment was created.
      */
    var CreatedAt: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the group deployment.
      */
    var DeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the group deployment.
      */
    var DeploymentId: js.UndefOr[__string] = js.undefined
    /**
      * The current status of the group deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
      */
    var DeploymentStatus: js.UndefOr[__string] = js.undefined
    /**
      * The type of the deployment.
      */
    var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
    /**
      * Details about the error.
      */
    var ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * The error message for a failed deployment
      */
    var ErrorMessage: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the Greengrass group.
      */
    var GroupArn: js.UndefOr[__string] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ConnectivityInfo extends js.Object {
    /**
      * The endpoint for the Greengrass core. Can be an IP address or DNS.
      */
    var HostAddress: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the connectivity information.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * Metadata for this endpoint.
      */
    var Metadata: js.UndefOr[__string] = js.undefined
    /**
      * The port of the Greengrass core. Usually 8883.
      */
    var PortNumber: js.UndefOr[__integer] = js.undefined
  }
  
  trait Connector extends js.Object {
    /**
      * The ARN of the connector.
      */
    var ConnectorArn: js.UndefOr[__string] = js.undefined
    /**
      * A descriptive or arbitrary ID for the connector. This value must be unique within the connector definition version. Max length is 128 characters with pattern [a-zA-Z0-9:_-]+.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The parameters or configuration that the connector uses.
      */
    var Parameters: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  trait ConnectorDefinitionVersion extends js.Object {
    /**
      * A list of references to connectors in this version, with their corresponding configuration settings.
      */
    var Connectors: js.UndefOr[__listOfConnector] = js.undefined
  }
  
  trait Core extends js.Object {
    /**
      * The ARN of the certificate associated with the core.
      */
    var CertificateArn: js.UndefOr[__string] = js.undefined
    /**
      * A descriptive or arbitrary ID for the core. This value must be unique within the core definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * If true, the core's local shadow is automatically synced with the cloud.
      */
    var SyncShadow: js.UndefOr[__boolean] = js.undefined
    /**
      * The ARN of the thing which is the core.
      */
    var ThingArn: js.UndefOr[__string] = js.undefined
  }
  
  trait CoreDefinitionVersion extends js.Object {
    /**
      * A list of cores in the core definition version.
      */
    var Cores: js.UndefOr[__listOfCore] = js.undefined
  }
  
  trait CreateConnectorDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the connector definition.
      */
    var InitialVersion: js.UndefOr[ConnectorDefinitionVersion] = js.undefined
    /**
      * The name of the connector definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateConnectorDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateConnectorDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
    /**
      * A list of references to connectors in this version, with their corresponding configuration settings.
      */
    var Connectors: js.UndefOr[__listOfConnector] = js.undefined
  }
  
  trait CreateConnectorDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateCoreDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the core definition.
      */
    var InitialVersion: js.UndefOr[CoreDefinitionVersion] = js.undefined
    /**
      * The name of the core definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateCoreDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateCoreDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
    /**
      * A list of cores in the core definition version.
      */
    var Cores: js.UndefOr[__listOfCore] = js.undefined
  }
  
  trait CreateCoreDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDeploymentRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the deployment if you wish to redeploy a previous deployment.
      */
    var DeploymentId: js.UndefOr[__string] = js.undefined
    /**
      * The type of deployment. When used for ''CreateDeployment'', only ''NewDeployment'' and ''Redeployment'' are valid.
      */
    var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The ID of the group version to be deployed.
      */
    var GroupVersionId: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDeploymentResponse extends js.Object {
    /**
      * The ARN of the deployment.
      */
    var DeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the deployment.
      */
    var DeploymentId: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDeviceDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the device definition.
      */
    var InitialVersion: js.UndefOr[DeviceDefinitionVersion] = js.undefined
    /**
      * The name of the device definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDeviceDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateDeviceDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
    /**
      * A list of devices in the definition version.
      */
    var Devices: js.UndefOr[__listOfDevice] = js.undefined
  }
  
  trait CreateDeviceDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateFunctionDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the function definition.
      */
    var InitialVersion: js.UndefOr[FunctionDefinitionVersion] = js.undefined
    /**
      * The name of the function definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateFunctionDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateFunctionDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
      */
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
    /**
      * A list of Lambda functions in this function definition version.
      */
    var Functions: js.UndefOr[__listOfFunction] = js.undefined
  }
  
  trait CreateFunctionDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateGroupCertificateAuthorityRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait CreateGroupCertificateAuthorityResponse extends js.Object {
    /**
      * The ARN of the group certificate authority.
      */
    var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateGroupRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the group.
      */
    var InitialVersion: js.UndefOr[GroupVersion] = js.undefined
    /**
      * The name of the group.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateGroupResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateGroupVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the connector definition version for this group.
      */
    var ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the core definition version for this group.
      */
    var CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the device definition version for this group.
      */
    var DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the function definition version for this group.
      */
    var FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The ARN of the logger definition version for this group.
      */
    var LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the resource definition version for this group.
      */
    var ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the subscription definition version for this group.
      */
    var SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateGroupVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateLoggerDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the logger definition.
      */
    var InitialVersion: js.UndefOr[LoggerDefinitionVersion] = js.undefined
    /**
      * The name of the logger definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateLoggerDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateLoggerDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
    /**
      * A list of loggers.
      */
    var Loggers: js.UndefOr[__listOfLogger] = js.undefined
  }
  
  trait CreateLoggerDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateResourceDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the resource definition.
      */
    var InitialVersion: js.UndefOr[ResourceDefinitionVersion] = js.undefined
    /**
      * The name of the resource definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateResourceDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateResourceDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
    /**
      * A list of resources.
      */
    var Resources: js.UndefOr[__listOfResource] = js.undefined
  }
  
  trait CreateResourceDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateSoftwareUpdateJobRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    var S3UrlSignerRole: js.UndefOr[S3UrlSignerRole] = js.undefined
    var SoftwareToUpdate: js.UndefOr[SoftwareToUpdate] = js.undefined
    var UpdateAgentLogLevel: js.UndefOr[UpdateAgentLogLevel] = js.undefined
    var UpdateTargets: js.UndefOr[UpdateTargets] = js.undefined
    var UpdateTargetsArchitecture: js.UndefOr[UpdateTargetsArchitecture] = js.undefined
    var UpdateTargetsOperatingSystem: js.UndefOr[UpdateTargetsOperatingSystem] = js.undefined
  }
  
  trait CreateSoftwareUpdateJobResponse extends js.Object {
    /**
      * The IoT Job ARN corresponding to this update.
      */
    var IotJobArn: js.UndefOr[__string] = js.undefined
    /**
      * The IoT Job Id corresponding to this update.
      */
    var IotJobId: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateSubscriptionDefinitionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about the initial version of the subscription definition.
      */
    var InitialVersion: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined
    /**
      * The name of the subscription definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateSubscriptionDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait CreateSubscriptionDefinitionVersionRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
    /**
      * A list of subscriptions.
      */
    var Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
  }
  
  trait CreateSubscriptionDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait DefinitionInformation extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait DeleteConnectorDefinitionRequest extends js.Object {
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
  }
  
  trait DeleteConnectorDefinitionResponse extends js.Object
  
  trait DeleteCoreDefinitionRequest extends js.Object {
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
  }
  
  trait DeleteCoreDefinitionResponse extends js.Object
  
  trait DeleteDeviceDefinitionRequest extends js.Object {
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
  }
  
  trait DeleteDeviceDefinitionResponse extends js.Object
  
  trait DeleteFunctionDefinitionRequest extends js.Object {
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
  }
  
  trait DeleteFunctionDefinitionResponse extends js.Object
  
  trait DeleteGroupRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait DeleteGroupResponse extends js.Object
  
  trait DeleteLoggerDefinitionRequest extends js.Object {
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
  }
  
  trait DeleteLoggerDefinitionResponse extends js.Object
  
  trait DeleteResourceDefinitionRequest extends js.Object {
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
  }
  
  trait DeleteResourceDefinitionResponse extends js.Object
  
  trait DeleteSubscriptionDefinitionRequest extends js.Object {
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
  }
  
  trait DeleteSubscriptionDefinitionResponse extends js.Object
  
  trait Deployment extends js.Object {
    /**
      * The time, in milliseconds since the epoch, when the deployment was created.
      */
    var CreatedAt: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the deployment.
      */
    var DeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the deployment.
      */
    var DeploymentId: js.UndefOr[__string] = js.undefined
    /**
      * The type of the deployment.
      */
    var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
    /**
      * The ARN of the group for this deployment.
      */
    var GroupArn: js.UndefOr[__string] = js.undefined
  }
  
  trait Device extends js.Object {
    /**
      * The ARN of the certificate associated with the device.
      */
    var CertificateArn: js.UndefOr[__string] = js.undefined
    /**
      * A descriptive or arbitrary ID for the device. This value must be unique within the device definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * If true, the device's local shadow will be automatically synced with the cloud.
      */
    var SyncShadow: js.UndefOr[__boolean] = js.undefined
    /**
      * The thing ARN of the device.
      */
    var ThingArn: js.UndefOr[__string] = js.undefined
  }
  
  trait DeviceDefinitionVersion extends js.Object {
    /**
      * A list of devices in the definition version.
      */
    var Devices: js.UndefOr[__listOfDevice] = js.undefined
  }
  
  trait DisassociateRoleFromGroupRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait DisassociateRoleFromGroupResponse extends js.Object {
    /**
      * The time, in milliseconds since the epoch, when the role was disassociated from the group.
      */
    var DisassociatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait DisassociateServiceRoleFromAccountRequest extends js.Object
  
  trait DisassociateServiceRoleFromAccountResponse extends js.Object {
    /**
      * The time when the service role was disassociated from the account.
      */
    var DisassociatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait ErrorDetail extends js.Object {
    /**
      * A detailed error code.
      */
    var DetailedErrorCode: js.UndefOr[__string] = js.undefined
    /**
      * A detailed error message.
      */
    var DetailedErrorMessage: js.UndefOr[__string] = js.undefined
  }
  
  @js.native
  trait Function extends js.Object {
    /**
      * The ARN of the Lambda function.
      */
    var FunctionArn: js.UndefOr[__string] = js.native
    /**
      * The configuration of the Lambda function.
      */
    var FunctionConfiguration: js.UndefOr[FunctionConfiguration] = js.native
    /**
      * A descriptive or arbitrary ID for the function. This value must be unique within the function definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
      */
    var Id: js.UndefOr[__string] = js.native
  }
  
  trait FunctionConfiguration extends js.Object {
    /**
      * The expected encoding type of the input payload for the function. The default is ''json''.
      */
    var EncodingType: js.UndefOr[EncodingType] = js.undefined
    /**
      * The environment configuration of the function.
      */
    var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.undefined
    /**
      * The execution arguments.
      */
    var ExecArgs: js.UndefOr[__string] = js.undefined
    /**
      * The name of the function executable.
      */
    var Executable: js.UndefOr[__string] = js.undefined
    /**
      * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
      */
    var MemorySize: js.UndefOr[__integer] = js.undefined
    /**
      * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
      */
    var Pinned: js.UndefOr[__boolean] = js.undefined
    /**
      * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
      */
    var Timeout: js.UndefOr[__integer] = js.undefined
  }
  
  trait FunctionConfigurationEnvironment extends js.Object {
    /**
      * If true, the Lambda function is allowed to access the host's /sys folder. Use this when the Lambda function needs to read device information from /sys. This setting applies only when you run the Lambda function in a Greengrass container.
      */
    var AccessSysfs: js.UndefOr[__boolean] = js.undefined
    /**
      * Configuration related to executing the Lambda function
      */
    var Execution: js.UndefOr[FunctionExecutionConfig] = js.undefined
    /**
      * A list of the resources, with their permissions, to which the Lambda function will be granted access. A Lambda function can have at most 10 resources. ResourceAccessPolicies apply only when you run the Lambda function in a Greengrass container.
      */
    var ResourceAccessPolicies: js.UndefOr[__listOfResourceAccessPolicy] = js.undefined
    /**
      * Environment variables for the Lambda function's configuration.
      */
    var Variables: js.UndefOr[__mapOf__string] = js.undefined
  }
  
  trait FunctionDefaultConfig extends js.Object {
    var Execution: js.UndefOr[FunctionDefaultExecutionConfig] = js.undefined
  }
  
  trait FunctionDefaultExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined
    var RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
  }
  
  trait FunctionDefinitionVersion extends js.Object {
    /**
      * The default configuration that applies to all Lambda functions in this function definition version. Individual Lambda functions can override these settings.
      */
    var DefaultConfig: js.UndefOr[FunctionDefaultConfig] = js.undefined
    /**
      * A list of Lambda functions in this function definition version.
      */
    var Functions: js.UndefOr[__listOfFunction] = js.undefined
  }
  
  trait FunctionExecutionConfig extends js.Object {
    var IsolationMode: js.UndefOr[FunctionIsolationMode] = js.undefined
    var RunAs: js.UndefOr[FunctionRunAsConfig] = js.undefined
  }
  
  trait FunctionRunAsConfig extends js.Object {
    /**
      * The group ID whose permissions are used to run a Lambda function.
      */
    var Gid: js.UndefOr[__integer] = js.undefined
    /**
      * The user ID whose permissions are used to run a Lambda function.
      */
    var Uid: js.UndefOr[__integer] = js.undefined
  }
  
  trait GetAssociatedRoleRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait GetAssociatedRoleResponse extends js.Object {
    /**
      * The time when the role was associated with the group.
      */
    var AssociatedAt: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the role that is associated with the group.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait GetBulkDeploymentStatusRequest extends js.Object {
    /**
      * The ID of the bulk deployment.
      */
    var BulkDeploymentId: __string
  }
  
  trait GetBulkDeploymentStatusResponse extends js.Object {
    /**
      * Relevant metrics on input records processed during bulk deployment.
      */
    var BulkDeploymentMetrics: js.UndefOr[BulkDeploymentMetrics] = js.undefined
    /**
      * The status of the bulk deployment.
      */
    var BulkDeploymentStatus: js.UndefOr[BulkDeploymentStatus] = js.undefined
    /**
      * The time, in ISO format, when the deployment was created.
      */
    var CreatedAt: js.UndefOr[__string] = js.undefined
    /**
      * Error details
      */
    var ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * Error message
      */
    var ErrorMessage: js.UndefOr[__string] = js.undefined
  }
  
  trait GetConnectivityInfoRequest extends js.Object {
    /**
      * The thing name.
      */
    var ThingName: __string
  }
  
  trait GetConnectivityInfoResponse extends js.Object {
    /**
      * Connectivity info list.
      */
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined
    /**
      * A message about the connectivity info request.
      */
    var Message: js.UndefOr[__string] = js.undefined
  }
  
  trait GetConnectorDefinitionRequest extends js.Object {
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
  }
  
  trait GetConnectorDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetConnectorDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
    /**
      * The ID of the connector definition version.
      */
    var ConnectorDefinitionVersionId: __string
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait GetConnectorDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the connector definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the connector definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the connector definition version.
      */
    var Definition: js.UndefOr[ConnectorDefinitionVersion] = js.undefined
    /**
      * The ID of the connector definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The version of the connector definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetCoreDefinitionRequest extends js.Object {
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
  }
  
  trait GetCoreDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetCoreDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
    /**
      * The ID of the core definition version.
      */
    var CoreDefinitionVersionId: __string
  }
  
  trait GetCoreDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the core definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the core definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the core definition version.
      */
    var Definition: js.UndefOr[CoreDefinitionVersion] = js.undefined
    /**
      * The ID of the core definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The version of the core definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetDeploymentStatusRequest extends js.Object {
    /**
      * The ID of the deployment.
      */
    var DeploymentId: __string
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait GetDeploymentStatusResponse extends js.Object {
    /**
      * The status of the deployment: ''InProgress'', ''Building'', ''Success'', or ''Failure''.
      */
    var DeploymentStatus: js.UndefOr[__string] = js.undefined
    /**
      * The type of the deployment.
      */
    var DeploymentType: js.UndefOr[DeploymentType] = js.undefined
    /**
      * Error details
      */
    var ErrorDetails: js.UndefOr[ErrorDetails] = js.undefined
    /**
      * Error message
      */
    var ErrorMessage: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the deployment status was updated.
      */
    var UpdatedAt: js.UndefOr[__string] = js.undefined
  }
  
  trait GetDeviceDefinitionRequest extends js.Object {
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
  }
  
  trait GetDeviceDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetDeviceDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
    /**
      * The ID of the device definition version.
      */
    var DeviceDefinitionVersionId: __string
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait GetDeviceDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the device definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the device definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the device definition version.
      */
    var Definition: js.UndefOr[DeviceDefinitionVersion] = js.undefined
    /**
      * The ID of the device definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The version of the device definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetFunctionDefinitionRequest extends js.Object {
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
  }
  
  trait GetFunctionDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetFunctionDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
    /**
      * The ID of the function definition version.
      */
    var FunctionDefinitionVersionId: __string
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait GetFunctionDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the function definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the function definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information on the definition.
      */
    var Definition: js.UndefOr[FunctionDefinitionVersion] = js.undefined
    /**
      * The ID of the function definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The version of the function definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetGroupCertificateAuthorityRequest extends js.Object {
    /**
      * The ID of the certificate authority.
      */
    var CertificateAuthorityId: __string
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait GetGroupCertificateAuthorityResponse extends js.Object {
    /**
      * The ARN of the certificate authority for the group.
      */
    var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the certificate authority for the group.
      */
    var GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined
    /**
      * The PEM encoded certificate for the group.
      */
    var PemEncodedCertificate: js.UndefOr[__string] = js.undefined
  }
  
  trait GetGroupCertificateConfigurationRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait GetGroupCertificateConfigurationResponse extends js.Object {
    /**
      * The amount of time remaining before the certificate authority expires, in milliseconds.
      */
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    /**
      * The amount of time remaining before the certificate expires, in milliseconds.
      */
    var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the group certificate configuration.
      */
    var GroupId: js.UndefOr[__string] = js.undefined
  }
  
  trait GetGroupRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait GetGroupResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetGroupVersionRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The ID of the group version.
      */
    var GroupVersionId: __string
  }
  
  trait GetGroupVersionResponse extends js.Object {
    /**
      * The ARN of the group version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the group version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the group version definition.
      */
    var Definition: js.UndefOr[GroupVersion] = js.undefined
    /**
      * The ID of the group version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID for the version of the group.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetLoggerDefinitionRequest extends js.Object {
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
  }
  
  trait GetLoggerDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetLoggerDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
    /**
      * The ID of the logger definition version.
      */
    var LoggerDefinitionVersionId: __string
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait GetLoggerDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the logger definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the logger definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the logger definition version.
      */
    var Definition: js.UndefOr[LoggerDefinitionVersion] = js.undefined
    /**
      * The ID of the logger definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The version of the logger definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetResourceDefinitionRequest extends js.Object {
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
  }
  
  trait GetResourceDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetResourceDefinitionVersionRequest extends js.Object {
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
    /**
      * The ID of the resource definition version.
      */
    var ResourceDefinitionVersionId: __string
  }
  
  trait GetResourceDefinitionVersionResponse extends js.Object {
    /**
      * Arn of the resource definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the resource definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the definition.
      */
    var Definition: js.UndefOr[ResourceDefinitionVersion] = js.undefined
    /**
      * The ID of the resource definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The version of the resource definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GetServiceRoleForAccountRequest extends js.Object
  
  trait GetServiceRoleForAccountResponse extends js.Object {
    /**
      * The time when the service role was associated with the account.
      */
    var AssociatedAt: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the role which is associated with the account.
      */
    var RoleArn: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSubscriptionDefinitionRequest extends js.Object {
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
  }
  
  trait GetSubscriptionDefinitionResponse extends js.Object {
    /**
      * The ARN of the definition.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the definition.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the definition was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the definition.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the definition.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GetSubscriptionDefinitionVersionRequest extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
    /**
      * The ID of the subscription definition version.
      */
    var SubscriptionDefinitionVersionId: __string
  }
  
  trait GetSubscriptionDefinitionVersionResponse extends js.Object {
    /**
      * The ARN of the subscription definition version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the subscription definition version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * Information about the subscription definition version.
      */
    var Definition: js.UndefOr[SubscriptionDefinitionVersion] = js.undefined
    /**
      * The ID of the subscription definition version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The version of the subscription definition version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait GroupCertificateAuthorityProperties extends js.Object {
    /**
      * The ARN of the certificate authority for the group.
      */
    var GroupCertificateAuthorityArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the certificate authority for the group.
      */
    var GroupCertificateAuthorityId: js.UndefOr[__string] = js.undefined
  }
  
  trait GroupInformation extends js.Object {
    /**
      * The ARN of the group.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the group was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the group.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the group was last updated.
      */
    var LastUpdatedTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The latest version of the group.
      */
    var LatestVersion: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the latest version of the group.
      */
    var LatestVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The name of the group.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait GroupOwnerSetting extends js.Object {
    /**
      * If true, AWS IoT Greengrass automatically adds the specified Linux OS group owner of the resource to the Lambda process privileges. Thus the Lambda process will have the file access permissions of the added Linux group.
      */
    var AutoAddGroupOwner: js.UndefOr[__boolean] = js.undefined
    /**
      * The name of the Linux OS group whose privileges will be added to the Lambda process. This field is optional.
      */
    var GroupOwner: js.UndefOr[__string] = js.undefined
  }
  
  trait GroupVersion extends js.Object {
    /**
      * The ARN of the connector definition version for this group.
      */
    var ConnectorDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the core definition version for this group.
      */
    var CoreDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the device definition version for this group.
      */
    var DeviceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the function definition version for this group.
      */
    var FunctionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the logger definition version for this group.
      */
    var LoggerDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the resource definition version for this group.
      */
    var ResourceDefinitionVersionArn: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the subscription definition version for this group.
      */
    var SubscriptionDefinitionVersionArn: js.UndefOr[__string] = js.undefined
  }
  
  trait ListBulkDeploymentDetailedReportsRequest extends js.Object {
    /**
      * The ID of the bulk deployment.
      */
    var BulkDeploymentId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListBulkDeploymentDetailedReportsResponse extends js.Object {
    /**
      * A list of the individual group deployments in the bulk deployment operation.
      */
    var Deployments: js.UndefOr[BulkDeploymentResults] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListBulkDeploymentsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListBulkDeploymentsResponse extends js.Object {
    /**
      * A list of bulk deployments.
      */
    var BulkDeployments: js.UndefOr[BulkDeployments] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListConnectorDefinitionVersionsRequest extends js.Object {
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListConnectorDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListConnectorDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListConnectorDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListCoreDefinitionVersionsRequest extends js.Object {
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListCoreDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListCoreDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListCoreDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDeploymentsRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDeploymentsResponse extends js.Object {
    /**
      * A list of deployments for the requested groups.
      */
    var Deployments: js.UndefOr[Deployments] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDeviceDefinitionVersionsRequest extends js.Object {
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDeviceDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListDeviceDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListDeviceDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFunctionDefinitionVersionsRequest extends js.Object {
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFunctionDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListFunctionDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListFunctionDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListGroupCertificateAuthoritiesRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait ListGroupCertificateAuthoritiesResponse extends js.Object {
    /**
      * A list of certificate authorities associated with the group.
      */
    var GroupCertificateAuthorities: js.UndefOr[__listOfGroupCertificateAuthorityProperties] = js.undefined
  }
  
  trait ListGroupVersionsRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListGroupVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListGroupsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListGroupsResponse extends js.Object {
    /**
      * Information about a group.
      */
    var Groups: js.UndefOr[__listOfGroupInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListLoggerDefinitionVersionsRequest extends js.Object {
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListLoggerDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListLoggerDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListLoggerDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListResourceDefinitionVersionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
  }
  
  trait ListResourceDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListResourceDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListResourceDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListSubscriptionDefinitionVersionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
  }
  
  trait ListSubscriptionDefinitionVersionsResponse extends js.Object {
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
    /**
      * Information about a version.
      */
    var Versions: js.UndefOr[__listOfVersionInformation] = js.undefined
  }
  
  trait ListSubscriptionDefinitionsRequest extends js.Object {
    /**
      * The maximum number of results to be returned per request.
      */
    var MaxResults: js.UndefOr[__string] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait ListSubscriptionDefinitionsResponse extends js.Object {
    /**
      * Information about a definition.
      */
    var Definitions: js.UndefOr[__listOfDefinitionInformation] = js.undefined
    /**
      * The token for the next set of results, or ''null'' if there are no additional results.
      */
    var NextToken: js.UndefOr[__string] = js.undefined
  }
  
  trait LocalDeviceResourceData extends js.Object {
    /**
      * Group/owner related settings for local resources.
      */
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined
    /**
      * The local absolute path of the device resource. The source path for a device resource can refer only to a character device or block device under ''/dev''.
      */
    var SourcePath: js.UndefOr[__string] = js.undefined
  }
  
  trait LocalVolumeResourceData extends js.Object {
    /**
      * The absolute local path of the resource inside the Lambda environment.
      */
    var DestinationPath: js.UndefOr[__string] = js.undefined
    /**
      * Allows you to configure additional group privileges for the Lambda process. This field is optional.
      */
    var GroupOwnerSetting: js.UndefOr[GroupOwnerSetting] = js.undefined
    /**
      * The local absolute path of the volume resource on the host. The source path for a volume resource type cannot start with ''/sys''.
      */
    var SourcePath: js.UndefOr[__string] = js.undefined
  }
  
  trait Logger extends js.Object {
    /**
      * The component that will be subject to logging.
      */
    var Component: js.UndefOr[LoggerComponent] = js.undefined
    /**
      * A descriptive or arbitrary ID for the logger. This value must be unique within the logger definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The level of the logs.
      */
    var Level: js.UndefOr[LoggerLevel] = js.undefined
    /**
      * The amount of file space, in KB, to use if the local file system is used for logging purposes.
      */
    var Space: js.UndefOr[__integer] = js.undefined
    /**
      * The type of log output which will be used.
      */
    var Type: js.UndefOr[LoggerType] = js.undefined
  }
  
  trait LoggerDefinitionVersion extends js.Object {
    /**
      * A list of loggers.
      */
    var Loggers: js.UndefOr[__listOfLogger] = js.undefined
  }
  
  trait ResetDeploymentsRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * If true, performs a best-effort only core reset.
      */
    var Force: js.UndefOr[__boolean] = js.undefined
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait ResetDeploymentsResponse extends js.Object {
    /**
      * The ARN of the deployment.
      */
    var DeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the deployment.
      */
    var DeploymentId: js.UndefOr[__string] = js.undefined
  }
  
  trait Resource extends js.Object {
    /**
      * The resource ID, used to refer to a resource in the Lambda function configuration. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The descriptive resource name, which is displayed on the AWS IoT Greengrass console. Max length 128 characters with pattern ''[a-zA-Z0-9:_-]+''. This must be unique within a Greengrass group.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * A container of data for all resource types.
      */
    var ResourceDataContainer: js.UndefOr[ResourceDataContainer] = js.undefined
  }
  
  trait ResourceAccessPolicy extends js.Object {
    /**
      * The permissions that the Lambda function has to the resource. Can be one of ''rw'' (read/write) or ''ro'' (read-only).
      */
    var Permission: js.UndefOr[Permission] = js.undefined
    /**
      * The ID of the resource. (This ID is assigned to the resource when you create the resource definiton.)
      */
    var ResourceId: js.UndefOr[__string] = js.undefined
  }
  
  trait ResourceDataContainer extends js.Object {
    /**
      * Attributes that define the local device resource.
      */
    var LocalDeviceResourceData: js.UndefOr[LocalDeviceResourceData] = js.undefined
    /**
      * Attributes that define the local volume resource.
      */
    var LocalVolumeResourceData: js.UndefOr[LocalVolumeResourceData] = js.undefined
    /**
      * Attributes that define an Amazon S3 machine learning resource.
      */
    var S3MachineLearningModelResourceData: js.UndefOr[S3MachineLearningModelResourceData] = js.undefined
    /**
      * Attributes that define an Amazon SageMaker machine learning resource.
      */
    var SageMakerMachineLearningModelResourceData: js.UndefOr[SageMakerMachineLearningModelResourceData] = js.undefined
    /**
      * Attributes that define a secret resource, which references a secret from AWS Secrets Manager.
      */
    var SecretsManagerSecretResourceData: js.UndefOr[SecretsManagerSecretResourceData] = js.undefined
  }
  
  trait ResourceDefinitionVersion extends js.Object {
    /**
      * A list of resources.
      */
    var Resources: js.UndefOr[__listOfResource] = js.undefined
  }
  
  trait S3MachineLearningModelResourceData extends js.Object {
    /**
      * The absolute local path of the resource inside the Lambda environment.
      */
    var DestinationPath: js.UndefOr[__string] = js.undefined
    /**
      * The URI of the source model in an S3 bucket. The model package must be in tar.gz or .zip format.
      */
    var S3Uri: js.UndefOr[__string] = js.undefined
  }
  
  trait SageMakerMachineLearningModelResourceData extends js.Object {
    /**
      * The absolute local path of the resource inside the Lambda environment.
      */
    var DestinationPath: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the Amazon SageMaker training job that represents the source model.
      */
    var SageMakerJobArn: js.UndefOr[__string] = js.undefined
  }
  
  trait SecretsManagerSecretResourceData extends js.Object {
    /**
      * The ARN of the Secrets Manager secret to make available on the core. The value of the secret's latest version (represented by the ''AWSCURRENT'' staging label) is included by default.
      */
    var ARN: js.UndefOr[__string] = js.undefined
    /**
      * Optional. The staging labels whose values you want to make available on the core, in addition to ''AWSCURRENT''.
      */
    var AdditionalStagingLabelsToDownload: js.UndefOr[__listOf__string] = js.undefined
  }
  
  trait StartBulkDeploymentRequest extends js.Object {
    /**
      * A client token used to correlate requests and responses.
      */
    var AmznClientToken: js.UndefOr[__string] = js.undefined
    /**
      * The ARN of the execution role to associate with the bulk deployment operation. This IAM role must allow the ''greengrass:CreateDeployment'' action for all group versions that are listed in the input file. This IAM role must have access to the S3 bucket containing the input file.
      */
    var ExecutionRoleArn: js.UndefOr[__string] = js.undefined
    /**
      * The URI of the input file contained in the S3 bucket. The execution role must have ''getObject'' permissions on this bucket to access the input file. The input file is a JSON-serialized, line delimited file with UTF-8 encoding that provides a list of group and version IDs and the deployment type. This file must be less than 100 MB. Currently, AWS IoT Greengrass supports only ''NewDeployment'' deployment types.
      */
    var InputFileUri: js.UndefOr[__string] = js.undefined
  }
  
  trait StartBulkDeploymentResponse extends js.Object {
    /**
      * The ARN of the bulk deployment.
      */
    var BulkDeploymentArn: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the bulk deployment.
      */
    var BulkDeploymentId: js.UndefOr[__string] = js.undefined
  }
  
  trait StopBulkDeploymentRequest extends js.Object {
    /**
      * The ID of the bulk deployment.
      */
    var BulkDeploymentId: __string
  }
  
  trait StopBulkDeploymentResponse extends js.Object
  
  trait Subscription extends js.Object {
    /**
      * A descriptive or arbitrary ID for the subscription. This value must be unique within the subscription definition version. Max length is 128 characters with pattern ''[a-zA-Z0-9:_-]+''.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The source of the subscription. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
      */
    var Source: js.UndefOr[__string] = js.undefined
    /**
      * The MQTT topic used to route the message.
      */
    var Subject: js.UndefOr[__string] = js.undefined
    /**
      * Where the message is sent to. Can be a thing ARN, a Lambda function ARN, a connector ARN, 'cloud' (which represents the AWS IoT cloud), or 'GGShadowService'.
      */
    var Target: js.UndefOr[__string] = js.undefined
  }
  
  trait SubscriptionDefinitionVersion extends js.Object {
    /**
      * A list of subscriptions.
      */
    var Subscriptions: js.UndefOr[__listOfSubscription] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UpdateConnectivityInfoRequest extends js.Object {
    /**
      * A list of connectivity info.
      */
    var ConnectivityInfo: js.UndefOr[__listOfConnectivityInfo] = js.undefined
    /**
      * The thing name.
      */
    var ThingName: __string
  }
  
  trait UpdateConnectivityInfoResponse extends js.Object {
    /**
      * A message about the connectivity info update request.
      */
    var Message: js.UndefOr[__string] = js.undefined
    /**
      * The new version of the connectivity info.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateConnectorDefinitionRequest extends js.Object {
    /**
      * The ID of the connector definition.
      */
    var ConnectorDefinitionId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateConnectorDefinitionResponse extends js.Object
  
  trait UpdateCoreDefinitionRequest extends js.Object {
    /**
      * The ID of the core definition.
      */
    var CoreDefinitionId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateCoreDefinitionResponse extends js.Object
  
  trait UpdateDeviceDefinitionRequest extends js.Object {
    /**
      * The ID of the device definition.
      */
    var DeviceDefinitionId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateDeviceDefinitionResponse extends js.Object
  
  trait UpdateFunctionDefinitionRequest extends js.Object {
    /**
      * The ID of the Lambda function definition.
      */
    var FunctionDefinitionId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateFunctionDefinitionResponse extends js.Object
  
  trait UpdateGroupCertificateConfigurationRequest extends js.Object {
    /**
      * The amount of time remaining before the certificate expires, in milliseconds.
      */
    var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
  }
  
  trait UpdateGroupCertificateConfigurationResponse extends js.Object {
    /**
      * The amount of time remaining before the certificate authority expires, in milliseconds.
      */
    var CertificateAuthorityExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    /**
      * The amount of time remaining before the certificate expires, in milliseconds.
      */
    var CertificateExpiryInMilliseconds: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the group certificate configuration.
      */
    var GroupId: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateGroupRequest extends js.Object {
    /**
      * The ID of the Greengrass group.
      */
    var GroupId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateGroupResponse extends js.Object
  
  trait UpdateLoggerDefinitionRequest extends js.Object {
    /**
      * The ID of the logger definition.
      */
    var LoggerDefinitionId: __string
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
  }
  
  trait UpdateLoggerDefinitionResponse extends js.Object
  
  trait UpdateResourceDefinitionRequest extends js.Object {
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the resource definition.
      */
    var ResourceDefinitionId: __string
  }
  
  trait UpdateResourceDefinitionResponse extends js.Object
  
  trait UpdateSubscriptionDefinitionRequest extends js.Object {
    /**
      * The name of the definition.
      */
    var Name: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the subscription definition.
      */
    var SubscriptionDefinitionId: __string
  }
  
  trait UpdateSubscriptionDefinitionResponse extends js.Object
  
  trait VersionInformation extends js.Object {
    /**
      * The ARN of the version.
      */
    var Arn: js.UndefOr[__string] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the version was created.
      */
    var CreationTimestamp: js.UndefOr[__string] = js.undefined
    /**
      * The ID of the version.
      */
    var Id: js.UndefOr[__string] = js.undefined
    /**
      * The unique ID of the version.
      */
    var Version: js.UndefOr[__string] = js.undefined
  }
  
  trait _BulkDeploymentStatus extends js.Object
  
  trait _DeploymentType extends js.Object
  
  trait _EncodingType extends js.Object
  
  trait _FunctionIsolationMode extends js.Object
  
  trait _LoggerComponent extends js.Object
  
  trait _LoggerLevel extends js.Object
  
  trait _LoggerType extends js.Object
  
  trait _Permission extends js.Object
  
  trait _SoftwareToUpdate extends js.Object
  
  trait _UpdateAgentLogLevel extends js.Object
  
  trait _UpdateTargetsArchitecture extends js.Object
  
  trait _UpdateTargetsOperatingSystem extends js.Object
  
  trait __mapOf__string
    extends /* key */ org.scalablytyped.runtime.StringDictionary[__string]
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type BulkDeploymentResults = js.Array[BulkDeploymentResult]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Initializing
    - awsDashSdkLib.awsDashSdkLibStrings.Running
    - awsDashSdkLib.awsDashSdkLibStrings.Completed
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type BulkDeploymentStatus = _BulkDeploymentStatus | java.lang.String
  type BulkDeployments = js.Array[BulkDeployment]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NewDeployment
    - awsDashSdkLib.awsDashSdkLibStrings.Redeployment
    - awsDashSdkLib.awsDashSdkLibStrings.ResetDeployment
    - awsDashSdkLib.awsDashSdkLibStrings.ForceResetDeployment
    - java.lang.String
  */
  type DeploymentType = _DeploymentType | java.lang.String
  type Deployments = js.Array[Deployment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.binary
    - awsDashSdkLib.awsDashSdkLibStrings.json
    - java.lang.String
  */
  type EncodingType = _EncodingType | java.lang.String
  type ErrorDetails = js.Array[ErrorDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassContainer
    - awsDashSdkLib.awsDashSdkLibStrings.NoContainer
    - java.lang.String
  */
  type FunctionIsolationMode = _FunctionIsolationMode | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.GreengrassSystem
    - awsDashSdkLib.awsDashSdkLibStrings.Lambda
    - java.lang.String
  */
  type LoggerComponent = _LoggerComponent | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FATAL
    - java.lang.String
  */
  type LoggerLevel = _LoggerLevel | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.FileSystem
    - awsDashSdkLib.awsDashSdkLibStrings.AWSCloudWatch
    - java.lang.String
  */
  type LoggerType = _LoggerType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ro
    - awsDashSdkLib.awsDashSdkLibStrings.rw
    - java.lang.String
  */
  type Permission = _Permission | java.lang.String
  type S3UrlSignerRole = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.core
    - awsDashSdkLib.awsDashSdkLibStrings.ota_agent
    - java.lang.String
  */
  type SoftwareToUpdate = _SoftwareToUpdate | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NONE
    - awsDashSdkLib.awsDashSdkLibStrings.TRACE
    - awsDashSdkLib.awsDashSdkLibStrings.DEBUG
    - awsDashSdkLib.awsDashSdkLibStrings.VERBOSE
    - awsDashSdkLib.awsDashSdkLibStrings.INFO
    - awsDashSdkLib.awsDashSdkLibStrings.WARN
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.FATAL
    - java.lang.String
  */
  type UpdateAgentLogLevel = _UpdateAgentLogLevel | java.lang.String
  type UpdateTargets = js.Array[__string]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.armv7l
    - awsDashSdkLib.awsDashSdkLibStrings.x86_64
    - awsDashSdkLib.awsDashSdkLibStrings.aarch64
    - java.lang.String
  */
  type UpdateTargetsArchitecture = _UpdateTargetsArchitecture | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ubuntu
    - awsDashSdkLib.awsDashSdkLibStrings.raspbian
    - awsDashSdkLib.awsDashSdkLibStrings.amazon_linux
    - java.lang.String
  */
  type UpdateTargetsOperatingSystem = _UpdateTargetsOperatingSystem | java.lang.String
  type __boolean = scala.Boolean
  type __integer = scala.Double
  type __listOfConnectivityInfo = js.Array[ConnectivityInfo]
  type __listOfConnector = js.Array[Connector]
  type __listOfCore = js.Array[Core]
  type __listOfDefinitionInformation = js.Array[DefinitionInformation]
  type __listOfDevice = js.Array[Device]
  type __listOfFunction = js.Array[Function]
  type __listOfGroupCertificateAuthorityProperties = js.Array[GroupCertificateAuthorityProperties]
  type __listOfGroupInformation = js.Array[GroupInformation]
  type __listOfLogger = js.Array[Logger]
  type __listOfResource = js.Array[Resource]
  type __listOfResourceAccessPolicy = js.Array[ResourceAccessPolicy]
  type __listOfSubscription = js.Array[Subscription]
  type __listOfVersionInformation = js.Array[VersionInformation]
  type __listOf__string = js.Array[__string]
  type __string = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-06-07`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

