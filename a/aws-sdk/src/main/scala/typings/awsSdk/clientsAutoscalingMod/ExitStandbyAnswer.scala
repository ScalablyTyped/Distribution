package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitStandbyAnswer extends StObject {
  
  /**
    * The activities related to moving instances out of Standby mode.
    */
  var Activities: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Activities] = js.undefined
}
object ExitStandbyAnswer {
  
  inline def apply(): ExitStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExitStandbyAnswer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExitStandbyAnswer] (val x: Self) extends AnyVal {
    
    inline def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    inline def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    inline def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value*))
  }
}
