package typings.awsLambda

import typings.awsLambda.anon.Artifact
import typings.awsLambda.awsLambdaStrings.`CodeBuild Build State Change`
import typings.awsLambda.awsLambdaStrings.awsDotcodebuild
import typings.awsLambda.triggerEventbridgeMod.EventBridgeEvent
import typings.awsLambda.triggerEventbridgeMod.EventBridgeHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object triggerCodebuildCloudwatchStateMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.NO_CACHE
    - typings.awsLambda.awsLambdaStrings.LOCAL
    - typings.awsLambda.awsLambdaStrings.S3
  */
  trait CodeBuildCacheType extends StObject
  object CodeBuildCacheType {
    
    inline def LOCAL: typings.awsLambda.awsLambdaStrings.LOCAL = "LOCAL".asInstanceOf[typings.awsLambda.awsLambdaStrings.LOCAL]
    
    inline def NO_CACHE: typings.awsLambda.awsLambdaStrings.NO_CACHE = "NO_CACHE".asInstanceOf[typings.awsLambda.awsLambdaStrings.NO_CACHE]
    
    inline def S3: typings.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typings.awsLambda.awsLambdaStrings.S3]
  }
  
  trait CodeBuildCloudWatchStateEvent
    extends StObject
       with EventBridgeEvent[`CodeBuild Build State Change`, CodeBuildStateEventDetail] {
    
    @JSName("source")
    var source_CodeBuildCloudWatchStateEvent: awsDotcodebuild
  }
  object CodeBuildCloudWatchStateEvent {
    
    inline def apply(
      account: String,
      detail: CodeBuildStateEventDetail,
      id: String,
      region: String,
      resources: js.Array[String],
      time: String,
      version: String
    ): CodeBuildCloudWatchStateEvent = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = "aws.codebuild", time = time.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("detail-type")("CodeBuild Build State Change")
      __obj.asInstanceOf[CodeBuildCloudWatchStateEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeBuildCloudWatchStateEvent] (val x: Self) extends AnyVal {
      
      inline def setSource(value: awsDotcodebuild): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type CodeBuildCloudWatchStateHandler = EventBridgeHandler[`CodeBuild Build State Change`, CodeBuildStateEventDetail, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL
    - typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM
    - typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE
    - typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE
  */
  trait CodeBuildEnvironmentComputeType extends StObject
  object CodeBuildEnvironmentComputeType {
    
    inline def BUILD_GENERAL1_2XLARGE: typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_2XLARGE]
    
    inline def BUILD_GENERAL1_LARGE: typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_LARGE]
    
    inline def BUILD_GENERAL1_MEDIUM: typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_MEDIUM]
    
    inline def BUILD_GENERAL1_SMALL: typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[typings.awsLambda.awsLambdaStrings.BUILD_GENERAL1_SMALL]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.CODEBUILD
    - typings.awsLambda.awsLambdaStrings.SERVICE_ROLE
  */
  trait CodeBuildEnvironmentPullCredentialsType extends StObject
  object CodeBuildEnvironmentPullCredentialsType {
    
    inline def CODEBUILD: typings.awsLambda.awsLambdaStrings.CODEBUILD = "CODEBUILD".asInstanceOf[typings.awsLambda.awsLambdaStrings.CODEBUILD]
    
    inline def SERVICE_ROLE: typings.awsLambda.awsLambdaStrings.SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[typings.awsLambda.awsLambdaStrings.SERVICE_ROLE]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.LINUX_CONTAINER
    - typings.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER
    - typings.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER
    - typings.awsLambda.awsLambdaStrings.ARM_CONTAINER
  */
  trait CodeBuildEnvironmentType extends StObject
  object CodeBuildEnvironmentType {
    
    inline def ARM_CONTAINER: typings.awsLambda.awsLambdaStrings.ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[typings.awsLambda.awsLambdaStrings.ARM_CONTAINER]
    
    inline def LINUX_CONTAINER: typings.awsLambda.awsLambdaStrings.LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[typings.awsLambda.awsLambdaStrings.LINUX_CONTAINER]
    
    inline def LINUX_GPU_CONTAINER: typings.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[typings.awsLambda.awsLambdaStrings.LINUX_GPU_CONTAINER]
    
    inline def WINDOWS_CONTAINER: typings.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[typings.awsLambda.awsLambdaStrings.WINDOWS_CONTAINER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.PARAMETER_STORE
    - typings.awsLambda.awsLambdaStrings.PLAINTEXT
    - typings.awsLambda.awsLambdaStrings.SECRETS_MANAGER
  */
  trait CodeBuildEnvironmentVariableType extends StObject
  object CodeBuildEnvironmentVariableType {
    
    inline def PARAMETER_STORE: typings.awsLambda.awsLambdaStrings.PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[typings.awsLambda.awsLambdaStrings.PARAMETER_STORE]
    
    inline def PLAINTEXT: typings.awsLambda.awsLambdaStrings.PLAINTEXT = "PLAINTEXT".asInstanceOf[typings.awsLambda.awsLambdaStrings.PLAINTEXT]
    
    inline def SECRETS_MANAGER: typings.awsLambda.awsLambdaStrings.SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[typings.awsLambda.awsLambdaStrings.SECRETS_MANAGER]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.TIMED_OUT
    - typings.awsLambda.awsLambdaStrings.STOPPED
    - typings.awsLambda.awsLambdaStrings.FAILED
    - typings.awsLambda.awsLambdaStrings.SUCCEEDED
    - typings.awsLambda.awsLambdaStrings.FAULT
    - typings.awsLambda.awsLambdaStrings.CLIENT_ERROR
  */
  trait CodeBuildPhaseStatusType extends StObject
  object CodeBuildPhaseStatusType {
    
    inline def CLIENT_ERROR: typings.awsLambda.awsLambdaStrings.CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[typings.awsLambda.awsLambdaStrings.CLIENT_ERROR]
    
    inline def FAILED: typings.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typings.awsLambda.awsLambdaStrings.FAILED]
    
    inline def FAULT: typings.awsLambda.awsLambdaStrings.FAULT = "FAULT".asInstanceOf[typings.awsLambda.awsLambdaStrings.FAULT]
    
    inline def STOPPED: typings.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typings.awsLambda.awsLambdaStrings.STOPPED]
    
    inline def SUCCEEDED: typings.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.awsLambda.awsLambdaStrings.SUCCEEDED]
    
    inline def TIMED_OUT: typings.awsLambda.awsLambdaStrings.TIMED_OUT = "TIMED_OUT".asInstanceOf[typings.awsLambda.awsLambdaStrings.TIMED_OUT]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.COMPLETED
    - typings.awsLambda.awsLambdaStrings.FINALIZING
    - typings.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS
    - typings.awsLambda.awsLambdaStrings.POST_BUILD
    - typings.awsLambda.awsLambdaStrings.BUILD
    - typings.awsLambda.awsLambdaStrings.PRE_BUILD
    - typings.awsLambda.awsLambdaStrings.INSTALL
    - typings.awsLambda.awsLambdaStrings.QUEUED
    - typings.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE
    - typings.awsLambda.awsLambdaStrings.PROVISIONING
    - typings.awsLambda.awsLambdaStrings.SUBMITTED
  */
  trait CodeBuildPhaseType extends StObject
  object CodeBuildPhaseType {
    
    inline def BUILD: typings.awsLambda.awsLambdaStrings.BUILD = "BUILD".asInstanceOf[typings.awsLambda.awsLambdaStrings.BUILD]
    
    inline def COMPLETED: typings.awsLambda.awsLambdaStrings.COMPLETED = "COMPLETED".asInstanceOf[typings.awsLambda.awsLambdaStrings.COMPLETED]
    
    inline def DOWNLOAD_SOURCE: typings.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[typings.awsLambda.awsLambdaStrings.DOWNLOAD_SOURCE]
    
    inline def FINALIZING: typings.awsLambda.awsLambdaStrings.FINALIZING = "FINALIZING".asInstanceOf[typings.awsLambda.awsLambdaStrings.FINALIZING]
    
    inline def INSTALL: typings.awsLambda.awsLambdaStrings.INSTALL = "INSTALL".asInstanceOf[typings.awsLambda.awsLambdaStrings.INSTALL]
    
    inline def POST_BUILD: typings.awsLambda.awsLambdaStrings.POST_BUILD = "POST_BUILD".asInstanceOf[typings.awsLambda.awsLambdaStrings.POST_BUILD]
    
    inline def PRE_BUILD: typings.awsLambda.awsLambdaStrings.PRE_BUILD = "PRE_BUILD".asInstanceOf[typings.awsLambda.awsLambdaStrings.PRE_BUILD]
    
    inline def PROVISIONING: typings.awsLambda.awsLambdaStrings.PROVISIONING = "PROVISIONING".asInstanceOf[typings.awsLambda.awsLambdaStrings.PROVISIONING]
    
    inline def QUEUED: typings.awsLambda.awsLambdaStrings.QUEUED = "QUEUED".asInstanceOf[typings.awsLambda.awsLambdaStrings.QUEUED]
    
    inline def SUBMITTED: typings.awsLambda.awsLambdaStrings.SUBMITTED = "SUBMITTED".asInstanceOf[typings.awsLambda.awsLambdaStrings.SUBMITTED]
    
    inline def UPLOAD_ARTIFACTS: typings.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[typings.awsLambda.awsLambdaStrings.UPLOAD_ARTIFACTS]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.CODECOMMIT
    - typings.awsLambda.awsLambdaStrings.CODEPIPELINE
    - typings.awsLambda.awsLambdaStrings.GITHUB
    - typings.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE
    - typings.awsLambda.awsLambdaStrings.BITBUCKET
    - typings.awsLambda.awsLambdaStrings.S3
    - typings.awsLambda.awsLambdaStrings.NO_SOURCE
  */
  trait CodeBuildSourceLocationType extends StObject
  object CodeBuildSourceLocationType {
    
    inline def BITBUCKET: typings.awsLambda.awsLambdaStrings.BITBUCKET = "BITBUCKET".asInstanceOf[typings.awsLambda.awsLambdaStrings.BITBUCKET]
    
    inline def CODECOMMIT: typings.awsLambda.awsLambdaStrings.CODECOMMIT = "CODECOMMIT".asInstanceOf[typings.awsLambda.awsLambdaStrings.CODECOMMIT]
    
    inline def CODEPIPELINE: typings.awsLambda.awsLambdaStrings.CODEPIPELINE = "CODEPIPELINE".asInstanceOf[typings.awsLambda.awsLambdaStrings.CODEPIPELINE]
    
    inline def GITHUB: typings.awsLambda.awsLambdaStrings.GITHUB = "GITHUB".asInstanceOf[typings.awsLambda.awsLambdaStrings.GITHUB]
    
    inline def GITHUB_ENTERPRISE: typings.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[typings.awsLambda.awsLambdaStrings.GITHUB_ENTERPRISE]
    
    inline def NO_SOURCE: typings.awsLambda.awsLambdaStrings.NO_SOURCE = "NO_SOURCE".asInstanceOf[typings.awsLambda.awsLambdaStrings.NO_SOURCE]
    
    inline def S3: typings.awsLambda.awsLambdaStrings.S3 = "S3".asInstanceOf[typings.awsLambda.awsLambdaStrings.S3]
  }
  
  trait CodeBuildStateEventDetail extends StObject {
    
    var `additional-information`: Artifact
    
    var `build-id`: String
    
    var `build-status`: CodeBuildStateType
    
    var `current-phase`: CodeBuildPhaseType
    
    var `current-phase-context`: String
    
    var `project-name`: String
    
    var version: String
  }
  object CodeBuildStateEventDetail {
    
    inline def apply(
      `additional-information`: Artifact,
      `build-id`: String,
      `build-status`: CodeBuildStateType,
      `current-phase`: CodeBuildPhaseType,
      `current-phase-context`: String,
      `project-name`: String,
      version: String
    ): CodeBuildStateEventDetail = {
      val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("additional-information")(`additional-information`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-id")(`build-id`.asInstanceOf[js.Any])
      __obj.updateDynamic("build-status")(`build-status`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase")(`current-phase`.asInstanceOf[js.Any])
      __obj.updateDynamic("current-phase-context")(`current-phase-context`.asInstanceOf[js.Any])
      __obj.updateDynamic("project-name")(`project-name`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CodeBuildStateEventDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CodeBuildStateEventDetail] (val x: Self) extends AnyVal {
      
      inline def `setAdditional-information`(value: Artifact): Self = StObject.set(x, "additional-information", value.asInstanceOf[js.Any])
      
      inline def `setBuild-id`(value: String): Self = StObject.set(x, "build-id", value.asInstanceOf[js.Any])
      
      inline def `setBuild-status`(value: CodeBuildStateType): Self = StObject.set(x, "build-status", value.asInstanceOf[js.Any])
      
      inline def `setCurrent-phase`(value: CodeBuildPhaseType): Self = StObject.set(x, "current-phase", value.asInstanceOf[js.Any])
      
      inline def `setCurrent-phase-context`(value: String): Self = StObject.set(x, "current-phase-context", value.asInstanceOf[js.Any])
      
      inline def `setProject-name`(value: String): Self = StObject.set(x, "project-name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.IN_PROGRESS
    - typings.awsLambda.awsLambdaStrings.SUCCEEDED
    - typings.awsLambda.awsLambdaStrings.FAILED
    - typings.awsLambda.awsLambdaStrings.STOPPED
  */
  trait CodeBuildStateType extends StObject
  object CodeBuildStateType {
    
    inline def FAILED: typings.awsLambda.awsLambdaStrings.FAILED = "FAILED".asInstanceOf[typings.awsLambda.awsLambdaStrings.FAILED]
    
    inline def IN_PROGRESS: typings.awsLambda.awsLambdaStrings.IN_PROGRESS = "IN_PROGRESS".asInstanceOf[typings.awsLambda.awsLambdaStrings.IN_PROGRESS]
    
    inline def STOPPED: typings.awsLambda.awsLambdaStrings.STOPPED = "STOPPED".asInstanceOf[typings.awsLambda.awsLambdaStrings.STOPPED]
    
    inline def SUCCEEDED: typings.awsLambda.awsLambdaStrings.SUCCEEDED = "SUCCEEDED".asInstanceOf[typings.awsLambda.awsLambdaStrings.SUCCEEDED]
  }
}
