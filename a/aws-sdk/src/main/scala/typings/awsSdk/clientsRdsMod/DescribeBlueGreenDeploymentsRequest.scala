package typings.awsSdk.clientsRdsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBlueGreenDeploymentsRequest extends StObject {
  
  /**
    * The blue/green deployment identifier. If this parameter is specified, information from only the specific blue/green deployment is returned. This parameter isn't case-sensitive. Constraints:   If supplied, must match an existing blue/green deployment identifier.  
    */
  var BlueGreenDeploymentIdentifier: js.UndefOr[typings.awsSdk.clientsRdsMod.BlueGreenDeploymentIdentifier] = js.undefined
  
  /**
    * A filter that specifies one or more blue/green deployments to describe. Supported filters:    blue-green-deployment-identifier - Accepts system-generated identifiers for blue/green deployments. The results list only includes information about the blue/green deployments with the specified identifiers.    blue-green-deployment-name - Accepts user-supplied names for blue/green deployments. The results list only includes information about the blue/green deployments with the specified names.    source - Accepts source databases for a blue/green deployment. The results list only includes information about the blue/green deployments with the specified source databases.    target - Accepts target databases for a blue/green deployment. The results list only includes information about the blue/green deployments with the specified target databases.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * An optional pagination token provided by a previous DescribeBlueGreenDeployments request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
  
  /**
    * The maximum number of records to include in the response. If more records exist than the specified MaxRecords value, a pagination token called a marker is included in the response so you can retrieve the remaining results. Default: 100 Constraints: Minimum 20, maximum 100.
    */
  var MaxRecords: js.UndefOr[typings.awsSdk.clientsRdsMod.MaxRecords] = js.undefined
}
object DescribeBlueGreenDeploymentsRequest {
  
  inline def apply(): DescribeBlueGreenDeploymentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeBlueGreenDeploymentsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeBlueGreenDeploymentsRequest] (val x: Self) extends AnyVal {
    
    inline def setBlueGreenDeploymentIdentifier(value: BlueGreenDeploymentIdentifier): Self = StObject.set(x, "BlueGreenDeploymentIdentifier", value.asInstanceOf[js.Any])
    
    inline def setBlueGreenDeploymentIdentifierUndefined: Self = StObject.set(x, "BlueGreenDeploymentIdentifier", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMarker(value: String): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    inline def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    inline def setMaxRecords(value: MaxRecords): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
  }
}
