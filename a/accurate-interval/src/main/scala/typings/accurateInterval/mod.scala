package typings.accurateInterval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(func: js.Function1[/* scheduledTime */ Double, Unit], interval: Double, opts: Opts): AccurateInterval = (^.asInstanceOf[js.Dynamic].apply(func.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[AccurateInterval]
  
  @JSImport("accurate-interval", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait AccurateInterval extends StObject {
    
    def clear(): Unit
  }
  object AccurateInterval {
    
    inline def apply(clear: () => Unit): AccurateInterval = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[AccurateInterval]
    }
    
    extension [Self <: AccurateInterval](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  trait Opts extends StObject {
    
    var aligned: Boolean
    
    var immediate: Boolean
  }
  object Opts {
    
    inline def apply(aligned: Boolean, immediate: Boolean): Opts = {
      val __obj = js.Dynamic.literal(aligned = aligned.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setAligned(value: Boolean): Self = StObject.set(x, "aligned", value.asInstanceOf[js.Any])
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    }
  }
}
