package typings.awsSdk.clientsEvidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduledSplitsLaunchConfig extends StObject {
  
  /**
    * An array of structures that define the traffic allocation percentages among the feature variations during each step of the launch. This also defines the start time of each step.
    */
  var steps: ScheduledSplitConfigList
}
object ScheduledSplitsLaunchConfig {
  
  inline def apply(steps: ScheduledSplitConfigList): ScheduledSplitsLaunchConfig = {
    val __obj = js.Dynamic.literal(steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledSplitsLaunchConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduledSplitsLaunchConfig] (val x: Self) extends AnyVal {
    
    inline def setSteps(value: ScheduledSplitConfigList): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: ScheduledSplitConfig*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
