package typings
package asyncDashRetryLib.asyncDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-retry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply[A](fn: RetryFunction[A], opts: Options): js.Promise[A] = js.native
}

