package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobStoppingCondition extends StObject {
  
  /**
    * The maximum length of time, in seconds, that an Amazon Braket job can run.
    */
  var maxRuntimeInSeconds: js.UndefOr[JobStoppingConditionMaxRuntimeInSecondsInteger] = js.undefined
}
object JobStoppingCondition {
  
  inline def apply(): JobStoppingCondition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JobStoppingCondition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JobStoppingCondition] (val x: Self) extends AnyVal {
    
    inline def setMaxRuntimeInSeconds(value: JobStoppingConditionMaxRuntimeInSecondsInteger): Self = StObject.set(x, "maxRuntimeInSeconds", value.asInstanceOf[js.Any])
    
    inline def setMaxRuntimeInSecondsUndefined: Self = StObject.set(x, "maxRuntimeInSeconds", js.undefined)
  }
}
