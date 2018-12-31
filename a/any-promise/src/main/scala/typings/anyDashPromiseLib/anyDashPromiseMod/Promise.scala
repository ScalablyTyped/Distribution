package typings
package anyDashPromiseLib.anyDashPromiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Promise[R]
  extends anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[R] {
  /**
    * Sugar for promise.then(undefined, onRejected)
    *
    * @param onRejected called when/if "promise" rejects
    */
  def `catch`[U](): Promise[U] = js.native
  def `catch`[U](
    onRejected: js.Function1[/* error */ js.Any, U | anyDashPromiseLib.anyDashPromiseMod.PromiseNs.Thenable[U]]
  ): Promise[U] = js.native
}

