package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectResult extends js.Object {
  var isTruncated: scala.Boolean
  var nextMarker: java.lang.String
  var objects: js.Array[ObjectMeta]
  var prefixes: js.Array[java.lang.String]
  var res: NormalSuccessResponse
}

object ListObjectResult {
  @scala.inline
  def apply(
    isTruncated: scala.Boolean,
    nextMarker: java.lang.String,
    objects: js.Array[ObjectMeta],
    prefixes: js.Array[java.lang.String],
    res: NormalSuccessResponse
  ): ListObjectResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isTruncated")(isTruncated)
    __obj.updateDynamic("nextMarker")(nextMarker)
    __obj.updateDynamic("objects")(objects)
    __obj.updateDynamic("prefixes")(prefixes)
    __obj.updateDynamic("res")(res)
    __obj.asInstanceOf[ListObjectResult]
  }
}

