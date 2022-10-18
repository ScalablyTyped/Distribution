package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterStandbyAnswer extends StObject {
  
  /**
    * The activities related to moving instances into Standby mode.
    */
  var Activities: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Activities] = js.undefined
}
object EnterStandbyAnswer {
  
  inline def apply(): EnterStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterStandbyAnswer]
  }
  
  extension [Self <: EnterStandbyAnswer](x: Self) {
    
    inline def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value*))
  }
}
