package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/codebuild", "CodeBuild")
@js.native
object CodeBuildNs extends js.Object {
  
  trait BatchDeleteBuildsInput extends js.Object {
    /**
         * The IDs of the builds to delete.
         */
    var ids: BuildIds
  }
  
  
  trait BatchDeleteBuildsOutput extends js.Object {
    /**
         * The IDs of the builds that were successfully deleted.
         */
    var buildsDeleted: js.UndefOr[BuildIds] = js.undefined
    /**
         * Information about any builds that could not be successfully deleted.
         */
    var buildsNotDeleted: js.UndefOr[BuildsNotDeleted] = js.undefined
  }
  
  
  trait BatchGetBuildsInput extends js.Object {
    /**
         * The IDs of the builds.
         */
    var ids: BuildIds
  }
  
  
  trait BatchGetBuildsOutput extends js.Object {
    /**
         * Information about the requested builds.
         */
    var builds: js.UndefOr[Builds] = js.undefined
    /**
         * The IDs of builds for which information could not be found.
         */
    var buildsNotFound: js.UndefOr[BuildIds] = js.undefined
  }
  
  
  trait BatchGetProjectsInput extends js.Object {
    /**
         * The names of the build projects.
         */
    var names: ProjectNames
  }
  
  
  trait BatchGetProjectsOutput extends js.Object {
    /**
         * Information about the requested build projects.
         */
    var projects: js.UndefOr[Projects] = js.undefined
    /**
         * The names of build projects for which information could not be found.
         */
    var projectsNotFound: js.UndefOr[ProjectNames] = js.undefined
  }
  
  
  trait Build extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the build.
         */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information about the output artifacts for the build.
         */
    var artifacts: js.UndefOr[BuildArtifacts] = js.undefined
    /**
         * Whether the build is complete. True if complete; otherwise, false.
         */
    var buildComplete: js.UndefOr[Boolean] = js.undefined
    /**
         * The current status of the build. Valid values include:    FAILED: The build failed.    FAULT: The build faulted.    IN_PROGRESS: The build is still in progress.    STOPPED: The build stopped.    SUCCEEDED: The build succeeded.    TIMED_OUT: The build timed out.  
         */
    var buildStatus: js.UndefOr[StatusType] = js.undefined
    /**
         * Information about the cache for the build.
         */
    var cache: js.UndefOr[ProjectCache] = js.undefined
    /**
         * The current build phase.
         */
    var currentPhase: js.UndefOr[String] = js.undefined
    /**
         * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts. This is expressed either as the Amazon Resource Name (ARN) of the CMK or, if specified, the CMK's alias (using the format alias/alias-name ).
         */
    var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * When the build process ended, expressed in Unix time format.
         */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * Information about the build environment for this build.
         */
    var environment: js.UndefOr[ProjectEnvironment] = js.undefined
    /**
         * The unique ID for the build.
         */
    var id: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The entity that started the build. Valid values include:   If AWS CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an AWS Identity and Access Management (IAM) user started the build, the user's name (for example, MyUserName).   If the Jenkins plugin for AWS CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
         */
    var initiator: js.UndefOr[String] = js.undefined
    /**
         * Information about the build's logs in Amazon CloudWatch Logs.
         */
    var logs: js.UndefOr[LogsLocation] = js.undefined
    /**
         * Describes a network interface.
         */
    var networkInterface: js.UndefOr[NetworkInterface] = js.undefined
    /**
         * Information about all previous build phases that are complete and information about any current build phase that is not yet complete.
         */
    var phases: js.UndefOr[BuildPhases] = js.undefined
    /**
         * The name of the AWS CodeBuild project.
         */
    var projectName: js.UndefOr[NonEmptyString] = js.undefined
    /**
         *  The number of minutes a build is allowed to be queued before it times out. 
         */
    var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
    /**
         *  An identifier for the version of this build's source code.     For AWS CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.     For AWS CodePipeline, the source revision provided by AWS CodePipeline.     For Amazon Simple Storage Service (Amazon S3), this does not apply.   
         */
    var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined
    /**
         *  An array of ProjectArtifacts objects. 
         */
    var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined
    /**
         *  An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
         */
    var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondarySources: js.UndefOr[ProjectSources] = js.undefined
    /**
         * The name of a service role used for this build.
         */
    var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information about the source code to be built.
         */
    var source: js.UndefOr[ProjectSource] = js.undefined
    /**
         * Any version identifier for the version of the source code to be built.
         */
    var sourceVersion: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * When the build process started, expressed in Unix time format.
         */
    var startTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * How long, in minutes, for AWS CodeBuild to wait before timing out this build if it does not get marked as completed.
         */
    var timeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
    /**
         * If your AWS CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same VPC. You must provide at least one security group and one subnet ID.
         */
    var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait BuildArtifacts extends js.Object {
    /**
         *  An identifier for this artifact definition. 
         */
    var artifactIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  Information that tells you if encryption for build artifacts is disabled. 
         */
    var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * Information about the location of the build artifacts.
         */
    var location: js.UndefOr[String] = js.undefined
    /**
         * The MD5 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
         */
    var md5sum: js.UndefOr[String] = js.undefined
    /**
         *  If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
         */
    var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * The SHA-256 hash of the build artifact. You can use this hash along with a checksum tool to confirm file integrity and authenticity.  This value is available only if the build project's packaging value is set to ZIP. 
         */
    var sha256sum: js.UndefOr[String] = js.undefined
  }
  
  
  trait BuildNotDeleted extends js.Object {
    /**
         * The ID of the build that could not be successfully deleted.
         */
    var id: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Additional information about the build that could not be successfully deleted.
         */
    var statusCode: js.UndefOr[String] = js.undefined
  }
  
  
  trait BuildPhase extends js.Object {
    /**
         * Additional information about a build phase, especially to help troubleshoot a failed build.
         */
    var contexts: js.UndefOr[PhaseContexts] = js.undefined
    /**
         * How long, in seconds, between the starting and ending times of the build's phase.
         */
    var durationInSeconds: js.UndefOr[WrapperLong] = js.undefined
    /**
         * When the build phase ended, expressed in Unix time format.
         */
    var endTime: js.UndefOr[Timestamp] = js.undefined
    /**
         * The current status of the build phase. Valid values include:    FAILED: The build phase failed.    FAULT: The build phase faulted.    IN_PROGRESS: The build phase is still in progress.    QUEUED: The build has been submitted and is queued behind other submitted builds.    STOPPED: The build phase stopped.    SUCCEEDED: The build phase succeeded.    TIMED_OUT: The build phase timed out.  
         */
    var phaseStatus: js.UndefOr[StatusType] = js.undefined
    /**
         * The name of the build phase. Valid values include:    BUILD: Core build activities typically occur in this build phase.    COMPLETED: The build has been completed.    DOWNLOAD_SOURCE: Source code is being downloaded in this build phase.    FINALIZING: The build process is completing in this build phase.    INSTALL: Installation activities typically occur in this build phase.    POST_BUILD: Post-build activities typically occur in this build phase.    PRE_BUILD: Pre-build activities typically occur in this build phase.    PROVISIONING: The build environment is being set up.    QUEUED: The build has been submitted and is queued behind other submitted builds.    SUBMITTED: The build has been submitted.    UPLOAD_ARTIFACTS: Build output artifacts are being uploaded to the output location.  
         */
    var phaseType: js.UndefOr[BuildPhaseType] = js.undefined
    /**
         * When the build phase started, expressed in Unix time format.
         */
    var startTime: js.UndefOr[Timestamp] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait CloudWatchLogsConfig extends js.Object {
    /**
         *  The group name of the logs in Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
         */
    var groupName: js.UndefOr[String] = js.undefined
    /**
         * The current status of the logs in Amazon CloudWatch Logs for a build project. Valid values are:    ENABLED: Amazon CloudWatch Logs are enabled for this build project.    DISABLED: Amazon CloudWatch Logs are not enabled for this build project.  
         */
    var status: LogsConfigStatusType
    /**
         *  The prefix of the stream name of the Amazon CloudWatch Logs. For more information, see Working with Log Groups and Log Streams. 
         */
    var streamName: js.UndefOr[String] = js.undefined
  }
  
  
  trait CreateProjectInput extends js.Object {
    /**
         * Information about the build output artifacts for the build project.
         */
    var artifacts: ProjectArtifacts
    /**
         * Set this to true to generate a publicly accessible URL for your project's build badge.
         */
    var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * Stores recently used information so that it can be quickly accessed at a later time.
         */
    var cache: js.UndefOr[ProjectCache] = js.undefined
    /**
         * A description that makes the build project easy to identify.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts. You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
         */
    var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information about the build environment for the build project.
         */
    var environment: ProjectEnvironment
    /**
         *  Information about logs for the build project. These can be logs in Amazon CloudWatch Logs, logs uploaded to a specified S3 bucket, or both. 
         */
    var logsConfig: js.UndefOr[LogsConfig] = js.undefined
    /**
         * The name of the build project.
         */
    var name: ProjectName
    /**
         *  The number of minutes a build is allowed to be queued before it times out. 
         */
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         *  An array of ProjectArtifacts objects. 
         */
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondarySources: js.UndefOr[ProjectSources] = js.undefined
    /**
         * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
         */
    var serviceRole: NonEmptyString
    /**
         * Information about the build input source code for the build project.
         */
    var source: ProjectSource
    /**
         * A set of tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
         */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
         * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before it times out any build that has not been marked as completed. The default is 60 minutes.
         */
    var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
         */
    var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait CreateProjectOutput extends js.Object {
    /**
         * Information about the build project that was created.
         */
    var project: js.UndefOr[Project] = js.undefined
  }
  
  
  trait CreateWebhookInput extends js.Object {
    /**
         * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.
         */
    var branchFilter: js.UndefOr[String] = js.undefined
    /**
         * The name of the AWS CodeBuild project.
         */
    var projectName: ProjectName
  }
  
  
  trait CreateWebhookOutput extends js.Object {
    /**
         * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
         */
    var webhook: js.UndefOr[Webhook] = js.undefined
  }
  
  
  trait DeleteProjectInput extends js.Object {
    /**
         * The name of the build project.
         */
    var name: NonEmptyString
  }
  
  
  trait DeleteProjectOutput extends js.Object
  
  
  trait DeleteSourceCredentialsInput extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) of the token.
         */
    var arn: NonEmptyString
  }
  
  
  trait DeleteSourceCredentialsOutput extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) of the token. 
         */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait DeleteWebhookInput extends js.Object {
    /**
         * The name of the AWS CodeBuild project.
         */
    var projectName: ProjectName
  }
  
  
  trait DeleteWebhookOutput extends js.Object
  
  
  trait EnvironmentImage extends js.Object {
    /**
         * The description of the Docker image.
         */
    var description: js.UndefOr[String] = js.undefined
    /**
         * The name of the Docker image.
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * A list of environment image versions.
         */
    var versions: js.UndefOr[ImageVersions] = js.undefined
  }
  
  
  trait EnvironmentLanguage extends js.Object {
    /**
         * The list of Docker images that are related by the specified programming language.
         */
    var images: js.UndefOr[EnvironmentImages] = js.undefined
    /**
         * The programming language for the Docker images.
         */
    var language: js.UndefOr[LanguageType] = js.undefined
  }
  
  
  trait EnvironmentPlatform extends js.Object {
    /**
         * The list of programming languages that are available for the specified platform.
         */
    var languages: js.UndefOr[EnvironmentLanguages] = js.undefined
    /**
         * The platform's name.
         */
    var platform: js.UndefOr[PlatformType] = js.undefined
  }
  
  
  trait EnvironmentVariable extends js.Object {
    /**
         * The name or key of the environment variable.
         */
    var name: NonEmptyString
    /**
         * The type of environment variable. Valid values include:    PARAMETER_STORE: An environment variable stored in Amazon EC2 Systems Manager Parameter Store.    PLAINTEXT: An environment variable in plaintext format.  
         */
    var `type`: js.UndefOr[EnvironmentVariableType] = js.undefined
    /**
         * The value of the environment variable.  We strongly discourage the use of environment variables to store sensitive values, especially AWS secret key IDs and secret access keys. Environment variables can be displayed in plain text using the AWS CodeBuild console and the AWS Command Line Interface (AWS CLI). 
         */
    var value: String
  }
  
  
  trait ImportSourceCredentialsInput extends js.Object {
    /**
         *  The type of authentication used to connect to a GitHub, GitHub Enterprise, or Bitbucket repository. An OAUTH connection is not supported by the API and must be created using the AWS CodeBuild console. 
         */
    var authType: AuthType
    /**
         *  The source provider used for this project. 
         */
    var serverType: ServerType
    /**
         *  For GitHub or GitHub Enterprise, this is the personal access token. For Bitbucket, this is the app password. 
         */
    var token: SensitiveNonEmptyString
    /**
         *  The Bitbucket username when the authType is BASIC_AUTH. This parameter is not valid for other types of source providers or connections. 
         */
    var username: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait ImportSourceCredentialsOutput extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) of the token. 
         */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait InvalidateProjectCacheInput extends js.Object {
    /**
         * The name of the AWS CodeBuild build project that the cache is reset for.
         */
    var projectName: NonEmptyString
  }
  
  
  trait InvalidateProjectCacheOutput extends js.Object
  
  
  trait ListBuildsForProjectInput extends js.Object {
    /**
         * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The name of the AWS CodeBuild project.
         */
    var projectName: NonEmptyString
    /**
         * The order to list build IDs. Valid values include:    ASCENDING: List the build IDs in ascending order by build ID.    DESCENDING: List the build IDs in descending order by build ID.  
         */
    var sortOrder: js.UndefOr[SortOrderType] = js.undefined
  }
  
  
  trait ListBuildsForProjectOutput extends js.Object {
    /**
         * A list of build IDs for the specified build project, with each build ID representing a single build.
         */
    var ids: js.UndefOr[BuildIds] = js.undefined
    /**
         * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListBuildsInput extends js.Object {
    /**
         * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The order to list build IDs. Valid values include:    ASCENDING: List the build IDs in ascending order by build ID.    DESCENDING: List the build IDs in descending order by build ID.  
         */
    var sortOrder: js.UndefOr[SortOrderType] = js.undefined
  }
  
  
  trait ListBuildsOutput extends js.Object {
    /**
         * A list of build IDs, with each build ID representing a single build.
         */
    var ids: js.UndefOr[BuildIds] = js.undefined
    /**
         * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
         */
    var nextToken: js.UndefOr[String] = js.undefined
  }
  
  
  trait ListCuratedEnvironmentImagesInput extends js.Object
  
  
  trait ListCuratedEnvironmentImagesOutput extends js.Object {
    /**
         * Information about supported platforms for Docker images that are managed by AWS CodeBuild.
         */
    var platforms: js.UndefOr[EnvironmentPlatforms] = js.undefined
  }
  
  
  trait ListProjectsInput extends js.Object {
    /**
         * During a previous call, if there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call. To get all of the items in the list, keep calling this operation with each subsequent next token that is returned, until no more next tokens are returned.
         */
    var nextToken: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The criterion to be used to list build project names. Valid values include:    CREATED_TIME: List based on when each build project was created.    LAST_MODIFIED_TIME: List based on when information about each build project was last changed.    NAME: List based on each build project's name.   Use sortOrder to specify in what order to list the build project names based on the preceding criteria.
         */
    var sortBy: js.UndefOr[ProjectSortByType] = js.undefined
    /**
         * The order in which to list build projects. Valid values include:    ASCENDING: List in ascending order.    DESCENDING: List in descending order.   Use sortBy to specify the criterion to be used to list build project names.
         */
    var sortOrder: js.UndefOr[SortOrderType] = js.undefined
  }
  
  
  trait ListProjectsOutput extends js.Object {
    /**
         * If there are more than 100 items in the list, only the first 100 items are returned, along with a unique string called a next token. To get the next batch of items in the list, call this operation again, adding the next token to the call.
         */
    var nextToken: js.UndefOr[String] = js.undefined
    /**
         * The list of build project names, with each build project name representing a single build project.
         */
    var projects: js.UndefOr[ProjectNames] = js.undefined
  }
  
  
  trait ListSourceCredentialsInput extends js.Object
  
  
  trait ListSourceCredentialsOutput extends js.Object {
    /**
         *  A list of SourceCredentialsInfo objects. Each SourceCredentialsInfo object includes the authentication type, token ARN, and type of source provider for one set of credentials. 
         */
    var sourceCredentialsInfos: js.UndefOr[SourceCredentialsInfos] = js.undefined
  }
  
  
  trait LogsConfig extends js.Object {
    /**
         *  Information about Amazon CloudWatch Logs for a build project. Amazon CloudWatch Logs are enabled by default. 
         */
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined
    /**
         *  Information about logs built to an S3 bucket for a build project. S3 logs are not enabled by default. 
         */
    var s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
  }
  
  
  trait LogsLocation extends js.Object {
    /**
         *  Information about Amazon CloudWatch Logs for a build project. 
         */
    var cloudWatchLogs: js.UndefOr[CloudWatchLogsConfig] = js.undefined
    /**
         * The URL to an individual build log in Amazon CloudWatch Logs.
         */
    var deepLink: js.UndefOr[String] = js.undefined
    /**
         * The name of the Amazon CloudWatch Logs group for the build logs.
         */
    var groupName: js.UndefOr[String] = js.undefined
    /**
         *  The URL to a build log in an S3 bucket. 
         */
    var s3DeepLink: js.UndefOr[String] = js.undefined
    /**
         *  Information about S3 logs for a build project. 
         */
    var s3Logs: js.UndefOr[S3LogsConfig] = js.undefined
    /**
         * The name of the Amazon CloudWatch Logs stream for the build logs.
         */
    var streamName: js.UndefOr[String] = js.undefined
  }
  
  
  trait NetworkInterface extends js.Object {
    /**
         * The ID of the network interface.
         */
    var networkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The ID of the subnet.
         */
    var subnetId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait PhaseContext extends js.Object {
    /**
         * An explanation of the build phase's context. This might include a command ID and an exit code.
         */
    var message: js.UndefOr[String] = js.undefined
    /**
         * The status code for the context of the build phase.
         */
    var statusCode: js.UndefOr[String] = js.undefined
  }
  
  
  trait Project extends js.Object {
    /**
         * The Amazon Resource Name (ARN) of the build project.
         */
    var arn: js.UndefOr[String] = js.undefined
    /**
         * Information about the build output artifacts for the build project.
         */
    var artifacts: js.UndefOr[ProjectArtifacts] = js.undefined
    /**
         * Information about the build badge for the build project.
         */
    var badge: js.UndefOr[ProjectBadge] = js.undefined
    /**
         * Information about the cache for the build project.
         */
    var cache: js.UndefOr[ProjectCache] = js.undefined
    /**
         * When the build project was created, expressed in Unix time format.
         */
    var created: js.UndefOr[Timestamp] = js.undefined
    /**
         * A description that makes the build project easy to identify.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * The AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts. This is expressed either as the Amazon Resource Name (ARN) of the CMK or, if specified, the CMK's alias (using the format alias/alias-name ).
         */
    var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information about the build environment for this build project.
         */
    var environment: js.UndefOr[ProjectEnvironment] = js.undefined
    /**
         * When the build project's settings were last modified, expressed in Unix time format.
         */
    var lastModified: js.UndefOr[Timestamp] = js.undefined
    /**
         *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, an S3 bucket, or both. 
         */
    var logsConfig: js.UndefOr[LogsConfig] = js.undefined
    /**
         * The name of the build project.
         */
    var name: js.UndefOr[ProjectName] = js.undefined
    /**
         *  The number of minutes a build is allowed to be queued before it times out. 
         */
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         *  An array of ProjectArtifacts objects. 
         */
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondarySources: js.UndefOr[ProjectSources] = js.undefined
    /**
         * The ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
         */
    var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information about the build input source code for this build project.
         */
    var source: js.UndefOr[ProjectSource] = js.undefined
    /**
         * The tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
         */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
         * How long, in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed. The default is 60 minutes.
         */
    var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         * Information about the VPC configuration that AWS CodeBuild accesses.
         */
    var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
    /**
         * Information about a webhook that connects repository events to a build project in AWS CodeBuild.
         */
    var webhook: js.UndefOr[Webhook] = js.undefined
  }
  
  
  trait ProjectArtifacts extends js.Object {
    /**
         *  An identifier for this artifact definition. 
         */
    var artifactIdentifier: js.UndefOr[String] = js.undefined
    /**
         *  Set to true if you do not want your output artifacts encrypted. This option is valid only if your artifacts type is Amazon Simple Storage Service (Amazon S3). If this is set with another artifacts type, an invalidInputException is thrown. 
         */
    var encryptionDisabled: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * Information about the build output artifact location:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output locations instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output bucket.  
         */
    var location: js.UndefOr[String] = js.undefined
    /**
         * Along with path and namespaceType, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the name of the output artifact object. If you set the name to be a forward slash ("/"), the artifact is stored in the root of the output bucket.   For example:    If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, then the output artifact is stored in MyArtifacts/build-ID/MyArtifact.zip.     If path is empty, namespaceType is set to NONE, and name is set to "/", the output artifact is stored in the root of the output bucket.     If path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to "/", the output artifact is stored in MyArtifacts/build-ID .   
         */
    var name: js.UndefOr[String] = js.undefined
    /**
         * Along with path and name, the pattern that AWS CodeBuild uses to determine the name and location to store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    BUILD_ID: Include the build ID in the location of the build output artifact.    NONE: Do not include the build ID. This is the default if namespaceType is not specified.     For example, if path is set to MyArtifacts, namespaceType is set to BUILD_ID, and name is set to MyArtifact.zip, the output artifact is stored in MyArtifacts/build-ID/MyArtifact.zip.
         */
    var namespaceType: js.UndefOr[ArtifactNamespace] = js.undefined
    /**
         *  If this flag is set, a name specified in the build spec file overrides the artifact name. The name specified in a build spec file is calculated at build time and uses the Shell Command Language. For example, you can append a date and time to your artifact name so that it is always unique. 
         */
    var overrideArtifactName: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * The type of build output artifact to create:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output artifacts instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, valid values include:    NONE: AWS CodeBuild creates in the output bucket a folder that contains the build output. This is the default if packaging is not specified.    ZIP: AWS CodeBuild creates in the output bucket a ZIP file that contains the build output.    
         */
    var packaging: js.UndefOr[ArtifactPackaging] = js.undefined
    /**
         * Along with namespaceType and name, the pattern that AWS CodeBuild uses to name and store the output artifact:   If type is set to CODEPIPELINE, AWS CodePipeline ignores this value if specified. This is because AWS CodePipeline manages its build output names instead of AWS CodeBuild.   If type is set to NO_ARTIFACTS, this value is ignored if specified, because no build output is produced.   If type is set to S3, this is the path to the output artifact. If path is not specified, path is not used.   For example, if path is set to MyArtifacts, namespaceType is set to NONE, and name is set to MyArtifact.zip, the output artifact is stored in the output bucket at MyArtifacts/MyArtifact.zip.
         */
    var path: js.UndefOr[String] = js.undefined
    /**
         * The type of build output artifact. Valid values include:    CODEPIPELINE: The build project has build output generated through AWS CodePipeline.    NO_ARTIFACTS: The build project does not produce any build output.    S3: The build project stores build output in Amazon Simple Storage Service (Amazon S3).  
         */
    var `type`: ArtifactsType
  }
  
  
  trait ProjectBadge extends js.Object {
    /**
         * Set this to true to generate a publicly accessible URL for your project's build badge.
         */
    var badgeEnabled: js.UndefOr[Boolean] = js.undefined
    /**
         * The publicly-accessible URL through which you can access the build badge for your project.  The publicly accessible URL through which you can access the build badge for your project. 
         */
    var badgeRequestUrl: js.UndefOr[String] = js.undefined
  }
  
  
  trait ProjectCache extends js.Object {
    /**
         * Information about the cache location:     NO_CACHE: This value is ignored.    S3: This is the S3 bucket name/prefix.  
         */
    var location: js.UndefOr[String] = js.undefined
    /**
         * The type of cache used by the build project. Valid values include:    NO_CACHE: The build project does not use any cache.    S3: The build project reads and writes from and to S3.  
         */
    var `type`: CacheType
  }
  
  
  trait ProjectEnvironment extends js.Object {
    /**
         * The certificate to use with this build project.
         */
    var certificate: js.UndefOr[String] = js.undefined
    /**
         * Information about the compute resources the build project uses. Available values include:    BUILD_GENERAL1_SMALL: Use up to 3 GB memory and 2 vCPUs for builds.    BUILD_GENERAL1_MEDIUM: Use up to 7 GB memory and 4 vCPUs for builds.    BUILD_GENERAL1_LARGE: Use up to 15 GB memory and 8 vCPUs for builds.  
         */
    var computeType: ComputeType
    /**
         * A set of environment variables to make available to builds for this build project.
         */
    var environmentVariables: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         * The ID of the Docker image to use for this build project.
         */
    var image: NonEmptyString
    /**
         * Enables running the Docker daemon inside a Docker container. Set to true only if the build project is be used to build Docker images, and the specified build environment image is not provided by AWS CodeBuild with Docker support. Otherwise, all associated builds that attempt to interact with the Docker daemon fail. You must also start the Docker daemon so that builds can interact with it. One way to do this is to initialize the Docker daemon during the install phase of your build spec by running the following build commands. (Do not run these commands if the specified build environment image is provided by AWS CodeBuild with Docker support.) If the operating system's base image is Ubuntu Linux:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 sh -c "until docker info; do echo .; sleep 1; done"  If the operating system's base image is Alpine Linux, add the -t argument to timeout:  - nohup /usr/local/bin/dockerd --host=unix:///var/run/docker.sock --host=tcp://0.0.0.0:2375 --storage-driver=overlay&amp; - timeout 15 -t sh -c "until docker info; do echo .; sleep 1; done" 
         */
    var privilegedMode: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * The type of build environment to use for related builds.
         */
    var `type`: EnvironmentType
  }
  
  
  trait ProjectSource extends js.Object {
    /**
         * Information about the authorization settings for AWS CodeBuild to access the source code to be built. This information is for the AWS CodeBuild console's use only. Your code should not get or set this information directly.
         */
    var auth: js.UndefOr[SourceAuth] = js.undefined
    /**
         * The build spec declaration to use for the builds in this build project. If this value is not specified, a build spec must be included along with the source code to be built.
         */
    var buildspec: js.UndefOr[String] = js.undefined
    /**
         * Information about the git clone depth for the build project.
         */
    var gitCloneDepth: js.UndefOr[GitCloneDepth] = js.undefined
    /**
         * Enable this flag to ignore SSL warnings while connecting to the project source code.
         */
    var insecureSsl: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * Information about the location of the source code to be built. Valid values include:   For source code settings that are specified in the source action of a pipeline in AWS CodePipeline, location should not be specified. If it is specified, AWS CodePipeline ignores it. This is because AWS CodePipeline uses the settings in a pipeline's source action instead of this value.   For source code in an AWS CodeCommit repository, the HTTPS clone URL to the repository that contains the source code and the build spec (for example, https://git-codecommit.region-ID.amazonaws.com/v1/repos/repo-name ).   For source code in an Amazon Simple Storage Service (Amazon S3) input bucket, one of the following.     The path to the ZIP file that contains the source code (for example,  bucket-name/path/to/object-name.zip).     The path to the folder that contains the source code (for example,  bucket-name/path/to/source-code/folder/).      For source code in a GitHub repository, the HTTPS clone URL to the repository that contains the source and the build spec. You must connect your AWS account to your GitHub account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with GitHub, on the GitHub Authorize application page, for Organization access, choose Request access next to each repository you want to allow AWS CodeBuild to have access to, and then choose Authorize application. (After you have connected to your GitHub account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.   For source code in a Bitbucket repository, the HTTPS clone URL to the repository that contains the source and the build spec. You must connect your AWS account to your Bitbucket account. Use the AWS CodeBuild console to start creating a build project. When you use the console to connect (or reconnect) with Bitbucket, on the Bitbucket Confirm access to your account page, choose Grant access. (After you have connected to your Bitbucket account, you do not need to finish creating the build project. You can leave the AWS CodeBuild console.) To instruct AWS CodeBuild to use this connection, in the source object, set the auth object's type value to OAUTH.  
         */
    var location: js.UndefOr[String] = js.undefined
    /**
         *  Set to true to report the status of a build's start and finish to your source provider. This option is valid only when your source provider is GitHub, GitHub Enterprise, or Bitbucket. If this is set and you use a different source provider, an invalidInputException is thrown. 
         */
    var reportBuildStatus: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         *  An identifier for this project source. 
         */
    var sourceIdentifier: js.UndefOr[String] = js.undefined
    /**
         * The type of repository that contains the source code to be built. Valid values include:    BITBUCKET: The source code is in a Bitbucket repository.    CODECOMMIT: The source code is in an AWS CodeCommit repository.    CODEPIPELINE: The source code settings are specified in the source action of a pipeline in AWS CodePipeline.    GITHUB: The source code is in a GitHub repository.    NO_SOURCE: The project does not have input source code.    S3: The source code is in an Amazon Simple Storage Service (Amazon S3) input bucket.  
         */
    var `type`: SourceType
  }
  
  
  trait ProjectSourceVersion extends js.Object {
    /**
         * An identifier for a source in the build project.
         */
    var sourceIdentifier: String
    /**
         * The source version for the corresponding source identifier. If specified, must be one of:   For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
         */
    var sourceVersion: String
  }
  
  
  trait S3LogsConfig extends js.Object {
    /**
         *  The ARN of an S3 bucket and the path prefix for S3 logs. If your Amazon S3 bucket name is my-bucket, and your path prefix is build-log, then acceptable formats are my-bucket/build-log or arn:aws:s3:::my-bucket/build-log. 
         */
    var location: js.UndefOr[String] = js.undefined
    /**
         * The current status of the S3 build logs. Valid values are:    ENABLED: S3 build logs are enabled for this build project.    DISABLED: S3 build logs are not enabled for this build project.  
         */
    var status: LogsConfigStatusType
  }
  
  
  trait SourceAuth extends js.Object {
    /**
         * The resource value that applies to the specified authorization type.
         */
    var resource: js.UndefOr[String] = js.undefined
    /**
         *   This data type is deprecated and is no longer accurate or used.   The authorization type to use. The only valid value is OAUTH, which represents the OAuth authorization type.
         */
    var `type`: SourceAuthType
  }
  
  
  trait SourceCredentialsInfo extends js.Object {
    /**
         *  The Amazon Resource Name (ARN) of the token. 
         */
    var arn: js.UndefOr[NonEmptyString] = js.undefined
    /**
         *  The type of authentication used by the credentials. Valid options are OAUTH, BASIC_AUTH, or PERSONAL_ACCESS_TOKEN. 
         */
    var authType: js.UndefOr[AuthType] = js.undefined
    /**
         *  The type of source provider. The valid options are GITHUB, GITHUB_ENTERPRISE, or BITBUCKET. 
         */
    var serverType: js.UndefOr[ServerType] = js.undefined
  }
  
  
  trait StartBuildInput extends js.Object {
    /**
         * Build output artifact settings that override, for this build only, the latest ones already defined in the build project.
         */
    var artifactsOverride: js.UndefOr[ProjectArtifacts] = js.undefined
    /**
         * A build spec declaration that overrides, for this build only, the latest one already defined in the build project.
         */
    var buildspecOverride: js.UndefOr[String] = js.undefined
    /**
         * A ProjectCache object specified for this build that overrides the one defined in the build project.
         */
    var cacheOverride: js.UndefOr[ProjectCache] = js.undefined
    /**
         * The name of a certificate for this build that overrides the one specified in the build project.
         */
    var certificateOverride: js.UndefOr[String] = js.undefined
    /**
         * The name of a compute type for this build that overrides the one specified in the build project.
         */
    var computeTypeOverride: js.UndefOr[ComputeType] = js.undefined
    /**
         * A container type for this build that overrides the one specified in the build project.
         */
    var environmentTypeOverride: js.UndefOr[EnvironmentType] = js.undefined
    /**
         * A set of environment variables that overrides, for this build only, the latest ones already defined in the build project.
         */
    var environmentVariablesOverride: js.UndefOr[EnvironmentVariables] = js.undefined
    /**
         * The user-defined depth of history, with a minimum value of 0, that overrides, for this build only, any previous depth of history defined in the build project.
         */
    var gitCloneDepthOverride: js.UndefOr[GitCloneDepth] = js.undefined
    /**
         * A unique, case sensitive identifier you provide to ensure the idempotency of the StartBuild request. The token is included in the StartBuild request and is valid for 12 hours. If you repeat the StartBuild request with the same token, but change a parameter, AWS CodeBuild returns a parameter mismatch error. 
         */
    var idempotencyToken: js.UndefOr[String] = js.undefined
    /**
         * The name of an image for this build that overrides the one specified in the build project.
         */
    var imageOverride: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Enable this flag to override the insecure SSL setting that is specified in the build project. The insecure SSL setting determines whether to ignore SSL warnings while connecting to the project source code. This override applies only if the build's source is GitHub Enterprise.
         */
    var insecureSslOverride: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         *  Log settings for this build that override the log settings defined in the build project. 
         */
    var logsConfigOverride: js.UndefOr[LogsConfig] = js.undefined
    /**
         * Enable this flag to override privileged mode in the build project.
         */
    var privilegedModeOverride: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * The name of the AWS CodeBuild build project to start running a build.
         */
    var projectName: NonEmptyString
    /**
         *  The number of minutes a build is allowed to be queued before it times out. 
         */
    var queuedTimeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
    /**
         *  Set to true to report to your source provider the status of a build's start and completion. If you use this option with a source provider other than GitHub, GitHub Enterprise, or Bitbucket, an invalidInputException is thrown. 
         */
    var reportBuildStatusOverride: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         *  An array of ProjectArtifacts objects. 
         */
    var secondaryArtifactsOverride: js.UndefOr[ProjectArtifactsList] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondarySourcesOverride: js.UndefOr[ProjectSources] = js.undefined
    /**
         *  An array of ProjectSourceVersion objects that specify one or more versions of the project's secondary sources to be used for this build only. 
         */
    var secondarySourcesVersionOverride: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
    /**
         * The name of a service role for this build that overrides the one specified in the build project.
         */
    var serviceRoleOverride: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * An authorization type for this build that overrides the one defined in the build project. This override applies only if the build project's source is BitBucket or GitHub.
         */
    var sourceAuthOverride: js.UndefOr[SourceAuth] = js.undefined
    /**
         * A location that overrides, for this build, the source location for the one defined in the build project.
         */
    var sourceLocationOverride: js.UndefOr[String] = js.undefined
    /**
         * A source input type, for this build, that overrides the source input defined in the build project.
         */
    var sourceTypeOverride: js.UndefOr[SourceType] = js.undefined
    /**
         * A version of the build input to be built, for this build only. If not specified, the latest version is used. If specified, must be one of:   For AWS CodeCommit: the commit ID to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon Simple Storage Service (Amazon S3): the version ID of the object that represents the build input ZIP file to use.  
         */
    var sourceVersion: js.UndefOr[String] = js.undefined
    /**
         * The number of build timeout minutes, from 5 to 480 (8 hours), that overrides, for this build only, the latest setting already defined in the build project.
         */
    var timeoutInMinutesOverride: js.UndefOr[TimeOut] = js.undefined
  }
  
  
  trait StartBuildOutput extends js.Object {
    /**
         * Information about the build to be run.
         */
    var build: js.UndefOr[Build] = js.undefined
  }
  
  
  trait StopBuildInput extends js.Object {
    /**
         * The ID of the build.
         */
    var id: NonEmptyString
  }
  
  
  trait StopBuildOutput extends js.Object {
    /**
         * Information about the build.
         */
    var build: js.UndefOr[Build] = js.undefined
  }
  
  
  trait Tag extends js.Object {
    /**
         * The tag's key.
         */
    var key: js.UndefOr[KeyInput] = js.undefined
    /**
         * The tag's value.
         */
    var value: js.UndefOr[ValueInput] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Deletes one or more builds.
       */
    def batchDeleteBuilds(): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more builds.
       */
    def batchDeleteBuilds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more builds.
       */
    def batchDeleteBuilds(params: BatchDeleteBuildsInput): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes one or more builds.
       */
    def batchDeleteBuilds(
      params: BatchDeleteBuildsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchDeleteBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchDeleteBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about builds.
       */
    def batchGetBuilds(): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about builds.
       */
    def batchGetBuilds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about builds.
       */
    def batchGetBuilds(params: BatchGetBuildsInput): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about builds.
       */
    def batchGetBuilds(
      params: BatchGetBuildsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about build projects.
       */
    def batchGetProjects(): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about build projects.
       */
    def batchGetProjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetProjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about build projects.
       */
    def batchGetProjects(params: BatchGetProjectsInput): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about build projects.
       */
    def batchGetProjects(
      params: BatchGetProjectsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchGetProjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchGetProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a build project.
       */
    def createProject(): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a build project.
       */
    def createProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a build project.
       */
    def createProject(params: CreateProjectInput): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a build project.
       */
    def createProject(
      params: CreateProjectInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
       */
    def createWebhook(): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
       */
    def createWebhook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
       */
    def createWebhook(params: CreateWebhookInput): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, enables AWS CodeBuild to start rebuilding the source code every time a code change is pushed to the repository.  If you enable webhooks for an AWS CodeBuild project, and the project is used as a build step in AWS CodePipeline, then two identical builds are created for each commit. One build is triggered through webhooks, and one through AWS CodePipeline. Because billing is on a per-build basis, you are billed for both builds. Therefore, if you are using AWS CodePipeline, we recommend that you disable webhooks in AWS CodeBuild. In the AWS CodeBuild console, clear the Webhook box. For more information, see step 5 in Change a Build Project's Settings. 
       */
    def createWebhook(
      params: CreateWebhookInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a build project.
       */
    def deleteProject(): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a build project.
       */
    def deleteProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a build project.
       */
    def deleteProject(params: DeleteProjectInput): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a build project.
       */
    def deleteProject(
      params: DeleteProjectInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
       */
    def deleteSourceCredentials(): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
       */
    def deleteSourceCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
       */
    def deleteSourceCredentials(params: DeleteSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Deletes a set of GitHub, GitHub Enterprise, or Bitbucket source credentials. 
       */
    def deleteSourceCredentials(
      params: DeleteSourceCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
       */
    def deleteWebhook(): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
       */
    def deleteWebhook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
       */
    def deleteWebhook(params: DeleteWebhookInput): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * For an existing AWS CodeBuild build project that has its source code stored in a GitHub or Bitbucket repository, stops AWS CodeBuild from rebuilding the source code every time a code change is pushed to the repository.
       */
    def deleteWebhook(
      params: DeleteWebhookInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
       */
    def importSourceCredentials(): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
       */
    def importSourceCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
       */
    def importSourceCredentials(params: ImportSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Imports the source repository credentials for an AWS CodeBuild project that has its source code stored in a GitHub, GitHub Enterprise, or Bitbucket repository. 
       */
    def importSourceCredentials(
      params: ImportSourceCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ImportSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ImportSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets the cache for a project.
       */
    def invalidateProjectCache(): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets the cache for a project.
       */
    def invalidateProjectCache(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvalidateProjectCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets the cache for a project.
       */
    def invalidateProjectCache(params: InvalidateProjectCacheInput): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Resets the cache for a project.
       */
    def invalidateProjectCache(
      params: InvalidateProjectCacheInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ InvalidateProjectCacheOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[InvalidateProjectCacheOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs, with each build ID representing a single build.
       */
    def listBuilds(): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs, with each build ID representing a single build.
       */
    def listBuilds(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs, with each build ID representing a single build.
       */
    def listBuilds(params: ListBuildsInput): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs, with each build ID representing a single build.
       */
    def listBuilds(
      params: ListBuildsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
       */
    def listBuildsForProject(): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
       */
    def listBuildsForProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsForProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
       */
    def listBuildsForProject(params: ListBuildsForProjectInput): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build IDs for the specified build project, with each build ID representing a single build.
       */
    def listBuildsForProject(
      params: ListBuildsForProjectInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBuildsForProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBuildsForProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about Docker images that are managed by AWS CodeBuild.
       */
    def listCuratedEnvironmentImages(): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about Docker images that are managed by AWS CodeBuild.
       */
    def listCuratedEnvironmentImages(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCuratedEnvironmentImagesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about Docker images that are managed by AWS CodeBuild.
       */
    def listCuratedEnvironmentImages(params: ListCuratedEnvironmentImagesInput): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets information about Docker images that are managed by AWS CodeBuild.
       */
    def listCuratedEnvironmentImages(
      params: ListCuratedEnvironmentImagesInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListCuratedEnvironmentImagesOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListCuratedEnvironmentImagesOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build project names, with each build project name representing a single build project.
       */
    def listProjects(): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build project names, with each build project name representing a single build project.
       */
    def listProjects(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build project names, with each build project name representing a single build project.
       */
    def listProjects(params: ListProjectsInput): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets a list of build project names, with each build project name representing a single build project.
       */
    def listProjects(
      params: ListProjectsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListProjectsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListProjectsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of SourceCredentialsInfo objects. 
       */
    def listSourceCredentials(): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of SourceCredentialsInfo objects. 
       */
    def listSourceCredentials(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of SourceCredentialsInfo objects. 
       */
    def listSourceCredentials(params: ListSourceCredentialsInput): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Returns a list of SourceCredentialsInfo objects. 
       */
    def listSourceCredentials(
      params: ListSourceCredentialsInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSourceCredentialsOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSourceCredentialsOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts running a build.
       */
    def startBuild(): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts running a build.
       */
    def startBuild(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts running a build.
       */
    def startBuild(params: StartBuildInput): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Starts running a build.
       */
    def startBuild(
      params: StartBuildInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartBuildOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attempts to stop running a build.
       */
    def stopBuild(): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attempts to stop running a build.
       */
    def stopBuild(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopBuildOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attempts to stop running a build.
       */
    def stopBuild(params: StopBuildInput): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Attempts to stop running a build.
       */
    def stopBuild(
      params: StopBuildInput,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ StopBuildOutput, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[StopBuildOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of a build project.
       */
    def updateProject(): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of a build project.
       */
    def updateProject(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of a build project.
       */
    def updateProject(params: UpdateProjectInput): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Changes the settings of a build project.
       */
    def updateProject(
      params: UpdateProjectInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProjectOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProjectOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
       */
    def updateWebhook(): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
       */
    def updateWebhook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
       */
    def updateWebhook(params: UpdateWebhookInput): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       *  Updates the webhook associated with an AWS CodeBuild build project.    If you use Bitbucket for your repository, rotateSecret is ignored.  
       */
    def updateWebhook(
      params: UpdateWebhookInput,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateWebhookOutput, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateWebhookOutput, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  
  trait UpdateProjectInput extends js.Object {
    /**
         * Information to be changed about the build output artifacts for the build project.
         */
    var artifacts: js.UndefOr[ProjectArtifacts] = js.undefined
    /**
         * Set this to true to generate a publicly accessible URL for your project's build badge.
         */
    var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
    /**
         * Stores recently used information so that it can be quickly accessed at a later time.
         */
    var cache: js.UndefOr[ProjectCache] = js.undefined
    /**
         * A new or replacement description of the build project.
         */
    var description: js.UndefOr[ProjectDescription] = js.undefined
    /**
         * The replacement AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build output artifacts. You can specify either the Amazon Resource Name (ARN)of the CMK or, if available, the CMK's alias (using the format alias/alias-name ).
         */
    var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information to be changed about the build environment for the build project.
         */
    var environment: js.UndefOr[ProjectEnvironment] = js.undefined
    /**
         *  Information about logs for the build project. A project can create logs in Amazon CloudWatch Logs, logs in an S3 bucket, or both. 
         */
    var logsConfig: js.UndefOr[LogsConfig] = js.undefined
    /**
         * The name of the build project.  You cannot change a build project's name. 
         */
    var name: NonEmptyString
    /**
         *  The number of minutes a build is allowed to be queued before it times out. 
         */
    var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
    /**
         *  An array of ProjectSource objects. 
         */
    var secondarySources: js.UndefOr[ProjectSources] = js.undefined
    /**
         * The replacement ARN of the AWS Identity and Access Management (IAM) role that enables AWS CodeBuild to interact with dependent AWS services on behalf of the AWS account.
         */
    var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Information to be changed about the build input source code for the build project.
         */
    var source: js.UndefOr[ProjectSource] = js.undefined
    /**
         * The replacement set of tags for this build project. These tags are available for use by AWS services that support AWS CodeBuild build project tags.
         */
    var tags: js.UndefOr[TagList] = js.undefined
    /**
         * The replacement value in minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait before timing out any related build that did not get marked as completed.
         */
    var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
    /**
         * VpcConfig enables AWS CodeBuild to access resources in an Amazon VPC.
         */
    var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
  }
  
  
  trait UpdateProjectOutput extends js.Object {
    /**
         * Information about the build project that was changed.
         */
    var project: js.UndefOr[Project] = js.undefined
  }
  
  
  trait UpdateWebhookInput extends js.Object {
    /**
         * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.
         */
    var branchFilter: js.UndefOr[String] = js.undefined
    /**
         * The name of the AWS CodeBuild project.
         */
    var projectName: ProjectName
    /**
         *  A boolean value that specifies whether the associated GitHub repository's secret token should be updated. If you use Bitbucket for your repository, rotateSecret is ignored. 
         */
    var rotateSecret: js.UndefOr[Boolean] = js.undefined
  }
  
  
  trait UpdateWebhookOutput extends js.Object {
    /**
         *  Information about a repository's webhook that is associated with a project in AWS CodeBuild. 
         */
    var webhook: js.UndefOr[Webhook] = js.undefined
  }
  
  
  trait VpcConfig extends js.Object {
    /**
         * A list of one or more security groups IDs in your Amazon VPC.
         */
    var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
    /**
         * A list of one or more subnet IDs in your Amazon VPC.
         */
    var subnets: js.UndefOr[Subnets] = js.undefined
    /**
         * The ID of the Amazon VPC.
         */
    var vpcId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  
  trait Webhook extends js.Object {
    /**
         * A regular expression used to determine which repository branches are built when a webhook is triggered. If the name of a branch matches the regular expression, then it is built. If branchFilter is empty, then all branches are built.
         */
    var branchFilter: js.UndefOr[String] = js.undefined
    /**
         *  A timestamp that indicates the last time a repository's secret token was modified. 
         */
    var lastModifiedSecret: js.UndefOr[Timestamp] = js.undefined
    /**
         *  The AWS CodeBuild endpoint where webhook events are sent.
         */
    var payloadUrl: js.UndefOr[NonEmptyString] = js.undefined
    /**
         *  The secret token of the associated repository.    A Bitbucket webhook does not support secret.  
         */
    var secret: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The URL to the webhook.
         */
    var url: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type ArtifactNamespace = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.BUILD_ID | java.lang.String
  type ArtifactPackaging = awsDashSdkLib.awsDashSdkLibStrings.NONE | awsDashSdkLib.awsDashSdkLibStrings.ZIP | java.lang.String
  type ArtifactsType = awsDashSdkLib.awsDashSdkLibStrings.CODEPIPELINE | awsDashSdkLib.awsDashSdkLibStrings.S3 | awsDashSdkLib.awsDashSdkLibStrings.NO_ARTIFACTS | java.lang.String
  type AuthType = awsDashSdkLib.awsDashSdkLibStrings.OAUTH | awsDashSdkLib.awsDashSdkLibStrings.BASIC_AUTH | awsDashSdkLib.awsDashSdkLibStrings.PERSONAL_ACCESS_TOKEN | java.lang.String
  type Boolean = scala.Boolean
  type BuildArtifactsList = js.Array[BuildArtifacts]
  type BuildIds = js.Array[NonEmptyString]
  type BuildPhaseType = awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED | awsDashSdkLib.awsDashSdkLibStrings.QUEUED | awsDashSdkLib.awsDashSdkLibStrings.PROVISIONING | awsDashSdkLib.awsDashSdkLibStrings.DOWNLOAD_SOURCE | awsDashSdkLib.awsDashSdkLibStrings.INSTALL | awsDashSdkLib.awsDashSdkLibStrings.PRE_BUILD | awsDashSdkLib.awsDashSdkLibStrings.BUILD | awsDashSdkLib.awsDashSdkLibStrings.POST_BUILD | awsDashSdkLib.awsDashSdkLibStrings.UPLOAD_ARTIFACTS | awsDashSdkLib.awsDashSdkLibStrings.FINALIZING | awsDashSdkLib.awsDashSdkLibStrings.COMPLETED | java.lang.String
  type BuildPhases = js.Array[BuildPhase]
  type Builds = js.Array[Build]
  type BuildsNotDeleted = js.Array[BuildNotDeleted]
  type CacheType = awsDashSdkLib.awsDashSdkLibStrings.NO_CACHE | awsDashSdkLib.awsDashSdkLibStrings.S3 | java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ComputeType = awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_SMALL | awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_MEDIUM | awsDashSdkLib.awsDashSdkLibStrings.BUILD_GENERAL1_LARGE | java.lang.String
  type EnvironmentImages = js.Array[EnvironmentImage]
  type EnvironmentLanguages = js.Array[EnvironmentLanguage]
  type EnvironmentPlatforms = js.Array[EnvironmentPlatform]
  type EnvironmentType = awsDashSdkLib.awsDashSdkLibStrings.WINDOWS_CONTAINER | awsDashSdkLib.awsDashSdkLibStrings.LINUX_CONTAINER | java.lang.String
  type EnvironmentVariableType = awsDashSdkLib.awsDashSdkLibStrings.PLAINTEXT | awsDashSdkLib.awsDashSdkLibStrings.PARAMETER_STORE | java.lang.String
  type EnvironmentVariables = js.Array[EnvironmentVariable]
  type GitCloneDepth = scala.Double
  type ImageVersions = js.Array[String]
  type KeyInput = java.lang.String
  type LanguageType = awsDashSdkLib.awsDashSdkLibStrings.JAVA | awsDashSdkLib.awsDashSdkLibStrings.PYTHON | awsDashSdkLib.awsDashSdkLibStrings.NODE_JS | awsDashSdkLib.awsDashSdkLibStrings.RUBY | awsDashSdkLib.awsDashSdkLibStrings.GOLANG | awsDashSdkLib.awsDashSdkLibStrings.DOCKER | awsDashSdkLib.awsDashSdkLibStrings.ANDROID | awsDashSdkLib.awsDashSdkLibStrings.DOTNET | awsDashSdkLib.awsDashSdkLibStrings.BASE | awsDashSdkLib.awsDashSdkLibStrings.PHP | java.lang.String
  type LogsConfigStatusType = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.DISABLED | java.lang.String
  type NonEmptyString = java.lang.String
  type PhaseContexts = js.Array[PhaseContext]
  type PlatformType = awsDashSdkLib.awsDashSdkLibStrings.DEBIAN | awsDashSdkLib.awsDashSdkLibStrings.AMAZON_LINUX | awsDashSdkLib.awsDashSdkLibStrings.UBUNTU | awsDashSdkLib.awsDashSdkLibStrings.WINDOWS_SERVER | java.lang.String
  type ProjectArtifactsList = js.Array[ProjectArtifacts]
  type ProjectDescription = java.lang.String
  type ProjectName = java.lang.String
  type ProjectNames = js.Array[NonEmptyString]
  type ProjectSecondarySourceVersions = js.Array[ProjectSourceVersion]
  type ProjectSortByType = awsDashSdkLib.awsDashSdkLibStrings.NAME | awsDashSdkLib.awsDashSdkLibStrings.CREATED_TIME | awsDashSdkLib.awsDashSdkLibStrings.LAST_MODIFIED_TIME | java.lang.String
  type ProjectSources = js.Array[ProjectSource]
  type Projects = js.Array[Project]
  type SecurityGroupIds = js.Array[NonEmptyString]
  type SensitiveNonEmptyString = java.lang.String
  type ServerType = awsDashSdkLib.awsDashSdkLibStrings.GITHUB | awsDashSdkLib.awsDashSdkLibStrings.BITBUCKET | awsDashSdkLib.awsDashSdkLibStrings.GITHUB_ENTERPRISE | java.lang.String
  type SortOrderType = awsDashSdkLib.awsDashSdkLibStrings.ASCENDING | awsDashSdkLib.awsDashSdkLibStrings.DESCENDING | java.lang.String
  type SourceAuthType = awsDashSdkLib.awsDashSdkLibStrings.OAUTH | java.lang.String
  type SourceCredentialsInfos = js.Array[SourceCredentialsInfo]
  type SourceType = awsDashSdkLib.awsDashSdkLibStrings.CODECOMMIT | awsDashSdkLib.awsDashSdkLibStrings.CODEPIPELINE | awsDashSdkLib.awsDashSdkLibStrings.GITHUB | awsDashSdkLib.awsDashSdkLibStrings.S3 | awsDashSdkLib.awsDashSdkLibStrings.BITBUCKET | awsDashSdkLib.awsDashSdkLibStrings.GITHUB_ENTERPRISE | awsDashSdkLib.awsDashSdkLibStrings.NO_SOURCE | java.lang.String
  type StatusType = awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | awsDashSdkLib.awsDashSdkLibStrings.FAULT | awsDashSdkLib.awsDashSdkLibStrings.TIMED_OUT | awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS | awsDashSdkLib.awsDashSdkLibStrings.STOPPED | java.lang.String
  type String = java.lang.String
  type Subnets = js.Array[NonEmptyString]
  type TagList = js.Array[Tag]
  type TimeOut = scala.Double
  type Timestamp = stdLib.Date
  type ValueInput = java.lang.String
  type WrapperBoolean = scala.Boolean
  type WrapperInt = scala.Double
  type WrapperLong = scala.Double
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2016-10-06` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

