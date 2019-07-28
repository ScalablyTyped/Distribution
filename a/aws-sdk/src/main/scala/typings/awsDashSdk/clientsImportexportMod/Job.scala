package typings.awsDashSdk.clientsImportexportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Job extends js.Object {
  var CreationDate: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.CreationDate] = js.undefined
  var IsCanceled: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.IsCanceled] = js.undefined
  var JobId: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobId] = js.undefined
  var JobType: js.UndefOr[typings.awsDashSdk.clientsImportexportMod.JobType] = js.undefined
}

object Job {
  @scala.inline
  def apply(
    CreationDate: CreationDate = null,
    IsCanceled: js.UndefOr[IsCanceled] = js.undefined,
    JobId: JobId = null,
    JobType: JobType = null
  ): Job = {
    val __obj = js.Dynamic.literal()
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (!js.isUndefined(IsCanceled)) __obj.updateDynamic("IsCanceled")(IsCanceled)
    if (JobId != null) __obj.updateDynamic("JobId")(JobId)
    if (JobType != null) __obj.updateDynamic("JobType")(JobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Job]
  }
}

