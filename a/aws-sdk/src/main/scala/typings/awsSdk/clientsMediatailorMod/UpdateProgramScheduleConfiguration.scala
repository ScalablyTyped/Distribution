package typings.awsSdk.clientsMediatailorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProgramScheduleConfiguration extends StObject {
  
  /**
    * Program clip range configuration.
    */
  var ClipRange: js.UndefOr[typings.awsSdk.clientsMediatailorMod.ClipRange] = js.undefined
  
  /**
    * Program transition configuration.
    */
  var Transition: js.UndefOr[UpdateProgramTransition] = js.undefined
}
object UpdateProgramScheduleConfiguration {
  
  inline def apply(): UpdateProgramScheduleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProgramScheduleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateProgramScheduleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setClipRange(value: ClipRange): Self = StObject.set(x, "ClipRange", value.asInstanceOf[js.Any])
    
    inline def setClipRangeUndefined: Self = StObject.set(x, "ClipRange", js.undefined)
    
    inline def setTransition(value: UpdateProgramTransition): Self = StObject.set(x, "Transition", value.asInstanceOf[js.Any])
    
    inline def setTransitionUndefined: Self = StObject.set(x, "Transition", js.undefined)
  }
}
