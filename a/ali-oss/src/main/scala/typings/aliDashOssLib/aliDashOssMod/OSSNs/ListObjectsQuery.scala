package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectsQuery extends js.Object {
   // search start from marker, including marker key
  var delimiter: js.UndefOr[java.lang.String] = js.undefined
   // search object using prefix key
  var marker: js.UndefOr[java.lang.String] = js.undefined
   // delimiter search scope e.g. / only search current dir, not including subdir
  var `max-keys`: java.lang.String | scala.Double
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

object ListObjectsQuery {
  @scala.inline
  def apply(
    `max-keys`: java.lang.String | scala.Double,
    delimiter: java.lang.String = null,
    marker: java.lang.String = null,
    prefix: java.lang.String = null
  ): ListObjectsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("max-keys")(`max-keys`.asInstanceOf[js.Any])
    if (delimiter != null) __obj.updateDynamic("delimiter")(delimiter)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    __obj.asInstanceOf[ListObjectsQuery]
  }
}

