package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyJobInput extends js.Object {
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: String = js.native
}

object DescribeCopyJobInput {
  @scala.inline
  def apply(CopyJobId: String): DescribeCopyJobInput = {
    val __obj = js.Dynamic.literal(CopyJobId = CopyJobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobInput]
  }
  @scala.inline
  implicit class DescribeCopyJobInputOps[Self <: DescribeCopyJobInput] (val x: Self) extends AnyVal {
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
    def setCopyJobId(value: String): Self = this.set("CopyJobId", value.asInstanceOf[js.Any])
  }
  
}

