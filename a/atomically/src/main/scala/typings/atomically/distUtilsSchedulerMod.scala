package typings.atomically

import typings.atomically.distTypesMod.Disposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsSchedulerMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def next(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def schedule(id: String): js.Promise[Disposer] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Disposer]]
  }
}
