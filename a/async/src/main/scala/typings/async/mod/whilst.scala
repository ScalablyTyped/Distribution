package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "whilst")
@js.native
object whilst extends js.Object {
  
  def apply[E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E],
    callback: ErrorCallback[E]
  ): Unit = js.native
  def apply[R, E](
    test: js.Function1[/* cb */ js.Function2[/* err */ js.Any, /* truth */ Boolean, Boolean], Boolean],
    fn: AsyncVoidFunction[E]
  ): js.Promise[R] = js.native
}
