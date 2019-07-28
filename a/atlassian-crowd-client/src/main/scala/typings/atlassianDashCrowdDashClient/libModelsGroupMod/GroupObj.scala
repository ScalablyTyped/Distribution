package typings.atlassianDashCrowdDashClient.libModelsGroupMod

import typings.atlassianDashCrowdDashClient.atlassianDashCrowdDashClientStrings.GROUP
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupObj extends js.Object {
  val active: Boolean
  val description: String
  val name: String
  val `type`: GROUP
}

object GroupObj {
  @scala.inline
  def apply(active: Boolean, description: String, name: String, `type`: GROUP): GroupObj = {
    val __obj = js.Dynamic.literal(active = active, description = description, name = name)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GroupObj]
  }
}

