package typings.awsSdk.clientsCodebuildMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectInput extends StObject {
  
  /**
    * Information about the build output artifacts for the build project.
    */
  var artifacts: ProjectArtifacts
  
  /**
    * Set this to true to generate a publicly accessible URL for your project's build badge.
    */
  var badgeEnabled: js.UndefOr[WrapperBoolean] = js.undefined
  
  /**
    * A ProjectBuildBatchConfig object that defines the batch build options for the project.
    */
  var buildBatchConfig: js.UndefOr[ProjectBuildBatchConfig] = js.undefined
  
  /**
    * Stores recently used information so that it can be quickly accessed at a later time.
    */
  var cache: js.UndefOr[ProjectCache] = js.undefined
  
  /**
    * The maximum number of concurrent builds that are allowed for this project. New builds are only started if the current number of builds is less than or equal to this limit. If the current build count meets this limit, new builds are throttled and are not run.
    */
  var concurrentBuildLimit: js.UndefOr[WrapperInt] = js.undefined
  
  /**
    * A description that makes the build project easy to identify.
    */
  var description: js.UndefOr[ProjectDescription] = js.undefined
  
  /**
    * The Key Management Service customer master key (CMK) to be used for encrypting the build output artifacts.  You can use a cross-account KMS key to encrypt the build output artifacts if your service role has permission to that key.   You can specify either the Amazon Resource Name (ARN) of the CMK or, if available, the CMK's alias (using the format alias/&lt;alias-name&gt;). 
    */
  var encryptionKey: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Information about the build environment for the build project.
    */
  var environment: ProjectEnvironment
  
  /**
    *  An array of ProjectFileSystemLocation objects for a CodeBuild build project. A ProjectFileSystemLocation object specifies the identifier, location, mountOptions, mountPoint, and type of a file system created using Amazon Elastic File System. 
    */
  var fileSystemLocations: js.UndefOr[ProjectFileSystemLocations] = js.undefined
  
  /**
    * Information about logs for the build project. These can be logs in CloudWatch Logs, logs uploaded to a specified S3 bucket, or both. 
    */
  var logsConfig: js.UndefOr[LogsConfig] = js.undefined
  
  /**
    * The name of the build project.
    */
  var name: ProjectName
  
  /**
    * The number of minutes a build is allowed to be queued before it times out. 
    */
  var queuedTimeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  
  /**
    * An array of ProjectArtifacts objects. 
    */
  var secondaryArtifacts: js.UndefOr[ProjectArtifactsList] = js.undefined
  
  /**
    * An array of ProjectSourceVersion objects. If secondarySourceVersions is specified at the build level, then they take precedence over these secondarySourceVersions (at the project level). 
    */
  var secondarySourceVersions: js.UndefOr[ProjectSecondarySourceVersions] = js.undefined
  
  /**
    * An array of ProjectSource objects. 
    */
  var secondarySources: js.UndefOr[ProjectSources] = js.undefined
  
  /**
    * The ARN of the IAM role that enables CodeBuild to interact with dependent Amazon Web Services services on behalf of the Amazon Web Services account.
    */
  var serviceRole: NonEmptyString
  
  /**
    * Information about the build input source code for the build project.
    */
  var source: ProjectSource
  
  /**
    * A version of the build input to be built for this project. If not specified, the latest version is used. If specified, it must be one of:    For CodeCommit: the commit ID, branch, or Git tag to use.   For GitHub: the commit ID, pull request ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a pull request ID is specified, it must use the format pr/pull-request-ID (for example pr/25). If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Bitbucket: the commit ID, branch name, or tag name that corresponds to the version of the source code you want to build. If a branch name is specified, the branch's HEAD commit ID is used. If not specified, the default branch's HEAD commit ID is used.   For Amazon S3: the version ID of the object that represents the build input ZIP file to use.   If sourceVersion is specified at the build level, then that version takes precedence over this sourceVersion (at the project level).  For more information, see Source Version Sample with CodeBuild in the CodeBuild User Guide. 
    */
  var sourceVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A list of tag key and value pairs associated with this build project. These tags are available for use by Amazon Web Services services that support CodeBuild build project tags.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * How long, in minutes, from 5 to 480 (8 hours), for CodeBuild to wait before it times out any build that has not been marked as completed. The default is 60 minutes.
    */
  var timeoutInMinutes: js.UndefOr[TimeOut] = js.undefined
  
  /**
    * VpcConfig enables CodeBuild to access resources in an Amazon VPC.
    */
  var vpcConfig: js.UndefOr[VpcConfig] = js.undefined
}
object CreateProjectInput {
  
  inline def apply(
    artifacts: ProjectArtifacts,
    environment: ProjectEnvironment,
    name: ProjectName,
    serviceRole: NonEmptyString,
    source: ProjectSource
  ): CreateProjectInput = {
    val __obj = js.Dynamic.literal(artifacts = artifacts.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceRole = serviceRole.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectInput]
  }
  
  extension [Self <: CreateProjectInput](x: Self) {
    
    inline def setArtifacts(value: ProjectArtifacts): Self = StObject.set(x, "artifacts", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnabled(value: WrapperBoolean): Self = StObject.set(x, "badgeEnabled", value.asInstanceOf[js.Any])
    
    inline def setBadgeEnabledUndefined: Self = StObject.set(x, "badgeEnabled", js.undefined)
    
    inline def setBuildBatchConfig(value: ProjectBuildBatchConfig): Self = StObject.set(x, "buildBatchConfig", value.asInstanceOf[js.Any])
    
    inline def setBuildBatchConfigUndefined: Self = StObject.set(x, "buildBatchConfig", js.undefined)
    
    inline def setCache(value: ProjectCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setConcurrentBuildLimit(value: WrapperInt): Self = StObject.set(x, "concurrentBuildLimit", value.asInstanceOf[js.Any])
    
    inline def setConcurrentBuildLimitUndefined: Self = StObject.set(x, "concurrentBuildLimit", js.undefined)
    
    inline def setDescription(value: ProjectDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setEncryptionKey(value: NonEmptyString): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setEncryptionKeyUndefined: Self = StObject.set(x, "encryptionKey", js.undefined)
    
    inline def setEnvironment(value: ProjectEnvironment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setFileSystemLocations(value: ProjectFileSystemLocations): Self = StObject.set(x, "fileSystemLocations", value.asInstanceOf[js.Any])
    
    inline def setFileSystemLocationsUndefined: Self = StObject.set(x, "fileSystemLocations", js.undefined)
    
    inline def setFileSystemLocationsVarargs(value: ProjectFileSystemLocation*): Self = StObject.set(x, "fileSystemLocations", js.Array(value*))
    
    inline def setLogsConfig(value: LogsConfig): Self = StObject.set(x, "logsConfig", value.asInstanceOf[js.Any])
    
    inline def setLogsConfigUndefined: Self = StObject.set(x, "logsConfig", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutes(value: TimeOut): Self = StObject.set(x, "queuedTimeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setQueuedTimeoutInMinutesUndefined: Self = StObject.set(x, "queuedTimeoutInMinutes", js.undefined)
    
    inline def setSecondaryArtifacts(value: ProjectArtifactsList): Self = StObject.set(x, "secondaryArtifacts", value.asInstanceOf[js.Any])
    
    inline def setSecondaryArtifactsUndefined: Self = StObject.set(x, "secondaryArtifacts", js.undefined)
    
    inline def setSecondaryArtifactsVarargs(value: ProjectArtifacts*): Self = StObject.set(x, "secondaryArtifacts", js.Array(value*))
    
    inline def setSecondarySourceVersions(value: ProjectSecondarySourceVersions): Self = StObject.set(x, "secondarySourceVersions", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourceVersionsUndefined: Self = StObject.set(x, "secondarySourceVersions", js.undefined)
    
    inline def setSecondarySourceVersionsVarargs(value: ProjectSourceVersion*): Self = StObject.set(x, "secondarySourceVersions", js.Array(value*))
    
    inline def setSecondarySources(value: ProjectSources): Self = StObject.set(x, "secondarySources", value.asInstanceOf[js.Any])
    
    inline def setSecondarySourcesUndefined: Self = StObject.set(x, "secondarySources", js.undefined)
    
    inline def setSecondarySourcesVarargs(value: ProjectSource*): Self = StObject.set(x, "secondarySources", js.Array(value*))
    
    inline def setServiceRole(value: NonEmptyString): Self = StObject.set(x, "serviceRole", value.asInstanceOf[js.Any])
    
    inline def setSource(value: ProjectSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVersion(value: String): Self = StObject.set(x, "sourceVersion", value.asInstanceOf[js.Any])
    
    inline def setSourceVersionUndefined: Self = StObject.set(x, "sourceVersion", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTimeoutInMinutes(value: TimeOut): Self = StObject.set(x, "timeoutInMinutes", value.asInstanceOf[js.Any])
    
    inline def setTimeoutInMinutesUndefined: Self = StObject.set(x, "timeoutInMinutes", js.undefined)
    
    inline def setVpcConfig(value: VpcConfig): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
