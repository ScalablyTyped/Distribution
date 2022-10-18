package typings.ahooks

import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseHoverMod {
  
  @JSImport("ahooks/lib/useHover", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: BasicTarget[Element]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def default(target: BasicTarget[Element], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait Options extends StObject {
    
    var onChange: js.UndefOr[js.Function1[/* isHovering */ Boolean, Unit]] = js.undefined
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnChange(value: /* isHovering */ Boolean => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnLeave(value: () => Unit): Self = StObject.set(x, "onLeave", js.Any.fromFunction0(value))
      
      inline def setOnLeaveUndefined: Self = StObject.set(x, "onLeave", js.undefined)
    }
  }
}
