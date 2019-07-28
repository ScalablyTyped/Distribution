package typings.airtable

import typings.airtable.airtableMod.Global.AirtableNs.Thumbnail
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Full extends js.Object {
  var full: Thumbnail
  var large: Thumbnail
  var small: Thumbnail
}

object Anon_Full {
  @scala.inline
  def apply(full: Thumbnail, large: Thumbnail, small: Thumbnail): Anon_Full = {
    val __obj = js.Dynamic.literal(full = full, large = large, small = small)
  
    __obj.asInstanceOf[Anon_Full]
  }
}

