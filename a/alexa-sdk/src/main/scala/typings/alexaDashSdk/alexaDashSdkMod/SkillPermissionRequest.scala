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

trait SkillPermissionRequest extends Request {
  var body: SkillPermissionBody
}

object SkillPermissionRequest {
  @scala.inline
  def apply(
    body: SkillPermissionBody,
    requestId: String,
    timestamp: String,
    `type`: typings.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typings.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typings.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDOTExceptionEncountered | AudioPlayerDOTPlaybackStarted | AudioPlayerDOTPlaybackFinished | AudioPlayerDOTPlaybackStopped | AudioPlayerDOTPlaybackNearlyFinished | PlaybackControllerDOTNextCommandIssued | PlaybackControllerDOTPauseCommandIssued | PlaybackControllerDOTPlayCommandIssued | PlaybackControllerDOTPreviousCommandIssued | AlexaSkillEventDOTSkillAccountLinked | AlexaSkillEventDOTSkillEnabled | AlexaSkillEventDOTSkillDisabled | AlexaSkillEventDOTSkillPermissionAccepted | AlexaSkillEventDOTSkillPermissionChanged | AlexaHouseholdListEventDOTListCreated | AlexaHouseholdListEventDOTListUpdated | AlexaHouseholdListEventDOTListDeleted | AlexaHouseholdListEventDOTItemsCreated | AlexaHouseholdListEventDOTItemsUpdated | AlexaHouseholdListEventDOTItemsDeleted,
    locale: String = null
  ): SkillPermissionRequest = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[SkillPermissionRequest]
  }
}

