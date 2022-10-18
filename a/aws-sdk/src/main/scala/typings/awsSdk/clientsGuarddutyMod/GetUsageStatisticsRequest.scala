package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUsageStatisticsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose usage statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The maximum number of results to return in the response.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.MaxResults] = js.undefined
  
  /**
    * A token to use for paginating results that are returned in the response. Set the value of this parameter to null for the first request to a list action. For subsequent calls, use the NextToken value returned from the previous request to continue listing results after the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The currency unit you would like to view your usage statistics in. Current valid values are USD.
    */
  var Unit: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the criteria used for querying usage.
    */
  var UsageCriteria: typings.awsSdk.clientsGuarddutyMod.UsageCriteria
  
  /**
    * The type of usage statistics to retrieve.
    */
  var UsageStatisticType: typings.awsSdk.clientsGuarddutyMod.UsageStatisticType
}
object GetUsageStatisticsRequest {
  
  inline def apply(DetectorId: DetectorId, UsageCriteria: UsageCriteria, UsageStatisticType: UsageStatisticType): GetUsageStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], UsageCriteria = UsageCriteria.asInstanceOf[js.Any], UsageStatisticType = UsageStatisticType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageStatisticsRequest]
  }
  
  extension [Self <: GetUsageStatisticsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "Unit", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "Unit", js.undefined)
    
    inline def setUsageCriteria(value: UsageCriteria): Self = StObject.set(x, "UsageCriteria", value.asInstanceOf[js.Any])
    
    inline def setUsageStatisticType(value: UsageStatisticType): Self = StObject.set(x, "UsageStatisticType", value.asInstanceOf[js.Any])
  }
}
