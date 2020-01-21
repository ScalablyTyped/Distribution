package typings.airtable.mod._Global_.Airtable

import typings.airtable.AnonFull
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var filename: String
  var id: String
  var size: Double
  var thumbnails: js.UndefOr[AnonFull] = js.undefined
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
    thumbnails: AnonFull = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

