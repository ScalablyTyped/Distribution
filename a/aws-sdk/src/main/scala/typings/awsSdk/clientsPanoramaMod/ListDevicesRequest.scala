package typings.awsSdk.clientsPanoramaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDevicesRequest extends StObject {
  
  /**
    * Filter based on a device's status.
    */
  var DeviceAggregatedStatusFilter: js.UndefOr[DeviceAggregatedStatus] = js.undefined
  
  /**
    * The maximum number of devices to return in one page of results.
    */
  var MaxResults: js.UndefOr[MaxSize25] = js.undefined
  
  /**
    * Filter based on device's name. Prefixes supported.
    */
  var NameFilter: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NameFilter] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPanoramaMod.NextToken] = js.undefined
  
  /**
    * The target column to be sorted on. Default column sort is CREATED_TIME.
    */
  var SortBy: js.UndefOr[ListDevicesSortBy] = js.undefined
  
  /**
    * The sorting order for the returned list. SortOrder is DESCENDING by default based on CREATED_TIME. Otherwise, SortOrder is ASCENDING.
    */
  var SortOrder: js.UndefOr[typings.awsSdk.clientsPanoramaMod.SortOrder] = js.undefined
}
object ListDevicesRequest {
  
  inline def apply(): ListDevicesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDevicesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDevicesRequest] (val x: Self) extends AnyVal {
    
    inline def setDeviceAggregatedStatusFilter(value: DeviceAggregatedStatus): Self = StObject.set(x, "DeviceAggregatedStatusFilter", value.asInstanceOf[js.Any])
    
    inline def setDeviceAggregatedStatusFilterUndefined: Self = StObject.set(x, "DeviceAggregatedStatusFilter", js.undefined)
    
    inline def setMaxResults(value: MaxSize25): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNameFilter(value: NameFilter): Self = StObject.set(x, "NameFilter", value.asInstanceOf[js.Any])
    
    inline def setNameFilterUndefined: Self = StObject.set(x, "NameFilter", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSortBy(value: ListDevicesSortBy): Self = StObject.set(x, "SortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "SortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "SortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "SortOrder", js.undefined)
  }
}
