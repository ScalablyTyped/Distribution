package typings.alexaDashSdk

import typings.alexaDashSdk.alexaDashSdkMod.AudioPlayerActivity
import typings.alexaDashSdk.alexaDashSdkMod.CardType
import typings.alexaDashSdk.alexaDashSdkMod.ConfirmationStatuses
import typings.alexaDashSdk.alexaDashSdkMod.DialogStates
import typings.alexaDashSdk.alexaDashSdkMod.DirectiveTypes
import typings.alexaDashSdk.alexaDashSdkMod.ImageSourceSize
import typings.alexaDashSdk.alexaDashSdkMod.ListItemObjectStatus
import typings.alexaDashSdk.alexaDashSdkMod.ListObjectState
import typings.alexaDashSdk.alexaDashSdkMod.MediaErrorType
import typings.alexaDashSdk.alexaDashSdkMod.SystemErrorType
import typings.alexaDashSdk.alexaDashSdkMod.TemplateBackButtonVisibility
import typings.alexaDashSdk.alexaDashSdkMod.TemplateType
import typings.alexaDashSdk.alexaDashSdkMod.TextContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object alexaDashSdkStrings {
  @js.native
  sealed trait AlexaHouseholdListEventDotItemsCreated extends js.Object
  
  @js.native
  sealed trait AlexaHouseholdListEventDotItemsDeleted extends js.Object
  
  @js.native
  sealed trait AlexaHouseholdListEventDotItemsUpdated extends js.Object
  
  @js.native
  sealed trait AlexaHouseholdListEventDotListCreated extends js.Object
  
  @js.native
  sealed trait AlexaHouseholdListEventDotListDeleted extends js.Object
  
  @js.native
  sealed trait AlexaHouseholdListEventDotListUpdated extends js.Object
  
  @js.native
  sealed trait AlexaSkillEventDotSkillAccountLinked extends js.Object
  
  @js.native
  sealed trait AlexaSkillEventDotSkillDisabled extends js.Object
  
  @js.native
  sealed trait AlexaSkillEventDotSkillEnabled extends js.Object
  
  @js.native
  sealed trait AlexaSkillEventDotSkillPermissionAccepted extends js.Object
  
  @js.native
  sealed trait AlexaSkillEventDotSkillPermissionChanged extends js.Object
  
  @js.native
  sealed trait AskForPermissionsConsent extends CardType
  
  @js.native
  sealed trait AudioPlayerDotClearQueue extends DirectiveTypes
  
  @js.native
  sealed trait AudioPlayerDotPlay extends DirectiveTypes
  
  @js.native
  sealed trait AudioPlayerDotPlaybackFinished extends js.Object
  
  @js.native
  sealed trait AudioPlayerDotPlaybackNearlyFinished extends js.Object
  
  @js.native
  sealed trait AudioPlayerDotPlaybackStarted extends js.Object
  
  @js.native
  sealed trait AudioPlayerDotPlaybackStopped extends js.Object
  
  @js.native
  sealed trait AudioPlayerDotStop extends DirectiveTypes
  
  @js.native
  sealed trait BUFFER_UNDERRUN extends AudioPlayerActivity
  
  @js.native
  sealed trait BodyTemplate1 extends TemplateType
  
  @js.native
  sealed trait BodyTemplate2 extends TemplateType
  
  @js.native
  sealed trait BodyTemplate3 extends TemplateType
  
  @js.native
  sealed trait BodyTemplate6 extends TemplateType
  
  @js.native
  sealed trait COMPLETED extends DialogStates
  
  @js.native
  sealed trait CONFIRMED extends ConfirmationStatuses
  
  @js.native
  sealed trait DENIED extends ConfirmationStatuses
  
  @js.native
  sealed trait DEVICE_COMMUNICATION_ERROR extends SystemErrorType
  
  @js.native
  sealed trait DisplayDotRenderTemplate extends DirectiveTypes
  
  @js.native
  sealed trait FINISHED extends AudioPlayerActivity
  
  @js.native
  sealed trait HIDDEN extends TemplateBackButtonVisibility
  
  @js.native
  sealed trait Hint extends DirectiveTypes
  
  @js.native
  sealed trait IDLE extends AudioPlayerActivity
  
  @js.native
  sealed trait INTERNAL_ERROR extends SystemErrorType
  
  @js.native
  sealed trait INVALID_RESPONSE extends SystemErrorType
  
  @js.native
  sealed trait IN_PROGRESS extends DialogStates
  
  @js.native
  sealed trait IntentRequest extends js.Object
  
  @js.native
  sealed trait LARGE extends ImageSourceSize
  
  @js.native
  sealed trait LaunchRequest extends js.Object
  
  @js.native
  sealed trait LinkAccount extends CardType
  
  @js.native
  sealed trait ListTemplate1 extends TemplateType
  
  @js.native
  sealed trait ListTemplate2 extends TemplateType
  
  @js.native
  sealed trait MEDIA_ERROR_INTERNAL_DEVICE_ERROR extends MediaErrorType
  
  @js.native
  sealed trait MEDIA_ERROR_INTERNAL_SERVER_ERROR extends MediaErrorType
  
  @js.native
  sealed trait MEDIA_ERROR_INVALID_REQUEST extends MediaErrorType
  
  @js.native
  sealed trait MEDIA_ERROR_SERVICE_UNAVAILABLE extends MediaErrorType
  
  @js.native
  sealed trait MEDIA_ERROR_UNKNOWN extends MediaErrorType
  
  @js.native
  sealed trait MEDIUM extends ImageSourceSize
  
  @js.native
  sealed trait NONE extends ConfirmationStatuses
  
  @js.native
  sealed trait PAUSED extends AudioPlayerActivity
  
  @js.native
  sealed trait PLAYING extends AudioPlayerActivity
  
  @js.native
  sealed trait PlainText extends TextContentType
  
  @js.native
  sealed trait PlaybackControllerDotNextCommandIssued extends js.Object
  
  @js.native
  sealed trait PlaybackControllerDotPauseCommandIssued extends js.Object
  
  @js.native
  sealed trait PlaybackControllerDotPlayCommandIssued extends js.Object
  
  @js.native
  sealed trait PlaybackControllerDotPreviousCommandIssued extends js.Object
  
  @js.native
  sealed trait RichText extends TextContentType
  
  @js.native
  sealed trait SMALL extends ImageSourceSize
  
  @js.native
  sealed trait SSML extends js.Object
  
  @js.native
  sealed trait STARTED extends DialogStates
  
  @js.native
  sealed trait STOPPED extends AudioPlayerActivity
  
  @js.native
  sealed trait SessionEndedRequest extends js.Object
  
  @js.native
  sealed trait Simple extends CardType
  
  @js.native
  sealed trait Standard extends CardType
  
  @js.native
  sealed trait SystemDotExceptionEncountered extends js.Object
  
  @js.native
  sealed trait VISIBLE extends TemplateBackButtonVisibility
  
  @js.native
  sealed trait VideoAppDotLaunch extends DirectiveTypes
  
  @js.native
  sealed trait X_LARGE extends ImageSourceSize
  
  @js.native
  sealed trait X_SMALL extends ImageSourceSize
  
  @js.native
  sealed trait active
    extends ListItemObjectStatus
       with ListObjectState
  
  @js.native
  sealed trait archived extends ListObjectState
  
  @js.native
  sealed trait completed_ extends ListItemObjectStatus
  
  @scala.inline
  def AlexaHouseholdListEventDotItemsCreated: AlexaHouseholdListEventDotItemsCreated = "AlexaHouseholdListEvent.ItemsCreated".asInstanceOf[AlexaHouseholdListEventDotItemsCreated]
  @scala.inline
  def AlexaHouseholdListEventDotItemsDeleted: AlexaHouseholdListEventDotItemsDeleted = "AlexaHouseholdListEvent.ItemsDeleted".asInstanceOf[AlexaHouseholdListEventDotItemsDeleted]
  @scala.inline
  def AlexaHouseholdListEventDotItemsUpdated: AlexaHouseholdListEventDotItemsUpdated = "AlexaHouseholdListEvent.ItemsUpdated".asInstanceOf[AlexaHouseholdListEventDotItemsUpdated]
  @scala.inline
  def AlexaHouseholdListEventDotListCreated: AlexaHouseholdListEventDotListCreated = "AlexaHouseholdListEvent.ListCreated".asInstanceOf[AlexaHouseholdListEventDotListCreated]
  @scala.inline
  def AlexaHouseholdListEventDotListDeleted: AlexaHouseholdListEventDotListDeleted = "AlexaHouseholdListEvent.ListDeleted".asInstanceOf[AlexaHouseholdListEventDotListDeleted]
  @scala.inline
  def AlexaHouseholdListEventDotListUpdated: AlexaHouseholdListEventDotListUpdated = "AlexaHouseholdListEvent.ListUpdated".asInstanceOf[AlexaHouseholdListEventDotListUpdated]
  @scala.inline
  def AlexaSkillEventDotSkillAccountLinked: AlexaSkillEventDotSkillAccountLinked = "AlexaSkillEvent.SkillAccountLinked".asInstanceOf[AlexaSkillEventDotSkillAccountLinked]
  @scala.inline
  def AlexaSkillEventDotSkillDisabled: AlexaSkillEventDotSkillDisabled = "AlexaSkillEvent.SkillDisabled".asInstanceOf[AlexaSkillEventDotSkillDisabled]
  @scala.inline
  def AlexaSkillEventDotSkillEnabled: AlexaSkillEventDotSkillEnabled = "AlexaSkillEvent.SkillEnabled".asInstanceOf[AlexaSkillEventDotSkillEnabled]
  @scala.inline
  def AlexaSkillEventDotSkillPermissionAccepted: AlexaSkillEventDotSkillPermissionAccepted = "AlexaSkillEvent.SkillPermissionAccepted".asInstanceOf[AlexaSkillEventDotSkillPermissionAccepted]
  @scala.inline
  def AlexaSkillEventDotSkillPermissionChanged: AlexaSkillEventDotSkillPermissionChanged = "AlexaSkillEvent.SkillPermissionChanged".asInstanceOf[AlexaSkillEventDotSkillPermissionChanged]
  @scala.inline
  def AskForPermissionsConsent: AskForPermissionsConsent = "AskForPermissionsConsent".asInstanceOf[AskForPermissionsConsent]
  @scala.inline
  def AudioPlayerDotClearQueue: AudioPlayerDotClearQueue = "AudioPlayer.ClearQueue".asInstanceOf[AudioPlayerDotClearQueue]
  @scala.inline
  def AudioPlayerDotPlay: AudioPlayerDotPlay = "AudioPlayer.Play".asInstanceOf[AudioPlayerDotPlay]
  @scala.inline
  def AudioPlayerDotPlaybackFinished: AudioPlayerDotPlaybackFinished = "AudioPlayer.PlaybackFinished".asInstanceOf[AudioPlayerDotPlaybackFinished]
  @scala.inline
  def AudioPlayerDotPlaybackNearlyFinished: AudioPlayerDotPlaybackNearlyFinished = "AudioPlayer.PlaybackNearlyFinished".asInstanceOf[AudioPlayerDotPlaybackNearlyFinished]
  @scala.inline
  def AudioPlayerDotPlaybackStarted: AudioPlayerDotPlaybackStarted = "AudioPlayer.PlaybackStarted".asInstanceOf[AudioPlayerDotPlaybackStarted]
  @scala.inline
  def AudioPlayerDotPlaybackStopped: AudioPlayerDotPlaybackStopped = "AudioPlayer.PlaybackStopped".asInstanceOf[AudioPlayerDotPlaybackStopped]
  @scala.inline
  def AudioPlayerDotStop: AudioPlayerDotStop = "AudioPlayer.Stop".asInstanceOf[AudioPlayerDotStop]
  @scala.inline
  def BUFFER_UNDERRUN: BUFFER_UNDERRUN = "BUFFER_UNDERRUN".asInstanceOf[BUFFER_UNDERRUN]
  @scala.inline
  def BodyTemplate1: BodyTemplate1 = "BodyTemplate1".asInstanceOf[BodyTemplate1]
  @scala.inline
  def BodyTemplate2: BodyTemplate2 = "BodyTemplate2".asInstanceOf[BodyTemplate2]
  @scala.inline
  def BodyTemplate3: BodyTemplate3 = "BodyTemplate3".asInstanceOf[BodyTemplate3]
  @scala.inline
  def BodyTemplate6: BodyTemplate6 = "BodyTemplate6".asInstanceOf[BodyTemplate6]
  @scala.inline
  def COMPLETED: COMPLETED = "COMPLETED".asInstanceOf[COMPLETED]
  @scala.inline
  def CONFIRMED: CONFIRMED = "CONFIRMED".asInstanceOf[CONFIRMED]
  @scala.inline
  def DENIED: DENIED = "DENIED".asInstanceOf[DENIED]
  @scala.inline
  def DEVICE_COMMUNICATION_ERROR: DEVICE_COMMUNICATION_ERROR = "DEVICE_COMMUNICATION_ERROR".asInstanceOf[DEVICE_COMMUNICATION_ERROR]
  @scala.inline
  def DisplayDotRenderTemplate: DisplayDotRenderTemplate = "Display.RenderTemplate".asInstanceOf[DisplayDotRenderTemplate]
  @scala.inline
  def FINISHED: FINISHED = "FINISHED".asInstanceOf[FINISHED]
  @scala.inline
  def HIDDEN: HIDDEN = "HIDDEN".asInstanceOf[HIDDEN]
  @scala.inline
  def Hint: Hint = "Hint".asInstanceOf[Hint]
  @scala.inline
  def IDLE: IDLE = "IDLE".asInstanceOf[IDLE]
  @scala.inline
  def INTERNAL_ERROR: INTERNAL_ERROR = "INTERNAL_ERROR".asInstanceOf[INTERNAL_ERROR]
  @scala.inline
  def INVALID_RESPONSE: INVALID_RESPONSE = "INVALID_RESPONSE".asInstanceOf[INVALID_RESPONSE]
  @scala.inline
  def IN_PROGRESS: IN_PROGRESS = "IN_PROGRESS".asInstanceOf[IN_PROGRESS]
  @scala.inline
  def IntentRequest: IntentRequest = "IntentRequest".asInstanceOf[IntentRequest]
  @scala.inline
  def LARGE: LARGE = "LARGE".asInstanceOf[LARGE]
  @scala.inline
  def LaunchRequest: LaunchRequest = "LaunchRequest".asInstanceOf[LaunchRequest]
  @scala.inline
  def LinkAccount: LinkAccount = "LinkAccount".asInstanceOf[LinkAccount]
  @scala.inline
  def ListTemplate1: ListTemplate1 = "ListTemplate1".asInstanceOf[ListTemplate1]
  @scala.inline
  def ListTemplate2: ListTemplate2 = "ListTemplate2".asInstanceOf[ListTemplate2]
  @scala.inline
  def MEDIA_ERROR_INTERNAL_DEVICE_ERROR: MEDIA_ERROR_INTERNAL_DEVICE_ERROR = "MEDIA_ERROR_INTERNAL_DEVICE_ERROR".asInstanceOf[MEDIA_ERROR_INTERNAL_DEVICE_ERROR]
  @scala.inline
  def MEDIA_ERROR_INTERNAL_SERVER_ERROR: MEDIA_ERROR_INTERNAL_SERVER_ERROR = "MEDIA_ERROR_INTERNAL_SERVER_ERROR".asInstanceOf[MEDIA_ERROR_INTERNAL_SERVER_ERROR]
  @scala.inline
  def MEDIA_ERROR_INVALID_REQUEST: MEDIA_ERROR_INVALID_REQUEST = "MEDIA_ERROR_INVALID_REQUEST".asInstanceOf[MEDIA_ERROR_INVALID_REQUEST]
  @scala.inline
  def MEDIA_ERROR_SERVICE_UNAVAILABLE: MEDIA_ERROR_SERVICE_UNAVAILABLE = "MEDIA_ERROR_SERVICE_UNAVAILABLE".asInstanceOf[MEDIA_ERROR_SERVICE_UNAVAILABLE]
  @scala.inline
  def MEDIA_ERROR_UNKNOWN: MEDIA_ERROR_UNKNOWN = "MEDIA_ERROR_UNKNOWN".asInstanceOf[MEDIA_ERROR_UNKNOWN]
  @scala.inline
  def MEDIUM: MEDIUM = "MEDIUM".asInstanceOf[MEDIUM]
  @scala.inline
  def NONE: NONE = "NONE".asInstanceOf[NONE]
  @scala.inline
  def PAUSED: PAUSED = "PAUSED".asInstanceOf[PAUSED]
  @scala.inline
  def PLAYING: PLAYING = "PLAYING".asInstanceOf[PLAYING]
  @scala.inline
  def PlainText: PlainText = "PlainText".asInstanceOf[PlainText]
  @scala.inline
  def PlaybackControllerDotNextCommandIssued: PlaybackControllerDotNextCommandIssued = "PlaybackController.NextCommandIssued".asInstanceOf[PlaybackControllerDotNextCommandIssued]
  @scala.inline
  def PlaybackControllerDotPauseCommandIssued: PlaybackControllerDotPauseCommandIssued = "PlaybackController.PauseCommandIssued".asInstanceOf[PlaybackControllerDotPauseCommandIssued]
  @scala.inline
  def PlaybackControllerDotPlayCommandIssued: PlaybackControllerDotPlayCommandIssued = "PlaybackController.PlayCommandIssued".asInstanceOf[PlaybackControllerDotPlayCommandIssued]
  @scala.inline
  def PlaybackControllerDotPreviousCommandIssued: PlaybackControllerDotPreviousCommandIssued = "PlaybackController.PreviousCommandIssued".asInstanceOf[PlaybackControllerDotPreviousCommandIssued]
  @scala.inline
  def RichText: RichText = "RichText".asInstanceOf[RichText]
  @scala.inline
  def SMALL: SMALL = "SMALL".asInstanceOf[SMALL]
  @scala.inline
  def SSML: SSML = "SSML".asInstanceOf[SSML]
  @scala.inline
  def STARTED: STARTED = "STARTED".asInstanceOf[STARTED]
  @scala.inline
  def STOPPED: STOPPED = "STOPPED".asInstanceOf[STOPPED]
  @scala.inline
  def SessionEndedRequest: SessionEndedRequest = "SessionEndedRequest".asInstanceOf[SessionEndedRequest]
  @scala.inline
  def Simple: Simple = "Simple".asInstanceOf[Simple]
  @scala.inline
  def Standard: Standard = "Standard".asInstanceOf[Standard]
  @scala.inline
  def SystemDotExceptionEncountered: SystemDotExceptionEncountered = "System.ExceptionEncountered".asInstanceOf[SystemDotExceptionEncountered]
  @scala.inline
  def VISIBLE: VISIBLE = "VISIBLE".asInstanceOf[VISIBLE]
  @scala.inline
  def VideoAppDotLaunch: VideoAppDotLaunch = "VideoApp.Launch".asInstanceOf[VideoAppDotLaunch]
  @scala.inline
  def X_LARGE: X_LARGE = "X_LARGE".asInstanceOf[X_LARGE]
  @scala.inline
  def X_SMALL: X_SMALL = "X_SMALL".asInstanceOf[X_SMALL]
  @scala.inline
  def active: active = "active".asInstanceOf[active]
  @scala.inline
  def archived: archived = "archived".asInstanceOf[archived]
  @scala.inline
  def completed_ : completed_ = "completed".asInstanceOf[completed_]
}

