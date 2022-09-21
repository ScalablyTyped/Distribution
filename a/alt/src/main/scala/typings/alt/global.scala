package typings.alt

import typings.alt.AltJS.AltConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AltJS {
    
    @JSGlobal("AltJS.Alt")
    @js.native
    open class Alt ()
      extends StObject
         with typings.alt.AltJS.Alt {
      def this(config: AltConfig) = this()
    }
    
    @JSGlobal("AltJS.lifeCycleEvents")
    @js.native
    object lifeCycleEvents extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.alt.AltJS.lifeCycleEvents & Double] = js.native
      
      /* 0 */ val bootstrap: typings.alt.AltJS.lifeCycleEvents.bootstrap & Double = js.native
      
      /* 4 */ val error: typings.alt.AltJS.lifeCycleEvents.error & Double = js.native
      
      /* 2 */ val init: typings.alt.AltJS.lifeCycleEvents.init & Double = js.native
      
      /* 3 */ val rollback: typings.alt.AltJS.lifeCycleEvents.rollback & Double = js.native
      
      /* 1 */ val snapshot: typings.alt.AltJS.lifeCycleEvents.snapshot & Double = js.native
    }
  }
}
