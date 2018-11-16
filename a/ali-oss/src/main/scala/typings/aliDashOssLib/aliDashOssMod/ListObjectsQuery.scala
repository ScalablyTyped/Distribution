package typings
package aliDashOssLib.aliDashOssMod

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

