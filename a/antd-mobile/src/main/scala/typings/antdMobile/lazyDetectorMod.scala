package typings.antdMobile

import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyDetectorMod {
  
  @JSImport("antd-mobile/es/components/image/lazy-detector", "LazyDetector")
  @js.native
  val LazyDetector: FC[Props] = js.native
  
  trait Props extends StObject {
    
    def onActive(): Unit
  }
  object Props {
    
    inline def apply(onActive: () => Unit): Props = {
      val __obj = js.Dynamic.literal(onActive = js.Any.fromFunction0(onActive))
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setOnActive(value: () => Unit): Self = StObject.set(x, "onActive", js.Any.fromFunction0(value))
    }
  }
}
