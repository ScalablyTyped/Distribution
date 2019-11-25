package typings.awsDashLambda

import typings.awsDashLambda.awsDashLambdaMod.CodePipelineActionCategory
import typings.awsDashLambda.awsDashLambdaMod.CodePipelineActionState
import typings.awsDashLambda.awsDashLambdaMod.CodePipelineStageState
import typings.awsDashLambda.awsDashLambdaMod.CodePipelineState
import typings.awsDashLambda.awsDashLambdaMod.FirehoseRecordTransformationStatus
import typings.awsDashLambda.awsDashLambdaMod.S3BatchResultResultCode
import typings.awsDashLambda.awsDashLambdaMod._SQSMessageAttributeDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object awsDashLambdaStrings {
  @js.native
  sealed trait `1DOT0` extends js.Object
  
  @js.native
  sealed trait ADMIN_NO_SRP_AUTH extends js.Object
  
  @js.native
  sealed trait AWS extends js.Object
  
  @js.native
  sealed trait Approval extends CodePipelineActionCategory
  
  @js.native
  sealed trait Binary extends _SQSMessageAttributeDataType
  
  @js.native
  sealed trait Build extends CodePipelineActionCategory
  
  @js.native
  sealed trait CANCELED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  
  @js.native
  sealed trait CONFIRMED extends js.Object
  
  @js.native
  sealed trait CUSTOM_CHALLENGE extends js.Object
  
  @js.native
  sealed trait Close extends js.Object
  
  @js.native
  sealed trait `CodePipeline Action Execution State Change` extends js.Object
  
  @js.native
  sealed trait `CodePipeline Pipeline Execution State Change` extends js.Object
  
  @js.native
  sealed trait `CodePipeline Stage Execution State Change` extends js.Object
  
  @js.native
  sealed trait ConfirmIntent extends js.Object
  
  @js.native
  sealed trait Confirmed_ extends js.Object
  
  @js.native
  sealed trait Create extends js.Object
  
  @js.native
  sealed trait CreateAuthChallenge_Authentication extends js.Object
  
  @js.native
  sealed trait Custom extends js.Object
  
  @js.native
  sealed trait CustomMessage_AdminCreateUser extends js.Object
  
  @js.native
  sealed trait CustomMessage_Authentication extends js.Object
  
  @js.native
  sealed trait CustomMessage_ForgotPassword extends js.Object
  
  @js.native
  sealed trait CustomMessage_ResendCode extends js.Object
  
  @js.native
  sealed trait CustomMessage_SignUp extends js.Object
  
  @js.native
  sealed trait CustomMessage_UpdateUserAttribute extends js.Object
  
  @js.native
  sealed trait CustomMessage_VerifyUserAttribute extends js.Object
  
  @js.native
  sealed trait CustomPayload extends js.Object
  
  @js.native
  sealed trait DEVICE_PASSWORD_VERIFIER extends js.Object
  
  @js.native
  sealed trait DEVICE_SRP_AUTH extends js.Object
  
  @js.native
  sealed trait DefineAuthChallenge_Authentication extends js.Object
  
  @js.native
  sealed trait Delegate extends js.Object
  
  @js.native
  sealed trait Delete extends js.Object
  
  @js.native
  sealed trait Denied extends js.Object
  
  @js.native
  sealed trait Deploy extends CodePipelineActionCategory
  
  @js.native
  sealed trait DialogCodeHook extends js.Object
  
  @js.native
  sealed trait Dropped extends FirehoseRecordTransformationStatus
  
  @js.native
  sealed trait EMAIL extends js.Object
  
  @js.native
  sealed trait ElicitIntent extends js.Object
  
  @js.native
  sealed trait ElicitSlot extends js.Object
  
  @js.native
  sealed trait FAILED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  
  @js.native
  sealed trait Failed_ extends js.Object
  
  @js.native
  sealed trait Fulfilled extends js.Object
  
  @js.native
  sealed trait FulfillmentCodeHook extends js.Object
  
  @js.native
  sealed trait INSERT extends js.Object
  
  @js.native
  sealed trait Invoke extends CodePipelineActionCategory
  
  @js.native
  sealed trait KEYS_ONLY extends js.Object
  
  @js.native
  sealed trait KMS extends js.Object
  
  @js.native
  sealed trait MODIFY extends js.Object
  
  @js.native
  sealed trait NEW_AND_OLD_IMAGES extends js.Object
  
  @js.native
  sealed trait NEW_IMAGE extends js.Object
  
  @js.native
  sealed trait None extends js.Object
  
  @js.native
  sealed trait Number extends _SQSMessageAttributeDataType
  
  @js.native
  sealed trait OLD_IMAGE extends js.Object
  
  @js.native
  sealed trait Ok extends FirehoseRecordTransformationStatus
  
  @js.native
  sealed trait PASSWORD_VERIFIER extends js.Object
  
  @js.native
  sealed trait PermanentFailure extends S3BatchResultResultCode
  
  @js.native
  sealed trait PlainText extends js.Object
  
  @js.native
  sealed trait PostAuthentication_Authentication extends js.Object
  
  @js.native
  sealed trait PostConfirmation_ConfirmForgotPassword extends js.Object
  
  @js.native
  sealed trait PostConfirmation_ConfirmSignUp extends js.Object
  
  @js.native
  sealed trait PreAuthentication_Authentication extends js.Object
  
  @js.native
  sealed trait PreSignUp_AdminCreateUser extends js.Object
  
  @js.native
  sealed trait PreSignUp_ExternalProvider extends js.Object
  
  @js.native
  sealed trait PreSignUp_SignUp extends js.Object
  
  @js.native
  sealed trait ProcessingFailed extends FirehoseRecordTransformationStatus
  
  @js.native
  sealed trait REMOVE extends js.Object
  
  @js.native
  sealed trait RESET_REQUIRED extends js.Object
  
  @js.native
  sealed trait RESUMED
    extends CodePipelineStageState
       with CodePipelineState
  
  @js.native
  sealed trait S3 extends js.Object
  
  @js.native
  sealed trait SMS extends js.Object
  
  @js.native
  sealed trait SMS_MFA extends js.Object
  
  @js.native
  sealed trait SSML extends js.Object
  
  @js.native
  sealed trait STARTED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  
  @js.native
  sealed trait SUCCEEDED
    extends CodePipelineActionState
       with CodePipelineStageState
       with CodePipelineState
  
  @js.native
  sealed trait SUCCESS extends js.Object
  
  @js.native
  sealed trait SUPERSEDED extends CodePipelineState
  
  @js.native
  sealed trait SUPPRESS extends js.Object
  
  @js.native
  sealed trait Source extends CodePipelineActionCategory
  
  @js.native
  sealed trait String extends _SQSMessageAttributeDataType
  
  @js.native
  sealed trait Succeeded_ extends S3BatchResultResultCode
  
  @js.native
  sealed trait TemporaryFailure extends S3BatchResultResultCode
  
  @js.native
  sealed trait Test extends CodePipelineActionCategory
  
  @js.native
  sealed trait Text extends js.Object
  
  @js.native
  sealed trait ThirdParty extends js.Object
  
  @js.native
  sealed trait TokenGeneration_AuthenticateDevice extends js.Object
  
  @js.native
  sealed trait TokenGeneration_Authentication extends js.Object
  
  @js.native
  sealed trait TokenGeneration_HostedAuth extends js.Object
  
  @js.native
  sealed trait TokenGeneration_NewPasswordChallenge extends js.Object
  
  @js.native
  sealed trait TokenGeneration_RefreshTokens extends js.Object
  
  @js.native
  sealed trait Update extends js.Object
  
  @js.native
  sealed trait UserMigration_Authentication extends js.Object
  
  @js.native
  sealed trait UserMigration_ForgotPassword extends js.Object
  
  @js.native
  sealed trait VerifyAuthChallengeResponse_Authentication extends js.Object
  
  @js.native
  sealed trait Voice extends js.Object
  
  @js.native
  sealed trait `application/vndDOTamazonawsDOTcardDOTgeneric` extends js.Object
  
  @js.native
  sealed trait awsDOTcodepipeline extends js.Object
  
  @js.native
  sealed trait base64 extends js.Object
  
  @js.native
  sealed trait body extends js.Object
  
  @js.native
  sealed trait clientIp extends js.Object
  
  @js.native
  sealed trait headers extends js.Object
  
  @js.native
  sealed trait http extends js.Object
  
  @js.native
  sealed trait https extends js.Object
  
  @js.native
  sealed trait method extends js.Object
  
  @js.native
  sealed trait none_ extends js.Object
  
  @js.native
  sealed trait origin extends js.Object
  
  @js.native
  sealed trait `origin-access-identity` extends js.Object
  
  @js.native
  sealed trait `origin-request` extends js.Object
  
  @js.native
  sealed trait `origin-response` extends js.Object
  
  @js.native
  sealed trait querystring extends js.Object
  
  @js.native
  sealed trait `read-only` extends js.Object
  
  @js.native
  sealed trait replace extends js.Object
  
  @js.native
  sealed trait text_ extends js.Object
  
  @js.native
  sealed trait uri extends js.Object
  
  @js.native
  sealed trait `viewer-request` extends js.Object
  
  @js.native
  sealed trait `viewer-response` extends js.Object
  
  @scala.inline
  def `1DOT0`: `1DOT0` = "1.0".asInstanceOf[`1DOT0`]
  @scala.inline
  def ADMIN_NO_SRP_AUTH: ADMIN_NO_SRP_AUTH = "ADMIN_NO_SRP_AUTH".asInstanceOf[ADMIN_NO_SRP_AUTH]
  @scala.inline
  def AWS: AWS = "AWS".asInstanceOf[AWS]
  @scala.inline
  def Approval: Approval = "Approval".asInstanceOf[Approval]
  @scala.inline
  def Binary: Binary = "Binary".asInstanceOf[Binary]
  @scala.inline
  def Build: Build = "Build".asInstanceOf[Build]
  @scala.inline
  def CANCELED: CANCELED = "CANCELED".asInstanceOf[CANCELED]
  @scala.inline
  def CONFIRMED: CONFIRMED = "CONFIRMED".asInstanceOf[CONFIRMED]
  @scala.inline
  def CUSTOM_CHALLENGE: CUSTOM_CHALLENGE = "CUSTOM_CHALLENGE".asInstanceOf[CUSTOM_CHALLENGE]
  @scala.inline
  def Close: Close = "Close".asInstanceOf[Close]
  @scala.inline
  def `CodePipeline Action Execution State Change`: `CodePipeline Action Execution State Change` = "CodePipeline Action Execution State Change".asInstanceOf[`CodePipeline Action Execution State Change`]
  @scala.inline
  def `CodePipeline Pipeline Execution State Change`: `CodePipeline Pipeline Execution State Change` = "CodePipeline Pipeline Execution State Change".asInstanceOf[`CodePipeline Pipeline Execution State Change`]
  @scala.inline
  def `CodePipeline Stage Execution State Change`: `CodePipeline Stage Execution State Change` = "CodePipeline Stage Execution State Change".asInstanceOf[`CodePipeline Stage Execution State Change`]
  @scala.inline
  def ConfirmIntent: ConfirmIntent = "ConfirmIntent".asInstanceOf[ConfirmIntent]
  @scala.inline
  def Confirmed_ : Confirmed_ = "Confirmed".asInstanceOf[Confirmed_]
  @scala.inline
  def Create: Create = "Create".asInstanceOf[Create]
  @scala.inline
  def CreateAuthChallenge_Authentication: CreateAuthChallenge_Authentication = "CreateAuthChallenge_Authentication".asInstanceOf[CreateAuthChallenge_Authentication]
  @scala.inline
  def Custom: Custom = "Custom".asInstanceOf[Custom]
  @scala.inline
  def CustomMessage_AdminCreateUser: CustomMessage_AdminCreateUser = "CustomMessage_AdminCreateUser".asInstanceOf[CustomMessage_AdminCreateUser]
  @scala.inline
  def CustomMessage_Authentication: CustomMessage_Authentication = "CustomMessage_Authentication".asInstanceOf[CustomMessage_Authentication]
  @scala.inline
  def CustomMessage_ForgotPassword: CustomMessage_ForgotPassword = "CustomMessage_ForgotPassword".asInstanceOf[CustomMessage_ForgotPassword]
  @scala.inline
  def CustomMessage_ResendCode: CustomMessage_ResendCode = "CustomMessage_ResendCode".asInstanceOf[CustomMessage_ResendCode]
  @scala.inline
  def CustomMessage_SignUp: CustomMessage_SignUp = "CustomMessage_SignUp".asInstanceOf[CustomMessage_SignUp]
  @scala.inline
  def CustomMessage_UpdateUserAttribute: CustomMessage_UpdateUserAttribute = "CustomMessage_UpdateUserAttribute".asInstanceOf[CustomMessage_UpdateUserAttribute]
  @scala.inline
  def CustomMessage_VerifyUserAttribute: CustomMessage_VerifyUserAttribute = "CustomMessage_VerifyUserAttribute".asInstanceOf[CustomMessage_VerifyUserAttribute]
  @scala.inline
  def CustomPayload: CustomPayload = "CustomPayload".asInstanceOf[CustomPayload]
  @scala.inline
  def DEVICE_PASSWORD_VERIFIER: DEVICE_PASSWORD_VERIFIER = "DEVICE_PASSWORD_VERIFIER".asInstanceOf[DEVICE_PASSWORD_VERIFIER]
  @scala.inline
  def DEVICE_SRP_AUTH: DEVICE_SRP_AUTH = "DEVICE_SRP_AUTH".asInstanceOf[DEVICE_SRP_AUTH]
  @scala.inline
  def DefineAuthChallenge_Authentication: DefineAuthChallenge_Authentication = "DefineAuthChallenge_Authentication".asInstanceOf[DefineAuthChallenge_Authentication]
  @scala.inline
  def Delegate: Delegate = "Delegate".asInstanceOf[Delegate]
  @scala.inline
  def Delete: Delete = "Delete".asInstanceOf[Delete]
  @scala.inline
  def Denied: Denied = "Denied".asInstanceOf[Denied]
  @scala.inline
  def Deploy: Deploy = "Deploy".asInstanceOf[Deploy]
  @scala.inline
  def DialogCodeHook: DialogCodeHook = "DialogCodeHook".asInstanceOf[DialogCodeHook]
  @scala.inline
  def Dropped: Dropped = "Dropped".asInstanceOf[Dropped]
  @scala.inline
  def EMAIL: EMAIL = "EMAIL".asInstanceOf[EMAIL]
  @scala.inline
  def ElicitIntent: ElicitIntent = "ElicitIntent".asInstanceOf[ElicitIntent]
  @scala.inline
  def ElicitSlot: ElicitSlot = "ElicitSlot".asInstanceOf[ElicitSlot]
  @scala.inline
  def FAILED: FAILED = "FAILED".asInstanceOf[FAILED]
  @scala.inline
  def Failed_ : Failed_ = "Failed".asInstanceOf[Failed_]
  @scala.inline
  def Fulfilled: Fulfilled = "Fulfilled".asInstanceOf[Fulfilled]
  @scala.inline
  def FulfillmentCodeHook: FulfillmentCodeHook = "FulfillmentCodeHook".asInstanceOf[FulfillmentCodeHook]
  @scala.inline
  def INSERT: INSERT = "INSERT".asInstanceOf[INSERT]
  @scala.inline
  def Invoke: Invoke = "Invoke".asInstanceOf[Invoke]
  @scala.inline
  def KEYS_ONLY: KEYS_ONLY = "KEYS_ONLY".asInstanceOf[KEYS_ONLY]
  @scala.inline
  def KMS: KMS = "KMS".asInstanceOf[KMS]
  @scala.inline
  def MODIFY: MODIFY = "MODIFY".asInstanceOf[MODIFY]
  @scala.inline
  def NEW_AND_OLD_IMAGES: NEW_AND_OLD_IMAGES = "NEW_AND_OLD_IMAGES".asInstanceOf[NEW_AND_OLD_IMAGES]
  @scala.inline
  def NEW_IMAGE: NEW_IMAGE = "NEW_IMAGE".asInstanceOf[NEW_IMAGE]
  @scala.inline
  def None: None = "None".asInstanceOf[None]
  @scala.inline
  def Number: Number = "Number".asInstanceOf[Number]
  @scala.inline
  def OLD_IMAGE: OLD_IMAGE = "OLD_IMAGE".asInstanceOf[OLD_IMAGE]
  @scala.inline
  def Ok: Ok = "Ok".asInstanceOf[Ok]
  @scala.inline
  def PASSWORD_VERIFIER: PASSWORD_VERIFIER = "PASSWORD_VERIFIER".asInstanceOf[PASSWORD_VERIFIER]
  @scala.inline
  def PermanentFailure: PermanentFailure = "PermanentFailure".asInstanceOf[PermanentFailure]
  @scala.inline
  def PlainText: PlainText = "PlainText".asInstanceOf[PlainText]
  @scala.inline
  def PostAuthentication_Authentication: PostAuthentication_Authentication = "PostAuthentication_Authentication".asInstanceOf[PostAuthentication_Authentication]
  @scala.inline
  def PostConfirmation_ConfirmForgotPassword: PostConfirmation_ConfirmForgotPassword = "PostConfirmation_ConfirmForgotPassword".asInstanceOf[PostConfirmation_ConfirmForgotPassword]
  @scala.inline
  def PostConfirmation_ConfirmSignUp: PostConfirmation_ConfirmSignUp = "PostConfirmation_ConfirmSignUp".asInstanceOf[PostConfirmation_ConfirmSignUp]
  @scala.inline
  def PreAuthentication_Authentication: PreAuthentication_Authentication = "PreAuthentication_Authentication".asInstanceOf[PreAuthentication_Authentication]
  @scala.inline
  def PreSignUp_AdminCreateUser: PreSignUp_AdminCreateUser = "PreSignUp_AdminCreateUser".asInstanceOf[PreSignUp_AdminCreateUser]
  @scala.inline
  def PreSignUp_ExternalProvider: PreSignUp_ExternalProvider = "PreSignUp_ExternalProvider".asInstanceOf[PreSignUp_ExternalProvider]
  @scala.inline
  def PreSignUp_SignUp: PreSignUp_SignUp = "PreSignUp_SignUp".asInstanceOf[PreSignUp_SignUp]
  @scala.inline
  def ProcessingFailed: ProcessingFailed = "ProcessingFailed".asInstanceOf[ProcessingFailed]
  @scala.inline
  def REMOVE: REMOVE = "REMOVE".asInstanceOf[REMOVE]
  @scala.inline
  def RESET_REQUIRED: RESET_REQUIRED = "RESET_REQUIRED".asInstanceOf[RESET_REQUIRED]
  @scala.inline
  def RESUMED: RESUMED = "RESUMED".asInstanceOf[RESUMED]
  @scala.inline
  def S3: S3 = "S3".asInstanceOf[S3]
  @scala.inline
  def SMS: SMS = "SMS".asInstanceOf[SMS]
  @scala.inline
  def SMS_MFA: SMS_MFA = "SMS_MFA".asInstanceOf[SMS_MFA]
  @scala.inline
  def SSML: SSML = "SSML".asInstanceOf[SSML]
  @scala.inline
  def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  @scala.inline
  def SUCCEEDED: SUCCEEDED = "SUCCEEDED".asInstanceOf[SUCCEEDED]
  @scala.inline
  def SUCCESS: SUCCESS = "SUCCESS".asInstanceOf[SUCCESS]
  @scala.inline
  def SUPERSEDED: SUPERSEDED = "SUPERSEDED".asInstanceOf[SUPERSEDED]
  @scala.inline
  def SUPPRESS: SUPPRESS = "SUPPRESS".asInstanceOf[SUPPRESS]
  @scala.inline
  def Source: Source = "Source".asInstanceOf[Source]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def Succeeded_ : Succeeded_ = "Succeeded".asInstanceOf[Succeeded_]
  @scala.inline
  def TemporaryFailure: TemporaryFailure = "TemporaryFailure".asInstanceOf[TemporaryFailure]
  @scala.inline
  def Test: Test = "Test".asInstanceOf[Test]
  @scala.inline
  def Text: Text = "Text".asInstanceOf[Text]
  @scala.inline
  def ThirdParty: ThirdParty = "ThirdParty".asInstanceOf[ThirdParty]
  @scala.inline
  def TokenGeneration_AuthenticateDevice: TokenGeneration_AuthenticateDevice = "TokenGeneration_AuthenticateDevice".asInstanceOf[TokenGeneration_AuthenticateDevice]
  @scala.inline
  def TokenGeneration_Authentication: TokenGeneration_Authentication = "TokenGeneration_Authentication".asInstanceOf[TokenGeneration_Authentication]
  @scala.inline
  def TokenGeneration_HostedAuth: TokenGeneration_HostedAuth = "TokenGeneration_HostedAuth".asInstanceOf[TokenGeneration_HostedAuth]
  @scala.inline
  def TokenGeneration_NewPasswordChallenge: TokenGeneration_NewPasswordChallenge = "TokenGeneration_NewPasswordChallenge".asInstanceOf[TokenGeneration_NewPasswordChallenge]
  @scala.inline
  def TokenGeneration_RefreshTokens: TokenGeneration_RefreshTokens = "TokenGeneration_RefreshTokens".asInstanceOf[TokenGeneration_RefreshTokens]
  @scala.inline
  def Update: Update = "Update".asInstanceOf[Update]
  @scala.inline
  def UserMigration_Authentication: UserMigration_Authentication = "UserMigration_Authentication".asInstanceOf[UserMigration_Authentication]
  @scala.inline
  def UserMigration_ForgotPassword: UserMigration_ForgotPassword = "UserMigration_ForgotPassword".asInstanceOf[UserMigration_ForgotPassword]
  @scala.inline
  def VerifyAuthChallengeResponse_Authentication: VerifyAuthChallengeResponse_Authentication = "VerifyAuthChallengeResponse_Authentication".asInstanceOf[VerifyAuthChallengeResponse_Authentication]
  @scala.inline
  def Voice: Voice = "Voice".asInstanceOf[Voice]
  @scala.inline
  def `application/vndDOTamazonawsDOTcardDOTgeneric`: `application/vndDOTamazonawsDOTcardDOTgeneric` = "application/vnd.amazonaws.card.generic".asInstanceOf[`application/vndDOTamazonawsDOTcardDOTgeneric`]
  @scala.inline
  def awsDOTcodepipeline: awsDOTcodepipeline = "aws.codepipeline".asInstanceOf[awsDOTcodepipeline]
  @scala.inline
  def base64: base64 = "base64".asInstanceOf[base64]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def clientIp: clientIp = "clientIp".asInstanceOf[clientIp]
  @scala.inline
  def headers: headers = "headers".asInstanceOf[headers]
  @scala.inline
  def http: http = "http".asInstanceOf[http]
  @scala.inline
  def https: https = "https".asInstanceOf[https]
  @scala.inline
  def method: method = "method".asInstanceOf[method]
  @scala.inline
  def none_ : none_ = "none".asInstanceOf[none_]
  @scala.inline
  def origin: origin = "origin".asInstanceOf[origin]
  @scala.inline
  def `origin-access-identity`: `origin-access-identity` = "origin-access-identity".asInstanceOf[`origin-access-identity`]
  @scala.inline
  def `origin-request`: `origin-request` = "origin-request".asInstanceOf[`origin-request`]
  @scala.inline
  def `origin-response`: `origin-response` = "origin-response".asInstanceOf[`origin-response`]
  @scala.inline
  def querystring: querystring = "querystring".asInstanceOf[querystring]
  @scala.inline
  def `read-only`: `read-only` = "read-only".asInstanceOf[`read-only`]
  @scala.inline
  def replace: replace = "replace".asInstanceOf[replace]
  @scala.inline
  def text_ : text_ = "text".asInstanceOf[text_]
  @scala.inline
  def uri: uri = "uri".asInstanceOf[uri]
  @scala.inline
  def `viewer-request`: `viewer-request` = "viewer-request".asInstanceOf[`viewer-request`]
  @scala.inline
  def `viewer-response`: `viewer-response` = "viewer-response".asInstanceOf[`viewer-response`]
}

