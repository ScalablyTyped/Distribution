package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitoringStoppingCondition extends StObject {
  
  /**
    * The maximum runtime allowed in seconds.  The MaxRuntimeInSeconds cannot exceed the frequency of the job. For data quality and model explainability, this can be up to 3600 seconds for an hourly schedule. For model bias and model quality hourly schedules, this can be up to 1800 seconds. 
    */
  var MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds
}
object MonitoringStoppingCondition {
  
  inline def apply(MaxRuntimeInSeconds: MonitoringMaxRuntimeInSeconds): MonitoringStoppingCondition = {
    val __obj = js.Dynamic.literal(MaxRuntimeInSeconds = MaxRuntimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonitoringStoppingCondition]
  }
  
  extension [Self <: MonitoringStoppingCondition](x: Self) {
    
    inline def setMaxRuntimeInSeconds(value: MonitoringMaxRuntimeInSeconds): Self = StObject.set(x, "MaxRuntimeInSeconds", value.asInstanceOf[js.Any])
  }
}
