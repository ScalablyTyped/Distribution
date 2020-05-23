package typings.airtable.anon

import typings.airtable.mod.global.Airtable.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Full extends js.Object {
  var full: Thumbnail
  var large: Thumbnail
  var small: Thumbnail
}

object Full {
  @scala.inline
  def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Full = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], large = large.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Full]
  }
}

