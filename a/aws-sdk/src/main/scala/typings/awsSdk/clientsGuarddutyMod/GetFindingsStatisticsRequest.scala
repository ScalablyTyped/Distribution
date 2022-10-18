package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsStatisticsRequest extends StObject {
  
  /**
    * The ID of the detector that specifies the GuardDuty service whose findings' statistics you want to retrieve.
    */
  var DetectorId: typings.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * Represents the criteria that is used for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.FindingCriteria] = js.undefined
  
  /**
    * The types of finding statistics to retrieve.
    */
  var FindingStatisticTypes: typings.awsSdk.clientsGuarddutyMod.FindingStatisticTypes
}
object GetFindingsStatisticsRequest {
  
  inline def apply(DetectorId: DetectorId, FindingStatisticTypes: FindingStatisticTypes): GetFindingsStatisticsRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], FindingStatisticTypes = FindingStatisticTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsRequest]
  }
  
  extension [Self <: GetFindingsStatisticsRequest](x: Self) {
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "FindingCriteria", value.asInstanceOf[js.Any])
    
    inline def setFindingCriteriaUndefined: Self = StObject.set(x, "FindingCriteria", js.undefined)
    
    inline def setFindingStatisticTypes(value: FindingStatisticTypes): Self = StObject.set(x, "FindingStatisticTypes", value.asInstanceOf[js.Any])
    
    inline def setFindingStatisticTypesVarargs(value: FindingStatisticType*): Self = StObject.set(x, "FindingStatisticTypes", js.Array(value*))
  }
}
