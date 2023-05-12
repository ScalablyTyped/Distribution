package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataQualityRuleRecommendationRunDescription extends StObject {
  
  /**
    * The data source (Glue table) associated with the recommendation run.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsGlueMod.DataSource] = js.undefined
  
  /**
    * The unique run identifier associated with this run.
    */
  var RunId: js.UndefOr[HashString] = js.undefined
  
  /**
    * The date and time when this run started.
    */
  var StartedOn: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The status for this run.
    */
  var Status: js.UndefOr[TaskStatusType] = js.undefined
}
object DataQualityRuleRecommendationRunDescription {
  
  inline def apply(): DataQualityRuleRecommendationRunDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataQualityRuleRecommendationRunDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataQualityRuleRecommendationRunDescription] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setRunId(value: HashString): Self = StObject.set(x, "RunId", value.asInstanceOf[js.Any])
    
    inline def setRunIdUndefined: Self = StObject.set(x, "RunId", js.undefined)
    
    inline def setStartedOn(value: js.Date): Self = StObject.set(x, "StartedOn", value.asInstanceOf[js.Any])
    
    inline def setStartedOnUndefined: Self = StObject.set(x, "StartedOn", js.undefined)
    
    inline def setStatus(value: TaskStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
