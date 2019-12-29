package typings.alexaDashSdk.alexaDashSdkMod

import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsCreated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsDeleted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotItemsUpdated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListCreated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListDeleted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaHouseholdListEventDotListUpdated
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillAccountLinked
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillDisabled
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillEnabled
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillPermissionAccepted
import typings.alexaDashSdk.alexaDashSdkStrings.AlexaSkillEventDotSkillPermissionChanged
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackFinished
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackNearlyFinished
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackStarted
import typings.alexaDashSdk.alexaDashSdkStrings.AudioPlayerDotPlaybackStopped
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotNextCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPauseCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPlayCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.PlaybackControllerDotPreviousCommandIssued
import typings.alexaDashSdk.alexaDashSdkStrings.SystemDotExceptionEncountered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntentRequest extends Request {
  var dialogState: js.UndefOr[DialogStates] = js.undefined
  var intent: js.UndefOr[Intent] = js.undefined
}

object IntentRequest {
  @scala.inline
  def apply(
    requestId: String,
    timestamp: String,
    `type`: typings.alexaDashSdk.alexaDashSdkStrings.LaunchRequest | typings.alexaDashSdk.alexaDashSdkStrings.IntentRequest | typings.alexaDashSdk.alexaDashSdkStrings.SessionEndedRequest | SystemDotExceptionEncountered | AudioPlayerDotPlaybackStarted | AudioPlayerDotPlaybackFinished | AudioPlayerDotPlaybackStopped | AudioPlayerDotPlaybackNearlyFinished | PlaybackControllerDotNextCommandIssued | PlaybackControllerDotPauseCommandIssued | PlaybackControllerDotPlayCommandIssued | PlaybackControllerDotPreviousCommandIssued | AlexaSkillEventDotSkillAccountLinked | AlexaSkillEventDotSkillEnabled | AlexaSkillEventDotSkillDisabled | AlexaSkillEventDotSkillPermissionAccepted | AlexaSkillEventDotSkillPermissionChanged | AlexaHouseholdListEventDotListCreated | AlexaHouseholdListEventDotListUpdated | AlexaHouseholdListEventDotListDeleted | AlexaHouseholdListEventDotItemsCreated | AlexaHouseholdListEventDotItemsUpdated | AlexaHouseholdListEventDotItemsDeleted,
    dialogState: DialogStates = null,
    intent: Intent = null,
    locale: String = null
  ): IntentRequest = {
    val __obj = js.Dynamic.literal(requestId = requestId.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (dialogState != null) __obj.updateDynamic("dialogState")(dialogState.asInstanceOf[js.Any])
    if (intent != null) __obj.updateDynamic("intent")(intent.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentRequest]
  }
}

