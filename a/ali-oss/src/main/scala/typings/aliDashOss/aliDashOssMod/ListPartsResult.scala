package typings.aliDashOss.aliDashOssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPartsResult extends js.Object {
  var PartNumberMarker: Double
  var bucket: String
  var isTruncated: Boolean
  var maxParts: Double
  var name: String
  var nextPartNumberMarker: Double
  var parts: js.Array[ObjectPart]
  var res: NormalSuccessResponse
  var uploadId: String
}

object ListPartsResult {
  @scala.inline
  def apply(
    PartNumberMarker: Double,
    bucket: String,
    isTruncated: Boolean,
    maxParts: Double,
    name: String,
    nextPartNumberMarker: Double,
    parts: js.Array[ObjectPart],
    res: NormalSuccessResponse,
    uploadId: String
  ): ListPartsResult = {
    val __obj = js.Dynamic.literal(PartNumberMarker = PartNumberMarker, bucket = bucket, isTruncated = isTruncated, maxParts = maxParts, name = name, nextPartNumberMarker = nextPartNumberMarker, parts = parts, res = res, uploadId = uploadId)
  
    __obj.asInstanceOf[ListPartsResult]
  }
}

