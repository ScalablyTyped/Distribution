package typings.antdMobile

import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esComponentsScrollMaskScrollMaskMod {
  
  @JSImport("antd-mobile/es/components/scroll-mask/scroll-mask", "ScrollMask")
  @js.native
  val ScrollMask: FC[ScrollMaskProps] = js.native
  
  trait ScrollMaskProps extends StObject {
    
    var scrollTrackRef: RefObject[HTMLElement]
  }
  object ScrollMaskProps {
    
    inline def apply(scrollTrackRef: RefObject[HTMLElement]): ScrollMaskProps = {
      val __obj = js.Dynamic.literal(scrollTrackRef = scrollTrackRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScrollMaskProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollMaskProps] (val x: Self) extends AnyVal {
      
      inline def setScrollTrackRef(value: RefObject[HTMLElement]): Self = StObject.set(x, "scrollTrackRef", value.asInstanceOf[js.Any])
    }
  }
}
