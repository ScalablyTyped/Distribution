package typings.ahooks

import typings.ahooks.anon.EnterFullscreen
import typings.ahooks.libUtilsDomTargetMod.BasicTarget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseFullscreenMod {
  
  @JSImport("ahooks/lib/useFullscreen", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(target: BasicTarget[Element]): js.Tuple2[Boolean, EnterFullscreen] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, EnterFullscreen]]
  inline def default(target: BasicTarget[Element], options: Options): js.Tuple2[Boolean, EnterFullscreen] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Boolean, EnterFullscreen]]
  
  trait Options extends StObject {
    
    var onEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setOnEnter(value: () => Unit): Self = StObject.set(x, "onEnter", js.Any.fromFunction0(value))
      
      inline def setOnEnterUndefined: Self = StObject.set(x, "onEnter", js.undefined)
      
      inline def setOnExit(value: () => Unit): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
    }
  }
}
