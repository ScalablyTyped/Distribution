package typings.activestorage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Blob extends js.Object {
  var byte_size: Double = js.native
  var checksum: String = js.native
  var content_type: String = js.native
  var filename: String = js.native
  var signed_id: String = js.native
}

object Blob {
  @scala.inline
  def apply(byte_size: Double, checksum: String, content_type: String, filename: String, signed_id: String): Blob = {
    val __obj = js.Dynamic.literal(byte_size = byte_size.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signed_id = signed_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Blob]
  }
  @scala.inline
  implicit class BlobOps[Self <: Blob] (val x: Self) extends AnyVal {
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
    def setByte_size(value: Double): Self = this.set("byte_size", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecksum(value: String): Self = this.set("checksum", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent_type(value: String): Self = this.set("content_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setSigned_id(value: String): Self = this.set("signed_id", value.asInstanceOf[js.Any])
  }
  
}

