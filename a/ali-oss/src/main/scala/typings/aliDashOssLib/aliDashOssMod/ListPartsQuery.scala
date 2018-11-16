package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ListPartsQuery extends js.Object {
   // Starting position of a specific list. A part is listed only when the part number is greater than the value of this parameter.
  var `encoding-type`: java.lang.String
  var `max-parts`: scala.Double
   // The maximum part number in the response of the OSS. default value: 1000.
  var `part-number-marker`: scala.Double
}

