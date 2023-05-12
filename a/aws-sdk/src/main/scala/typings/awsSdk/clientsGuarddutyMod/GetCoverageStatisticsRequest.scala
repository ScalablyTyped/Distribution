package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoverageStatisticsRequest extends StObject {
  
  /**
    * The unique ID of the GuardDuty detector associated to the coverage statistics.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * Represents the criteria used to filter the coverage statistics
    */
  var FilterCriteria: js.UndefOr[CoverageFilterCriteria] = js.undefined
  
  /**
    * Represents the statistics type used to aggregate the coverage details.
    */
  var StatisticsType: CoverageStatisticsTypeList
}
object GetCoverageStatisticsRequest {
  
  inline def apply(DetectorId: DetectorId, StatisticsType: CoverageStatisticsTypeList): GetCoverageStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], StatisticsType = StatisticsType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCoverageStatisticsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCoverageStatisticsRequest] (val x: Self) extends AnyVal {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteria(value: CoverageFilterCriteria): Self = StObject.set(x, "FilterCriteria", value.asInstanceOf[js.Any])
    
    inline def setFilterCriteriaUndefined: Self = StObject.set(x, "FilterCriteria", js.undefined)
    
    inline def setStatisticsType(value: CoverageStatisticsTypeList): Self = StObject.set(x, "StatisticsType", value.asInstanceOf[js.Any])
    
    inline def setStatisticsTypeVarargs(value: CoverageStatisticsType*): Self = StObject.set(x, "StatisticsType", js.Array(value*))
  }
}
