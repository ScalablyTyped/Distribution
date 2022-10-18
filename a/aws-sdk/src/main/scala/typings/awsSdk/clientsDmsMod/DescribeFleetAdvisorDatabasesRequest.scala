package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorDatabasesRequest extends StObject {
  
  /**
    *  If you specify any of the following filters, the output includes information for only those databases that meet the filter criteria:     database-id – The ID of the database.    database-name – The name of the database.    database-engine – The name of the database engine.    server-ip-address – The IP address of the database server.    database-ip-address – The IP address of the database.    collector-name – The name of the associated Fleet Advisor collector.   An example is: describe-fleet-advisor-databases --filter Name="database-id",Values="45" 
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
  
  /**
    * Sets the maximum number of records returned in the response.
    */
  var MaxRecords: js.UndefOr[IntegerOptional] = js.undefined
  
  /**
    * If NextToken is returned by a previous response, there are more results available. The value of NextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeFleetAdvisorDatabasesRequest {
  
  inline def apply(): DescribeFleetAdvisorDatabasesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorDatabasesRequest]
  }
  
  extension [Self <: DescribeFleetAdvisorDatabasesRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
