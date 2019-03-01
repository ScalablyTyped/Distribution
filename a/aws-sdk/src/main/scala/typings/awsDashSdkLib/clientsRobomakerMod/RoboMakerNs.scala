package typings
package awsDashSdkLib.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/robomaker", "RoboMaker")
@js.native
object RoboMakerNs extends js.Object {
  trait BatchDescribeSimulationJobRequest extends js.Object {
    /**
      * A list of Amazon Resource Names (ARNs) of simulation jobs to describe.
      */
    var jobs: Arns
  }
  
  trait BatchDescribeSimulationJobResponse extends js.Object {
    /**
      * A list of simulation jobs.
      */
    var jobs: js.UndefOr[SimulationJobs] = js.undefined
    /**
      * A list of unprocessed simulation job Amazon Resource Names (ARNs).
      */
    var unprocessedJobs: js.UndefOr[Arns] = js.undefined
  }
  
  trait CancelSimulationJobRequest extends js.Object {
    /**
      * The simulation job ARN to cancel.
      */
    var job: Arn
  }
  
  trait CancelSimulationJobResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateDeploymentJobRequest extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: ClientRequestToken
    /**
      * The deployment application configuration.
      */
    var deploymentApplicationConfigs: DeploymentApplicationConfigs
    /**
      * The requested deployment configuration.
      */
    var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet to deploy.
      */
    var fleet: Arn
    /**
      * A map that contains tag keys and tag values that are attached to the deployment job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateDeploymentJobResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deployment job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the fleet was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The deployment application configuration.
      */
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
    /**
      * The deployment configuration.
      */
    var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
    /**
      * The failure code of the simulation job if it failed:  BadPermissionError  AWS Greengrass requires a service-level role permission to access other services. The role must include the  AWSGreengrassResourceAccessRolePolicy managed policy.   ExtractingBundleFailure  The robot application could not be extracted from the bundle.  FailureThresholdBreached  The percentage of robots that could not be updated exceeded the percentage set for the deployment.  GreengrassDeploymentFailed  The robot application could not be deployed to the robot.  GreengrassGroupVersionDoesNotExist  The AWS Greengrass group or version associated with a robot is missing.  InternalServerError  An internal error has occurred. Retry your request, but if the problem persists, contact us with details.  MissingRobotApplicationArchitecture  The robot application does not have a source that matches the architecture of the robot.  MissingRobotDeploymentResource  One or more of the resources specified for the robot application are missing. For example, does the robot application have the correct launch package and launch file?  PostLaunchFileFailure  The post-launch script failed.  PreLaunchFileFailure  The pre-launch script failed.  ResourceNotFound  One or more deployment resources are missing. For example, do robot application source bundles still exist?   RobotDeploymentNoResponse  There is no response from the robot. It might not be powered on or connected to the internet.  
      */
    var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
    /**
      * The failure reason of the deployment job if it failed.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The target fleet for the deployment job.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * The status of the deployment job.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
    /**
      * The list of all tags added to the deployment job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateFleetRequest extends js.Object {
    /**
      * The name of the fleet.
      */
    var name: Name
    /**
      * A map that contains tag keys and tag values that are attached to the fleet.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateFleetResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the fleet was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The name of the fleet.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The list of all tags added to the fleet.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateRobotApplicationRequest extends js.Object {
    /**
      * The name of the robot application.
      */
    var name: Name
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: RobotSoftwareSuite
    /**
      * The sources of the robot application.
      */
    var sources: SourceConfigs
    /**
      * A map that contains tag keys and tag values that are attached to the robot application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateRobotApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the robot application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The revision id of the robot application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The sources of the robot application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The list of all tags added to the robot application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait CreateRobotApplicationVersionRequest extends js.Object {
    /**
      * The application information for the robot application.
      */
    var application: Arn
    /**
      * The current revision id for the robot application. If you provide a value and it matches the latest revision ID, a new version will be created.
      */
    var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  }
  
  trait CreateRobotApplicationVersionResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the robot application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The revision id of the robot application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The sources of the robot application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait CreateRobotRequest extends js.Object {
    /**
      * The target architecture of the robot.
      */
    var architecture: Architecture
    /**
      * The Greengrass group id.
      */
    var greengrassGroupId: Id
    /**
      * The name for the robot.
      */
    var name: Name
    /**
      * A map that contains tag keys and tag values that are attached to the robot.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateRobotResponse extends js.Object {
    /**
      * The target architecture of the robot.
      */
    var architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Greengrass group associated with the robot.
      */
    var greengrassGroupId: js.UndefOr[Id] = js.undefined
    /**
      * The name of the robot.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The list of all tags added to the robot.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateSimulationApplicationRequest extends js.Object {
    /**
      * The name of the simulation application.
      */
    var name: Name
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: RenderingEngine
    /**
      * The robot software suite of the simulation application.
      */
    var robotSoftwareSuite: RobotSoftwareSuite
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: SimulationSoftwareSuite
    /**
      * The sources of the simulation application.
      */
    var sources: SourceConfigs
    /**
      * A map that contains tag keys and tag values that are attached to the simulation application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait CreateSimulationApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
    /**
      * The revision id of the simulation application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * Information about the robot software suite.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
    /**
      * The sources of the simulation application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The list of all tags added to the simulation application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The version of the simulation application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait CreateSimulationApplicationVersionRequest extends js.Object {
    /**
      * The application information for the simulation application.
      */
    var application: Arn
    /**
      * The current revision id for the simulation application. If you provide a value and it matches the latest revision ID, a new version will be created.
      */
    var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
  }
  
  trait CreateSimulationApplicationVersionResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
    /**
      * The revision ID of the simulation application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * Information about the robot software suite.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
    /**
      * The sources of the simulation application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The version of the simulation application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait CreateSimulationJobRequest extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The failure behavior the simulation job.  Continue  Restart the simulation job in the same host instance.  Fail  Stop the simulation job and terminate the instance.  
      */
    var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
    /**
      * The IAM role name that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. 
      */
    var iamRole: IamRole
    /**
      * The maximum simulation job duration in seconds (up to 14 days or 1,209,600 seconds. When maxJobDurationInSeconds is reached, the simulation job will status will transition to Completed.
      */
    var maxJobDurationInSeconds: JobDuration
    /**
      * Location for output files generated by the simulation job.
      */
    var outputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * The robot application to use in the simulation job.
      */
    var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
    /**
      * The simulation application to use in the simulation job.
      */
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
    /**
      * A map that contains tag keys and tag values that are attached to the simulation job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * If your simulation job accesses resources in a VPC, you provide this parameter identifying the list of security group IDs and subnet IDs. These must belong to the same VPC. You must provide at least one security group and one subnet ID. 
      */
    var vpcConfig: js.UndefOr[VPCConfig] = js.undefined
  }
  
  trait CreateSimulationJobResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * the failure behavior for the simulation job.
      */
    var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
    /**
      * The failure code of the simulation job if it failed:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
      */
    var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
    /**
      * The IAM role that allows the simulation job to call the AWS APIs that are specified in its associated policies on your behalf.
      */
    var iamRole: js.UndefOr[IamRole] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less. 
      */
    var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
    /**
      * Simulation job output files location.
      */
    var outputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * The robot application used by the simulation job.
      */
    var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
    /**
      * The simulation application used by the simulation job.
      */
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
    /**
      * The simulation job execution duration in milliseconds.
      */
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
    /**
      * The status of the simulation job.
      */
    var status: js.UndefOr[SimulationJobStatus] = js.undefined
    /**
      * The list of all tags added to the simulation job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * Information about the vpc configuration.
      */
    var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
  }
  
  trait DeleteFleetRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: Arn
  }
  
  trait DeleteFleetResponse extends js.Object
  
  trait DeleteRobotApplicationRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the the robot application.
      */
    var application: Arn
    /**
      * The version of the robot application to delete.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
  }
  
  trait DeleteRobotApplicationResponse extends js.Object
  
  trait DeleteRobotRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var robot: Arn
  }
  
  trait DeleteRobotResponse extends js.Object
  
  trait DeleteSimulationApplicationRequest extends js.Object {
    /**
      * The application information for the simulation application to delete.
      */
    var application: Arn
    /**
      * The version of the simulation application to delete.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
  }
  
  trait DeleteSimulationApplicationResponse extends js.Object
  
  trait DeploymentApplicationConfig extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot application.
      */
    var application: Arn
    /**
      * The version of the application.
      */
    var applicationVersion: DeploymentVersion
    /**
      * The launch configuration.
      */
    var launchConfig: DeploymentLaunchConfig
  }
  
  trait DeploymentConfig extends js.Object {
    /**
      * The percentage of robots receiving the deployment at the same time.
      */
    var concurrentDeploymentPercentage: js.UndefOr[Percentage] = js.undefined
    /**
      * The percentage of deployments that need to fail before stopping deployment.
      */
    var failureThresholdPercentage: js.UndefOr[Percentage] = js.undefined
  }
  
  trait DeploymentJob extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deployment job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the deployment job was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The deployment application configuration.
      */
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
    /**
      * The deployment configuration.
      */
    var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
    /**
      * The deployment job failure code.
      */
    var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
    /**
      * A short description of the reason why the deployment job failed.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * The status of the deployment job.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
  }
  
  trait DeploymentLaunchConfig extends js.Object {
    /**
      * An array of key/value pairs specifying environment variables for the robot application
      */
    var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
    /**
      * The launch file name.
      */
    var launchFile: GenericString
    /**
      * The package name.
      */
    var packageName: GenericString
    /**
      * The deployment post-launch file. This file will be executed after the launch file.
      */
    var postLaunchFile: js.UndefOr[GenericString] = js.undefined
    /**
      * The deployment pre-launch file. This file will be executed prior to the launch file.
      */
    var preLaunchFile: js.UndefOr[GenericString] = js.undefined
  }
  
  trait DeregisterRobotRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: Arn
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var robot: Arn
  }
  
  trait DeregisterRobotResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var robot: js.UndefOr[Arn] = js.undefined
  }
  
  trait DescribeDeploymentJobRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deployment job.
      */
    var job: Arn
  }
  
  trait DescribeDeploymentJobResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the deployment job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the deployment job was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The deployment application configuration.
      */
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
    /**
      * The deployment configuration.
      */
    var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
    /**
      * The deployment job failure code.
      */
    var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
    /**
      * A short description of the reason why the deployment job failed.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * A list of robot deployment summaries.
      */
    var robotDeploymentSummary: js.UndefOr[RobotDeploymentSummary] = js.undefined
    /**
      * The status of the deployment job.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
    /**
      * The list of all tags added to the specified deployment job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait DescribeFleetRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: Arn
  }
  
  trait DescribeFleetResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the fleet was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the last deployment job.
      */
    var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
    /**
      * The status of the last deployment.
      */
    var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
      * The time of the last deployment.
      */
    var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The name of the fleet.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * A list of robots.
      */
    var robots: js.UndefOr[Robots] = js.undefined
    /**
      * The list of all tags added to the specified fleet.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait DescribeRobotApplicationRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot application.
      */
    var application: Arn
    /**
      * The version of the robot application to describe.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeRobotApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the robot application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The revision id of the robot application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The sources of the robot application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The list of all tags added to the specified robot application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeRobotRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot to be described.
      */
    var robot: Arn
  }
  
  trait DescribeRobotResponse extends js.Object {
    /**
      * The target architecture of the robot application.
      */
    var architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleetArn: js.UndefOr[Arn] = js.undefined
    /**
      * The Greengrass group id.
      */
    var greengrassGroupId: js.UndefOr[Id] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the last deployment job.
      */
    var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
    /**
      * The time of the last deployment job.
      */
    var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The name of the robot.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The status of the fleet.
      */
    var status: js.UndefOr[RobotStatus] = js.undefined
    /**
      * The list of all tags added to the specified robot.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait DescribeSimulationApplicationRequest extends js.Object {
    /**
      * The application information for the simulation application.
      */
    var application: Arn
    /**
      * The version of the simulation application to describe.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeSimulationApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot simulation application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
    /**
      * The revision id of the simulation application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * Information about the robot software suite.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
    /**
      * The sources of the simulation application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The list of all tags added to the specified simulation application.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The version of the simulation application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait DescribeSimulationJobRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job to be described.
      */
    var job: Arn
  }
  
  trait DescribeSimulationJobResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The failure behavior for the simulation job.
      */
    var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
    /**
      * The failure code of the simulation job if it failed:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
      */
    var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
    /**
      * Details about why the simulation job failed. For more information about troubleshooting, see Troubleshooting.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The IAM role that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf.
      */
    var iamRole: js.UndefOr[IamRole] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The maximum job duration in seconds. The value must be 8 days (691,200 seconds) or less.
      */
    var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
    /**
      * The name of the simulation job.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * Location for output files generated by the simulation job.
      */
    var outputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * A list of robot applications.
      */
    var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
    /**
      * A list of simulation applications.
      */
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
    /**
      * The simulation job execution duration in milliseconds.
      */
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
    /**
      * The status of the simulation job.
      */
    var status: js.UndefOr[SimulationJobStatus] = js.undefined
    /**
      * The list of all tags added to the specified simulation job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * The VPC configuration.
      */
    var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
  }
  
  trait EnvironmentVariableMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[EnvironmentVariableValue]
  
  trait Filter extends js.Object {
    /**
      * The name of the filter.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * A list of values.
      */
    var values: js.UndefOr[FilterValues] = js.undefined
  }
  
  trait Fleet extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the fleet was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the last deployment job.
      */
    var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
    /**
      * The status of the last fleet deployment.
      */
    var lastDeploymentStatus: js.UndefOr[DeploymentStatus] = js.undefined
    /**
      * The time of the last deployment.
      */
    var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The name of the fleet.
      */
    var name: js.UndefOr[Name] = js.undefined
  }
  
  trait LaunchConfig extends js.Object {
    /**
      * The environment variables for the application launch.
      */
    var environmentVariables: js.UndefOr[EnvironmentVariableMap] = js.undefined
    /**
      * The launch file name.
      */
    var launchFile: GenericString
    /**
      * The package name.
      */
    var packageName: GenericString
  }
  
  trait ListDeploymentJobsRequest extends js.Object {
    /**
      * Optional filters to limit results.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListDeploymentJobs in paginated output. When this parameter is used, ListDeploymentJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListDeploymentJobs request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListDeploymentJobs returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListDeploymentJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListDeploymentJobsResponse extends js.Object {
    /**
      * A list of deployment jobs that meet the criteria of the request.
      */
    var deploymentJobs: js.UndefOr[DeploymentJobs] = js.undefined
    /**
      * The nextToken value to include in a future ListDeploymentJobs request. When the results of a ListDeploymentJobs request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListFleetsRequest extends js.Object {
    /**
      * Optional filters to limit results.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListFleets in paginated output. When this parameter is used, ListFleets only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFleets request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListFleets returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListFleets request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListFleetsResponse extends js.Object {
    /**
      * A list of fleet details meeting the request criteria.
      */
    var fleetDetails: js.UndefOr[Fleets] = js.undefined
    /**
      * The nextToken value to include in a future ListDeploymentJobs request. When the results of a ListFleets request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListRobotApplicationsRequest extends js.Object {
    /**
      * Optional filters to limit results.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListRobotApplications in paginated output. When this parameter is used, ListRobotApplications only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFleets request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListRobotApplications returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListRobotApplications request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The version qualifier of the robot application.
      */
    var versionQualifier: js.UndefOr[VersionQualifier] = js.undefined
  }
  
  trait ListRobotApplicationsResponse extends js.Object {
    /**
      * The nextToken value to include in a future ListRobotApplications request. When the results of a ListRobotApplications request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * A list of robot application summaries that meet the criteria of the request.
      */
    var robotApplicationSummaries: js.UndefOr[RobotApplicationSummaries] = js.undefined
  }
  
  trait ListRobotsRequest extends js.Object {
    /**
      * Optional filters to limit results.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListRobots in paginated output. When this parameter is used, ListRobots only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFleets request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListRobots returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListRobots request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListRobotsResponse extends js.Object {
    /**
      * The nextToken value to include in a future ListRobots request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * A list of robots that meet the criteria of the request.
      */
    var robots: js.UndefOr[Robots] = js.undefined
  }
  
  trait ListSimulationApplicationsRequest extends js.Object {
    /**
      * Optional list of filters to limit results. The only valid filter name is name.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListSimulationApplications in paginated output. When this parameter is used, ListSimulationApplications only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFleets request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListSimulationApplications returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListSimulationApplications request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * The version qualifier of the simulation application.
      */
    var versionQualifier: js.UndefOr[VersionQualifier] = js.undefined
  }
  
  trait ListSimulationApplicationsResponse extends js.Object {
    /**
      * The nextToken value to include in a future ListSimulationApplications request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * A list of simulation application summaries that meet the criteria of the request.
      */
    var simulationApplicationSummaries: js.UndefOr[SimulationApplicationSummaries] = js.undefined
  }
  
  trait ListSimulationJobsRequest extends js.Object {
    /**
      * Optional filters to limit results.
      */
    var filters: js.UndefOr[Filters] = js.undefined
    /**
      * The maximum number of deployment job results returned by ListSimulationJobs in paginated output. When this parameter is used, ListSimulationJobs only returns maxResults results in a single page along with a nextToken response element. The remaining results of the initial request can be seen by sending another ListFleets request with the returned nextToken value. This value can be between 1 and 100. If this parameter is not used, then ListSimulationJobs returns up to 100 results and a nextToken value if applicable. 
      */
    var maxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The nextToken value returned from a previous paginated ListSimulationJobs request where maxResults was used and the results exceeded the value of that parameter. Pagination continues from the end of the previous results that returned the nextToken value.   This token should be treated as an opaque identifier that is only used to retrieve the next items in a list and not for other programmatic purposes. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
  }
  
  trait ListSimulationJobsResponse extends js.Object {
    /**
      * The nextToken value to include in a future ListSimulationJobs request. When the results of a ListRobot request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return. 
      */
    var nextToken: js.UndefOr[PaginationToken] = js.undefined
    /**
      * A list of simulation job summaries that meet the criteria of the request.
      */
    var simulationJobSummaries: SimulationJobSummaries
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The AWS RoboMaker Amazon Resource Name (ARN) with tags to be listed.
      */
    var resourceArn: Arn
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The list of all tags added to the specified resource.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
  }
  
  trait OutputLocation extends js.Object {
    /**
      * The S3 bucket for output.
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The S3 folder in the s3Bucket where output files will be placed.
      */
    var s3Prefix: js.UndefOr[S3Key] = js.undefined
  }
  
  trait ProgressDetail extends js.Object {
    /**
      * The current progress status.
      */
    var currentProgress: js.UndefOr[GenericString] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the deployment job.
      */
    var targetResource: js.UndefOr[GenericString] = js.undefined
  }
  
  trait RegisterRobotRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: Arn
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var robot: Arn
  }
  
  trait RegisterRobotResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the fleet that the robot will join.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * Information about the robot registration.
      */
    var robot: js.UndefOr[Arn] = js.undefined
  }
  
  trait RenderingEngine extends js.Object {
    /**
      * The name of the rendering engine.
      */
    var name: js.UndefOr[RenderingEngineType] = js.undefined
    /**
      * The version of the rendering engine.
      */
    var version: js.UndefOr[RenderingEngineVersionType] = js.undefined
  }
  
  trait RestartSimulationJobRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job.
      */
    var job: Arn
  }
  
  trait RestartSimulationJobResponse extends js.Object
  
  trait Robot extends js.Object {
    /**
      * The architecture of the robot.
      */
    var architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleetArn: js.UndefOr[Arn] = js.undefined
    /**
      * The Greengrass group associated with the robot.
      */
    var greenGrassGroupId: js.UndefOr[Id] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the last deployment job.
      */
    var lastDeploymentJob: js.UndefOr[Arn] = js.undefined
    /**
      * The time of the last deployment.
      */
    var lastDeploymentTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The name of the robot.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The status of the robot.
      */
    var status: js.UndefOr[RobotStatus] = js.undefined
  }
  
  trait RobotApplicationConfig extends js.Object {
    /**
      * The application information for the robot application.
      */
    var application: Arn
    /**
      * The version of the robot application.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
    /**
      * The launch configuration for the robot application.
      */
    var launchConfig: LaunchConfig
  }
  
  trait RobotApplicationSummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the robot.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the robot application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait RobotDeployment extends js.Object {
    /**
      * The robot deployment Amazon Resource Name (ARN).
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the deployment finished.
      */
    var deploymentFinishTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the deployment was started.
      */
    var deploymentStartTime: js.UndefOr[CreatedAt] = js.undefined
    /**
      * The robot deployment failure code.
      */
    var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
    /**
      * A short description of the reason why the robot deployment failed.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * Information about how the deployment is progressing.
      */
    var progressDetail: js.UndefOr[ProgressDetail] = js.undefined
    /**
      * The status of the robot deployment.
      */
    var status: js.UndefOr[RobotStatus] = js.undefined
  }
  
  trait RobotSoftwareSuite extends js.Object {
    /**
      * The name of the robot software suite.
      */
    var name: js.UndefOr[RobotSoftwareSuiteType] = js.undefined
    /**
      * The version of the robot software suite.
      */
    var version: js.UndefOr[RobotSoftwareSuiteVersionType] = js.undefined
  }
  
  trait SimulationApplicationConfig extends js.Object {
    /**
      * The application information for the simulation application.
      */
    var application: Arn
    /**
      * The version of the simulation application.
      */
    var applicationVersion: js.UndefOr[Version] = js.undefined
    /**
      * The launch configuration for the simulation application.
      */
    var launchConfig: LaunchConfig
  }
  
  trait SimulationApplicationSummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The version of the simulation application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait SimulationJob extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * A unique identifier for this SimulationJob request.
      */
    var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The failure behavior the simulation job.  Continue  Restart the simulation job in the same host instance.  Fail  Stop the simulation job and terminate the instance.  
      */
    var failureBehavior: js.UndefOr[FailureBehavior] = js.undefined
    /**
      * The failure code of the simulation job if it failed.
      */
    var failureCode: js.UndefOr[SimulationJobErrorCode] = js.undefined
    /**
      * The reason why the simulation job failed.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The IAM role that allows the simulation instance to call the AWS APIs that are specified in its associated policies on your behalf. This is how credentials are passed in to your simulation job. See how to specify AWS security credentials for your application. 
      */
    var iamRole: js.UndefOr[IamRole] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The maximum simulation job duration in seconds. The value must be 8 days (691,200 seconds) or less.
      */
    var maxJobDurationInSeconds: js.UndefOr[JobDuration] = js.undefined
    /**
      * The name of the simulation job.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * Location for output files generated by the simulation job.
      */
    var outputLocation: js.UndefOr[OutputLocation] = js.undefined
    /**
      * A list of robot applications.
      */
    var robotApplications: js.UndefOr[RobotApplicationConfigs] = js.undefined
    /**
      * A list of simulation applications.
      */
    var simulationApplications: js.UndefOr[SimulationApplicationConfigs] = js.undefined
    /**
      * The simulation job execution duration in milliseconds.
      */
    var simulationTimeMillis: js.UndefOr[SimulationTimeMillis] = js.undefined
    /**
      * Status of the simulation job.
      */
    var status: js.UndefOr[SimulationJobStatus] = js.undefined
    /**
      * A map that contains tag keys and tag values that are attached to the simulation job.
      */
    var tags: js.UndefOr[TagMap] = js.undefined
    /**
      * VPC configuration information.
      */
    var vpcConfig: js.UndefOr[VPCConfigResponse] = js.undefined
  }
  
  trait SimulationJobSummary extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the simulation job.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation job was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation job.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * A list of simulation job robot application names.
      */
    var robotApplicationNames: js.UndefOr[RobotApplicationNames] = js.undefined
    /**
      * A list of simulation job simulation application names.
      */
    var simulationApplicationNames: js.UndefOr[SimulationApplicationNames] = js.undefined
    /**
      * The status of the simulation job.
      */
    var status: js.UndefOr[SimulationJobStatus] = js.undefined
  }
  
  trait SimulationSoftwareSuite extends js.Object {
    /**
      * The name of the simulation software suite.
      */
    var name: js.UndefOr[SimulationSoftwareSuiteType] = js.undefined
    /**
      * The version of the simulation software suite.
      */
    var version: js.UndefOr[SimulationSoftwareSuiteVersionType] = js.undefined
  }
  
  trait Source extends js.Object {
    /**
      * The taget processor architecture for the application.
      */
    var architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * A hash of the object specified by s3Bucket and s3Key.
      */
    var etag: js.UndefOr[S3Etag] = js.undefined
    /**
      * The s3 bucket name.
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The s3 object key.
      */
    var s3Key: js.UndefOr[S3Key] = js.undefined
  }
  
  trait SourceConfig extends js.Object {
    /**
      * The target processor architecture for the application.
      */
    var architecture: js.UndefOr[Architecture] = js.undefined
    /**
      * The Amazon S3 bucket name.
      */
    var s3Bucket: js.UndefOr[S3Bucket] = js.undefined
    /**
      * The s3 object key.
      */
    var s3Key: js.UndefOr[S3Key] = js.undefined
  }
  
  trait SyncDeploymentJobRequest extends js.Object {
    /**
      * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
      */
    var clientRequestToken: ClientRequestToken
    /**
      * The target fleet for the synchronization.
      */
    var fleet: Arn
  }
  
  trait SyncDeploymentJobResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the synchronization request.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the fleet was created.
      */
    var createdAt: js.UndefOr[CreatedAt] = js.undefined
    /**
      * Information about the deployment application configurations.
      */
    var deploymentApplicationConfigs: js.UndefOr[DeploymentApplicationConfigs] = js.undefined
    /**
      * Information about the deployment configuration.
      */
    var deploymentConfig: js.UndefOr[DeploymentConfig] = js.undefined
    /**
      * The failure code if the job fails:  InternalServiceError  Internal service error.  RobotApplicationCrash  Robot application exited abnormally.  SimulationApplicationCrash   Simulation application exited abnormally.  BadPermissionsRobotApplication  Robot application bundle could not be downloaded.  BadPermissionsSimulationApplication  Simulation application bundle could not be downloaded.  BadPermissionsS3Output  Unable to publish outputs to customer-provided S3 bucket.  BadPermissionsCloudwatchLogs  Unable to publish logs to customer-provided CloudWatch Logs resource.  SubnetIpLimitExceeded  Subnet IP limit exceeded.  ENILimitExceeded  ENI limit exceeded.  BadPermissionsUserCredentials  Unable to use the Role provided.  InvalidBundleRobotApplication  Robot bundle cannot be extracted (invalid format, bundling error, or other issue).  InvalidBundleSimulationApplication  Simulation bundle cannot be extracted (invalid format, bundling error, or other issue).  RobotApplicationVersionMismatchedEtag  Etag for RobotApplication does not match value during version creation.  SimulationApplicationVersionMismatchedEtag  Etag for SimulationApplication does not match value during version creation.  
      */
    var failureCode: js.UndefOr[DeploymentJobErrorCode] = js.undefined
    /**
      * The failure reason if the job fails.
      */
    var failureReason: js.UndefOr[GenericString] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the fleet.
      */
    var fleet: js.UndefOr[Arn] = js.undefined
    /**
      * The status of the synchronization job.
      */
    var status: js.UndefOr[DeploymentStatus] = js.undefined
  }
  
  trait TagMap
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValue]
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the AWS RoboMaker resource you are tagging.
      */
    var resourceArn: Arn
    /**
      * A map that contains tag keys and tag values that are attached to the resource.
      */
    var tags: TagMap
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Describes one or more simulation jobs.
      */
    def batchDescribeSimulationJob(): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDescribeSimulationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDescribeSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes one or more simulation jobs.
      */
    def batchDescribeSimulationJob(params: BatchDescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchDescribeSimulationJob(
      params: BatchDescribeSimulationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDescribeSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the specified simulation job.
      */
    def cancelSimulationJob(): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelSimulationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Cancels the specified simulation job.
      */
    def cancelSimulationJob(params: CancelSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def cancelSimulationJob(
      params: CancelSimulationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CancelSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CancelSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version. 
      */
    def createDeploymentJob(): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deploys a specific version of a robot application to robots in a fleet. The robot application must have a numbered applicationVersion for consistency reasons. To create a new version, use CreateRobotApplicationVersion or see Creating a Robot Application Version. 
      */
    def createDeploymentJob(params: CreateDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createDeploymentJob(
      params: CreateDeploymentJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a fleet, a logical group of robots running the same robot application.
      */
    def createFleet(): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a fleet, a logical group of robots running the same robot application.
      */
    def createFleet(params: CreateFleetRequest): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createFleet(
      params: CreateFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a robot.
      */
    def createRobot(): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a robot.
      */
    def createRobot(params: CreateRobotRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobot(
      params: CreateRobotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a robot application. 
      */
    def createRobotApplication(): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobotApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a robot application. 
      */
    def createRobotApplication(params: CreateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobotApplication(
      params: CreateRobotApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a version of a robot application.
      */
    def createRobotApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobotApplicationVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a version of a robot application.
      */
    def createRobotApplicationVersion(params: CreateRobotApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRobotApplicationVersion(
      params: CreateRobotApplicationVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRobotApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRobotApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation application.
      */
    def createSimulationApplication(): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation application.
      */
    def createSimulationApplication(params: CreateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationApplication(
      params: CreateSimulationApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation application with a specific revision id.
      */
    def createSimulationApplicationVersion(): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationApplicationVersion(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation application with a specific revision id.
      */
    def createSimulationApplicationVersion(params: CreateSimulationApplicationVersionRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationApplicationVersion(
      params: CreateSimulationApplicationVersionRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationApplicationVersionResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationApplicationVersionResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation job.
      */
    def createSimulationJob(): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a simulation job.
      */
    def createSimulationJob(params: CreateSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSimulationJob(
      params: CreateSimulationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a fleet.
      */
    def deleteFleet(): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a fleet.
      */
    def deleteFleet(params: DeleteFleetRequest): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteFleet(
      params: DeleteFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a robot.
      */
    def deleteRobot(): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRobot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a robot.
      */
    def deleteRobot(params: DeleteRobotRequest): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRobot(
      params: DeleteRobotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a robot application.
      */
    def deleteRobotApplication(): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRobotApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a robot application.
      */
    def deleteRobotApplication(params: DeleteRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRobotApplication(
      params: DeleteRobotApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a simulation application.
      */
    def deleteSimulationApplication(): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSimulationApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a simulation application.
      */
    def deleteSimulationApplication(params: DeleteSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSimulationApplication(
      params: DeleteSimulationApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a robot.
      */
    def deregisterRobot(): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterRobot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deregisters a robot.
      */
    def deregisterRobot(params: DeregisterRobotRequest): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deregisterRobot(
      params: DeregisterRobotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeregisterRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeregisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
      */
    def describeDeploymentJob(): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDeploymentJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a deployment job. [Does it work regardless of deployment status, e.g. Failed?]
      */
    def describeDeploymentJob(params: DescribeDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeDeploymentJob(
      params: DescribeDeploymentJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a fleet.
      */
    def describeFleet(): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleet(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a fleet.
      */
    def describeFleet(params: DescribeFleetRequest): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeFleet(
      params: DescribeFleetRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeFleetResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeFleetResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a robot.
      */
    def describeRobot(): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRobot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a robot.
      */
    def describeRobot(params: DescribeRobotRequest): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRobot(
      params: DescribeRobotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a robot application.
      */
    def describeRobotApplication(): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRobotApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a robot application.
      */
    def describeRobotApplication(params: DescribeRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeRobotApplication(
      params: DescribeRobotApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a simulation application.
      */
    def describeSimulationApplication(): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSimulationApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a simulation application.
      */
    def describeSimulationApplication(params: DescribeSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSimulationApplication(
      params: DescribeSimulationApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a simulation job.
      */
    def describeSimulationJob(): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSimulationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Describes a simulation job.
      */
    def describeSimulationJob(params: DescribeSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def describeSimulationJob(
      params: DescribeSimulationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.
      */
    def listDeploymentJobs(): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of deployment jobs for a fleet. You can optionally provide filters to retrieve specific deployment jobs.
      */
    def listDeploymentJobs(params: ListDeploymentJobsRequest): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeploymentJobs(
      params: ListDeploymentJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeploymentJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeploymentJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
      */
    def listFleets(): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFleets(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFleetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of fleets. You can optionally provide filters to retrieve specific fleets.
      */
    def listFleets(params: ListFleetsRequest): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listFleets(
      params: ListFleetsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListFleetsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListFleetsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
      */
    def listRobotApplications(): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRobotApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRobotApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of robot application. You can optionally provide filters to retrieve specific robot applications.
      */
    def listRobotApplications(params: ListRobotApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRobotApplications(
      params: ListRobotApplicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRobotApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRobotApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
      */
    def listRobots(): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRobots(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRobotsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of robots. You can optionally provide filters to retrieve specific robots.
      */
    def listRobots(params: ListRobotsRequest): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listRobots(
      params: ListRobotsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListRobotsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListRobotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications.
      */
    def listSimulationApplications(): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSimulationApplications(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSimulationApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of simulation applications. You can optionally provide filters to retrieve specific simulation applications.
      */
    def listSimulationApplications(params: ListSimulationApplicationsRequest): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSimulationApplications(
      params: ListSimulationApplicationsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSimulationApplicationsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSimulationApplicationsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
      */
    def listSimulationJobs(): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSimulationJobs(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSimulationJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Returns a list of simulation jobs. You can optionally provide filters to retrieve specific simulation jobs.
      */
    def listSimulationJobs(params: ListSimulationJobsRequest): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSimulationJobs(
      params: ListSimulationJobsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSimulationJobsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSimulationJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags on a AWS RoboMaker resource.
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
      * Lists all tags on a AWS RoboMaker resource.
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
      * Registers a robot with a fleet.
      */
    def registerRobot(): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerRobot(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers a robot with a fleet.
      */
    def registerRobot(params: RegisterRobotRequest): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerRobot(
      params: RegisterRobotRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterRobotResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterRobotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restarts a running simulation job.
      */
    def restartSimulationJob(): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restartSimulationJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestartSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Restarts a running simulation job.
      */
    def restartSimulationJob(params: RestartSimulationJobRequest): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def restartSimulationJob(
      params: RestartSimulationJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RestartSimulationJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RestartSimulationJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
      */
    def syncDeploymentJob(): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def syncDeploymentJob(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SyncDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Syncrhonizes robots in a fleet to the latest deployment. This is helpful if robots were added after a deployment.
      */
    def syncDeploymentJob(params: SyncDeploymentJobRequest): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def syncDeploymentJob(
      params: SyncDeploymentJobRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SyncDeploymentJobResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SyncDeploymentJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds or edits tags for a AWS RoboMaker resource. Each tag consists of a tag key and a tag value. Tag keys and tag values are both required, but tag values can be empty strings.  For information about the rules that apply to tag keys and tag values, see User-Defined Tag Restrictions in the AWS Billing and Cost Management User Guide. 
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes the specified tags from the specified AWS RoboMaker resource. To remove a tag, specify the tag key. To change the tag value of an existing tag key, use  TagResource . 
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a robot application.
      */
    def updateRobotApplication(): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRobotApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a robot application.
      */
    def updateRobotApplication(params: UpdateRobotApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRobotApplication(
      params: UpdateRobotApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRobotApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRobotApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a simulation application.
      */
    def updateSimulationApplication(): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSimulationApplication(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates a simulation application.
      */
    def updateSimulationApplication(params: UpdateSimulationApplicationRequest): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSimulationApplication(
      params: UpdateSimulationApplicationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSimulationApplicationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSimulationApplicationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the AWS RoboMaker resource you are removing tags.
      */
    var resourceArn: Arn
    /**
      * A map that contains tag keys and tag values that will be unattached from the resource.
      */
    var tagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateRobotApplicationRequest extends js.Object {
    /**
      * The application information for the robot application.
      */
    var application: Arn
    /**
      * The revision id for the robot application.
      */
    var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: RobotSoftwareSuite
    /**
      * The sources of the robot application.
      */
    var sources: SourceConfigs
  }
  
  trait UpdateRobotApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the updated robot application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the robot application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the robot application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The revision id of the robot application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The robot software suite used by the robot application.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The sources of the robot application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait UpdateSimulationApplicationRequest extends js.Object {
    /**
      * The application information for the simulation application.
      */
    var application: Arn
    /**
      * The revision id for the robot application.
      */
    var currentRevisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: RenderingEngine
    /**
      * Information about the robot software suite.
      */
    var robotSoftwareSuite: RobotSoftwareSuite
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: SimulationSoftwareSuite
    /**
      * The sources of the simulation application.
      */
    var sources: SourceConfigs
  }
  
  trait UpdateSimulationApplicationResponse extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the updated simulation application.
      */
    var arn: js.UndefOr[Arn] = js.undefined
    /**
      * The time, in milliseconds since the epoch, when the simulation application was last updated.
      */
    var lastUpdatedAt: js.UndefOr[LastUpdatedAt] = js.undefined
    /**
      * The name of the simulation application.
      */
    var name: js.UndefOr[Name] = js.undefined
    /**
      * The rendering engine for the simulation application.
      */
    var renderingEngine: js.UndefOr[RenderingEngine] = js.undefined
    /**
      * The revision id of the simulation application.
      */
    var revisionId: js.UndefOr[RevisionId] = js.undefined
    /**
      * Information about the robot software suite.
      */
    var robotSoftwareSuite: js.UndefOr[RobotSoftwareSuite] = js.undefined
    /**
      * The simulation software suite used by the simulation application.
      */
    var simulationSoftwareSuite: js.UndefOr[SimulationSoftwareSuite] = js.undefined
    /**
      * The sources of the simulation application.
      */
    var sources: js.UndefOr[Sources] = js.undefined
    /**
      * The version of the robot application.
      */
    var version: js.UndefOr[Version] = js.undefined
  }
  
  trait VPCConfig extends js.Object {
    /**
      * A boolean indicating whether to assign a public IP address.
      */
    var assignPublicIp: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of one or more security groups IDs in your VPC.
      */
    var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
      * A list of one or more subnet IDs in your VPC.
      */
    var subnets: Subnets
  }
  
  trait VPCConfigResponse extends js.Object {
    /**
      * A boolean indicating if a public IP was assigned.
      */
    var assignPublicIp: js.UndefOr[Boolean] = js.undefined
    /**
      * A list of security group IDs associated with the simulation job.
      */
    var securityGroups: js.UndefOr[SecurityGroups] = js.undefined
    /**
      * A list of subnet IDs associated with the simulation job.
      */
    var subnets: js.UndefOr[Subnets] = js.undefined
    /**
      * The VPC ID associated with your simulation job.
      */
    var vpcId: js.UndefOr[GenericString] = js.undefined
  }
  
  trait _Architecture extends js.Object
  
  trait _DeploymentJobErrorCode extends js.Object
  
  trait _DeploymentStatus extends js.Object
  
  trait _FailureBehavior extends js.Object
  
  trait _RobotStatus extends js.Object
  
  trait _SimulationJobErrorCode extends js.Object
  
  trait _SimulationJobStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Architecture = _Architecture | java.lang.String
  type Arn = java.lang.String
  type Arns = js.Array[Arn]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CreatedAt = stdLib.Date
  type DeploymentApplicationConfigs = js.Array[DeploymentApplicationConfig]
  type DeploymentJobErrorCode = _DeploymentJobErrorCode | java.lang.String
  type DeploymentJobs = js.Array[DeploymentJob]
  type DeploymentStatus = _DeploymentStatus | java.lang.String
  type DeploymentVersion = java.lang.String
  type EnvironmentVariableKey = java.lang.String
  type EnvironmentVariableValue = java.lang.String
  type FailureBehavior = _FailureBehavior | java.lang.String
  type FilterValues = js.Array[Name]
  type Filters = js.Array[Filter]
  type Fleets = js.Array[Fleet]
  type GenericString = java.lang.String
  type IamRole = java.lang.String
  type Id = java.lang.String
  type JobDuration = scala.Double
  type LastUpdatedAt = stdLib.Date
  type MaxResults = scala.Double
  type Name = java.lang.String
  type PaginationToken = java.lang.String
  type Percentage = scala.Double
  type RenderingEngineType = awsDashSdkLib.awsDashSdkLibStrings.OGRE | java.lang.String
  type RenderingEngineVersionType = java.lang.String
  type RevisionId = java.lang.String
  type RobotApplicationConfigs = js.Array[RobotApplicationConfig]
  type RobotApplicationNames = js.Array[Name]
  type RobotApplicationSummaries = js.Array[RobotApplicationSummary]
  type RobotDeploymentSummary = js.Array[RobotDeployment]
  type RobotSoftwareSuiteType = awsDashSdkLib.awsDashSdkLibStrings.ROS | java.lang.String
  type RobotSoftwareSuiteVersionType = awsDashSdkLib.awsDashSdkLibStrings.Kinetic | java.lang.String
  type RobotStatus = _RobotStatus | java.lang.String
  type Robots = js.Array[Robot]
  type S3Bucket = java.lang.String
  type S3Etag = java.lang.String
  type S3Key = java.lang.String
  type SecurityGroups = js.Array[GenericString]
  type SimulationApplicationConfigs = js.Array[SimulationApplicationConfig]
  type SimulationApplicationNames = js.Array[Name]
  type SimulationApplicationSummaries = js.Array[SimulationApplicationSummary]
  type SimulationJobErrorCode = _SimulationJobErrorCode | java.lang.String
  type SimulationJobStatus = _SimulationJobStatus | java.lang.String
  type SimulationJobSummaries = js.Array[SimulationJobSummary]
  type SimulationJobs = js.Array[SimulationJob]
  type SimulationSoftwareSuiteType = awsDashSdkLib.awsDashSdkLibStrings.Gazebo | java.lang.String
  type SimulationSoftwareSuiteVersionType = java.lang.String
  type SimulationTimeMillis = scala.Double
  type SourceConfigs = js.Array[SourceConfig]
  type Sources = js.Array[Source]
  type Subnets = js.Array[GenericString]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagValue = java.lang.String
  type Version = java.lang.String
  type VersionQualifier = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
}

