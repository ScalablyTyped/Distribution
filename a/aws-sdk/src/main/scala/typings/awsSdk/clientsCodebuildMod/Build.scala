package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Build extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the output artifacts for the build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.undefined
  
  /**
    * The ARN of the batch build that this build is a member of, if applicable.
    */
  var buildBatchArn: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the build is complete. True if complete; otherwise, false.
    */
  var buildComplete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of the build. For each project, the buildNumber of its first build is 1. The buildNumber of each subsequent build is incremented by 1. If a build is deleted, the buildNumber of other builds does not change.
    */
  var buildNumber: js.UndefOr[WrapperLong] = js.undefined
  
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
    * Contains information about the debug session for this build.
    */
  var debugSession: js.UndefOr[DebugSession] = js.undefined
  
  /**
    * The Key Management Service customer master key (CMK) to be used for encrypting the build output artifacts.   You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When the build process ended, expressed in Unix time format.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information about the build environment for this build.
    */
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  
  /**
    * A list of exported environment variables for this build. Exported environment variables are used in conjunction with CodePipeline to export environment variables from the current build stage to subsequent stages in the pipeline. For more information, see Working with variables in the CodePipeline User Guide.
    */
  var exportedEnvironmentVariables: js.UndefOr[ExportedEnvironmentVariables] = js.undefined
  
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined
  
  /**
    * The unique ID for the build.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The entity that started the build. Valid values include:   If CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an IAM user started the build, the user's name (for example, MyUserName).   If the Jenkins plugin for CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the build's logs in CloudWatch Logs.
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
    * The name of the CodeBuild project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  /**
    *  An array of the ARNs associated with this build's reports. 
    */
  var reportArns: js.UndefOr[BuildReportArns] = js.undefined
  
  /**
    *  An identifier for the version of this build's source code.     For CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.     For CodePipeline, the source revision provided by CodePipeline.     For Amazon S3, this does not apply.   
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    *  An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined
  
  /**
    *  An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon S3: the version ID of the object that represents the build input ZIP file to use.  
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
    * Any version identifier for the version of the source code to be built. If sourceVersion is specified at the project level, then this sourceVersion (at the build level) takes precedence.   For more information, see Source Version Sample with CodeBuild in the CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * When the build process started, expressed in Unix time format.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * How long, in minutes, for CodeBuild to wait before timing out this build if it does not get marked as completed.
    */
  var timeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  /**
    * If your CodeBuild project accesses resources in an Amazon VPC, you provide this parameter that identifies the VPC ID and the list of security group IDs and subnet IDs. The security groups and subnets must belong to the same VPC. You must provide at least one security group and one subnet ID.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object Build {
  
  inline def apply(): Build = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Build]
  }
  
  extension [Self <: Build](x: Self) {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setArtifacts(value: BuildArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBuildBatchArn(value: String): Self = StObject.set(x, "buildBatchArn", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchArnUndefined: Self = StObject.set(x, "buildBatchArn", js.undefined)
    
    inline def setBuildComplete(value: Boolean): Self = StObject.set(x, "buildComplete", value.asInstanceOf[js.Any])
    
    inline def setBuildCompleteUndefined: Self = StObject.set(x, "buildComplete", js.undefined)
    
    inline def setBuildNumber(value: WrapperLong): Self = StObject.set(x, "buildNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildNumberUndefined: Self = StObject.set(x, "buildNumber", js.undefined)
    
    inline def setBuildStatus(value: StatusType): Self = StObject.set(x, "buildStatus", value.asInstanceOf[js.Any])
    
    inline def setBuildStatusUndefined: Self = StObject.set(x, "buildStatus", js.undefined)
    
    inline def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCurrentPhase(value: String): Self = StObject.set(x, "currentPhase", value.asInstanceOf[js.Any])
    
    inline def setCurrentPhaseUndefined: Self = StObject.set(x, "currentPhase", js.undefined)
    
    inline def setDebugSession(value: DebugSession): Self = StObject.set(x, "debugSession", value.asInstanceOf[js.Any])
    
    inline def setDebugSessionUndefined: Self = StObject.set(x, "debugSession", js.undefined)
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEnvironment(value: ProjectEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setExportedEnvironmentVariables(value: ExportedEnvironmentVariables): Self = StObject.set(x, "exportedEnvironmentVariables", value.asInstanceOf[js.Any])
    
    inline def setExportedEnvironmentVariablesUndefined: Self = StObject.set(x, "exportedEnvironmentVariables", js.undefined)
    
    inline def setExportedEnvironmentVariablesVarargs(value: ExportedEnvironmentVariable*): Self = StObject.set(x, "exportedEnvironmentVariables", js.Array(value*))
    
    inline def setFileSystemLocations(value: ProjectFileSystemLocations): Self = StObject.set(x, "fileSystemLocations", value.asInstanceOf[js.Any])
    
    inline def setFileSystemLocationsUndefined: Self = StObject.set(x, "fileSystemLocations", js.undefined)
    
    inline def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = StObject.set(x, "fileSystemLocations", js.Array(value*))
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setLogs(value: LogsLocation): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
    
    inline def setLogsUndefined: Self = StObject.set(x, "logs", js.undefined)
    
    inline def setNetworkInterface(value: NetworkInterface): Self = StObject.set(x, "networkInterface", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceUndefined: Self = StObject.set(x, "networkInterface", js.undefined)
    
    inline def setPhases(value: BuildPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
    
    inline def setPhasesVarargs(value: BuildPhase*): Self = StObject.set(x, "phases", js.Array(value*))
    
    inline def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setQueuedTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
    inline def setReportArns(value: BuildReportArns): Self = StObject.set(x, "reportArns", value.asInstanceOf[js.Any])
    
    inline def setReportArnsUndefined: Self = StObject.set(x, "reportArns", js.undefined)
    
    inline def setReportArnsVarargs(value: String*): Self = StObject.set(x, "reportArns", js.Array(value*))
    
    inline def setResolvedSourceVersion(value: NonEmptyString): Self = StObject.set(x, "resolvedSourceVersion", value.asInstanceOf[js.Any])
    
    inline def setResolvedSourceVersionUndefined: Self = StObject.set(x, "resolvedSourceVersion", js.undefined)
    
    inline def setSecondaryArtifacts(value: BuildArtifactsList): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    inline def setSecondaryArtifactsVarargs(value: BuildArtifacts*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value*))
    
    inline def setSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourceVersions", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourceVersionsUndefined: Self = StObject.set(x, "secondarySourceVersions", js.undefined)
    
    inline def setSecondarySourceVersionsVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourceVersions", js.Array(value*))
    
    inline def setSecondarySources(value: ProjectSources): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
    
    inline def setSecondarySourcesVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySources", js.Array(value*))
    
    inline def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "serviceRole", js.undefined)
    
    inline def setSource(value: ProjectSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    inline def setSourceVersion(value: NonEmptyString): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    inline def setTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
