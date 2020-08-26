package typings.absintheSocket.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Observer[Variables, Result] extends js.Object {
  var onAbort: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
  var onCancel: js.UndefOr[js.Function0[_]] = js.native
  var onError: js.UndefOr[js.Function1[/* error */ Error, _]] = js.native
  var onResult: js.UndefOr[js.Function1[/* result */ Result, _]] = js.native
  var onStart: js.UndefOr[js.Function1[/* notifier */ Notifier[Variables, js.Object], _]] = js.native
}

object Observer {
  @scala.inline
  def apply[Variables, Result](): Observer[Variables, Result] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Observer[Variables, Result]]
  }
  @scala.inline
  implicit class ObserverOps[Self <: Observer[_, _], Variables, Result] (val x: Self with (Observer[Variables, Result])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOnAbort(value: /* error */ Error => _): Self = this.set("onAbort", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAbort: Self = this.set("onAbort", js.undefined)
    @scala.inline
    def setOnCancel(value: () => _): Self = this.set("onCancel", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    @scala.inline
    def setOnError(value: /* error */ Error => _): Self = this.set("onError", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setOnResult(value: /* result */ Result => _): Self = this.set("onResult", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnResult: Self = this.set("onResult", js.undefined)
    @scala.inline
    def setOnStart(value: /* notifier */ Notifier[Variables, js.Object] => _): Self = this.set("onStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnStart: Self = this.set("onStart", js.undefined)
  }
  
}

