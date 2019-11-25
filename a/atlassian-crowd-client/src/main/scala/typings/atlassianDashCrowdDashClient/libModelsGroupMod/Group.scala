package typings.atlassianDashCrowdDashClient.libModelsGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  val active: Boolean
  val attributes: js.UndefOr[js.Any] = js.undefined
  val description: String
  val groupname: String
  def toCrowd(): GroupObj
}

object Group {
  @scala.inline
  def apply(
    active: Boolean,
    description: String,
    groupname: String,
    toCrowd: () => GroupObj,
    attributes: js.Any = null
  ): Group = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupname = groupname.asInstanceOf[js.Any], toCrowd = js.Any.fromFunction0(toCrowd))
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group]
  }
}

