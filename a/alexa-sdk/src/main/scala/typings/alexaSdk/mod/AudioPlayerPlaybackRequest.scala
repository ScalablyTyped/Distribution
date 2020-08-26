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

@js.native
trait AudioPlayerPlaybackRequest extends Request {
  var offsetInMilliseconds: Double = js.native
  var token: String = js.native
}

object AudioPlayerPlaybackRequest {
  @scala.inline
  def apply(
    offsetInMilliseconds: Double,
    requestId: String,
    timestamp: String,
    token: String,
    `type`: typings.alexaSdk.alexaSdkStrings.LaunchRequest | typings.alexaSdk.alexaSdkStrings.IntentRequest | typings.alexaSdk.alexaSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted
  ): AudioPlayerPlaybackRequest = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioPlayerPlaybackRequest]
  }
  @scala.inline
  implicit class AudioPlayerPlaybackRequestOps[Self <: AudioPlayerPlaybackRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOffsetInMilliseconds(value: Double): Self = this.set("offsetInMilliseconds", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
  }
  
}

