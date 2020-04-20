package typings.asar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinkMetadata extends Metadata {
  var link: String
}

object LinkMetadata {
  @scala.inline
  def apply(link: String): LinkMetadata = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkMetadata]
  }
}

