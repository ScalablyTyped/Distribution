package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.TypeChallengeType
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartHomeV1ExecuteResponseCommands extends js.Object {
  var challengeNeeded: js.UndefOr[TypeChallengeType] = js.undefined
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
    challengeNeeded: TypeChallengeType = null,
    debugString: String = null,
    errorCode: SmartHomeV1ExecuteErrors = null,
    states: ApiClientObjectMap[_] = null
  ): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (challengeNeeded != null) __obj.updateDynamic("challengeNeeded")(challengeNeeded.asInstanceOf[js.Any])
    if (debugString != null) __obj.updateDynamic("debugString")(debugString.asInstanceOf[js.Any])
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
}

