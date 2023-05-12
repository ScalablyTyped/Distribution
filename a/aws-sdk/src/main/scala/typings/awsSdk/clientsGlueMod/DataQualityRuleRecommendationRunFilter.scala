package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRuleRecommendationRunFilter extends StObject {
  
  /**
    * Filter based on a specified data source (Glue table).
    */
  var DataSource: typings.awsSdk.clientsGlueMod.DataSource
  
  /**
    * Filter based on time for results started after provided time.
    */
  var StartedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter based on time for results started before provided time.
    */
  var StartedBefore: js.UndefOr[js.Date] = js.undefined
}
object DataQualityRuleRecommendationRunFilter {
  
  inline def apply(DataSource: DataSource): DataQualityRuleRecommendationRunFilter = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualityRuleRecommendationRunFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRuleRecommendationRunFilter] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setStartedAfter(value: js.Date): Self = StObject.set(x, "StartedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "StartedAfter", js.undefined)
    
    inline def setStartedBefore(value: js.Date): Self = StObject.set(x, "StartedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "StartedBefore", js.undefined)
  }
}
