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
    val __obj = js.Dynamic.literal(PartNumberMarker = PartNumberMarker.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], isTruncated = isTruncated.asInstanceOf[js.Any], maxParts = maxParts.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nextPartNumberMarker = nextPartNumberMarker.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListPartsResult]
  }
}

