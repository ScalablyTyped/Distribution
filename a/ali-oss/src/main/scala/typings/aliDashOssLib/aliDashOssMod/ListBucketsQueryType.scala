package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListBucketsQueryType extends js.Object {
   // search buckets using prefix key
  var marker: js.UndefOr[java.lang.String] = js.undefined
   // search start from marker, including marker key
  var `max-keys`: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var prefix: js.UndefOr[java.lang.String] = js.undefined
}

