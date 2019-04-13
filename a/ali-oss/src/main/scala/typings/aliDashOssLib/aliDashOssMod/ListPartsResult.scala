package typings
package aliDashOssLib.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsResult extends js.Object {
  var PartNumberMarker: scala.Double
  var bucket: java.lang.String
  var isTruncated: scala.Boolean
  var maxParts: scala.Double
  var name: java.lang.String
  var nextPartNumberMarker: scala.Double
  var parts: js.Array[ObjectPart]
  var res: NormalSuccessResponse
  var uploadId: java.lang.String
}

object ListPartsResult {
  @scala.inline
  def apply(
    PartNumberMarker: scala.Double,
    bucket: java.lang.String,
    isTruncated: scala.Boolean,
    maxParts: scala.Double,
    name: java.lang.String,
    nextPartNumberMarker: scala.Double,
    parts: js.Array[ObjectPart],
    res: NormalSuccessResponse,
    uploadId: java.lang.String
  ): ListPartsResult = {
    val __obj = js.Dynamic.literal(PartNumberMarker = PartNumberMarker, bucket = bucket, isTruncated = isTruncated, maxParts = maxParts, name = name, nextPartNumberMarker = nextPartNumberMarker, parts = parts, res = res, uploadId = uploadId)
  
    __obj.asInstanceOf[ListPartsResult]
  }
}

