package typings.awsLambda

import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildCacheType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentComputeType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentPullCredentialsType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildEnvironmentVariableType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildPhaseType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildSourceLocationType
import typings.awsLambda.codebuildCloudwatchStateMod.CodeBuildStateType
import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionCategory
import typings.awsLambda.codepipelineCloudwatchActionMod.CodePipelineActionState
import typings.awsLambda.codepipelineCloudwatchPipelineMod.CodePipelineState
import typings.awsLambda.codepipelineCloudwatchStageMod.CodePipelineStageState
import typings.awsLambda.commonMod.ChallengeName
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowChannel
import typings.awsLambda.connectContactFlowMod.ConnectContactFlowInitiationMethod
import typings.awsLambda.kinesisFirehoseTransformationMod.FirehoseRecordTransformationStatus
import typings.awsLambda.s3BatchMod.S3BatchResultResultCode
import typings.awsLambda.sqsMod._SQSMessageAttributeDataType
import typings.awsLambda.userMigrationMod.UserStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsLambdaStrings {
  
  @js.native
  sealed trait `1Dot0` extends StObject
  @scala.inline
  def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait ADMIN_NO_SRP_AUTH extends ChallengeName
  @scala.inline
  def ADMIN_NO_SRP_AUTH: ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[ADMIN_NO_SRP_AUTH]
  
  @js.native
  sealed trait API extends ConnectContactFlowInitiationMethod
  @scala.inline
  def API: API = "API".asInstanceOf[API]
  
  @js.native
  sealed trait ARCHIVED extends UserStatus
  @scala.inline
  def ARCHIVED: ARCHIVED = "ARCHIVED".asInstanceOf[ARCHIVED]
  
  @js.native
  sealed trait ARM_CONTAINER extends CodeBuildEnvironmentType
  @scala.inline
  def ARM_CONTAINER: ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[ARM_CONTAINER]
  
  @js.native
  sealed trait AWS extends StObject
  @scala.inline
  def AWS: AWS = "AWS".asInstanceOf[AWS]
  
  @js.native
  sealed trait Approval extends CodePipelineActionCategory
  @scala.inline
  def Approval: Approval = "Approval".asInstanceOf[Approval]
  
  @js.native
  sealed trait BITBUCKET extends CodeBuildSourceLocationType
  @scala.inline
  def BITBUCKET: BITBUCKET = "BITBUCKET".asInstanceOf[BITBUCKET]
  
  @js.native
  sealed trait BUILD extends CodeBuildPhaseType
  @scala.inline
  def BUILD: BUILD = "BUILD".asInstanceOf[BUILD]
  
  @js.native
  sealed trait BUILD_GENERAL1_2XLARGE extends CodeBuildEnvironmentComputeType
  @scala.inline
  def BUILD_GENERAL1_2XLARGE: BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[BUILD_GENERAL1_2XLARGE]
  
  @js.native
  sealed trait BUILD_GENERAL1_LARGE extends CodeBuildEnvironmentComputeType
  @scala.inline
  def BUILD_GENERAL1_LARGE: BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[BUILD_GENERAL1_LARGE]
  
  @js.native
  sealed trait BUILD_GENERAL1_MEDIUM extends CodeBuildEnvironmentComputeType
  @scala.inline
  def BUILD_GENERAL1_MEDIUM: BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[BUILD_GENERAL1_MEDIUM]
  
  @js.native
  sealed trait BUILD_GENERAL1_SMALL extends CodeBuildEnvironmentComputeType
  @scala.inline
  def BUILD_GENERAL1_SMALL: BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[BUILD_GENERAL1_SMALL]
  
  @js.native
  sealed trait Binary extends _SQSMessageAttributeDataType
  @scala.inline
  def Binary: Binary = "Binary".asInstanceOf[Binary]
  
  @js.native
  sealed trait Build_ extends CodePipelineActionCategory
  @scala.inline
  def Build_ : Build_ = "Build".asInstanceOf[Build_]
  
  @js.native
  sealed trait CALLBACK extends ConnectContactFlowInitiationMethod
  @scala.inline
  def CALLBACK: CALLBACK = "CALLBACK".asInstanceOf[CALLBACK]
  
  @js.native
  sealed trait CANCELED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait CHAT extends ConnectContactFlowChannel
  @scala.inline
  def CHAT: CHAT = "CHAT".asInstanceOf[CHAT]
  
  @js.native
  sealed trait CLIENT_ERROR extends CodeBuildPhaseStatusType
  @scala.inline
  def CLIENT_ERROR: CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[CLIENT_ERROR]
  
  @js.native
  sealed trait CODEBUILD extends CodeBuildEnvironmentPullCredentialsType
  @scala.inline
  def CODEBUILD: CODEBUILD = "CODEBUILD".asInstanceOf[CODEBUILD]
  
  @js.native
  sealed trait CODECOMMIT extends CodeBuildSourceLocationType
  @scala.inline
  def CODECOMMIT: CODECOMMIT = "CODECOMMIT".asInstanceOf[CODECOMMIT]
  
  @js.native
  sealed trait CODEPIPELINE extends CodeBuildSourceLocationType
  @scala.inline
  def CODEPIPELINE: CODEPIPELINE = "CODEPIPELINE".asInstanceOf[CODEPIPELINE]
  
  @js.native
  sealed trait COMPLETED extends CodeBuildPhaseType
  @scala.inline
  def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait COMPROMISED extends UserStatus
  @scala.inline
  def COMPROMISED: COMPROMISED = "COMPROMISED".asInstanceOf[COMPROMISED]
  
  @js.native
  sealed trait CONFIRMED extends UserStatus
  @scala.inline
  def CONFIRMED: CONFIRMED = "CONFIRMED".asInstanceOf[CONFIRMED]
  
  @js.native
  sealed trait CREATE_TIME extends StObject
  @scala.inline
  def CREATE_TIME: CREATE_TIME = "CREATE_TIME".asInstanceOf[CREATE_TIME]
  
  @js.native
  sealed trait CUSTOM_CHALLENGE extends StObject
  @scala.inline
  def CUSTOM_CHALLENGE: CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE".asInstanceOf[CUSTOM_CHALLENGE]
  
  @js.native
  sealed trait Close extends StObject
  @scala.inline
  def Close: Close = "Close".asInstanceOf[Close]
  
  @js.native
  sealed trait `CodeBuild Build State Change` extends StObject
  @scala.inline
  def `CodeBuild Build State Change`: `CodeBuild Build State Change` = ("CodeBuild Build State Change").asInstanceOf[`CodeBuild Build State Change`]
  
  @js.native
  sealed trait `CodePipeline Action Execution State Change` extends StObject
  @scala.inline
  def `CodePipeline Action Execution State Change`: `CodePipeline Action Execution State Change` = ("CodePipeline Action Execution State Change").asInstanceOf[`CodePipeline Action Execution State Change`]
  
  @js.native
  sealed trait `CodePipeline Pipeline Execution State Change` extends StObject
  @scala.inline
  def `CodePipeline Pipeline Execution State Change`: `CodePipeline Pipeline Execution State Change` = ("CodePipeline Pipeline Execution State Change").asInstanceOf[`CodePipeline Pipeline Execution State Change`]
  
  @js.native
  sealed trait `CodePipeline Stage Execution State Change` extends StObject
  @scala.inline
  def `CodePipeline Stage Execution State Change`: `CodePipeline Stage Execution State Change` = ("CodePipeline Stage Execution State Change").asInstanceOf[`CodePipeline Stage Execution State Change`]
  
  @js.native
  sealed trait ConfirmIntent extends StObject
  @scala.inline
  def ConfirmIntent: ConfirmIntent = "ConfirmIntent".asInstanceOf[ConfirmIntent]
  
  @js.native
  sealed trait Confirmed_ extends StObject
  @scala.inline
  def Confirmed_ : Confirmed_ = "Confirmed".asInstanceOf[Confirmed_]
  
  @js.native
  sealed trait ContactFlowEvent extends StObject
  @scala.inline
  def ContactFlowEvent: ContactFlowEvent = "ContactFlowEvent".asInstanceOf[ContactFlowEvent]
  
  @js.native
  sealed trait Create extends StObject
  @scala.inline
  def Create: Create = "Create".asInstanceOf[Create]
  
  @js.native
  sealed trait CreateAuthChallenge_Authentication extends StObject
  @scala.inline
  def CreateAuthChallenge_Authentication: CreateAuthChallenge_Authentication = "CreateAuthChallenge_Authentication".asInstanceOf[CreateAuthChallenge_Authentication]
  
  @js.native
  sealed trait Custom extends StObject
  @scala.inline
  def Custom: Custom = "Custom".asInstanceOf[Custom]
  
  @js.native
  sealed trait CustomMessage_AdminCreateUser extends StObject
  @scala.inline
  def CustomMessage_AdminCreateUser: CustomMessage_AdminCreateUser = "CustomMessage_AdminCreateUser".asInstanceOf[CustomMessage_AdminCreateUser]
  
  @js.native
  sealed trait CustomMessage_Authentication extends StObject
  @scala.inline
  def CustomMessage_Authentication: CustomMessage_Authentication = "CustomMessage_Authentication".asInstanceOf[CustomMessage_Authentication]
  
  @js.native
  sealed trait CustomMessage_ForgotPassword extends StObject
  @scala.inline
  def CustomMessage_ForgotPassword: CustomMessage_ForgotPassword = "CustomMessage_ForgotPassword".asInstanceOf[CustomMessage_ForgotPassword]
  
  @js.native
  sealed trait CustomMessage_ResendCode extends StObject
  @scala.inline
  def CustomMessage_ResendCode: CustomMessage_ResendCode = "CustomMessage_ResendCode".asInstanceOf[CustomMessage_ResendCode]
  
  @js.native
  sealed trait CustomMessage_SignUp extends StObject
  @scala.inline
  def CustomMessage_SignUp: CustomMessage_SignUp = "CustomMessage_SignUp".asInstanceOf[CustomMessage_SignUp]
  
  @js.native
  sealed trait CustomMessage_UpdateUserAttribute extends StObject
  @scala.inline
  def CustomMessage_UpdateUserAttribute: CustomMessage_UpdateUserAttribute = "CustomMessage_UpdateUserAttribute".asInstanceOf[CustomMessage_UpdateUserAttribute]
  
  @js.native
  sealed trait CustomMessage_VerifyUserAttribute extends StObject
  @scala.inline
  def CustomMessage_VerifyUserAttribute: CustomMessage_VerifyUserAttribute = "CustomMessage_VerifyUserAttribute".asInstanceOf[CustomMessage_VerifyUserAttribute]
  
  @js.native
  sealed trait CustomPayload extends StObject
  @scala.inline
  def CustomPayload: CustomPayload = "CustomPayload".asInstanceOf[CustomPayload]
  
  @js.native
  sealed trait DEVICE_PASSWORD_VERIFIER extends ChallengeName
  @scala.inline
  def DEVICE_PASSWORD_VERIFIER: DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[DEVICE_PASSWORD_VERIFIER]
  
  @js.native
  sealed trait DEVICE_SRP_AUTH extends ChallengeName
  @scala.inline
  def DEVICE_SRP_AUTH: DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[DEVICE_SRP_AUTH]
  
  @js.native
  sealed trait DOWNLOAD_SOURCE extends CodeBuildPhaseType
  @scala.inline
  def DOWNLOAD_SOURCE: DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[DOWNLOAD_SOURCE]
  
  @js.native
  sealed trait DefineAuthChallenge_Authentication extends StObject
  @scala.inline
  def DefineAuthChallenge_Authentication: DefineAuthChallenge_Authentication = "DefineAuthChallenge_Authentication".asInstanceOf[DefineAuthChallenge_Authentication]
  
  @js.native
  sealed trait Delegate extends StObject
  @scala.inline
  def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  
  @js.native
  sealed trait Delete extends StObject
  @scala.inline
  def Delete: Delete = "Delete".asInstanceOf[Delete]
  
  @js.native
  sealed trait Denied extends StObject
  @scala.inline
  def Denied: Denied = "Denied".asInstanceOf[Denied]
  
  @js.native
  sealed trait Deploy extends CodePipelineActionCategory
  @scala.inline
  def Deploy: Deploy = "Deploy".asInstanceOf[Deploy]
  
  @js.native
  sealed trait DialogCodeHook extends StObject
  @scala.inline
  def DialogCodeHook: DialogCodeHook = "DialogCodeHook".asInstanceOf[DialogCodeHook]
  
  @js.native
  sealed trait Dropped extends FirehoseRecordTransformationStatus
  @scala.inline
  def Dropped: Dropped = "Dropped".asInstanceOf[Dropped]
  
  @js.native
  sealed trait EMAIL extends StObject
  @scala.inline
  def EMAIL: EMAIL = "EMAIL".asInstanceOf[EMAIL]
  
  @js.native
  sealed trait ElicitIntent extends StObject
  @scala.inline
  def ElicitIntent: ElicitIntent = "ElicitIntent".asInstanceOf[ElicitIntent]
  
  @js.native
  sealed trait ElicitSlot extends StObject
  @scala.inline
  def ElicitSlot: ElicitSlot = "ElicitSlot".asInstanceOf[ElicitSlot]
  
  @js.native
  sealed trait FAILED
    extends CodeBuildPhaseStatusType
       with CodeBuildStateType
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAULT extends CodeBuildPhaseStatusType
  @scala.inline
  def FAULT: FAULT = "FAULT".asInstanceOf[FAULT]
  
  @js.native
  sealed trait FINALIZING extends CodeBuildPhaseType
  @scala.inline
  def FINALIZING: FINALIZING = "FINALIZING".asInstanceOf[FINALIZING]
  
  @js.native
  sealed trait FORCE_CHANGE_PASSWORD extends UserStatus
  @scala.inline
  def FORCE_CHANGE_PASSWORD: FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[FORCE_CHANGE_PASSWORD]
  
  @js.native
  sealed trait Failed_ extends StObject
  @scala.inline
  def Failed_ : Failed_ = "Failed".asInstanceOf[Failed_]
  
  @js.native
  sealed trait Fulfilled extends StObject
  @scala.inline
  def Fulfilled: Fulfilled = "Fulfilled".asInstanceOf[Fulfilled]
  
  @js.native
  sealed trait FulfillmentCodeHook extends StObject
  @scala.inline
  def FulfillmentCodeHook: FulfillmentCodeHook = "FulfillmentCodeHook".asInstanceOf[FulfillmentCodeHook]
  
  @js.native
  sealed trait GITHUB extends CodeBuildSourceLocationType
  @scala.inline
  def GITHUB: GITHUB = "GITHUB".asInstanceOf[GITHUB]
  
  @js.native
  sealed trait GITHUB_ENTERPRISE extends CodeBuildSourceLocationType
  @scala.inline
  def GITHUB_ENTERPRISE: GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[GITHUB_ENTERPRISE]
  
  @js.native
  sealed trait INBOUND extends ConnectContactFlowInitiationMethod
  @scala.inline
  def INBOUND: INBOUND = "INBOUND".asInstanceOf[INBOUND]
  
  @js.native
  sealed trait INSERT extends StObject
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  
  @js.native
  sealed trait INSTALL extends CodeBuildPhaseType
  @scala.inline
  def INSTALL: INSTALL = "INSTALL".asInstanceOf[INSTALL]
  
  @js.native
  sealed trait IN_PROGRESS extends CodeBuildStateType
  @scala.inline
  def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait Invoke extends CodePipelineActionCategory
  @scala.inline
  def Invoke: Invoke = "Invoke".asInstanceOf[Invoke]
  
  @js.native
  sealed trait KEYS_ONLY extends StObject
  @scala.inline
  def KEYS_ONLY: KEYS_ONLY = "KEYS_ONLY".asInstanceOf[KEYS_ONLY]
  
  @js.native
  sealed trait KMS extends StObject
  @scala.inline
  def KMS: KMS = "KMS".asInstanceOf[KMS]
  
  @js.native
  sealed trait LINUX_CONTAINER extends CodeBuildEnvironmentType
  @scala.inline
  def LINUX_CONTAINER: LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[LINUX_CONTAINER]
  
  @js.native
  sealed trait LINUX_GPU_CONTAINER extends CodeBuildEnvironmentType
  @scala.inline
  def LINUX_GPU_CONTAINER: LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[LINUX_GPU_CONTAINER]
  
  @js.native
  sealed trait LOCAL extends CodeBuildCacheType
  @scala.inline
  def LOCAL: LOCAL = "LOCAL".asInstanceOf[LOCAL]
  
  @js.native
  sealed trait LOG_APPEND_TIME extends StObject
  @scala.inline
  def LOG_APPEND_TIME: LOG_APPEND_TIME = "LOG_APPEND_TIME".asInstanceOf[LOG_APPEND_TIME]
  
  @js.native
  sealed trait MODIFY extends StObject
  @scala.inline
  def MODIFY: MODIFY = "MODIFY".asInstanceOf[MODIFY]
  
  @js.native
  sealed trait NEW_AND_OLD_IMAGES extends StObject
  @scala.inline
  def NEW_AND_OLD_IMAGES: NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[NEW_AND_OLD_IMAGES]
  
  @js.native
  sealed trait NEW_IMAGE extends StObject
  @scala.inline
  def NEW_IMAGE: NEW_IMAGE = "NEW_IMAGE".asInstanceOf[NEW_IMAGE]
  
  @js.native
  sealed trait NO_CACHE extends CodeBuildCacheType
  @scala.inline
  def NO_CACHE: NO_CACHE = "NO_CACHE".asInstanceOf[NO_CACHE]
  
  @js.native
  sealed trait NO_SOURCE extends CodeBuildSourceLocationType
  @scala.inline
  def NO_SOURCE: NO_SOURCE = "NO_SOURCE".asInstanceOf[NO_SOURCE]
  
  @js.native
  sealed trait None extends StObject
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait Number extends _SQSMessageAttributeDataType
  @scala.inline
  def Number: Number = "Number".asInstanceOf[Number]
  
  @js.native
  sealed trait OLD_IMAGE extends StObject
  @scala.inline
  def OLD_IMAGE: OLD_IMAGE = "OLD_IMAGE".asInstanceOf[OLD_IMAGE]
  
  @js.native
  sealed trait OUTBOUND extends ConnectContactFlowInitiationMethod
  @scala.inline
  def OUTBOUND: OUTBOUND = "OUTBOUND".asInstanceOf[OUTBOUND]
  
  @js.native
  sealed trait Ok extends FirehoseRecordTransformationStatus
  @scala.inline
  def Ok: Ok = "Ok".asInstanceOf[Ok]
  
  @js.native
  sealed trait PARAMETER_STORE extends CodeBuildEnvironmentVariableType
  @scala.inline
  def PARAMETER_STORE: PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[PARAMETER_STORE]
  
  @js.native
  sealed trait PASSWORD_VERIFIER extends ChallengeName
  @scala.inline
  def PASSWORD_VERIFIER: PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[PASSWORD_VERIFIER]
  
  @js.native
  sealed trait PLAINTEXT extends CodeBuildEnvironmentVariableType
  @scala.inline
  def PLAINTEXT: PLAINTEXT = "PLAINTEXT".asInstanceOf[PLAINTEXT]
  
  @js.native
  sealed trait POST_BUILD extends CodeBuildPhaseType
  @scala.inline
  def POST_BUILD: POST_BUILD = "POST_BUILD".asInstanceOf[POST_BUILD]
  
  @js.native
  sealed trait PRE_BUILD extends CodeBuildPhaseType
  @scala.inline
  def PRE_BUILD: PRE_BUILD = "PRE_BUILD".asInstanceOf[PRE_BUILD]
  
  @js.native
  sealed trait PROVISIONING extends CodeBuildPhaseType
  @scala.inline
  def PROVISIONING: PROVISIONING = "PROVISIONING".asInstanceOf[PROVISIONING]
  
  @js.native
  sealed trait PermanentFailure extends S3BatchResultResultCode
  @scala.inline
  def PermanentFailure: PermanentFailure = "PermanentFailure".asInstanceOf[PermanentFailure]
  
  @js.native
  sealed trait PlainText_ extends StObject
  @scala.inline
  def PlainText_ : PlainText_ = "PlainText".asInstanceOf[PlainText_]
  
  @js.native
  sealed trait PostAuthentication_Authentication extends StObject
  @scala.inline
  def PostAuthentication_Authentication: PostAuthentication_Authentication = "PostAuthentication_Authentication".asInstanceOf[PostAuthentication_Authentication]
  
  @js.native
  sealed trait PostConfirmation_ConfirmForgotPassword extends StObject
  @scala.inline
  def PostConfirmation_ConfirmForgotPassword: PostConfirmation_ConfirmForgotPassword = "PostConfirmation_ConfirmForgotPassword".asInstanceOf[PostConfirmation_ConfirmForgotPassword]
  
  @js.native
  sealed trait PostConfirmation_ConfirmSignUp extends StObject
  @scala.inline
  def PostConfirmation_ConfirmSignUp: PostConfirmation_ConfirmSignUp = "PostConfirmation_ConfirmSignUp".asInstanceOf[PostConfirmation_ConfirmSignUp]
  
  @js.native
  sealed trait PreAuthentication_Authentication extends StObject
  @scala.inline
  def PreAuthentication_Authentication: PreAuthentication_Authentication = "PreAuthentication_Authentication".asInstanceOf[PreAuthentication_Authentication]
  
  @js.native
  sealed trait PreSignUp_AdminCreateUser extends StObject
  @scala.inline
  def PreSignUp_AdminCreateUser: PreSignUp_AdminCreateUser = "PreSignUp_AdminCreateUser".asInstanceOf[PreSignUp_AdminCreateUser]
  
  @js.native
  sealed trait PreSignUp_ExternalProvider extends StObject
  @scala.inline
  def PreSignUp_ExternalProvider: PreSignUp_ExternalProvider = "PreSignUp_ExternalProvider".asInstanceOf[PreSignUp_ExternalProvider]
  
  @js.native
  sealed trait PreSignUp_SignUp extends StObject
  @scala.inline
  def PreSignUp_SignUp: PreSignUp_SignUp = "PreSignUp_SignUp".asInstanceOf[PreSignUp_SignUp]
  
  @js.native
  sealed trait ProcessingFailed extends FirehoseRecordTransformationStatus
  @scala.inline
  def ProcessingFailed: ProcessingFailed = "ProcessingFailed".asInstanceOf[ProcessingFailed]
  
  @js.native
  sealed trait QUEUED extends CodeBuildPhaseType
  @scala.inline
  def QUEUED: QUEUED = "QUEUED".asInstanceOf[QUEUED]
  
  @js.native
  sealed trait REMOVE extends StObject
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait REQUEST extends StObject
  @scala.inline
  def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait RESEND extends StObject
  @scala.inline
  def RESEND: RESEND = "RESEND".asInstanceOf[RESEND]
  
  @js.native
  sealed trait RESET_REQUIRED extends UserStatus
  @scala.inline
  def RESET_REQUIRED: RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[RESET_REQUIRED]
  
  @js.native
  sealed trait RESUMED
    extends CodePipelineStageState
       with CodePipelineState
  @scala.inline
  def RESUMED: RESUMED = "RESUMED".asInstanceOf[RESUMED]
  
  @js.native
  sealed trait S3
    extends CodeBuildCacheType
       with CodeBuildSourceLocationType
  @scala.inline
  def S3: S3 = "S3".asInstanceOf[S3]
  
  @js.native
  sealed trait SECRETS_MANAGER extends CodeBuildEnvironmentVariableType
  @scala.inline
  def SECRETS_MANAGER: SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[SECRETS_MANAGER]
  
  @js.native
  sealed trait SERVICE_ROLE extends CodeBuildEnvironmentPullCredentialsType
  @scala.inline
  def SERVICE_ROLE: SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[SERVICE_ROLE]
  
  @js.native
  sealed trait SMS extends StObject
  @scala.inline
  def SMS: SMS = "SMS".asInstanceOf[SMS]
  
  @js.native
  sealed trait SMS_MFA extends ChallengeName
  @scala.inline
  def SMS_MFA: SMS_MFA = "SMS_MFA".asInstanceOf[SMS_MFA]
  
  @js.native
  sealed trait SRP_A extends ChallengeName
  @scala.inline
  def SRP_A: SRP_A = "SRP_A".asInstanceOf[SRP_A]
  
  @js.native
  sealed trait SSML extends StObject
  @scala.inline
  def SSML: SSML = "SSML".asInstanceOf[SSML]
  
  @js.native
  sealed trait STARTED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  @scala.inline
  def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  
  @js.native
  sealed trait STOPPED
    extends CodeBuildPhaseStatusType
       with CodeBuildStateType
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  
  @js.native
  sealed trait SUBMITTED extends CodeBuildPhaseType
  @scala.inline
  def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCEEDED
    extends CodeBuildPhaseStatusType
       with CodeBuildStateType
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @js.native
  sealed trait SUCCESS extends StObject
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SUPERSEDED extends CodePipelineState
  @scala.inline
  def SUPERSEDED: SUPERSEDED = "SUPERSEDED".asInstanceOf[SUPERSEDED]
  
  @js.native
  sealed trait SUPPRESS extends StObject
  @scala.inline
  def SUPPRESS: SUPPRESS = "SUPPRESS".asInstanceOf[SUPPRESS]
  
  @js.native
  sealed trait `Scheduled Event` extends StObject
  @scala.inline
  def `Scheduled Event`: `Scheduled Event` = ("Scheduled Event").asInstanceOf[`Scheduled Event`]
  
  @js.native
  sealed trait Source extends CodePipelineActionCategory
  @scala.inline
  def Source: Source = "Source".asInstanceOf[Source]
  
  @js.native
  sealed trait String extends _SQSMessageAttributeDataType
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait Succeeded_ extends S3BatchResultResultCode
  @scala.inline
  def Succeeded_ : Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
  
  @js.native
  sealed trait TELEPHONE_NUMBER extends StObject
  @scala.inline
  def TELEPHONE_NUMBER: TELEPHONE_NUMBER = "TELEPHONE_NUMBER".asInstanceOf[TELEPHONE_NUMBER]
  
  @js.native
  sealed trait TIMED_OUT extends CodeBuildPhaseStatusType
  @scala.inline
  def TIMED_OUT: TIMED_OUT = "TIMED_OUT".asInstanceOf[TIMED_OUT]
  
  @js.native
  sealed trait TOKEN extends StObject
  @scala.inline
  def TOKEN: TOKEN = "TOKEN".asInstanceOf[TOKEN]
  
  @js.native
  sealed trait TRANSFER extends ConnectContactFlowInitiationMethod
  @scala.inline
  def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  
  @js.native
  sealed trait TemporaryFailure extends S3BatchResultResultCode
  @scala.inline
  def TemporaryFailure: TemporaryFailure = "TemporaryFailure".asInstanceOf[TemporaryFailure]
  
  @js.native
  sealed trait Test extends CodePipelineActionCategory
  @scala.inline
  def Test: Test = "Test".asInstanceOf[Test]
  
  @js.native
  sealed trait Text extends StObject
  @scala.inline
  def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait ThirdParty extends StObject
  @scala.inline
  def ThirdParty: ThirdParty = "ThirdParty".asInstanceOf[ThirdParty]
  
  @js.native
  sealed trait TokenGeneration_AuthenticateDevice extends StObject
  @scala.inline
  def TokenGeneration_AuthenticateDevice: TokenGeneration_AuthenticateDevice = "TokenGeneration_AuthenticateDevice".asInstanceOf[TokenGeneration_AuthenticateDevice]
  
  @js.native
  sealed trait TokenGeneration_Authentication extends StObject
  @scala.inline
  def TokenGeneration_Authentication: TokenGeneration_Authentication = "TokenGeneration_Authentication".asInstanceOf[TokenGeneration_Authentication]
  
  @js.native
  sealed trait TokenGeneration_HostedAuth extends StObject
  @scala.inline
  def TokenGeneration_HostedAuth: TokenGeneration_HostedAuth = "TokenGeneration_HostedAuth".asInstanceOf[TokenGeneration_HostedAuth]
  
  @js.native
  sealed trait TokenGeneration_NewPasswordChallenge extends StObject
  @scala.inline
  def TokenGeneration_NewPasswordChallenge: TokenGeneration_NewPasswordChallenge = "TokenGeneration_NewPasswordChallenge".asInstanceOf[TokenGeneration_NewPasswordChallenge]
  
  @js.native
  sealed trait TokenGeneration_RefreshTokens extends StObject
  @scala.inline
  def TokenGeneration_RefreshTokens: TokenGeneration_RefreshTokens = "TokenGeneration_RefreshTokens".asInstanceOf[TokenGeneration_RefreshTokens]
  
  @js.native
  sealed trait UNCONFIRMED extends UserStatus
  @scala.inline
  def UNCONFIRMED: UNCONFIRMED = "UNCONFIRMED".asInstanceOf[UNCONFIRMED]
  
  @js.native
  sealed trait UNKNOWN extends UserStatus
  @scala.inline
  def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UPLOAD_ARTIFACTS extends CodeBuildPhaseType
  @scala.inline
  def UPLOAD_ARTIFACTS: UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[UPLOAD_ARTIFACTS]
  
  @js.native
  sealed trait Update extends StObject
  @scala.inline
  def Update: Update = "Update".asInstanceOf[Update]
  
  @js.native
  sealed trait UserMigration_Authentication extends StObject
  @scala.inline
  def UserMigration_Authentication: UserMigration_Authentication = "UserMigration_Authentication".asInstanceOf[UserMigration_Authentication]
  
  @js.native
  sealed trait UserMigration_ForgotPassword extends StObject
  @scala.inline
  def UserMigration_ForgotPassword: UserMigration_ForgotPassword = "UserMigration_ForgotPassword".asInstanceOf[UserMigration_ForgotPassword]
  
  @js.native
  sealed trait VOICE extends ConnectContactFlowChannel
  @scala.inline
  def VOICE: VOICE = "VOICE".asInstanceOf[VOICE]
  
  @js.native
  sealed trait VerifyAuthChallengeResponse_Authentication extends StObject
  @scala.inline
  def VerifyAuthChallengeResponse_Authentication: VerifyAuthChallengeResponse_Authentication = "VerifyAuthChallengeResponse_Authentication".asInstanceOf[VerifyAuthChallengeResponse_Authentication]
  
  @js.native
  sealed trait Voice_ extends StObject
  @scala.inline
  def Voice_ : Voice_ = "Voice".asInstanceOf[Voice_]
  
  @js.native
  sealed trait WINDOWS_CONTAINER extends CodeBuildEnvironmentType
  @scala.inline
  def WINDOWS_CONTAINER: WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[WINDOWS_CONTAINER]
  
  @js.native
  sealed trait applicationSlashvndDotamazonawsDotcardDotgeneric extends StObject
  @scala.inline
  def applicationSlashvndDotamazonawsDotcardDotgeneric: applicationSlashvndDotamazonawsDotcardDotgeneric = "application/vnd.amazonaws.card.generic".asInstanceOf[applicationSlashvndDotamazonawsDotcardDotgeneric]
  
  @js.native
  sealed trait awsColonkafka extends StObject
  @scala.inline
  def awsColonkafka: awsColonkafka = "aws:kafka".asInstanceOf[awsColonkafka]
  
  @js.native
  sealed trait awsDotcodebuild extends StObject
  @scala.inline
  def awsDotcodebuild: awsDotcodebuild = "aws.codebuild".asInstanceOf[awsDotcodebuild]
  
  @js.native
  sealed trait awsDotcodepipeline extends StObject
  @scala.inline
  def awsDotcodepipeline: awsDotcodepipeline = "aws.codepipeline".asInstanceOf[awsDotcodepipeline]
  
  @js.native
  sealed trait base64 extends StObject
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait http extends StObject
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait none_ extends StObject
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait `origin-access-identity` extends StObject
  @scala.inline
  def `origin-access-identity`: `origin-access-identity` = "origin-access-identity".asInstanceOf[`origin-access-identity`]
  
  @js.native
  sealed trait `origin-request` extends StObject
  @scala.inline
  def `origin-request`: `origin-request` = "origin-request".asInstanceOf[`origin-request`]
  
  @js.native
  sealed trait `origin-response` extends StObject
  @scala.inline
  def `origin-response`: `origin-response` = "origin-response".asInstanceOf[`origin-response`]
  
  @js.native
  sealed trait `read-only` extends StObject
  @scala.inline
  def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  
  @js.native
  sealed trait replace extends StObject
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait text_ extends StObject
  @scala.inline
  def text_ : text_ = "text".asInstanceOf[text_]
  
  @js.native
  sealed trait `viewer-request` extends StObject
  @scala.inline
  def `viewer-request`: `viewer-request` = "viewer-request".asInstanceOf[`viewer-request`]
  
  @js.native
  sealed trait `viewer-response` extends StObject
  @scala.inline
  def `viewer-response`: `viewer-response` = "viewer-response".asInstanceOf[`viewer-response`]
}
