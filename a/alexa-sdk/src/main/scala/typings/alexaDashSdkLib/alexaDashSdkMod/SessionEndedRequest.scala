package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionEndedRequest extends Request {
  var reason: js.UndefOr[java.lang.String] = js.undefined
}

object SessionEndedRequest {
  @scala.inline
  def apply(
    requestId: java.lang.String,
    timestamp: java.lang.String,
    `type`: alexaDashSdkLib.alexaDashSdkLibStrings.LaunchRequest | alexaDashSdkLib.alexaDashSdkLibStrings.IntentRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SessionEndedRequest | alexaDashSdkLib.alexaDashSdkLibStrings.SystemDOTExceptionEncountered | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStarted | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackFinished | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackStopped | alexaDashSdkLib.alexaDashSdkLibStrings.AudioPlayerDOTPlaybackNearlyFinished | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTNextCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPauseCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPlayCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.PlaybackControllerDOTPreviousCommandIssued | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillAccountLinked | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillEnabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillDisabled | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionAccepted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaSkillEventDOTSkillPermissionChanged | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTListDeleted | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsCreated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsUpdated | alexaDashSdkLib.alexaDashSdkLibStrings.AlexaHouseholdListEventDOTItemsDeleted,
    locale: java.lang.String = null,
    reason: java.lang.String = null
  ): SessionEndedRequest = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("requestId")(requestId)
    __obj.updateDynamic("timestamp")(timestamp)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (reason != null) __obj.updateDynamic("reason")(reason)
    __obj.asInstanceOf[SessionEndedRequest]
  }
}

