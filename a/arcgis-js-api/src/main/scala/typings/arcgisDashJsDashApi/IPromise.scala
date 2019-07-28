package typings.arcgisDashJsDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromise[T] extends js.Object {
  var cancel: js.UndefOr[
    js.Function2[/* reason */ js.UndefOr[js.Any], /* strict */ js.UndefOr[Boolean], _]
  ] = js.native
  var isCanceled: js.UndefOr[js.Function0[Boolean]] = js.native
  def always[TResult1](): IPromise[TResult1] = js.native
  def always[TResult1](callback: js.Function1[/* valueOrError */ T | js.Any, TResult1 | IPromiseLike[TResult1]]): IPromise[TResult1] = js.native
  def `catch`[TResult](): IPromise[T | TResult] = js.native
  def `catch`[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | IPromiseLike[TResult]]): IPromise[T | TResult] = js.native
  def isFulfilled(): Boolean = js.native
  def isRejected(): Boolean = js.native
  def isResolved(): Boolean = js.native
  def otherwise[TResult](): IPromise[T | TResult] = js.native
  def otherwise[TResult](onrejected: js.Function1[/* reason */ js.Any, TResult | IPromiseLike[TResult]]): IPromise[T | TResult] = js.native
  def `then`[TResult1, TResult2](): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | IPromiseLike[TResult1]]): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | IPromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromise[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromise[TResult1 | TResult2] = js.native
}

