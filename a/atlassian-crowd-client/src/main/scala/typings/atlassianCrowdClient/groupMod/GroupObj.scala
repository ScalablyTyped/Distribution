package typings.atlassianCrowdClient.groupMod

import typings.atlassianCrowdClient.atlassianCrowdClientStrings.GROUP
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
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupObj]
  }
}

