package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStatisticsResponse extends StObject {
  
  /**
    * The statistics returned by the Fleet Indexing service based on the query and aggregation field.
    */
  var statistics: js.UndefOr[Statistics] = js.undefined
}
object GetStatisticsResponse {
  
  inline def apply(): GetStatisticsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStatisticsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetStatisticsResponse] (val x: Self) extends AnyVal {
    
    inline def setStatistics(value: Statistics): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
  }
}
