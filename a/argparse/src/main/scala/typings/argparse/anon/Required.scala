package typings.argparse.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Required extends js.Object {
  var required: Boolean
}

object Required {
  @scala.inline
  def apply(required: Boolean): Required = {
    val __obj = js.Dynamic.literal(required = required.asInstanceOf[js.Any])
    __obj.asInstanceOf[Required]
  }
}

