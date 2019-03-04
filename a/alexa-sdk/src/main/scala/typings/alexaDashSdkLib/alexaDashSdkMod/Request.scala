package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var requestId: java.lang.String
  var timestamp: java.lang.String
  var `type`: alexaDashSdkLib.alexaDashSdkLibStrings.LaunchRequest | alexaDashSdkLib.alexaDashSdkLibStrings.IntentRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SessionEndedRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SystemDOTExceptionEncountered | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStarted | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackFinished | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStopped | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackNearlyFinished | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTNextCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPauseCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPlayCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPreviousCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillAccountLinked | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillEnabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillDisabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionAccepted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionChanged | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListDeleted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsDeleted
}

object Request {
  @scala.inline
  def apply(
    requestId: java.lang.String,
    timestamp: java.lang.String,
    `type`: alexaDashSdkLib.alexaDashSdkLibStrings.LaunchRequest | alexaDashSdkLib.alexaDashSdkLibStrings.IntentRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SessionEndedRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SystemDOTExceptionEncountered | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStarted | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackFinished | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStopped | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackNearlyFinished | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTNextCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPauseCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPlayCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPreviousCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillAccountLinked | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillEnabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillDisabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionAccepted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionChanged | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListDeleted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsDeleted,
    locale: java.lang.String = null
  ): Request = {
    val __obj = js.Dynamic.literal(requestId = requestId, timestamp = timestamp)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[Request]
  }
}

