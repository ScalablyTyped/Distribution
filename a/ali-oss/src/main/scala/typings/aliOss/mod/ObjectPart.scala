package typings.aliOss.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPart extends js.Object {
   // {Date} Time when a part is uploaded.
  var ETag: String = js.native
  var LastModified: js.Any = js.native
  var PartNumber: Double = js.native
  var size: Double = js.native
}

object ObjectPart {
  @scala.inline
  def apply(ETag: String, LastModified: js.Any, PartNumber: Double, size: Double): ObjectPart = {
    val __obj = js.Dynamic.literal(ETag = ETag.asInstanceOf[js.Any], LastModified = LastModified.asInstanceOf[js.Any], PartNumber = PartNumber.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPart]
  }
  @scala.inline
  implicit class ObjectPartOps[Self <: ObjectPart] (val x: Self) extends AnyVal {
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
    def setETag(value: String): Self = this.set("ETag", value.asInstanceOf[js.Any])
    @scala.inline
    def setLastModified(value: js.Any): Self = this.set("LastModified", value.asInstanceOf[js.Any])
    @scala.inline
    def setPartNumber(value: Double): Self = this.set("PartNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
  }
  
}

