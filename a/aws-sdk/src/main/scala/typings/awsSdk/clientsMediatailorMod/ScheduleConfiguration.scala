package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleConfiguration extends StObject {
  
  /**
    * Program clip range configuration.
    */
  var ClipRange: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ClipRange] = js.undefined
  
  /**
    * Program transition configurations.
    */
  var Transition: typings.awsSdk.clientsMediatailorMod.Transition
}
object ScheduleConfiguration {
  
  inline def apply(Transition: Transition): ScheduleConfiguration = {
    val __obj = js.Dynamic.literal(Transition = Transition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScheduleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClipRange(value: ClipRange): Self = StObject.set(x, "ClipRange", value.asInstanceOf[js.Any])
    
    inline def setClipRangeUndefined: Self = StObject.set(x, "ClipRange", js.undefined)
    
    inline def setTransition(value: Transition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
  }
}
