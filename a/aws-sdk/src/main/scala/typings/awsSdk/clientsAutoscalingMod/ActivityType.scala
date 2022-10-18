package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivityType extends StObject {
  
  /**
    * A scaling activity.
    */
  var Activity: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Activity] = js.undefined
}
object ActivityType {
  
  inline def apply(): ActivityType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivityType]
  }
  
  extension [Self <: ActivityType](x: Self) {
    
    inline def setActivity(value: Activity): Self = StObject.set(x, "Activity", value.asInstanceOf[js.Any])
    
    inline def setActivityUndefined: Self = StObject.set(x, "Activity", js.undefined)
  }
}
