package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.ExportTaskId
import typings.awsSdk.ec2Mod.ExportTaskIdStringList
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeExportTasksRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait DescribeExportTasksReques extends StObject {
  
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
  def apply(): DescribeExportTasksReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksReques]
  }
  
  @scala.inline
  implicit class DescribeExportTasksRequesMutableBuilder[Self <: DescribeExportTasksReques] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    @scala.inline
    def setExportTaskIds(value: ExportTaskIdStringList): Self = StObject.set(x, "ExportTaskIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportTaskIdsUndefined: Self = StObject.set(x, "ExportTaskIds", js.undefined)
    
    @scala.inline
    def setExportTaskIdsVarargs(value: ExportTaskId*): Self = StObject.set(x, "ExportTaskIds", js.Array(value :_*))
    
    @scala.inline
    def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    @scala.inline
    def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
  }
}
