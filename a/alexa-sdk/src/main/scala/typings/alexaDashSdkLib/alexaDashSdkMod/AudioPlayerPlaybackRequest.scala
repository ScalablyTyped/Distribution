package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayerPlaybackRequest extends Request {
  var offsetInMilliseconds: scala.Double
  var token: java.lang.String
}

object AudioPlayerPlaybackRequest {
  @scala.inline
  def apply(
    offsetInMilliseconds: scala.Double,
    requestId: java.lang.String,
    timestamp: java.lang.String,
    token: java.lang.String,
    `type`: alexaDashSdkLib.alexaDashSdkLibStrings.LaunchRequest | alexaDashSdkLib.alexaDashSdkLibStrings.IntentRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SessionEndedRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SystemDOTExceptionEncountered | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStarted | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackFinished | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStopped | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackNearlyFinished | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTNextCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPauseCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPlayCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPreviousCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillAccountLinked | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillEnabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillDisabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionAccepted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionChanged | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListDeleted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsDeleted,
    locale: java.lang.String = null
  ): AudioPlayerPlaybackRequest = {
    val __obj = js.Dynamic.literal(offsetInMilliseconds = offsetInMilliseconds, requestId = requestId, timestamp = timestamp, token = token)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale)
    __obj.asInstanceOf[AudioPlayerPlaybackRequest]
  }
}

