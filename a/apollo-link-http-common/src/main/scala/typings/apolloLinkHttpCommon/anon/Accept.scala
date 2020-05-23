package typings.apolloLinkHttpCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Accept extends js.Object {
  var accept: String
  var `content-type`: String
}

object Accept {
  @scala.inline
  def apply(accept: String, `content-type`: String): Accept = {
    val __obj = js.Dynamic.literal(accept = accept.asInstanceOf[js.Any])
    __obj.updateDynamic("content-type")(`content-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accept]
  }
}

