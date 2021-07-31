package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnterStandbyAnswer extends StObject {
  
  /**
    * The activities related to moving instances into Standby mode.
    */
  var Activities: js.UndefOr[typings.awsSdk.autoscalingMod.Activities] = js.undefined
}
object EnterStandbyAnswer {
  
  @scala.inline
  def apply(): EnterStandbyAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnterStandbyAnswer]
  }
  
  @scala.inline
  implicit class EnterStandbyAnswerMutableBuilder[Self <: EnterStandbyAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value :_*))
  }
}
