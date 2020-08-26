package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPartsResult extends js.Object {
  var PartNumberMarker: Double = js.native
  var bucket: String = js.native
  var isTruncated: Boolean = js.native
  var maxParts: Double = js.native
  var name: String = js.native
  var nextPartNumberMarker: Double = js.native
  var parts: js.Array[ObjectPart] = js.native
  var res: NormalSuccessResponse = js.native
  var uploadId: String = js.native
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
  @scala.inline
  implicit class ListPartsResultOps[Self <: ListPartsResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPartNumberMarker(value: Double): Self = this.set("PartNumberMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsTruncated(value: Boolean): Self = this.set("isTruncated", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxParts(value: Double): Self = this.set("maxParts", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setNextPartNumberMarker(value: Double): Self = this.set("nextPartNumberMarker", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartsVarargs(value: ObjectPart*): Self = this.set("parts", js.Array(value :_*))
    @scala.inline
    def setParts(value: js.Array[ObjectPart]): Self = this.set("parts", value.asInstanceOf[js.Any])
    @scala.inline
    def setRes(value: NormalSuccessResponse): Self = this.set("res", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadId(value: String): Self = this.set("uploadId", value.asInstanceOf[js.Any])
  }
  
}

