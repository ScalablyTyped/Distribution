package typings.accurateInterval

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("accurate-interval", JSImport.Namespace)
  @js.native
  def apply(func: js.Function1[/* scheduledTime */ Double, Unit], interval: Double, opts: Opts): AccurateInterval = js.native
  
  @js.native
  trait AccurateInterval extends StObject {
    
    def clear(): Unit = js.native
  }
  object AccurateInterval {
    
    @scala.inline
    def apply(clear: () => Unit): AccurateInterval = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[AccurateInterval]
    }
    
    @scala.inline
    implicit class AccurateIntervalMutableBuilder[Self <: AccurateInterval] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait Opts extends StObject {
    
    var aligned: Boolean = js.native
    
    var immediate: Boolean = js.native
  }
  object Opts {
    
    @scala.inline
    def apply(aligned: Boolean, immediate: Boolean): Opts = {
      val __obj = js.Dynamic.literal(aligned = aligned.asInstanceOf[js.Any], immediate = immediate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    @scala.inline
    implicit class OptsMutableBuilder[Self <: Opts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAligned(value: Boolean): Self = StObject.set(x, "aligned", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
    }
  }
}
