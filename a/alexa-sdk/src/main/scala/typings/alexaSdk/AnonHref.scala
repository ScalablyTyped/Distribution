package typings.alexaSdk

import typings.alexaSdk.mod.ListItemObjectStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHref extends js.Object {
  var href: String
  var status: ListItemObjectStatus
}

object AnonHref {
  @scala.inline
  def apply(href: String, status: ListItemObjectStatus): AnonHref = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHref]
  }
}

