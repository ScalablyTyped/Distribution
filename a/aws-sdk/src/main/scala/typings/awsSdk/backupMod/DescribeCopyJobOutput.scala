package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCopyJobOutput extends js.Object {
  /**
    * Contains detailed information about a copy job.
    */
  var CopyJob: js.UndefOr[typings.awsSdk.backupMod.CopyJob] = js.native
}

object DescribeCopyJobOutput {
  @scala.inline
  def apply(CopyJob: CopyJob = null): DescribeCopyJobOutput = {
    val __obj = js.Dynamic.literal()
    if (CopyJob != null) __obj.updateDynamic("CopyJob")(CopyJob.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCopyJobOutput]
  }
}

