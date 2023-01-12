package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildBatch extends StObject {
  
  /**
    * The ARN of the batch build.
    */
  var arn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * A BuildArtifacts object the defines the build artifacts for this batch build.
    */
  var artifacts: js.UndefOr[BuildArtifacts] = js.undefined
  
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined
  
  /**
    * The number of the batch build. For each project, the buildBatchNumber of its first batch build is 1. The buildBatchNumber of each subsequent batch build is incremented by 1. If a batch build is deleted, the buildBatchNumber of other batch builds does not change.
    */
  var buildBatchNumber: js.UndefOr[WrapperLong] = js.undefined
  
  /**
    * The status of the batch build.
    */
  var buildBatchStatus: js.UndefOr[StatusType] = js.undefined
  
  /**
    * An array of BuildGroup objects that define the build groups for the batch build.
    */
  var buildGroups: js.UndefOr[BuildGroups] = js.undefined
  
  /**
    * Specifies the maximum amount of time, in minutes, that the build in a batch must be completed in.
    */
  var buildTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  var cache: js.UndefOr[ProjectCache] = js.undefined
  
  /**
    * Indicates if the batch build is complete.
    */
  var complete: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The current phase of the batch build.
    */
  var currentPhase: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if session debugging is enabled for this batch build. For more information, see Viewing a running build in Session Manager. Batch session debugging is not supported for matrix batch builds.
    */
  var debugSessionEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * The Key Management Service customer master key (CMK) to be used for encrypting the batch build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;).
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time that the batch build ended.
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  var environment: js.UndefOr[ProjectEnvironment] = js.undefined
  
  /**
    * An array of ProjectFileSystemLocation objects for the batch build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined
  
  /**
    * The identifier of the batch build.
    */
  var id: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The entity that started the batch build. Valid values include:   If CodePipeline started the build, the pipeline's name (for example, codepipeline/my-demo-pipeline).   If an IAM user started the build, the user's name.   If the Jenkins plugin for CodeBuild started the build, the string CodeBuild-Jenkins-Plugin.  
    */
  var initiator: js.UndefOr[String] = js.undefined
  
  var logConfig: js.UndefOr[LogsConfig] = js.undefined
  
  /**
    * An array of BuildBatchPhase objects the specify the phases of the batch build.
    */
  var phases: js.UndefOr[BuildBatchPhases] = js.undefined
  
  /**
    * The name of the batch build project.
    */
  var projectName: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Specifies the amount of time, in minutes, that the batch build is allowed to be queued before it times out.
    */
  var queuedTimeoutInMinutes: js.UndefOr[WrapperInt] = js.undefined
  
  /**
    * The identifier of the resolved version of this batch build's source code.   For CodeCommit, GitHub, GitHub Enterprise, and BitBucket, the commit ID.   For CodePipeline, the source revision provided by CodePipeline.   For Amazon S3, this does not apply.  
    */
  var resolvedSourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * An array of BuildArtifacts objects the define the build artifacts for this batch build.
    */
  var secondaryArtifacts: js.UndefOr[BuildArtifactsList] = js.undefined
  
  /**
    * An array of ProjectSourceVersion objects. Each ProjectSourceVersion must be one of:    For CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example, pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon S3: the version ID of the object that represents the build input ZIP file to use.  
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  
  /**
    * An array of ProjectSource objects that define the sources for the batch build.
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  
  /**
    * The name of a service role used for builds in the batch.
    */
  var serviceRole: js.UndefOr[NonEmptyString] = js.undefined
  
  var source: js.UndefOr[ProjectSource] = js.undefined
  
  /**
    * The identifier of the version of the source code to be built.
    */
  var sourceVersion: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The date and time that the batch build started.
    */
  var startTime: js.UndefOr[js.Date] = js.undefined
  
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object BuildBatch {
  
  inline def apply(): BuildBatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BuildBatch]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BuildBatch] (val x: Self) extends AnyVal {
    
    inline def setArn(value: NonEmptyString): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setArtifacts(value: BuildArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setArtifactsUndefined: Self = StObject.set(x, "artifacts", js.undefined)
    
    inline def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = StObject.set(x, "buildBatchConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchConfigUndefined: Self = StObject.set(x, "buildBatchConfig", js.undefined)
    
    inline def setBuildBatchNumber(value: WrapperLong): Self = StObject.set(x, "buildBatchNumber", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchNumberUndefined: Self = StObject.set(x, "buildBatchNumber", js.undefined)
    
    inline def setBuildBatchStatus(value: StatusType): Self = StObject.set(x, "buildBatchStatus", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchStatusUndefined: Self = StObject.set(x, "buildBatchStatus", js.undefined)
    
    inline def setBuildGroups(value: BuildGroups): Self = StObject.set(x, "buildGroups", value.asInstanceOf[js.Any])
    
    inline def setBuildGroupsUndefined: Self = StObject.set(x, "buildGroups", js.undefined)
    
    inline def setBuildGroupsVarargs(value: BuildGroup*): Self = StObject.set(x, "buildGroups", js.Array(value*))
    
    inline def setBuildTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "buildTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setBuildTimeoutInMinutesUndefined: Self = StObject.set(x, "buildTimeoutInMinutes", js.undefined)
    
    inline def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setComplete(value: Boolean): Self = StObject.set(x, "complete", value.asInstanceOf[js.Any])
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setCurrentPhase(value: String): Self = StObject.set(x, "currentPhase", value.asInstanceOf[js.Any])
    
    inline def setCurrentPhaseUndefined: Self = StObject.set(x, "currentPhase", js.undefined)
    
    inline def setDebugSessionEnabled(value: WrapperBoolean): Self = StObject.set(x, "debugSessionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDebugSessionEnabledUndefined: Self = StObject.set(x, "debugSessionEnabled", js.undefined)
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setEnvironment(value: ProjectEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
    
    inline def setFileSystemLocations(value: ProjectFileSystemLocations): Self = StObject.set(x, "fileSystemLocations", value.asInstanceOf[js.Any])
    
    inline def setFileSystemLocationsUndefined: Self = StObject.set(x, "fileSystemLocations", js.undefined)
    
    inline def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = StObject.set(x, "fileSystemLocations", js.Array(value*))
    
    inline def setId(value: NonEmptyString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInitiator(value: String): Self = StObject.set(x, "initiator", value.asInstanceOf[js.Any])
    
    inline def setInitiatorUndefined: Self = StObject.set(x, "initiator", js.undefined)
    
    inline def setLogConfig(value: LogsConfig): Self = StObject.set(x, "logConfig", value.asInstanceOf[js.Any])
    
    inline def setLogConfigUndefined: Self = StObject.set(x, "logConfig", js.undefined)
    
    inline def setPhases(value: BuildBatchPhases): Self = StObject.set(x, "phases", value.asInstanceOf[js.Any])
    
    inline def setPhasesUndefined: Self = StObject.set(x, "phases", js.undefined)
    
    inline def setPhasesVarargs(value: BuildBatchPhase*): Self = StObject.set(x, "phases", js.Array(value*))
    
    inline def setProjectName(value: NonEmptyString): Self = StObject.set(x, "projectName", value.asInstanceOf[js.Any])
    
    inline def setProjectNameUndefined: Self = StObject.set(x, "projectName", js.undefined)
    
    inline def setQueuedTimeoutInMinutes(value: WrapperInt): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
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
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
