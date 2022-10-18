package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelQualityBaselineConfig extends StObject {
  
  /**
    * The name of the job that performs baselining for the monitoring job.
    */
  var BaseliningJobName: js.UndefOr[ProcessingJobName] = js.undefined
  
  var ConstraintsResource: js.UndefOr[MonitoringConstraintsResource] = js.undefined
}
object ModelQualityBaselineConfig {
  
  inline def apply(): ModelQualityBaselineConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelQualityBaselineConfig]
  }
  
  extension [Self <: ModelQualityBaselineConfig](x: Self) {
    
    inline def setBaseliningJobName(value: ProcessingJobName): Self = StObject.set(x, "BaseliningJobName", value.asInstanceOf[js.Any])
    
    inline def setBaseliningJobNameUndefined: Self = StObject.set(x, "BaseliningJobName", js.undefined)
    
    inline def setConstraintsResource(value: MonitoringConstraintsResource): Self = StObject.set(x, "ConstraintsResource", value.asInstanceOf[js.Any])
    
    inline def setConstraintsResourceUndefined: Self = StObject.set(x, "ConstraintsResource", js.undefined)
  }
}
