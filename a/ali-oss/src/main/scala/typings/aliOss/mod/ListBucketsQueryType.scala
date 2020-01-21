package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// parameters type
trait ListBucketsQueryType extends js.Object {
   // search buckets using prefix key
  var marker: js.UndefOr[String] = js.undefined
   // search start from marker, including marker key
  var `max-keys`: js.UndefOr[String | Double] = js.undefined
  var prefix: js.UndefOr[String] = js.undefined
}

object ListBucketsQueryType {
  @scala.inline
  def apply(marker: String = null, `max-keys`: String | Double = null, prefix: String = null): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (`max-keys` != null) __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBucketsQueryType]
  }
}

