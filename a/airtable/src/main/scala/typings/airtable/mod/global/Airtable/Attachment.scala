package typings.airtable.mod.global.Airtable

import typings.airtable.anon.Full
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var filename: String
  var id: String
  var size: Double
  var thumbnails: js.UndefOr[Full] = js.undefined
  var `type`: String
  var url: String
}

object Attachment {
  @scala.inline
  def apply(filename: String, id: String, size: Double, `type`: String, url: String, thumbnails: Full = null): Attachment = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachment]
  }
}

