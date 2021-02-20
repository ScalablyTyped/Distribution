package typings.atomically

import typings.atomically.typesMod.Disposer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object schedulerMod {
  
  object default {
    
    @JSImport("atomically/dist/utils/scheduler", "default.next")
    @js.native
    def next(id: String): Unit = js.native
    
    @JSImport("atomically/dist/utils/scheduler", "default.schedule")
    @js.native
    def schedule(id: String): js.Promise[Disposer] = js.native
  }
}
