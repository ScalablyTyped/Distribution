package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.ExportTaskId
import typings.awsSdk.ec2Mod.ExportTaskIdStringList
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeExportTasksRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeExportTasksReques extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * The export task IDs.
    */
  var ExportTaskIds: js.UndefOr[ExportTaskIdStringList] = js.undefined
  
  /**
    * the filters for the export tasks.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
}
object DescribeExportTasksReques {
  
  inline def apply(): DescribeExportTasksReques = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeExportTasksReques]
  }
  
  extension [Self <: DescribeExportTasksReques](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setExportTaskIds(value: ExportTaskIdStringList): Self = StObject.set(x, "ExportTaskIds", value.asInstanceOf[js.Any])
    
    inline def setExportTaskIdsUndefined: Self = StObject.set(x, "ExportTaskIds", js.undefined)
    
    inline def setExportTaskIdsVarargs(value: ExportTaskId*): Self = StObject.set(x, "ExportTaskIds", js.Array(value*))
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
  }
}
