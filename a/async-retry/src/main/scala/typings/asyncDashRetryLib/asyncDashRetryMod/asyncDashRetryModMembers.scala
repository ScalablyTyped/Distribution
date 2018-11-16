package typings
package asyncDashRetryLib.asyncDashRetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async-retry", JSImport.Namespace)
@js.native
object asyncDashRetryModMembers extends js.Object {
  def apply[A](
    fn: asyncDashRetryLib.asyncDashRetryMod.AsyncRetryNs.RetryFunction[A],
    opts: asyncDashRetryLib.asyncDashRetryMod.AsyncRetryNs.Options
  ): stdLib.Promise[A] = js.native
}

