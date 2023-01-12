package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledSplitsLaunchDefinition extends StObject {
  
  /**
    * An array of structures that define the traffic allocation percentages among the feature variations during each step of the launch. This also defines the start time of each step.
    */
  var steps: js.UndefOr[ScheduledStepList] = js.undefined
}
object ScheduledSplitsLaunchDefinition {
  
  inline def apply(): ScheduledSplitsLaunchDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledSplitsLaunchDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledSplitsLaunchDefinition] (val x: Self) extends AnyVal {
    
    inline def setSteps(value: ScheduledStepList): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setStepsVarargs(value: ScheduledSplit*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
