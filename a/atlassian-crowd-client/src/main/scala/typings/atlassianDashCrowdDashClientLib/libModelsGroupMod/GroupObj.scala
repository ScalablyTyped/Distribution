package typings
package atlassianDashCrowdDashClientLib.libModelsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupObj extends js.Object {
  val active: scala.Boolean
  val description: java.lang.String
  val name: java.lang.String
  val `type`: atlassianDashCrowdDashClientLib.atlassianDashCrowdDashClientLibStrings.GROUP
}

object GroupObj {
  @scala.inline
  def apply(
    active: scala.Boolean,
    description: java.lang.String,
    name: java.lang.String,
    `type`: atlassianDashCrowdDashClientLib.atlassianDashCrowdDashClientLibStrings.GROUP
  ): GroupObj = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[GroupObj]
  }
}

