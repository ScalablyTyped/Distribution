package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingsStatisticsResponse extends StObject {
  
  /**
    * The finding statistics object.
    */
  var FindingStatistics: typings.awsSdk.clientsGuarddutyMod.FindingStatistics
}
object GetFindingsStatisticsResponse {
  
  inline def apply(FindingStatistics: FindingStatistics): GetFindingsStatisticsResponse = {
    val __obj = js.Dynamic.literal(FindingStatistics = FindingStatistics.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingsStatisticsResponse]
  }
  
  extension [Self <: GetFindingsStatisticsResponse](x: Self) {
    
    inline def setFindingStatistics(value: FindingStatistics): Self = StObject.set(x, "FindingStatistics", value.asInstanceOf[js.Any])
  }
}
