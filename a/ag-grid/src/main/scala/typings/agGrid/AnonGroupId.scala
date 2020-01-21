package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGroupId extends js.Object {
  var groupId: String
  var open: Boolean
}

object AnonGroupId {
  @scala.inline
  def apply(groupId: String, open: Boolean): AnonGroupId = {
    val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGroupId]
  }
}

