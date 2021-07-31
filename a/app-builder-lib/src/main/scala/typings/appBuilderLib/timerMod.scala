package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerMod {
  
  @JSImport("app-builder-lib/out/util/timer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/util/timer", "DevTimer")
  @js.native
  class DevTimer protected ()
    extends StObject
       with Timer {
    def this(label: String) = this()
    
    /* CompleteClass */
    override def end(): Unit = js.native
    
    def endAndGet(): String = js.native
    
    val label: js.Any = js.native
    
    var start: js.Any = js.native
  }
  
  @scala.inline
  def time(label: String): Timer = ^.asInstanceOf[js.Dynamic].applyDynamic("time")(label.asInstanceOf[js.Any]).asInstanceOf[Timer]
  
  trait Timer extends StObject {
    
    def end(): Unit
  }
  object Timer {
    
    @scala.inline
    def apply(end: () => Unit): Timer = {
      val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end))
      __obj.asInstanceOf[Timer]
    }
    
    @scala.inline
    implicit class TimerMutableBuilder[Self <: Timer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
    }
  }
}
