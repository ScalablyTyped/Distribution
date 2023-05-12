package typings.awsLambda

import typings.awsLambda.triggerAutoscalingMod.AutoScalingInstanceMarketOption
import typings.awsLambda.triggerAutoscalingMod.AutoScalingScaleInCause
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildCacheType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildEnvironmentComputeType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildEnvironmentPullCredentialsType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildEnvironmentType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildEnvironmentVariableType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildPhaseStatusType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildPhaseType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildSourceLocationType
import typings.awsLambda.triggerCodebuildCloudwatchStateMod.CodeBuildStateType
import typings.awsLambda.triggerCodepipelineCloudwatchActionMod.CodePipelineActionCategory
import typings.awsLambda.triggerCodepipelineCloudwatchActionMod.CodePipelineActionState
import typings.awsLambda.triggerCodepipelineCloudwatchPipelineMod.CodePipelineState
import typings.awsLambda.triggerCodepipelineCloudwatchStageMod.CodePipelineStageState
import typings.awsLambda.triggerCognitoUserPoolTriggerCommonMod.ChallengeName
import typings.awsLambda.triggerCognitoUserPoolTriggerCustomEmailSenderMod.AccountTakeOverActionType
import typings.awsLambda.triggerCognitoUserPoolTriggerUserMigrationMod.UserStatus
import typings.awsLambda.triggerConnectContactFlowMod.ConnectContactFlowChannel
import typings.awsLambda.triggerConnectContactFlowMod.ConnectContactFlowInitiationMethod
import typings.awsLambda.triggerKinesisFirehoseTransformationMod.FirehoseRecordTransformationStatus
import typings.awsLambda.triggerLexV2Mod.LexV2IntentState
import typings.awsLambda.triggerS3BatchMod.S3BatchResultResultCode
import typings.awsLambda.triggerSecretsmanagerMod.SecretsManagerRotationEventStep
import typings.awsLambda.triggerSqsMod._SQSMessageAttributeDataType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object awsLambdaStrings {
  
  @js.native
  sealed trait `0` extends StObject
  inline def `0`: `0` = "0".asInstanceOf[`0`]
  
  @js.native
  sealed trait `1Dot0` extends StObject
  inline def `1Dot0`: `1Dot0` = "1.0".asInstanceOf[`1Dot0`]
  
  @js.native
  sealed trait ADMIN_NO_SRP_AUTH
    extends StObject
       with ChallengeName
  inline def ADMIN_NO_SRP_AUTH: ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[ADMIN_NO_SRP_AUTH]
  
  @js.native
  sealed trait API
    extends StObject
       with ConnectContactFlowInitiationMethod
  inline def API: API = "API".asInstanceOf[API]
  
  @js.native
  sealed trait ARCHIVED
    extends StObject
       with UserStatus
  inline def ARCHIVED: ARCHIVED = "ARCHIVED".asInstanceOf[ARCHIVED]
  
  @js.native
  sealed trait ARCHIVE_ACCESS extends StObject
  inline def ARCHIVE_ACCESS: ARCHIVE_ACCESS = "ARCHIVE_ACCESS".asInstanceOf[ARCHIVE_ACCESS]
  
  @js.native
  sealed trait ARM_CONTAINER
    extends StObject
       with CodeBuildEnvironmentType
  inline def ARM_CONTAINER: ARM_CONTAINER = "ARM_CONTAINER".asInstanceOf[ARM_CONTAINER]
  
  @js.native
  sealed trait AWS extends StObject
  inline def AWS: AWS = "AWS".asInstanceOf[AWS]
  
  @js.native
  sealed trait Approval
    extends StObject
       with CodePipelineActionCategory
  inline def Approval: Approval = "Approval".asInstanceOf[Approval]
  
  @js.native
  sealed trait BITBUCKET
    extends StObject
       with CodeBuildSourceLocationType
  inline def BITBUCKET: BITBUCKET = "BITBUCKET".asInstanceOf[BITBUCKET]
  
  @js.native
  sealed trait BLOCK
    extends StObject
       with AccountTakeOverActionType
  inline def BLOCK: BLOCK = "BLOCK".asInstanceOf[BLOCK]
  
  @js.native
  sealed trait BUILD
    extends StObject
       with CodeBuildPhaseType
  inline def BUILD: BUILD = "BUILD".asInstanceOf[BUILD]
  
  @js.native
  sealed trait BUILD_GENERAL1_2XLARGE
    extends StObject
       with CodeBuildEnvironmentComputeType
  inline def BUILD_GENERAL1_2XLARGE: BUILD_GENERAL1_2XLARGE = "BUILD_GENERAL1_2XLARGE".asInstanceOf[BUILD_GENERAL1_2XLARGE]
  
  @js.native
  sealed trait BUILD_GENERAL1_LARGE
    extends StObject
       with CodeBuildEnvironmentComputeType
  inline def BUILD_GENERAL1_LARGE: BUILD_GENERAL1_LARGE = "BUILD_GENERAL1_LARGE".asInstanceOf[BUILD_GENERAL1_LARGE]
  
  @js.native
  sealed trait BUILD_GENERAL1_MEDIUM
    extends StObject
       with CodeBuildEnvironmentComputeType
  inline def BUILD_GENERAL1_MEDIUM: BUILD_GENERAL1_MEDIUM = "BUILD_GENERAL1_MEDIUM".asInstanceOf[BUILD_GENERAL1_MEDIUM]
  
  @js.native
  sealed trait BUILD_GENERAL1_SMALL
    extends StObject
       with CodeBuildEnvironmentComputeType
  inline def BUILD_GENERAL1_SMALL: BUILD_GENERAL1_SMALL = "BUILD_GENERAL1_SMALL".asInstanceOf[BUILD_GENERAL1_SMALL]
  
  @js.native
  sealed trait Binary
    extends StObject
       with _SQSMessageAttributeDataType
  inline def Binary: Binary = "Binary".asInstanceOf[Binary]
  
  @js.native
  sealed trait Bounce extends StObject
  inline def Bounce: Bounce = "Bounce".asInstanceOf[Bounce]
  
  @js.native
  sealed trait Build_
    extends StObject
       with CodePipelineActionCategory
  inline def Build_ : Build_ = "Build".asInstanceOf[Build_]
  
  @js.native
  sealed trait CALLBACK
    extends StObject
       with ConnectContactFlowInitiationMethod
  inline def CALLBACK: CALLBACK = "CALLBACK".asInstanceOf[CALLBACK]
  
  @js.native
  sealed trait CANCELED
    extends StObject
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  inline def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  
  @js.native
  sealed trait CHAT
    extends StObject
       with ConnectContactFlowChannel
  inline def CHAT: CHAT = "CHAT".asInstanceOf[CHAT]
  
  @js.native
  sealed trait CLIENT_ERROR
    extends StObject
       with CodeBuildPhaseStatusType
  inline def CLIENT_ERROR: CLIENT_ERROR = "CLIENT_ERROR".asInstanceOf[CLIENT_ERROR]
  
  @js.native
  sealed trait CODEBUILD
    extends StObject
       with CodeBuildEnvironmentPullCredentialsType
  inline def CODEBUILD: CODEBUILD = "CODEBUILD".asInstanceOf[CODEBUILD]
  
  @js.native
  sealed trait CODECOMMIT
    extends StObject
       with CodeBuildSourceLocationType
  inline def CODECOMMIT: CODECOMMIT = "CODECOMMIT".asInstanceOf[CODECOMMIT]
  
  @js.native
  sealed trait CODEPIPELINE
    extends StObject
       with CodeBuildSourceLocationType
  inline def CODEPIPELINE: CODEPIPELINE = "CODEPIPELINE".asInstanceOf[CODEPIPELINE]
  
  @js.native
  sealed trait COMPLETED
    extends StObject
       with CodeBuildPhaseType
  inline def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  
  @js.native
  sealed trait COMPROMISED
    extends StObject
       with UserStatus
  inline def COMPROMISED: COMPROMISED = "COMPROMISED".asInstanceOf[COMPROMISED]
  
  @js.native
  sealed trait CONFIRMED
    extends StObject
       with UserStatus
  inline def CONFIRMED: CONFIRMED = "CONFIRMED".asInstanceOf[CONFIRMED]
  
  @js.native
  sealed trait CONNECT extends StObject
  inline def CONNECT: CONNECT = "CONNECT".asInstanceOf[CONNECT]
  
  @js.native
  sealed trait CREATE_TIME extends StObject
  inline def CREATE_TIME: CREATE_TIME = "CREATE_TIME".asInstanceOf[CREATE_TIME]
  
  @js.native
  sealed trait CUSTOM_CHALLENGE extends StObject
  inline def CUSTOM_CHALLENGE: CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE".asInstanceOf[CUSTOM_CHALLENGE]
  
  @js.native
  sealed trait Close extends StObject
  inline def Close: Close = "Close".asInstanceOf[Close]
  
  @js.native
  sealed trait `CodeBuild Build State Change` extends StObject
  inline def `CodeBuild Build State Change`: `CodeBuild Build State Change` = ("CodeBuild Build State Change").asInstanceOf[`CodeBuild Build State Change`]
  
  @js.native
  sealed trait `CodePipeline Action Execution State Change` extends StObject
  inline def `CodePipeline Action Execution State Change`: `CodePipeline Action Execution State Change` = ("CodePipeline Action Execution State Change").asInstanceOf[`CodePipeline Action Execution State Change`]
  
  @js.native
  sealed trait `CodePipeline Pipeline Execution State Change` extends StObject
  inline def `CodePipeline Pipeline Execution State Change`: `CodePipeline Pipeline Execution State Change` = ("CodePipeline Pipeline Execution State Change").asInstanceOf[`CodePipeline Pipeline Execution State Change`]
  
  @js.native
  sealed trait `CodePipeline Stage Execution State Change` extends StObject
  inline def `CodePipeline Stage Execution State Change`: `CodePipeline Stage Execution State Change` = ("CodePipeline Stage Execution State Change").asInstanceOf[`CodePipeline Stage Execution State Change`]
  
  @js.native
  sealed trait CompleteMultipartUpload extends StObject
  inline def CompleteMultipartUpload: CompleteMultipartUpload = "CompleteMultipartUpload".asInstanceOf[CompleteMultipartUpload]
  
  @js.native
  sealed trait ConfirmIntent extends StObject
  inline def ConfirmIntent: ConfirmIntent = "ConfirmIntent".asInstanceOf[ConfirmIntent]
  
  @js.native
  sealed trait Confirmed_ extends StObject
  inline def Confirmed_ : Confirmed_ = "Confirmed".asInstanceOf[Confirmed_]
  
  @js.native
  sealed trait ContactFlowEvent extends StObject
  inline def ContactFlowEvent: ContactFlowEvent = "ContactFlowEvent".asInstanceOf[ContactFlowEvent]
  
  @js.native
  sealed trait CopyObject extends StObject
  inline def CopyObject: CopyObject = "CopyObject".asInstanceOf[CopyObject]
  
  @js.native
  sealed trait Create extends StObject
  inline def Create: Create = "Create".asInstanceOf[Create]
  
  @js.native
  sealed trait CreateAuthChallenge_Authentication extends StObject
  inline def CreateAuthChallenge_Authentication: CreateAuthChallenge_Authentication = "CreateAuthChallenge_Authentication".asInstanceOf[CreateAuthChallenge_Authentication]
  
  @js.native
  sealed trait Custom extends StObject
  inline def Custom: Custom = "Custom".asInstanceOf[Custom]
  
  @js.native
  sealed trait CustomEmailSender_AccountTakeOverNotification extends StObject
  inline def CustomEmailSender_AccountTakeOverNotification: CustomEmailSender_AccountTakeOverNotification = "CustomEmailSender_AccountTakeOverNotification".asInstanceOf[CustomEmailSender_AccountTakeOverNotification]
  
  @js.native
  sealed trait CustomEmailSender_AdminCreateUser extends StObject
  inline def CustomEmailSender_AdminCreateUser: CustomEmailSender_AdminCreateUser = "CustomEmailSender_AdminCreateUser".asInstanceOf[CustomEmailSender_AdminCreateUser]
  
  @js.native
  sealed trait CustomEmailSender_ForgotPassword extends StObject
  inline def CustomEmailSender_ForgotPassword: CustomEmailSender_ForgotPassword = "CustomEmailSender_ForgotPassword".asInstanceOf[CustomEmailSender_ForgotPassword]
  
  @js.native
  sealed trait CustomEmailSender_ResendCode extends StObject
  inline def CustomEmailSender_ResendCode: CustomEmailSender_ResendCode = "CustomEmailSender_ResendCode".asInstanceOf[CustomEmailSender_ResendCode]
  
  @js.native
  sealed trait CustomEmailSender_SignUp extends StObject
  inline def CustomEmailSender_SignUp: CustomEmailSender_SignUp = "CustomEmailSender_SignUp".asInstanceOf[CustomEmailSender_SignUp]
  
  @js.native
  sealed trait CustomEmailSender_UpdateUserAttribute extends StObject
  inline def CustomEmailSender_UpdateUserAttribute: CustomEmailSender_UpdateUserAttribute = "CustomEmailSender_UpdateUserAttribute".asInstanceOf[CustomEmailSender_UpdateUserAttribute]
  
  @js.native
  sealed trait CustomEmailSender_VerifyUserAttribute extends StObject
  inline def CustomEmailSender_VerifyUserAttribute: CustomEmailSender_VerifyUserAttribute = "CustomEmailSender_VerifyUserAttribute".asInstanceOf[CustomEmailSender_VerifyUserAttribute]
  
  @js.native
  sealed trait CustomMessage_AdminCreateUser extends StObject
  inline def CustomMessage_AdminCreateUser: CustomMessage_AdminCreateUser = "CustomMessage_AdminCreateUser".asInstanceOf[CustomMessage_AdminCreateUser]
  
  @js.native
  sealed trait CustomMessage_Authentication extends StObject
  inline def CustomMessage_Authentication: CustomMessage_Authentication = "CustomMessage_Authentication".asInstanceOf[CustomMessage_Authentication]
  
  @js.native
  sealed trait CustomMessage_ForgotPassword extends StObject
  inline def CustomMessage_ForgotPassword: CustomMessage_ForgotPassword = "CustomMessage_ForgotPassword".asInstanceOf[CustomMessage_ForgotPassword]
  
  @js.native
  sealed trait CustomMessage_ResendCode extends StObject
  inline def CustomMessage_ResendCode: CustomMessage_ResendCode = "CustomMessage_ResendCode".asInstanceOf[CustomMessage_ResendCode]
  
  @js.native
  sealed trait CustomMessage_SignUp extends StObject
  inline def CustomMessage_SignUp: CustomMessage_SignUp = "CustomMessage_SignUp".asInstanceOf[CustomMessage_SignUp]
  
  @js.native
  sealed trait CustomMessage_UpdateUserAttribute extends StObject
  inline def CustomMessage_UpdateUserAttribute: CustomMessage_UpdateUserAttribute = "CustomMessage_UpdateUserAttribute".asInstanceOf[CustomMessage_UpdateUserAttribute]
  
  @js.native
  sealed trait CustomMessage_VerifyUserAttribute extends StObject
  inline def CustomMessage_VerifyUserAttribute: CustomMessage_VerifyUserAttribute = "CustomMessage_VerifyUserAttribute".asInstanceOf[CustomMessage_VerifyUserAttribute]
  
  @js.native
  sealed trait CustomPayload extends StObject
  inline def CustomPayload: CustomPayload = "CustomPayload".asInstanceOf[CustomPayload]
  
  @js.native
  sealed trait CustomSMSSender_AdminCreateUser extends StObject
  inline def CustomSMSSender_AdminCreateUser: CustomSMSSender_AdminCreateUser = "CustomSMSSender_AdminCreateUser".asInstanceOf[CustomSMSSender_AdminCreateUser]
  
  @js.native
  sealed trait CustomSMSSender_Authentication extends StObject
  inline def CustomSMSSender_Authentication: CustomSMSSender_Authentication = "CustomSMSSender_Authentication".asInstanceOf[CustomSMSSender_Authentication]
  
  @js.native
  sealed trait CustomSMSSender_ForgotPassword extends StObject
  inline def CustomSMSSender_ForgotPassword: CustomSMSSender_ForgotPassword = "CustomSMSSender_ForgotPassword".asInstanceOf[CustomSMSSender_ForgotPassword]
  
  @js.native
  sealed trait CustomSMSSender_ResendCode extends StObject
  inline def CustomSMSSender_ResendCode: CustomSMSSender_ResendCode = "CustomSMSSender_ResendCode".asInstanceOf[CustomSMSSender_ResendCode]
  
  @js.native
  sealed trait CustomSMSSender_SignUp extends StObject
  inline def CustomSMSSender_SignUp: CustomSMSSender_SignUp = "CustomSMSSender_SignUp".asInstanceOf[CustomSMSSender_SignUp]
  
  @js.native
  sealed trait CustomSMSSender_UpdateUserAttribute extends StObject
  inline def CustomSMSSender_UpdateUserAttribute: CustomSMSSender_UpdateUserAttribute = "CustomSMSSender_UpdateUserAttribute".asInstanceOf[CustomSMSSender_UpdateUserAttribute]
  
  @js.native
  sealed trait CustomSMSSender_VerifyUserAttribute extends StObject
  inline def CustomSMSSender_VerifyUserAttribute: CustomSMSSender_VerifyUserAttribute = "CustomSMSSender_VerifyUserAttribute".asInstanceOf[CustomSMSSender_VerifyUserAttribute]
  
  @js.native
  sealed trait DEEP_ARCHIVE extends StObject
  inline def DEEP_ARCHIVE: DEEP_ARCHIVE = "DEEP_ARCHIVE".asInstanceOf[DEEP_ARCHIVE]
  
  @js.native
  sealed trait DEEP_ARCHIVE_ACCESS extends StObject
  inline def DEEP_ARCHIVE_ACCESS: DEEP_ARCHIVE_ACCESS = "DEEP_ARCHIVE_ACCESS".asInstanceOf[DEEP_ARCHIVE_ACCESS]
  
  @js.native
  sealed trait DEVICE_PASSWORD_VERIFIER
    extends StObject
       with ChallengeName
  inline def DEVICE_PASSWORD_VERIFIER: DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[DEVICE_PASSWORD_VERIFIER]
  
  @js.native
  sealed trait DEVICE_SRP_AUTH
    extends StObject
       with ChallengeName
  inline def DEVICE_SRP_AUTH: DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[DEVICE_SRP_AUTH]
  
  @js.native
  sealed trait DISABLED extends StObject
  inline def DISABLED: DISABLED = "DISABLED".asInstanceOf[DISABLED]
  
  @js.native
  sealed trait DISCONNECT extends StObject
  inline def DISCONNECT: DISCONNECT = "DISCONNECT".asInstanceOf[DISCONNECT]
  
  @js.native
  sealed trait DOWNLOAD_SOURCE
    extends StObject
       with CodeBuildPhaseType
  inline def DOWNLOAD_SOURCE: DOWNLOAD_SOURCE = "DOWNLOAD_SOURCE".asInstanceOf[DOWNLOAD_SOURCE]
  
  @js.native
  sealed trait DTMF extends StObject
  inline def DTMF: DTMF = "DTMF".asInstanceOf[DTMF]
  
  @js.native
  sealed trait Default extends StObject
  inline def Default: Default = "Default".asInstanceOf[Default]
  
  @js.native
  sealed trait DefineAuthChallenge_Authentication extends StObject
  inline def DefineAuthChallenge_Authentication: DefineAuthChallenge_Authentication = "DefineAuthChallenge_Authentication".asInstanceOf[DefineAuthChallenge_Authentication]
  
  @js.native
  sealed trait Delegate extends StObject
  inline def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  
  @js.native
  sealed trait Delete extends StObject
  inline def Delete: Delete = "Delete".asInstanceOf[Delete]
  
  @js.native
  sealed trait `Delete Marker Created` extends StObject
  inline def `Delete Marker Created`: `Delete Marker Created` = ("Delete Marker Created").asInstanceOf[`Delete Marker Created`]
  
  @js.native
  sealed trait DeleteObject extends StObject
  inline def DeleteObject: DeleteObject = "DeleteObject".asInstanceOf[DeleteObject]
  
  @js.native
  sealed trait Denied extends StObject
  inline def Denied: Denied = "Denied".asInstanceOf[Denied]
  
  @js.native
  sealed trait Deploy
    extends StObject
       with CodePipelineActionCategory
  inline def Deploy: Deploy = "Deploy".asInstanceOf[Deploy]
  
  @js.native
  sealed trait DialogCodeHook extends StObject
  inline def DialogCodeHook: DialogCodeHook = "DialogCodeHook".asInstanceOf[DialogCodeHook]
  
  @js.native
  sealed trait Dropped
    extends StObject
       with FirehoseRecordTransformationStatus
  inline def Dropped: Dropped = "Dropped".asInstanceOf[Dropped]
  
  @js.native
  sealed trait EMAIL extends StObject
  inline def EMAIL: EMAIL = "EMAIL".asInstanceOf[EMAIL]
  
  @js.native
  sealed trait ElicitIntent extends StObject
  inline def ElicitIntent: ElicitIntent = "ElicitIntent".asInstanceOf[ElicitIntent]
  
  @js.native
  sealed trait ElicitSlot extends StObject
  inline def ElicitSlot: ElicitSlot = "ElicitSlot".asInstanceOf[ElicitSlot]
  
  @js.native
  sealed trait FAIL extends StObject
  inline def FAIL: FAIL = "FAIL".asInstanceOf[FAIL]
  
  @js.native
  sealed trait FAILED
    extends StObject
       with CodeBuildPhaseStatusType
       with CodeBuildStateType
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  inline def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  
  @js.native
  sealed trait FAULT
    extends StObject
       with CodeBuildPhaseStatusType
  inline def FAULT: FAULT = "FAULT".asInstanceOf[FAULT]
  
  @js.native
  sealed trait FINALIZING
    extends StObject
       with CodeBuildPhaseType
  inline def FINALIZING: FINALIZING = "FINALIZING".asInstanceOf[FINALIZING]
  
  @js.native
  sealed trait FORCE_CHANGE_PASSWORD
    extends StObject
       with UserStatus
  inline def FORCE_CHANGE_PASSWORD: FORCE_CHANGE_PASSWORD = "FORCE_CHANGE_PASSWORD".asInstanceOf[FORCE_CHANGE_PASSWORD]
  
  @js.native
  sealed trait Failed_
    extends StObject
       with LexV2IntentState
  inline def Failed_ : Failed_ = "Failed".asInstanceOf[Failed_]
  
  @js.native
  sealed trait Fulfilled
    extends StObject
       with LexV2IntentState
  inline def Fulfilled: Fulfilled = "Fulfilled".asInstanceOf[Fulfilled]
  
  @js.native
  sealed trait FulfillmentCodeHook extends StObject
  inline def FulfillmentCodeHook: FulfillmentCodeHook = "FulfillmentCodeHook".asInstanceOf[FulfillmentCodeHook]
  
  @js.native
  sealed trait FulfillmentInProgress
    extends StObject
       with LexV2IntentState
  inline def FulfillmentInProgress: FulfillmentInProgress = "FulfillmentInProgress".asInstanceOf[FulfillmentInProgress]
  
  @js.native
  sealed trait GITHUB
    extends StObject
       with CodeBuildSourceLocationType
  inline def GITHUB: GITHUB = "GITHUB".asInstanceOf[GITHUB]
  
  @js.native
  sealed trait GITHUB_ENTERPRISE
    extends StObject
       with CodeBuildSourceLocationType
  inline def GITHUB_ENTERPRISE: GITHUB_ENTERPRISE = "GITHUB_ENTERPRISE".asInstanceOf[GITHUB_ENTERPRISE]
  
  @js.native
  sealed trait GLACIER extends StObject
  inline def GLACIER: GLACIER = "GLACIER".asInstanceOf[GLACIER]
  
  @js.native
  sealed trait GLACIER_IR extends StObject
  inline def GLACIER_IR: GLACIER_IR = "GLACIER_IR".asInstanceOf[GLACIER_IR]
  
  @js.native
  sealed trait GRAY extends StObject
  inline def GRAY: GRAY = "GRAY".asInstanceOf[GRAY]
  
  @js.native
  sealed trait IN extends StObject
  inline def IN: IN = "IN".asInstanceOf[IN]
  
  @js.native
  sealed trait INBOUND
    extends StObject
       with ConnectContactFlowInitiationMethod
  inline def INBOUND: INBOUND = "INBOUND".asInstanceOf[INBOUND]
  
  @js.native
  sealed trait INSERT extends StObject
  inline def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  
  @js.native
  sealed trait INSTALL
    extends StObject
       with CodeBuildPhaseType
  inline def INSTALL: INSTALL = "INSTALL".asInstanceOf[INSTALL]
  
  @js.native
  sealed trait INSTANCE_REFRESH
    extends StObject
       with AutoScalingScaleInCause
  inline def INSTANCE_REFRESH: INSTANCE_REFRESH = "INSTANCE_REFRESH".asInstanceOf[INSTANCE_REFRESH]
  
  @js.native
  sealed trait INTELLIGENT_TIERING extends StObject
  inline def INTELLIGENT_TIERING: INTELLIGENT_TIERING = "INTELLIGENT_TIERING".asInstanceOf[INTELLIGENT_TIERING]
  
  @js.native
  sealed trait IN_PROGRESS
    extends StObject
       with CodeBuildStateType
  inline def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  
  @js.native
  sealed trait ImageResponseCard extends StObject
  inline def ImageResponseCard: ImageResponseCard = "ImageResponseCard".asInstanceOf[ImageResponseCard]
  
  @js.native
  sealed trait InProgress
    extends StObject
       with LexV2IntentState
  inline def InProgress: InProgress = "InProgress".asInstanceOf[InProgress]
  
  @js.native
  sealed trait Invoke
    extends StObject
       with CodePipelineActionCategory
  inline def Invoke: Invoke = "Invoke".asInstanceOf[Invoke]
  
  @js.native
  sealed trait KEYS_ONLY extends StObject
  inline def KEYS_ONLY: KEYS_ONLY = "KEYS_ONLY".asInstanceOf[KEYS_ONLY]
  
  @js.native
  sealed trait LINUX_CONTAINER
    extends StObject
       with CodeBuildEnvironmentType
  inline def LINUX_CONTAINER: LINUX_CONTAINER = "LINUX_CONTAINER".asInstanceOf[LINUX_CONTAINER]
  
  @js.native
  sealed trait LINUX_GPU_CONTAINER
    extends StObject
       with CodeBuildEnvironmentType
  inline def LINUX_GPU_CONTAINER: LINUX_GPU_CONTAINER = "LINUX_GPU_CONTAINER".asInstanceOf[LINUX_GPU_CONTAINER]
  
  @js.native
  sealed trait LOCAL
    extends StObject
       with CodeBuildCacheType
  inline def LOCAL: LOCAL = "LOCAL".asInstanceOf[LOCAL]
  
  @js.native
  sealed trait LOG_APPEND_TIME extends StObject
  inline def LOG_APPEND_TIME: LOG_APPEND_TIME = "LOG_APPEND_TIME".asInstanceOf[LOG_APPEND_TIME]
  
  @js.native
  sealed trait Lambda extends StObject
  inline def Lambda: Lambda = "Lambda".asInstanceOf[Lambda]
  
  @js.native
  sealed trait `Lifecycle Expiration` extends StObject
  inline def `Lifecycle Expiration`: `Lifecycle Expiration` = ("Lifecycle Expiration").asInstanceOf[`Lifecycle Expiration`]
  
  @js.native
  sealed trait List extends StObject
  inline def List: List = "List".asInstanceOf[List]
  
  @js.native
  sealed trait MAX_INSTANCE_LIFETIME
    extends StObject
       with AutoScalingScaleInCause
  inline def MAX_INSTANCE_LIFETIME: MAX_INSTANCE_LIFETIME = "MAX_INSTANCE_LIFETIME".asInstanceOf[MAX_INSTANCE_LIFETIME]
  
  @js.native
  sealed trait MESSAGE extends StObject
  inline def MESSAGE: MESSAGE = "MESSAGE".asInstanceOf[MESSAGE]
  
  @js.native
  sealed trait MFA
    extends StObject
       with AccountTakeOverActionType
  inline def MFA: MFA = "MFA".asInstanceOf[MFA]
  
  @js.native
  sealed trait MFA_IF_CONFIGURED
    extends StObject
       with AccountTakeOverActionType
  inline def MFA_IF_CONFIGURED: MFA_IF_CONFIGURED = "MFA_IF_CONFIGURED".asInstanceOf[MFA_IF_CONFIGURED]
  
  @js.native
  sealed trait MFA_REQUIRED
    extends StObject
       with AccountTakeOverActionType
  inline def MFA_REQUIRED: MFA_REQUIRED = "MFA_REQUIRED".asInstanceOf[MFA_REQUIRED]
  
  @js.native
  sealed trait MODIFY extends StObject
  inline def MODIFY: MODIFY = "MODIFY".asInstanceOf[MODIFY]
  
  @js.native
  sealed trait NEW_AND_OLD_IMAGES extends StObject
  inline def NEW_AND_OLD_IMAGES: NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[NEW_AND_OLD_IMAGES]
  
  @js.native
  sealed trait NEW_IMAGE extends StObject
  inline def NEW_IMAGE: NEW_IMAGE = "NEW_IMAGE".asInstanceOf[NEW_IMAGE]
  
  @js.native
  sealed trait NO_ACTION
    extends StObject
       with AccountTakeOverActionType
  inline def NO_ACTION: NO_ACTION = "NO_ACTION".asInstanceOf[NO_ACTION]
  
  @js.native
  sealed trait NO_CACHE
    extends StObject
       with CodeBuildCacheType
  inline def NO_CACHE: NO_CACHE = "NO_CACHE".asInstanceOf[NO_CACHE]
  
  @js.native
  sealed trait NO_SOURCE
    extends StObject
       with CodeBuildSourceLocationType
  inline def NO_SOURCE: NO_SOURCE = "NO_SOURCE".asInstanceOf[NO_SOURCE]
  
  @js.native
  sealed trait None extends StObject
  inline def None: None = "None".asInstanceOf[None]
  
  @js.native
  sealed trait Number
    extends StObject
       with _SQSMessageAttributeDataType
  inline def Number: Number = "Number".asInstanceOf[Number]
  
  @js.native
  sealed trait OLD_IMAGE extends StObject
  inline def OLD_IMAGE: OLD_IMAGE = "OLD_IMAGE".asInstanceOf[OLD_IMAGE]
  
  @js.native
  sealed trait ONEZONE_IA extends StObject
  inline def ONEZONE_IA: ONEZONE_IA = "ONEZONE_IA".asInstanceOf[ONEZONE_IA]
  
  @js.native
  sealed trait OUTBOUND
    extends StObject
       with ConnectContactFlowInitiationMethod
  inline def OUTBOUND: OUTBOUND = "OUTBOUND".asInstanceOf[OUTBOUND]
  
  @js.native
  sealed trait OUTPOSTS extends StObject
  inline def OUTPOSTS: OUTPOSTS = "OUTPOSTS".asInstanceOf[OUTPOSTS]
  
  @js.native
  sealed trait `Object ACL Updated` extends StObject
  inline def `Object ACL Updated`: `Object ACL Updated` = ("Object ACL Updated").asInstanceOf[`Object ACL Updated`]
  
  @js.native
  sealed trait `Object Access Tier Changed` extends StObject
  inline def `Object Access Tier Changed`: `Object Access Tier Changed` = ("Object Access Tier Changed").asInstanceOf[`Object Access Tier Changed`]
  
  @js.native
  sealed trait `Object Created` extends StObject
  inline def `Object Created`: `Object Created` = ("Object Created").asInstanceOf[`Object Created`]
  
  @js.native
  sealed trait `Object Deleted` extends StObject
  inline def `Object Deleted`: `Object Deleted` = ("Object Deleted").asInstanceOf[`Object Deleted`]
  
  @js.native
  sealed trait `Object Restore Completed` extends StObject
  inline def `Object Restore Completed`: `Object Restore Completed` = ("Object Restore Completed").asInstanceOf[`Object Restore Completed`]
  
  @js.native
  sealed trait `Object Restore Expired` extends StObject
  inline def `Object Restore Expired`: `Object Restore Expired` = ("Object Restore Expired").asInstanceOf[`Object Restore Expired`]
  
  @js.native
  sealed trait `Object Restore Initiated` extends StObject
  inline def `Object Restore Initiated`: `Object Restore Initiated` = ("Object Restore Initiated").asInstanceOf[`Object Restore Initiated`]
  
  @js.native
  sealed trait `Object Storage Class Changed` extends StObject
  inline def `Object Storage Class Changed`: `Object Storage Class Changed` = ("Object Storage Class Changed").asInstanceOf[`Object Storage Class Changed`]
  
  @js.native
  sealed trait `Object Tags Added` extends StObject
  inline def `Object Tags Added`: `Object Tags Added` = ("Object Tags Added").asInstanceOf[`Object Tags Added`]
  
  @js.native
  sealed trait `Object Tags Deleted` extends StObject
  inline def `Object Tags Deleted`: `Object Tags Deleted` = ("Object Tags Deleted").asInstanceOf[`Object Tags Deleted`]
  
  @js.native
  sealed trait Ok
    extends StObject
       with FirehoseRecordTransformationStatus
  inline def Ok: Ok = "Ok".asInstanceOf[Ok]
  
  @js.native
  sealed trait PARAMETER_STORE
    extends StObject
       with CodeBuildEnvironmentVariableType
  inline def PARAMETER_STORE: PARAMETER_STORE = "PARAMETER_STORE".asInstanceOf[PARAMETER_STORE]
  
  @js.native
  sealed trait PASS extends StObject
  inline def PASS: PASS = "PASS".asInstanceOf[PASS]
  
  @js.native
  sealed trait PASSWORD_VERIFIER
    extends StObject
       with ChallengeName
  inline def PASSWORD_VERIFIER: PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[PASSWORD_VERIFIER]
  
  @js.native
  sealed trait PLAINTEXT
    extends StObject
       with CodeBuildEnvironmentVariableType
  inline def PLAINTEXT: PLAINTEXT = "PLAINTEXT".asInstanceOf[PLAINTEXT]
  
  @js.native
  sealed trait `POST Object` extends StObject
  inline def `POST Object`: `POST Object` = ("POST Object").asInstanceOf[`POST Object`]
  
  @js.native
  sealed trait POST_BUILD
    extends StObject
       with CodeBuildPhaseType
  inline def POST_BUILD: POST_BUILD = "POST_BUILD".asInstanceOf[POST_BUILD]
  
  @js.native
  sealed trait PRE_BUILD
    extends StObject
       with CodeBuildPhaseType
  inline def PRE_BUILD: PRE_BUILD = "PRE_BUILD".asInstanceOf[PRE_BUILD]
  
  @js.native
  sealed trait PROCESSING_FAILED extends StObject
  inline def PROCESSING_FAILED: PROCESSING_FAILED = "PROCESSING_FAILED".asInstanceOf[PROCESSING_FAILED]
  
  @js.native
  sealed trait PROVISIONING
    extends StObject
       with CodeBuildPhaseType
  inline def PROVISIONING: PROVISIONING = "PROVISIONING".asInstanceOf[PROVISIONING]
  
  @js.native
  sealed trait PermanentFailure
    extends StObject
       with S3BatchResultResultCode
  inline def PermanentFailure: PermanentFailure = "PermanentFailure".asInstanceOf[PermanentFailure]
  
  @js.native
  sealed trait `Permanently Deleted` extends StObject
  inline def `Permanently Deleted`: `Permanently Deleted` = ("Permanently Deleted").asInstanceOf[`Permanently Deleted`]
  
  @js.native
  sealed trait PlainText_ extends StObject
  inline def PlainText_ : PlainText_ = "PlainText".asInstanceOf[PlainText_]
  
  @js.native
  sealed trait PostAuthentication_Authentication extends StObject
  inline def PostAuthentication_Authentication: PostAuthentication_Authentication = "PostAuthentication_Authentication".asInstanceOf[PostAuthentication_Authentication]
  
  @js.native
  sealed trait PostConfirmation_ConfirmForgotPassword extends StObject
  inline def PostConfirmation_ConfirmForgotPassword: PostConfirmation_ConfirmForgotPassword = "PostConfirmation_ConfirmForgotPassword".asInstanceOf[PostConfirmation_ConfirmForgotPassword]
  
  @js.native
  sealed trait PostConfirmation_ConfirmSignUp extends StObject
  inline def PostConfirmation_ConfirmSignUp: PostConfirmation_ConfirmSignUp = "PostConfirmation_ConfirmSignUp".asInstanceOf[PostConfirmation_ConfirmSignUp]
  
  @js.native
  sealed trait PreAuthentication_Authentication extends StObject
  inline def PreAuthentication_Authentication: PreAuthentication_Authentication = "PreAuthentication_Authentication".asInstanceOf[PreAuthentication_Authentication]
  
  @js.native
  sealed trait PreSignUp_AdminCreateUser extends StObject
  inline def PreSignUp_AdminCreateUser: PreSignUp_AdminCreateUser = "PreSignUp_AdminCreateUser".asInstanceOf[PreSignUp_AdminCreateUser]
  
  @js.native
  sealed trait PreSignUp_ExternalProvider extends StObject
  inline def PreSignUp_ExternalProvider: PreSignUp_ExternalProvider = "PreSignUp_ExternalProvider".asInstanceOf[PreSignUp_ExternalProvider]
  
  @js.native
  sealed trait PreSignUp_SignUp extends StObject
  inline def PreSignUp_SignUp: PreSignUp_SignUp = "PreSignUp_SignUp".asInstanceOf[PreSignUp_SignUp]
  
  @js.native
  sealed trait ProcessingFailed
    extends StObject
       with FirehoseRecordTransformationStatus
  inline def ProcessingFailed: ProcessingFailed = "ProcessingFailed".asInstanceOf[ProcessingFailed]
  
  @js.native
  sealed trait PutObject extends StObject
  inline def PutObject: PutObject = "PutObject".asInstanceOf[PutObject]
  
  @js.native
  sealed trait QUEUED
    extends StObject
       with CodeBuildPhaseType
  inline def QUEUED: QUEUED = "QUEUED".asInstanceOf[QUEUED]
  
  @js.native
  sealed trait REBALANCE
    extends StObject
       with AutoScalingScaleInCause
  inline def REBALANCE: REBALANCE = "REBALANCE".asInstanceOf[REBALANCE]
  
  @js.native
  sealed trait REDUCED_REDUNDANCY extends StObject
  inline def REDUCED_REDUNDANCY: REDUCED_REDUNDANCY = "REDUCED_REDUNDANCY".asInstanceOf[REDUCED_REDUNDANCY]
  
  @js.native
  sealed trait REMOVE extends StObject
  inline def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  
  @js.native
  sealed trait REQUEST extends StObject
  inline def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait RESEND extends StObject
  inline def RESEND: RESEND = "RESEND".asInstanceOf[RESEND]
  
  @js.native
  sealed trait RESET_REQUIRED
    extends StObject
       with UserStatus
  inline def RESET_REQUIRED: RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[RESET_REQUIRED]
  
  @js.native
  sealed trait RESUMED
    extends StObject
       with CodePipelineStageState
       with CodePipelineState
  inline def RESUMED: RESUMED = "RESUMED".asInstanceOf[RESUMED]
  
  @js.native
  sealed trait ReadyForFulfillment
    extends StObject
       with LexV2IntentState
  inline def ReadyForFulfillment: ReadyForFulfillment = "ReadyForFulfillment".asInstanceOf[ReadyForFulfillment]
  
  @js.native
  sealed trait S3
    extends StObject
       with CodeBuildCacheType
       with CodeBuildSourceLocationType
  inline def S3: S3 = "S3".asInstanceOf[S3]
  
  @js.native
  sealed trait SCALE_IN
    extends StObject
       with AutoScalingScaleInCause
  inline def SCALE_IN: SCALE_IN = "SCALE_IN".asInstanceOf[SCALE_IN]
  
  @js.native
  sealed trait SECRETS_MANAGER
    extends StObject
       with CodeBuildEnvironmentVariableType
  inline def SECRETS_MANAGER: SECRETS_MANAGER = "SECRETS_MANAGER".asInstanceOf[SECRETS_MANAGER]
  
  @js.native
  sealed trait SERVICE_ROLE
    extends StObject
       with CodeBuildEnvironmentPullCredentialsType
  inline def SERVICE_ROLE: SERVICE_ROLE = "SERVICE_ROLE".asInstanceOf[SERVICE_ROLE]
  
  @js.native
  sealed trait SMS extends StObject
  inline def SMS: SMS = "SMS".asInstanceOf[SMS]
  
  @js.native
  sealed trait SMS_MFA
    extends StObject
       with ChallengeName
  inline def SMS_MFA: SMS_MFA = "SMS_MFA".asInstanceOf[SMS_MFA]
  
  @js.native
  sealed trait SNS extends StObject
  inline def SNS: SNS = "SNS".asInstanceOf[SNS]
  
  @js.native
  sealed trait SRP_A
    extends StObject
       with ChallengeName
  inline def SRP_A: SRP_A = "SRP_A".asInstanceOf[SRP_A]
  
  @js.native
  sealed trait SSML extends StObject
  inline def SSML: SSML = "SSML".asInstanceOf[SSML]
  
  @js.native
  sealed trait STANDARD extends StObject
  inline def STANDARD: STANDARD = "STANDARD".asInstanceOf[STANDARD]
  
  @js.native
  sealed trait STANDARD_IA extends StObject
  inline def STANDARD_IA: STANDARD_IA = "STANDARD_IA".asInstanceOf[STANDARD_IA]
  
  @js.native
  sealed trait STARTED
    extends StObject
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  inline def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  
  @js.native
  sealed trait STOPPED
    extends StObject
       with CodeBuildPhaseStatusType
       with CodeBuildStateType
  inline def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  
  @js.native
  sealed trait SUBMITTED
    extends StObject
       with CodeBuildPhaseType
  inline def SUBMITTED: SUBMITTED = "SUBMITTED".asInstanceOf[SUBMITTED]
  
  @js.native
  sealed trait SUCCEEDED
    extends StObject
       with CodeBuildPhaseStatusType
       with CodeBuildStateType
       with CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  inline def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  
  @js.native
  sealed trait SUCCESS extends StObject
  inline def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  
  @js.native
  sealed trait SUPERSEDED
    extends StObject
       with CodePipelineState
  inline def SUPERSEDED: SUPERSEDED = "SUPERSEDED".asInstanceOf[SUPERSEDED]
  
  @js.native
  sealed trait SUPPRESS extends StObject
  inline def SUPPRESS: SUPPRESS = "SUPPRESS".asInstanceOf[SUPPRESS]
  
  @js.native
  sealed trait Scalar extends StObject
  inline def Scalar: Scalar = "Scalar".asInstanceOf[Scalar]
  
  @js.native
  sealed trait `Scheduled Event` extends StObject
  inline def `Scheduled Event`: `Scheduled Event` = ("Scheduled Event").asInstanceOf[`Scheduled Event`]
  
  @js.native
  sealed trait SelfManagedKafka extends StObject
  inline def SelfManagedKafka: SelfManagedKafka = "SelfManagedKafka".asInstanceOf[SelfManagedKafka]
  
  @js.native
  sealed trait Source
    extends StObject
       with CodePipelineActionCategory
  inline def Source: Source = "Source".asInstanceOf[Source]
  
  @js.native
  sealed trait Speech extends StObject
  inline def Speech: Speech = "Speech".asInstanceOf[Speech]
  
  @js.native
  sealed trait SpellByLetter extends StObject
  inline def SpellByLetter: SpellByLetter = "SpellByLetter".asInstanceOf[SpellByLetter]
  
  @js.native
  sealed trait SpellByWord extends StObject
  inline def SpellByWord: SpellByWord = "SpellByWord".asInstanceOf[SpellByWord]
  
  @js.native
  sealed trait Stop extends StObject
  inline def Stop: Stop = "Stop".asInstanceOf[Stop]
  
  @js.native
  sealed trait String
    extends StObject
       with _SQSMessageAttributeDataType
  inline def String: String = "String".asInstanceOf[String]
  
  @js.native
  sealed trait Succeeded_
    extends StObject
       with S3BatchResultResultCode
  inline def Succeeded_ : Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
  
  @js.native
  sealed trait TELEPHONE_NUMBER extends StObject
  inline def TELEPHONE_NUMBER: TELEPHONE_NUMBER = "TELEPHONE_NUMBER".asInstanceOf[TELEPHONE_NUMBER]
  
  @js.native
  sealed trait TIMED_OUT
    extends StObject
       with CodeBuildPhaseStatusType
  inline def TIMED_OUT: TIMED_OUT = "TIMED_OUT".asInstanceOf[TIMED_OUT]
  
  @js.native
  sealed trait TOKEN extends StObject
  inline def TOKEN: TOKEN = "TOKEN".asInstanceOf[TOKEN]
  
  @js.native
  sealed trait TRANSFER
    extends StObject
       with ConnectContactFlowInitiationMethod
  inline def TRANSFER: TRANSFER = "TRANSFER".asInstanceOf[TRANSFER]
  
  @js.native
  sealed trait TemporaryFailure
    extends StObject
       with S3BatchResultResultCode
  inline def TemporaryFailure: TemporaryFailure = "TemporaryFailure".asInstanceOf[TemporaryFailure]
  
  @js.native
  sealed trait Test
    extends StObject
       with CodePipelineActionCategory
  inline def Test: Test = "Test".asInstanceOf[Test]
  
  @js.native
  sealed trait Text extends StObject
  inline def Text: Text = "Text".asInstanceOf[Text]
  
  @js.native
  sealed trait ThirdParty extends StObject
  inline def ThirdParty: ThirdParty = "ThirdParty".asInstanceOf[ThirdParty]
  
  @js.native
  sealed trait TokenGeneration_AuthenticateDevice extends StObject
  inline def TokenGeneration_AuthenticateDevice: TokenGeneration_AuthenticateDevice = "TokenGeneration_AuthenticateDevice".asInstanceOf[TokenGeneration_AuthenticateDevice]
  
  @js.native
  sealed trait TokenGeneration_Authentication extends StObject
  inline def TokenGeneration_Authentication: TokenGeneration_Authentication = "TokenGeneration_Authentication".asInstanceOf[TokenGeneration_Authentication]
  
  @js.native
  sealed trait TokenGeneration_HostedAuth extends StObject
  inline def TokenGeneration_HostedAuth: TokenGeneration_HostedAuth = "TokenGeneration_HostedAuth".asInstanceOf[TokenGeneration_HostedAuth]
  
  @js.native
  sealed trait TokenGeneration_NewPasswordChallenge extends StObject
  inline def TokenGeneration_NewPasswordChallenge: TokenGeneration_NewPasswordChallenge = "TokenGeneration_NewPasswordChallenge".asInstanceOf[TokenGeneration_NewPasswordChallenge]
  
  @js.native
  sealed trait TokenGeneration_RefreshTokens extends StObject
  inline def TokenGeneration_RefreshTokens: TokenGeneration_RefreshTokens = "TokenGeneration_RefreshTokens".asInstanceOf[TokenGeneration_RefreshTokens]
  
  @js.native
  sealed trait UNCONFIRMED
    extends StObject
       with UserStatus
  inline def UNCONFIRMED: UNCONFIRMED = "UNCONFIRMED".asInstanceOf[UNCONFIRMED]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with UserStatus
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UPLOAD_ARTIFACTS
    extends StObject
       with CodeBuildPhaseType
  inline def UPLOAD_ARTIFACTS: UPLOAD_ARTIFACTS = "UPLOAD_ARTIFACTS".asInstanceOf[UPLOAD_ARTIFACTS]
  
  @js.native
  sealed trait Update extends StObject
  inline def Update: Update = "Update".asInstanceOf[Update]
  
  @js.native
  sealed trait UserMigration_Authentication extends StObject
  inline def UserMigration_Authentication: UserMigration_Authentication = "UserMigration_Authentication".asInstanceOf[UserMigration_Authentication]
  
  @js.native
  sealed trait UserMigration_ForgotPassword extends StObject
  inline def UserMigration_ForgotPassword: UserMigration_ForgotPassword = "UserMigration_ForgotPassword".asInstanceOf[UserMigration_ForgotPassword]
  
  @js.native
  sealed trait VOICE
    extends StObject
       with ConnectContactFlowChannel
  inline def VOICE: VOICE = "VOICE".asInstanceOf[VOICE]
  
  @js.native
  sealed trait VerifyAuthChallengeResponse_Authentication extends StObject
  inline def VerifyAuthChallengeResponse_Authentication: VerifyAuthChallengeResponse_Authentication = "VerifyAuthChallengeResponse_Authentication".asInstanceOf[VerifyAuthChallengeResponse_Authentication]
  
  @js.native
  sealed trait Voice_ extends StObject
  inline def Voice_ : Voice_ = "Voice".asInstanceOf[Voice_]
  
  @js.native
  sealed trait WINDOWS_CONTAINER
    extends StObject
       with CodeBuildEnvironmentType
  inline def WINDOWS_CONTAINER: WINDOWS_CONTAINER = "WINDOWS_CONTAINER".asInstanceOf[WINDOWS_CONTAINER]
  
  @js.native
  sealed trait Waiting
    extends StObject
       with LexV2IntentState
  inline def Waiting: Waiting = "Waiting".asInstanceOf[Waiting]
  
  @js.native
  sealed trait WorkMail extends StObject
  inline def WorkMail: WorkMail = "WorkMail".asInstanceOf[WorkMail]
  
  @js.native
  sealed trait applicationSlashvndDotamazonawsDotcardDotgeneric extends StObject
  inline def applicationSlashvndDotamazonawsDotcardDotgeneric: applicationSlashvndDotamazonawsDotcardDotgeneric = "application/vnd.amazonaws.card.generic".asInstanceOf[applicationSlashvndDotamazonawsDotcardDotgeneric]
  
  @js.native
  sealed trait awsColonkafka extends StObject
  inline def awsColonkafka: awsColonkafka = "aws:kafka".asInstanceOf[awsColonkafka]
  
  @js.native
  sealed trait awsDotcodebuild extends StObject
  inline def awsDotcodebuild: awsDotcodebuild = "aws.codebuild".asInstanceOf[awsDotcodebuild]
  
  @js.native
  sealed trait awsDotcodepipeline extends StObject
  inline def awsDotcodepipeline: awsDotcodepipeline = "aws.codepipeline".asInstanceOf[awsDotcodepipeline]
  
  @js.native
  sealed trait awsDots3 extends StObject
  inline def awsDots3: awsDots3 = "aws.s3".asInstanceOf[awsDots3]
  
  @js.native
  sealed trait base64 extends StObject
  inline def base64: base64 = "base64".asInstanceOf[base64]
  
  @js.native
  sealed trait createSecret
    extends StObject
       with SecretsManagerRotationEventStep
  inline def createSecret: createSecret = "createSecret".asInstanceOf[createSecret]
  
  @js.native
  sealed trait finishSecret
    extends StObject
       with SecretsManagerRotationEventStep
  inline def finishSecret: finishSecret = "finishSecret".asInstanceOf[finishSecret]
  
  @js.native
  sealed trait http extends StObject
  inline def http: http = "http".asInstanceOf[http]
  
  @js.native
  sealed trait https extends StObject
  inline def https: https = "https".asInstanceOf[https]
  
  @js.native
  sealed trait none_ extends StObject
  inline def none_ : none_ = "none".asInstanceOf[none_]
  
  @js.native
  sealed trait `on-demand`
    extends StObject
       with AutoScalingInstanceMarketOption
  inline def `on-demand`: `on-demand` = "on-demand".asInstanceOf[`on-demand`]
  
  @js.native
  sealed trait `origin-access-identity` extends StObject
  inline def `origin-access-identity`: `origin-access-identity` = "origin-access-identity".asInstanceOf[`origin-access-identity`]
  
  @js.native
  sealed trait `origin-request` extends StObject
  inline def `origin-request`: `origin-request` = "origin-request".asInstanceOf[`origin-request`]
  
  @js.native
  sealed trait `origin-response` extends StObject
  inline def `origin-response`: `origin-response` = "origin-response".asInstanceOf[`origin-response`]
  
  @js.native
  sealed trait quarantine extends StObject
  inline def quarantine: quarantine = "quarantine".asInstanceOf[quarantine]
  
  @js.native
  sealed trait `read-only` extends StObject
  inline def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  
  @js.native
  sealed trait reject extends StObject
  inline def reject: reject = "reject".asInstanceOf[reject]
  
  @js.native
  sealed trait replace extends StObject
  inline def replace: replace = "replace".asInstanceOf[replace]
  
  @js.native
  sealed trait s3DotamazonawsDotcom extends StObject
  inline def s3DotamazonawsDotcom: s3DotamazonawsDotcom = "s3.amazonaws.com".asInstanceOf[s3DotamazonawsDotcom]
  
  @js.native
  sealed trait setSecret
    extends StObject
       with SecretsManagerRotationEventStep
  inline def setSecret: setSecret = "setSecret".asInstanceOf[setSecret]
  
  @js.native
  sealed trait spot
    extends StObject
       with AutoScalingInstanceMarketOption
  inline def spot: spot = "spot".asInstanceOf[spot]
  
  @js.native
  sealed trait testSecret
    extends StObject
       with SecretsManagerRotationEventStep
  inline def testSecret: testSecret = "testSecret".asInstanceOf[testSecret]
  
  @js.native
  sealed trait text_ extends StObject
  inline def text_ : text_ = "text".asInstanceOf[text_]
  
  @js.native
  sealed trait `viewer-request` extends StObject
  inline def `viewer-request`: `viewer-request` = "viewer-request".asInstanceOf[`viewer-request`]
  
  @js.native
  sealed trait `viewer-response` extends StObject
  inline def `viewer-response`: `viewer-response` = "viewer-response".asInstanceOf[`viewer-response`]
}
