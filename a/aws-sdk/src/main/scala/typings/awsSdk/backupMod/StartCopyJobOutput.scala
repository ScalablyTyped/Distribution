package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCopyJobOutput extends js.Object {
  /**
    * Uniquely identifies a copy job.
    */
  var CopyJobId: js.UndefOr[String] = js.native
  /**
    * The date and time that a copy job is started, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
}

object StartCopyJobOutput {
  @scala.inline
  def apply(): StartCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartCopyJobOutput]
  }
  @scala.inline
  implicit class StartCopyJobOutputOps[Self <: StartCopyJobOutput] (val x: Self) extends AnyVal {
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
    @scala.inline
    def deleteCopyJobId: Self = this.set("CopyJobId", js.undefined)
    @scala.inline
    def setCreationDate(value: timestamp): Self = this.set("CreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("CreationDate", js.undefined)
  }
  
}

