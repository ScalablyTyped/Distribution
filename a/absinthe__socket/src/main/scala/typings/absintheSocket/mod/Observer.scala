package typings.absintheSocket.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Observer[Variables, Result] extends js.Object {
  var onAbort: js.UndefOr[js.Function1[/* error */ Error, _]] = js.undefined
  var onCancel: js.UndefOr[js.Function0[_]] = js.undefined
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.undefined
  var onResult: js.UndefOr[js.Function1[/* result */ Result, _]] = js.undefined
  var onStart: js.UndefOr[js.Function1[/* notifier */ Notifier[Variables, js.Object], _]] = js.undefined
}

object Observer {
  @scala.inline
  def apply[Variables, Result](
    onAbort: /* error */ Error => _ = null,
    onCancel: () => _ = null,
    onError: /* error */ Error => _ = null,
    onResult: /* result */ Result => _ = null,
    onStart: /* notifier */ Notifier[Variables, js.Object] => _ = null
  ): Observer[Variables, Result] = {
    val __obj = js.Dynamic.literal()
    if (onAbort != null) __obj.updateDynamic("onAbort")(js.Any.fromFunction1(onAbort))
    if (onCancel != null) __obj.updateDynamic("onCancel")(js.Any.fromFunction0(onCancel))
    if (onError != null) __obj.updateDynamic("onError")(js.Any.fromFunction1(onError))
    if (onResult != null) __obj.updateDynamic("onResult")(js.Any.fromFunction1(onResult))
    if (onStart != null) __obj.updateDynamic("onStart")(js.Any.fromFunction1(onStart))
    __obj.asInstanceOf[Observer[Variables, Result]]
  }
}

