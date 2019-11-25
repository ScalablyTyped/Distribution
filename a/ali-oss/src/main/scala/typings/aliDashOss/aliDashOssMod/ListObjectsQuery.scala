package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsQuery extends js.Object {
   // search start from marker, including marker key
  var delimiter: js.UndefOr[String] = js.undefined
   // search object using prefix key
  var marker: js.UndefOr[String] = js.undefined
   // delimiter search scope e.g. / only search current dir, not including subdir
  var `max-keys`: String | Double
  var prefix: js.UndefOr[String] = js.undefined
}

object ListObjectsQuery {
  @scala.inline
  def apply(
    `max-keys`: String | Double,
    delimiter: String = null,
    marker: String = null,
    prefix: String = null
  ): ListObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListObjectsQuery]
  }
}

