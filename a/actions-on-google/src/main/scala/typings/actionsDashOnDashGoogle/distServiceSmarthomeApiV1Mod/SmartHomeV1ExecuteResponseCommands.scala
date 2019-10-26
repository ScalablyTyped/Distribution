package typings.actionsDashOnDashGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsDashOnDashGoogle.Anon_TypeChallengeType
import typings.actionsDashOnDashGoogle.distCommonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteResponseCommands extends js.Object {
  var challengeNeeded: js.UndefOr[Anon_TypeChallengeType] = js.undefined
  var debugString: js.UndefOr[String] = js.undefined
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.undefined
  var ids: js.Array[String]
  var states: js.UndefOr[ApiClientObjectMap[_]] = js.undefined
  var status: SmartHomeV1ExecuteStatus
}

object SmartHomeV1ExecuteResponseCommands {
  @scala.inline
  def apply(
    ids: js.Array[String],
    status: SmartHomeV1ExecuteStatus,
    challengeNeeded: Anon_TypeChallengeType = null,
    debugString: String = null,
    errorCode: SmartHomeV1ExecuteErrors = null,
    states: ApiClientObjectMap[_] = null
  ): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids, status = status)
    if (challengeNeeded != null) __obj.updateDynamic("challengeNeeded")(challengeNeeded)
    if (debugString != null) __obj.updateDynamic("debugString")(debugString)
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode)
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
}

