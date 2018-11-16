package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// TimeoutService
// see http://docs.angularjs.org/api/ng.$timeout
///////////////////////////////////////////////////////////////////////////
@js.native
trait ITimeoutService extends js.Object {
  def apply(): IPromise[scala.Unit] = js.native
  def apply(delay: scala.Double): IPromise[scala.Unit] = js.native
  def apply(delay: scala.Double, invokeApply: scala.Boolean): IPromise[scala.Unit] = js.native
  def apply[T](fn: js.Function1[/* repeated */js.Any, T | IPromise[T]]): IPromise[T] = js.native
  def apply[T](fn: js.Function1[/* repeated */js.Any, T | IPromise[T]], delay: scala.Double): IPromise[T] = js.native
  def apply[T](
    fn: js.Function1[/* repeated */js.Any, T | IPromise[T]],
    delay: scala.Double,
    invokeApply: scala.Boolean,
    args: js.Any*
  ): IPromise[T] = js.native
  def cancel(): scala.Boolean = js.native
  def cancel(promise: IPromise[_]): scala.Boolean = js.native
}

