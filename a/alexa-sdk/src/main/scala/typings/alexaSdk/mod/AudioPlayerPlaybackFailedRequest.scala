package typings.alexaSdk.mod

import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsCreated
import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsDeleted
import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotItemsUpdated
import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListCreated
import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListDeleted
import typings.alexaSdk.alexaSdkStrings.AlexaHouseholdListEventDotListUpdated
import typings.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillAccountLinked
import typings.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillDisabled
import typings.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillEnabled
import typings.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionAccepted
import typings.alexaSdk.alexaSdkStrings.AlexaSkillEventDotSkillPermissionChanged
import typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackFinished
import typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackNearlyFinished
import typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStarted
import typings.alexaSdk.alexaSdkStrings.AudioPlayerDotPlaybackStopped
import typings.alexaSdk.alexaSdkStrings.PlaybackControllerDotNextCommandIssued
import typings.alexaSdk.alexaSdkStrings.PlaybackControllerDotPauseCommandIssued
import typings.alexaSdk.alexaSdkStrings.PlaybackControllerDotPlayCommandIssued
import typings.alexaSdk.alexaSdkStrings.PlaybackControllerDotPreviousCommandIssued
import typings.alexaSdk.alexaSdkStrings.SystemDotExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayerPlaybackFailedRequest extends Request {
  var currentPlaybackState: AudioPlayer
  var error: MediaError
  var token: String
}

object AudioPlayerPlaybackFailedRequest {
  @scala.inline
  def apply(
    currentPlaybackState: AudioPlayer,
    error: MediaError,
    requestId: String,
    timestamp: String,
    token: String,
    `type`: typings.alexaSdk.alexaSdkStrings.LaunchRequest | typings.alexaSdk.alexaSdkStrings.IntentRequest | typings.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    locale: String = null
  ): AudioPlayerPlaybackFailedRequest = {
    val __obj = js.Dynamic.literal(currentPlaybackState = currentPlaybackState.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerPlaybackFailedRequest]
  }
}

