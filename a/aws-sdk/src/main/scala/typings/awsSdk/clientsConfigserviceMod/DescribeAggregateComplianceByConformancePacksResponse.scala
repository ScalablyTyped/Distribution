package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAggregateComplianceByConformancePacksResponse extends StObject {
  
  /**
    * Returns the AggregateComplianceByConformancePack object.
    */
  var AggregateComplianceByConformancePacks: js.UndefOr[AggregateComplianceByConformancePackList] = js.undefined
  
  /**
    * The nextToken string returned on a previous page that you use to get the next page of results in a paginated response.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.NextToken] = js.undefined
}
object DescribeAggregateComplianceByConformancePacksResponse {
  
  inline def apply(): DescribeAggregateComplianceByConformancePacksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAggregateComplianceByConformancePacksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAggregateComplianceByConformancePacksResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregateComplianceByConformancePacks(value: AggregateComplianceByConformancePackList): Self = StObject.set(x, "AggregateComplianceByConformancePacks", value.asInstanceOf[js.Any])
    
    inline def setAggregateComplianceByConformancePacksUndefined: Self = StObject.set(x, "AggregateComplianceByConformancePacks", js.undefined)
    
    inline def setAggregateComplianceByConformancePacksVarargs(value: AggregateComplianceByConformancePack*): Self = StObject.set(x, "AggregateComplianceByConformancePacks", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
