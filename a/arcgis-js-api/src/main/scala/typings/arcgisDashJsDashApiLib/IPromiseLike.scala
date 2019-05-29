package typings
package arcgisDashJsDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPromiseLike[T] extends js.Object {
  def `then`[TResult1, TResult2](): IPromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.UndefOr[scala.Nothing],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](onfulfilled: js.Function1[/* value */ T, TResult1 | IPromiseLike[TResult1]]): IPromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[/* value */ T, TResult1 | IPromiseLike[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromiseLike[TResult1 | TResult2] = js.native
  def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | IPromiseLike[TResult2]]
  ): IPromiseLike[TResult1 | TResult2] = js.native
}

