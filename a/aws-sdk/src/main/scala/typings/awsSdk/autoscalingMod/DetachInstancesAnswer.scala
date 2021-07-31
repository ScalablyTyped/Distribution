package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetachInstancesAnswer extends StObject {
  
  /**
    * The activities related to detaching the instances from the Auto Scaling group.
    */
  var Activities: js.UndefOr[typings.awsSdk.autoscalingMod.Activities] = js.undefined
}
object DetachInstancesAnswer {
  
  @scala.inline
  def apply(): DetachInstancesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetachInstancesAnswer]
  }
  
  @scala.inline
  implicit class DetachInstancesAnswerMutableBuilder[Self <: DetachInstancesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivities(value: Activities): Self = StObject.set(x, "Activities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivitiesUndefined: Self = StObject.set(x, "Activities", js.undefined)
    
    @scala.inline
    def setActivitiesVarargs(value: Activity*): Self = StObject.set(x, "Activities", js.Array(value :_*))
  }
}
