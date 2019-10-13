package typings.airtable.airtableMod._Global_.Airtable

import typings.airtable.Anon_Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var filename: String
  var id: String
  var size: Double
  var thumbnails: js.UndefOr[Anon_Full] = js.undefined
  var `type`: String
  var url: String
}

object Attachment {
  @scala.inline
  def apply(
    filename: String,
    id: String,
    size: Double,
    `type`: String,
    url: String,
    thumbnails: Anon_Full = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(filename = filename, id = id, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.asInstanceOf[Attachment]
  }
}

