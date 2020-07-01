package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetId extends js.Object {
  /**
    * Effective group id.
    */
  var group: String
  /**
    * Effective user id.
    */
  var user: String
}

object SetId {
  @scala.inline
  def apply(group: String, user: String): SetId = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetId]
  }
}

