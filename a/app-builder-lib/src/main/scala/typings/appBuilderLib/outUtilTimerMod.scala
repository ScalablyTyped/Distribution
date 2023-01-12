package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilTimerMod {
  
  @JSImport("app-builder-lib/out/util/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/util/timer", "DevTimer")
  @js.native
  open class DevTimer protected ()
    extends StObject
       with Timer {
    def this(label: String) = this()
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    def endAndGet(): String = js.native
    
    /* private */ val label: Any = js.native
    
    /* private */ var start: Any = js.native
  }
  
  inline def time(label: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  trait Timer extends StObject {
    
    def end(): Unit
  }
  object Timer {
    
    inline def apply(end: () => Unit): Timer = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      inline def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    }
  }
}
