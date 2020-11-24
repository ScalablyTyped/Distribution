package typings.alt

import typings.alt.AltJS.AltConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object global extends js.Object {
  
  @js.native
  object AltJS extends js.Object {
    
    @js.native
    class Alt ()
      extends typings.alt.AltJS.Alt {
      def this(config: AltConfig) = this()
    }
    
    @js.native
    object lifeCycleEvents extends js.Object {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.alt.AltJS.lifeCycleEvents with Double] = js.native
      
      /* 0 */ val bootstrap: typings.alt.AltJS.lifeCycleEvents.bootstrap with Double = js.native
      
      /* 4 */ val error: typings.alt.AltJS.lifeCycleEvents.error with Double = js.native
      
      /* 2 */ val init: typings.alt.AltJS.lifeCycleEvents.init with Double = js.native
      
      /* 3 */ val rollback: typings.alt.AltJS.lifeCycleEvents.rollback with Double = js.native
      
      /* 1 */ val snapshot: typings.alt.AltJS.lifeCycleEvents.snapshot with Double = js.native
    }
  }
}
