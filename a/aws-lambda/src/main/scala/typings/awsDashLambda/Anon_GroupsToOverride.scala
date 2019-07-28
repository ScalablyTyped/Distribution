package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupsToOverride extends js.Object {
  var groupsToOverride: js.UndefOr[js.Array[String]] = js.undefined
  var iamRolesToOverride: js.UndefOr[js.Array[String]] = js.undefined
  var preferredRole: js.UndefOr[String] = js.undefined
}

object Anon_GroupsToOverride {
  @scala.inline
  def apply(
    groupsToOverride: js.Array[String] = null,
    iamRolesToOverride: js.Array[String] = null,
    preferredRole: String = null
  ): Anon_GroupsToOverride = {
    val __obj = js.Dynamic.literal()
    if (groupsToOverride != null) __obj.updateDynamic("groupsToOverride")(groupsToOverride)
    if (iamRolesToOverride != null) __obj.updateDynamic("iamRolesToOverride")(iamRolesToOverride)
    if (preferredRole != null) __obj.updateDynamic("preferredRole")(preferredRole)
    __obj.asInstanceOf[Anon_GroupsToOverride]
  }
}

