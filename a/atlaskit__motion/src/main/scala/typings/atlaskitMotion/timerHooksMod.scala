package typings.atlaskitMotion

import typings.atlaskitMotion.atlaskitMotionStrings.`next-effect`
import typings.atlaskitMotion.atlaskitMotionStrings.unmount
import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timerHooksMod {
  
  @JSImport("@atlaskit/motion/dist/types/utils/timer-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useRequestAnimationFrame(): js.Function1[/* handler */ FrameRequestCallback, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRequestAnimationFrame")().asInstanceOf[js.Function1[/* handler */ FrameRequestCallback, Unit]]
  inline def useRequestAnimationFrame(opts: Opts): js.Function1[/* handler */ FrameRequestCallback, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRequestAnimationFrame")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* handler */ FrameRequestCallback, Unit]]
  
  inline def useSetTimeout(): js.Function3[/* handler */ js.Function, /* timeout */ js.UndefOr[Double], /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")().asInstanceOf[js.Function3[/* handler */ js.Function, /* timeout */ js.UndefOr[Double], /* repeated */ Any, Unit]]
  inline def useSetTimeout(opts: Opts): js.Function3[/* handler */ js.Function, /* timeout */ js.UndefOr[Double], /* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Function3[/* handler */ js.Function, /* timeout */ js.UndefOr[Double], /* repeated */ Any, Unit]]
  
  trait Opts extends StObject {
    
    var cleanup: `next-effect` | unmount
  }
  object Opts {
    
    inline def apply(cleanup: `next-effect` | unmount): Opts = {
      val __obj = js.Dynamic.literal(cleanup = cleanup.asInstanceOf[js.Any])
      __obj.asInstanceOf[Opts]
    }
    
    extension [Self <: Opts](x: Self) {
      
      inline def setCleanup(value: `next-effect` | unmount): Self = StObject.set(x, "cleanup", value.asInstanceOf[js.Any])
    }
  }
}
