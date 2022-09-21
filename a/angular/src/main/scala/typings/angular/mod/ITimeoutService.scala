package typings.angular.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

///////////////////////////////////////////////////////////////////////////
// TimeoutService
// see http://docs.angularjs.org/api/ng/service/$timeout
///////////////////////////////////////////////////////////////////////////
@js.native
trait ITimeoutService extends StObject {
  
  def apply(): IPromise[Unit] = js.native
  def apply(delay: Double): IPromise[Unit] = js.native
  def apply(delay: Double, invokeApply: Boolean): IPromise[Unit] = js.native
  def apply(delay: Unit, invokeApply: Boolean): IPromise[Unit] = js.native
  def apply[T](
    fn: js.Function1[/* repeated */ Any, T | IPromise[T]],
    delay: Double,
    invokeApply: Boolean,
    args: Any*
  ): IPromise[T] = js.native
  def apply[T](
    fn: js.Function1[/* repeated */ Any, T | IPromise[T]],
    delay: Double,
    invokeApply: Unit,
    args: Any*
  ): IPromise[T] = js.native
  def apply[T](
    fn: js.Function1[/* repeated */ Any, T | IPromise[T]],
    delay: Unit,
    invokeApply: Boolean,
    args: Any*
  ): IPromise[T] = js.native
  def apply[T](fn: js.Function1[/* repeated */ Any, T | IPromise[T]], delay: Unit, invokeApply: Unit, args: Any*): IPromise[T] = js.native
  
  def cancel(): Boolean = js.native
  def cancel(promise: IPromise[Any]): Boolean = js.native
}
