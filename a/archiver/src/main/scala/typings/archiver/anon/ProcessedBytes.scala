package typings.archiver.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessedBytes extends js.Object {
  var processedBytes: Double = js.native
  var totalBytes: Double = js.native
}

object ProcessedBytes {
  @scala.inline
  def apply(processedBytes: Double, totalBytes: Double): ProcessedBytes = {
    val __obj = js.Dynamic.literal(processedBytes = processedBytes.asInstanceOf[js.Any], totalBytes = totalBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessedBytes]
  }
  @scala.inline
  implicit class ProcessedBytesOps[Self <: ProcessedBytes] (val x: Self) extends AnyVal {
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
    def setProcessedBytes(value: Double): Self = this.set("processedBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalBytes(value: Double): Self = this.set("totalBytes", value.asInstanceOf[js.Any])
  }
  
}

