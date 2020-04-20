package typings.airtable.mod._Global_.Airtable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
  var height: Double
  var url: String
  var width: Double
}

object Thumbnail {
  @scala.inline
  def apply(height: Double, url: String, width: Double): Thumbnail = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

