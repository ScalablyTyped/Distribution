package typings.algoliaClientCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<std.Promise<void>> */
trait ReadonlyPromisevoid extends js.Object {
  def `catch`[TResult](): js.Promise[Unit | TResult]
  def `finally`(): js.Promise[Unit]
  def `then`[TResult1, TResult2](): js.Promise[TResult1 | TResult2]
}

object ReadonlyPromisevoid {
  @scala.inline
  def apply(
    `catch`: () => js.Promise[Unit | js.Any],
    `finally`: () => js.Promise[Unit],
    `then`: () => js.Promise[js.Any | js.Any]
  ): ReadonlyPromisevoid = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("catch")(js.Any.fromFunction0(`catch`))
    __obj.updateDynamic("finally")(js.Any.fromFunction0(`finally`))
    __obj.updateDynamic("then")(js.Any.fromFunction0(`then`))
    __obj.asInstanceOf[ReadonlyPromisevoid]
  }
}

