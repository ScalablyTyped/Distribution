package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListJobsOutput extends js.Object {
  var IsTruncated: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.IsTruncated] = js.undefined
  var Jobs: js.UndefOr[JobsList] = js.undefined
}

object ListJobsOutput {
  @scala.inline
  def apply(IsTruncated: js.UndefOr[IsTruncated] = js.undefined, Jobs: JobsList = null): ListJobsOutput = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(IsTruncated)) __obj.updateDynamic("IsTruncated")(IsTruncated)
    if (Jobs != null) __obj.updateDynamic("Jobs")(Jobs)
    __obj.asInstanceOf[ListJobsOutput]
  }
}

