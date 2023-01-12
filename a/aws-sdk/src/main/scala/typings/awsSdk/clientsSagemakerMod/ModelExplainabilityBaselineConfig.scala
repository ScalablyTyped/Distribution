package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelExplainabilityBaselineConfig extends StObject {
  
  /**
    * The name of the baseline model explainability job.
    */
  var BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined
  
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
}
object ModelExplainabilityBaselineConfig {
  
  inline def apply(): ModelExplainabilityBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelExplainabilityBaselineConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelExplainabilityBaselineConfig] (val x: Self) extends AnyVal {
    
    inline def setBaseliningJobName(value: ProcessingJobName): Self = StObject.set(x, "BaseliningJobName", value.asInstanceOf[js.Any])
    
    inline def setBaseliningJobNameUndefined: Self = StObject.set(x, "BaseliningJobName", js.undefined)
    
    inline def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    inline def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
  }
}
