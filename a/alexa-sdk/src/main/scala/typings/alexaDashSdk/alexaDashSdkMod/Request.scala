package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsCreated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsDeleted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTItemsUpdated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListCreated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListDeleted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDOTListUpdated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillAccountLinked
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillDisabled
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillEnabled
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillPermissionAccepted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDOTSkillPermissionChanged
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackFinished
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackNearlyFinished
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackStarted
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDOTPlaybackStopped
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTNextCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPauseCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPlayCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDOTPreviousCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.SystemDOTExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var locale: js.UndefOr[String] = js.undefined
  var requestId: String
  var timestamp: String
  var `type`: typings.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typings.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typings.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDOTExceptionEncountered | AudioPlayerDOTPlaybackStarted | AudioPlayerDOTPlaybackFinished | AudioPlayerDOTPlaybackStopped | AudioPlayerDOTPlaybackNearlyFinished | PlaybackControllerDOTNextCommandIssued | PlaybackControllerDOTPauseCommandIssued | PlaybackControllerDOTPlayCommandIssued | PlaybackControllerDOTPreviousCommandIssued | AlexaSkillEventDOTSkillAccountLinked | AlexaSkillEventDOTSkillEnabled | AlexaSkillEventDOTSkillDisabled | AlexaSkillEventDOTSkillPermissionAccepted | AlexaSkillEventDOTSkillPermissionChanged | AlexaHouseholdListEventDOTListCreated | AlexaHouseholdListEventDOTListUpdated | AlexaHouseholdListEventDOTListDeleted | AlexaHouseholdListEventDOTItemsCreated | AlexaHouseholdListEventDOTItemsUpdated | AlexaHouseholdListEventDOTItemsDeleted
}

object Request {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typings.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typings.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typings.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDOTExceptionEncountered | AudioPlayerDOTPlaybackStarted | AudioPlayerDOTPlaybackFinished | AudioPlayerDOTPlaybackStopped | AudioPlayerDOTPlaybackNearlyFinished | PlaybackControllerDOTNextCommandIssued | PlaybackControllerDOTPauseCommandIssued | PlaybackControllerDOTPlayCommandIssued | PlaybackControllerDOTPreviousCommandIssued | AlexaSkillEventDOTSkillAccountLinked | AlexaSkillEventDOTSkillEnabled | AlexaSkillEventDOTSkillDisabled | AlexaSkillEventDOTSkillPermissionAccepted | AlexaSkillEventDOTSkillPermissionChanged | AlexaHouseholdListEventDOTListCreated | AlexaHouseholdListEventDOTListUpdated | AlexaHouseholdListEventDOTListDeleted | AlexaHouseholdListEventDOTItemsCreated | AlexaHouseholdListEventDOTItemsUpdated | AlexaHouseholdListEventDOTItemsDeleted,
    locale: String = null
  ): Request = {
    val __obj = js.Dynamic.literal(requestId = requestId, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Request]
  }
}

