package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectResult extends js.Object {
  var isTruncated: Boolean
  var nextMarker: String
  var objects: js.Array[ObjectMeta]
  var prefixes: js.Array[String]
  var res: NormalSuccessResponse
}

object ListObjectResult {
  @scala.inline
  def apply(
    isTruncated: Boolean,
    nextMarker: String,
    objects: js.Array[ObjectMeta],
    prefixes: js.Array[String],
    res: NormalSuccessResponse
  ): ListObjectResult = {
    val __obj = js.Dynamic.literal(isTruncated = isTruncated, nextMarker = nextMarker, objects = objects, prefixes = prefixes, res = res)
  
    __obj.asInstanceOf[ListObjectResult]
  }
}

