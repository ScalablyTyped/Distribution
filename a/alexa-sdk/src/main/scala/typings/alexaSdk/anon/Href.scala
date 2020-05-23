package typings.alexaSdk.anon

import typings.alexaSdk.mod.ListItemObjectStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Href extends js.Object {
  var href: String
  var status: ListItemObjectStatus
}

object Href {
  @scala.inline
  def apply(href: String, status: ListItemObjectStatus): Href = {
    val __obj = js.Dynamic.literal(href = href.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Href]
  }
}

