package typings.airtable

import typings.airtable.mod._Global_.Airtable.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFull extends js.Object {
  var full: Thumbnail
  var large: Thumbnail
  var small: Thumbnail
}

object AnonFull {
  @scala.inline
  def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): AnonFull = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFull]
  }
}

