package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDBProxyEndpointsRequest extends StObject {
  
  /**
    * The name of a DB proxy endpoint to describe. If you omit this parameter, the output includes information about all DB proxy endpoints associated with the specified proxy.
    */
  var DBProxyEndpointName: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxyEndpointName] = js.undefined
  
  /**
    * The name of the DB proxy whose endpoints you want to describe. If you omit this parameter, the output includes information about all DB proxy endpoints associated with all your DB proxies.
    */
  var DBProxyName: js.UndefOr[typings.awsSdk.clientsRdsMod.DBProxyName] = js.undefined
  
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
}
object DescribeDBProxyEndpointsRequest {
  
  inline def apply(): DescribeDBProxyEndpointsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDBProxyEndpointsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDBProxyEndpointsRequest] (val x: Self) extends AnyVal {
    
    inline def setDBProxyEndpointName(value: DBProxyEndpointName): Self = StObject.set(x, "DBProxyEndpointName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyEndpointNameUndefined: Self = StObject.set(x, "DBProxyEndpointName", js.undefined)
    
    inline def setDBProxyName(value: DBProxyName): Self = StObject.set(x, "DBProxyName", value.asInstanceOf[js.Any])
    
    inline def setDBProxyNameUndefined: Self = StObject.set(x, "DBProxyName", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
