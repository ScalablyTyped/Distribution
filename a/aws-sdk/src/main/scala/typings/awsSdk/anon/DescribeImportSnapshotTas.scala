package typings.awsSdk.anon

import typings.awsSdk.clientsEc2Mod.Boolean
import typings.awsSdk.clientsEc2Mod.Filter
import typings.awsSdk.clientsEc2Mod.FilterList
import typings.awsSdk.clientsEc2Mod.ImportSnapshotTaskId
import typings.awsSdk.clientsEc2Mod.ImportSnapshotTaskIdList
import typings.awsSdk.clientsEc2Mod.Integer
import typings.awsSdk.clientsEc2Mod.String
import typings.awsSdk.libServiceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeImportSnapshotTasksRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeImportSnapshotTas extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The filters.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * A list of import snapshot task IDs.
    */
  var ImportTaskIds: js.UndefOr[ImportSnapshotTaskIdList] = js.undefined
  
  /**
    * The maximum number of results to return in a single call. To retrieve the remaining results, make another call with the returned NextToken value.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * A token that indicates the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeImportSnapshotTas {
  
  inline def apply(): DescribeImportSnapshotTas = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeImportSnapshotTas]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeImportSnapshotTas] (val x: Self) extends AnyVal {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setImportTaskIds(value: ImportSnapshotTaskIdList): Self = StObject.set(x, "ImportTaskIds", value.asInstanceOf[js.Any])
    
    inline def setImportTaskIdsUndefined: Self = StObject.set(x, "ImportTaskIds", js.undefined)
    
    inline def setImportTaskIdsVarargs(value: ImportSnapshotTaskId*): Self = StObject.set(x, "ImportTaskIds", js.Array(value*))
    
    inline def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
