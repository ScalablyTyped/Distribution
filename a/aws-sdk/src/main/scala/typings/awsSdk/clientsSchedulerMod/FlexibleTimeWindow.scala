package typings.awsSdk.clientsSchedulerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlexibleTimeWindow extends StObject {
  
  /**
    * The maximum time window during which a schedule can be invoked.
    */
  var MaximumWindowInMinutes: js.UndefOr[typings.awsSdk.clientsSchedulerMod.MaximumWindowInMinutes] = js.undefined
  
  /**
    * Determines whether the schedule is invoked within a flexible time window.
    */
  var Mode: FlexibleTimeWindowMode
}
object FlexibleTimeWindow {
  
  inline def apply(Mode: FlexibleTimeWindowMode): FlexibleTimeWindow = {
    val __obj = js.Dynamic.literal(Mode = Mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexibleTimeWindow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FlexibleTimeWindow] (val x: Self) extends AnyVal {
    
    inline def setMaximumWindowInMinutes(value: MaximumWindowInMinutes): Self = StObject.set(x, "MaximumWindowInMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaximumWindowInMinutesUndefined: Self = StObject.set(x, "MaximumWindowInMinutes", js.undefined)
    
    inline def setMode(value: FlexibleTimeWindowMode): Self = StObject.set(x, "Mode", value.asInstanceOf[js.Any])
  }
}
