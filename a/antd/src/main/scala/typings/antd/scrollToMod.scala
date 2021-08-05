package typings.antd

import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scrollToMod {
  
  @JSImport("antd/lib/_util/scrollTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(y: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(y.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(y: Double, options: ScrollToOptions): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(y.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait ScrollToOptions extends StObject {
    
    /** Scroll end callback */
    var callback: js.UndefOr[js.Function0[js.Any]] = js.undefined
    
    /** Animation duration, default as 450 */
    var duration: js.UndefOr[Double] = js.undefined
    
    /** Scroll container, default as window */
    var getContainer: js.UndefOr[js.Function0[HTMLElement | Window | Document]] = js.undefined
  }
  object ScrollToOptions {
    
    inline def apply(): ScrollToOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollToOptions]
    }
    
    extension [Self <: ScrollToOptions](x: Self) {
      
      inline def setCallback(value: () => js.Any): Self = StObject.set(x, "callback", js.Any.fromFunction0(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setGetContainer(value: () => HTMLElement | Window | Document): Self = StObject.set(x, "getContainer", js.Any.fromFunction0(value))
      
      inline def setGetContainerUndefined: Self = StObject.set(x, "getContainer", js.undefined)
    }
  }
}
