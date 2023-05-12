package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCoverageStatisticsResponse extends StObject {
  
  /**
    * Represents the count aggregated by the statusCode and resourceType.
    */
  var CoverageStatistics: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.CoverageStatistics] = js.undefined
}
object GetCoverageStatisticsResponse {
  
  inline def apply(): GetCoverageStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCoverageStatisticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCoverageStatisticsResponse] (val x: Self) extends AnyVal {
    
    inline def setCoverageStatistics(value: CoverageStatistics): Self = StObject.set(x, "CoverageStatistics", value.asInstanceOf[js.Any])
    
    inline def setCoverageStatisticsUndefined: Self = StObject.set(x, "CoverageStatistics", js.undefined)
  }
}
