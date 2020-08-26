package typings.aliApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fail extends js.Object {
  var fail: js.UndefOr[js.Function1[/* res */ Error, Unit]] = js.native
  var result: HitKeywords = js.native
}

object Fail {
  @scala.inline
  def apply(result: HitKeywords): Fail = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  @scala.inline
  implicit class FailOps[Self <: Fail] (val x: Self) extends AnyVal {
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
    def setResult(value: HitKeywords): Self = this.set("result", value.asInstanceOf[js.Any])
    @scala.inline
    def setFail(value: /* res */ Error => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
  }
  
}

