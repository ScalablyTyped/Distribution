package typings
package airtableLib.airtableMod.Global.AirtableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attachment extends js.Object {
  var filename: java.lang.String
  var id: java.lang.String
  var size: scala.Double
  var thumbnails: js.UndefOr[airtableLib.Anon_Full] = js.undefined
  var `type`: java.lang.String
  var url: java.lang.String
}

object Attachment {
  @scala.inline
  def apply(
    filename: java.lang.String,
    id: java.lang.String,
    size: scala.Double,
    `type`: java.lang.String,
    url: java.lang.String,
    thumbnails: airtableLib.Anon_Full = null
  ): Attachment = {
    val __obj = js.Dynamic.literal(filename = filename, id = id, size = size, url = url)
    __obj.updateDynamic("type")(`type`)
    if (thumbnails != null) __obj.updateDynamic("thumbnails")(thumbnails)
    __obj.asInstanceOf[Attachment]
  }
}

