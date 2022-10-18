package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyTargetGroupsRequest extends StObject {
  
  /**
    * The identifier of the DBProxy associated with the target group.
    */
  var DBProxyName: String
  
  /**
    * This parameter is not currently supported.
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so that the remaining results can be retrieved. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsRdsMod.MaxRecords] = js.undefined
  
  /**
    * The identifier of the DBProxyTargetGroup to describe.
    */
  var TargetGroupName: js.UndefOr[String] = js.undefined
}
object DescribeDBProxyTargetGroupsRequest {
  
  inline def apply(DBProxyName: String): DescribeDBProxyTargetGroupsRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDBProxyTargetGroupsRequest]
  }
  
  extension [Self <: DescribeDBProxyTargetGroupsRequest](x: Self) {
    
    inline def setDBProxyName(value: String): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setTargetGroupName(value: String): Self = StObject.set(x, "TargetGroupName", value.asInstanceOf[js.Any])
    
    inline def setTargetGroupNameUndefined: Self = StObject.set(x, "TargetGroupName", js.undefined)
  }
}
