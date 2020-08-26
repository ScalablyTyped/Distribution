package typings.arangodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileSize extends js.Object {
  var count: Double = js.native
  var fileSize: Double = js.native
}

object FileSize {
  @scala.inline
  def apply(count: Double, fileSize: Double): FileSize = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], fileSize = fileSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileSize]
  }
  @scala.inline
  implicit class FileSizeOps[Self <: FileSize] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
  }
  
}

