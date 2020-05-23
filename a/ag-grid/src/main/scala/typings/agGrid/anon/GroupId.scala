package typings.agGrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupId extends js.Object {
  var groupId: String
  var open: Boolean
}

object GroupId {
  @scala.inline
  def apply(groupId: String, open: Boolean): GroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupId]
  }
}

