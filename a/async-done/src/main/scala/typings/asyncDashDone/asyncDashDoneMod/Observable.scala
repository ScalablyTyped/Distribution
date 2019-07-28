package typings.asyncDashDone.asyncDashDoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Minimal `Observable` interface compatible with `async-done`.
  *
  * @see https://github.com/ReactiveX/rxjs/blob/c3c56867eaf93f302ac7cd588034c7d8712f2834/src/internal/Observable.ts#L77
  */
@js.native
trait Observable[T] extends js.Object {
  def subscribe(): js.Any = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit]): js.Any = js.native
  def subscribe(next: js.Function1[/* value */ T, Unit], error: js.Function1[/* error */ js.Any, Unit]): js.Any = js.native
  def subscribe(
    next: js.Function1[/* value */ T, Unit],
    error: js.Function1[/* error */ js.Any, Unit],
    complete: js.Function0[Unit]
  ): js.Any = js.native
}

