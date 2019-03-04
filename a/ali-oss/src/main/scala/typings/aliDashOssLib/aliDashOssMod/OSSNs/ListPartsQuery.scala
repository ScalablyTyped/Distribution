package typings
package aliDashOssLib.aliDashOssMod.OSSNs

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

object ListPartsQuery {
  @scala.inline
  def apply(`encoding-type`: java.lang.String, `max-parts`: scala.Double, `part-number-marker`: scala.Double): ListPartsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("encoding-type")(`encoding-type`)
    __obj.updateDynamic("max-parts")(`max-parts`)
    __obj.updateDynamic("part-number-marker")(`part-number-marker`)
    __obj.asInstanceOf[ListPartsQuery]
  }
}

