package typings.atomically

import typings.atomically.typesMod.Disposer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("atomically/dist/utils/scheduler", JSImport.Namespace)
@js.native
object schedulerMod extends js.Object {
  @js.native
  object default extends js.Object {
    def next(id: String): Unit = js.native
    def schedule(id: String): js.Promise[Disposer] = js.native
  }
  
}

