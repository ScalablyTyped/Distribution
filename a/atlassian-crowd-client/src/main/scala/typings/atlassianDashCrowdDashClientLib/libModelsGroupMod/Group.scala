package typings
package atlassianDashCrowdDashClientLib.libModelsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  val active: scala.Boolean
  val attributes: js.UndefOr[js.Any] = js.undefined
  val description: java.lang.String
  val groupname: java.lang.String
  def toCrowd(): GroupObj
}

object Group {
  @scala.inline
  def apply(
    active: scala.Boolean,
    description: java.lang.String,
    groupname: java.lang.String,
    toCrowd: () => GroupObj,
    attributes: js.Any = null
  ): Group = {
    val __obj = js.Dynamic.literal(active = active, description = description, groupname = groupname, toCrowd = js.Any.fromFunction0(toCrowd))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Group]
  }
}

