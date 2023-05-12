package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRulesetEvaluationRunFilter extends StObject {
  
  /**
    * Filter based on a data source (an Glue table) associated with the run.
    */
  var DataSource: typings.awsSdk.clientsGlueMod.DataSource
  
  /**
    * Filter results by runs that started after this time.
    */
  var StartedAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Filter results by runs that started before this time.
    */
  var StartedBefore: js.UndefOr[js.Date] = js.undefined
}
object DataQualityRulesetEvaluationRunFilter {
  
  inline def apply(DataSource: DataSource): DataQualityRulesetEvaluationRunFilter = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataQualityRulesetEvaluationRunFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRulesetEvaluationRunFilter] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setStartedAfter(value: js.Date): Self = StObject.set(x, "StartedAfter", value.asInstanceOf[js.Any])
    
    inline def setStartedAfterUndefined: Self = StObject.set(x, "StartedAfter", js.undefined)
    
    inline def setStartedBefore(value: js.Date): Self = StObject.set(x, "StartedBefore", value.asInstanceOf[js.Any])
    
    inline def setStartedBeforeUndefined: Self = StObject.set(x, "StartedBefore", js.undefined)
  }
}
