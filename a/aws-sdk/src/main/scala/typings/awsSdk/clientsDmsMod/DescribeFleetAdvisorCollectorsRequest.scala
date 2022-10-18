package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFleetAdvisorCollectorsRequest extends StObject {
  
  /**
    *  If you specify any of the following filters, the output includes information for only those collectors that meet the filter criteria:    collector-referenced-id – The ID of the collector agent, for example d4610ac5-e323-4ad9-bc50-eaf7249dfe9d.    collector-name – The name of the collector agent.   An example is: describe-fleet-advisor-collectors --filter Name="collector-referenced-id",Values="d4610ac5-e323-4ad9-bc50-eaf7249dfe9d" 
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
object DescribeFleetAdvisorCollectorsRequest {
  
  inline def apply(): DescribeFleetAdvisorCollectorsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFleetAdvisorCollectorsRequest]
  }
  
  extension [Self <: DescribeFleetAdvisorCollectorsRequest](x: Self) {
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value*))
    
    inline def setMaxRecords(value: IntegerOptional): Self = StObject.set(x, "MaxRecords", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordsUndefined: Self = StObject.set(x, "MaxRecords", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
