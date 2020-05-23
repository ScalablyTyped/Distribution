package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.ExportTaskIdStringList
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.serviceMod.WaiterConfiguration
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeExportTasksRequest & {  $waiter ? :aws-sdk.aws-sdk/lib/service.WaiterConfiguration} */
@js.native
trait DescribeExportTasksReques extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * The export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.native
  /**
    * the filters for the export tasks.
    */
  var Filters: js.UndefOr[FilterList] = js.native
}

object DescribeExportTasksReques {
  @scala.inline
  def apply(
    $waiter: WaiterConfiguration = null,
    ExportTaskIds: ExportTaskIdStringList = null,
    Filters: FilterList = null
  ): DescribeExportTasksReques = {
    val __obj = js.Dynamic.literal()
    if ($waiter != null) __obj.updateDynamic("$waiter")($waiter.asInstanceOf[js.Any])
    if (ExportTaskIds != null) __obj.updateDynamic("ExportTaskIds")(ExportTaskIds.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeExportTasksReques]
  }
}

