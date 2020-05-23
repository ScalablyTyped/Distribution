package typings.algoliaClientSearch.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<boolean>> */
trait ReadonlyPromiseboolean extends js.Object {
  def `catch`[TResult](): js.Promise[Boolean | TResult]
  def `finally`(): js.Promise[Boolean]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseboolean {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Boolean | js.Any],
    `finally`: () => js.Promise[Boolean],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseboolean = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseboolean]
  }
}

