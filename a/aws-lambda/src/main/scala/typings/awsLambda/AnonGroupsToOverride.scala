package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupsToOverride extends js.Object {
  var groupsToOverride: js.UndefOr[js.Array[String]] = js.undefined
  var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.undefined
  var preferredRole: js.UndefOr[String] = js.undefined
}

object AnonGroupsToOverride {
  @scala.inline
  def apply(
    groupsToOverride: js.Array[String] = null,
    iamRolesToOverride: js.Array[String] = null,
    preferredRole: String = null
  ): AnonGroupsToOverride = {
    val __obj = js.Dynamic.literal()
    if (groupsToOverride != null) __obj.updateDynamic("groupsToOverride")(groupsToOverride.asInstanceOf[js.Any])
    if (iamRolesToOverride != null) __obj.updateDynamic("iamRolesToOverride")(iamRolesToOverride.asInstanceOf[js.Any])
    if (preferredRole != null) __obj.updateDynamic("preferredRole")(preferredRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGroupsToOverride]
  }
}

