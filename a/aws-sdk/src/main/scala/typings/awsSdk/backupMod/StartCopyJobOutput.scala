package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartCopyJobOutput extends js.Object {
  /**
    * Uniquely identifies a request to AWS Backup to copy a resource.
    */
  var CopyJobId: js.UndefOr[String] = js.native
  /**
    * The date and time that a backup job is started, in Unix format and Coordinated Universal Time (UTC). The value of CreationDate is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM. &gt;
    */
  var CreationDate: js.UndefOr[timestamp] = js.native
}

object StartCopyJobOutput {
  @scala.inline
  def apply(CopyJobId: String = null, CreationDate: timestamp = null): StartCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyJobId != null) __obj.updateDynamic("CopyJobId")(CopyJobId.asInstanceOf[js.Any])
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartCopyJobOutput]
  }
}

