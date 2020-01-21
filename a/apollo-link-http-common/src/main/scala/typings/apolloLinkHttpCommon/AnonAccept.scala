package typings.apolloLinkHttpCommon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccept extends js.Object {
  var accept: String
  var `content-type`: String
}

object AnonAccept {
  @scala.inline
  def apply(accept: String, `content-type`: String): AnonAccept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccept]
  }
}

