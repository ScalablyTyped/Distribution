package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// parameters type
trait ListBucketsQueryType extends js.Object {
   // search buckets using prefix key
  var marker: js.UndefOr[java.lang.String] = js.undefined
   // search start from marker, including marker key
  var `max-keys`: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ListBucketsQueryType {
  @scala.inline
  def apply(
    marker: java.lang.String = null,
    `max-keys`: java.lang.String | scala.Double = null,
    prefix: java.lang.String = null
  ): ListBucketsQueryType = {
    val __obj = js.Dynamic.literal()
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (`max-keys` != null) __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ListBucketsQueryType]
  }
}

