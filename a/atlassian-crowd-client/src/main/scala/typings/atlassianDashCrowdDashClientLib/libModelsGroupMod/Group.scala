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
    toCrowd: js.Function0[GroupObj],
    attributes: js.Any = null
  ): Group = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("active")(active)
    __obj.updateDynamic("description")(description)
    __obj.updateDynamic("groupname")(groupname)
    __obj.updateDynamic("toCrowd")(toCrowd)
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    __obj.asInstanceOf[Group]
  }
}

