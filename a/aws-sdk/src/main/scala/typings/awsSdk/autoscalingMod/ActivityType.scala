package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActivityType extends StObject {
  
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[typings.awsSdk.autoscalingMod.Activity] = js.native
}
object ActivityType {
  
  @scala.inline
  def apply(): ActivityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityType]
  }
  
  @scala.inline
  implicit class ActivityTypeMutableBuilder[Self <: ActivityType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivity(value: Activity): Self = StObject.set(x, "Activity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityUndefined: Self = StObject.set(x, "Activity", js.undefined)
  }
}
