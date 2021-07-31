package typings.atomically

import typings.atomically.typesMod.Disposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/scheduler", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def next(id: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("next")(id.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    @scala.inline
    def schedule(id: String): js.Promise[Disposer] = ^.asInstanceOf[js.Dynamic].applyDynamic("schedule")(id.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Disposer]]
  }
}
