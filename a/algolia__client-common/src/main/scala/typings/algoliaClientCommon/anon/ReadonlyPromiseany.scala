package typings.algoliaClientCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<any>> */
trait ReadonlyPromiseany extends js.Object {
  def `catch`[TResult](): js.Promise[_ | TResult]
  def `finally`(): js.Promise[_]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromiseany {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[_ | js.Any],
    `finally`: () => js.Promise[_],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromiseany = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromiseany]
  }
}

