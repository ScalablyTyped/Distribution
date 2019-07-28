package typings.angular.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////
// TimeoutService
// see http://docs.angularjs.org/api/ng.$timeout
///////////////////////////////////////////////////////////////////////////
@js.native
trait ITimeoutService extends js.Object {
  def apply(): IPromise[Unit] = js.native
  def apply(delay: Double): IPromise[Unit] = js.native
  def apply(delay: Double, invokeApply: Boolean): IPromise[Unit] = js.native
  def apply[T](fn: js.Function1[/* repeated */ js.Any, T | IPromise[T]]): IPromise[T] = js.native
  def apply[T](fn: js.Function1[/* repeated */ js.Any, T | IPromise[T]], delay: Double): IPromise[T] = js.native
  def apply[T](
    fn: js.Function1[/* repeated */ js.Any, T | IPromise[T]],
    delay: Double,
    invokeApply: Boolean,
    args: js.Any*
  ): IPromise[T] = js.native
  def cancel(): Boolean = js.native
  def cancel(promise: IPromise[_]): Boolean = js.native
}

