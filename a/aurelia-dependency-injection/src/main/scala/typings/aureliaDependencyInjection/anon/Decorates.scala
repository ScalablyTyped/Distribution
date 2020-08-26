package typings.aureliaDependencyInjection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Decorates extends js.Object {
  var decorates: js.UndefOr[
    js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.anon.Get */ Boolean]
  ] = js.native
}

object Decorates {
  @scala.inline
  def apply(): Decorates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Decorates]
  }
  @scala.inline
  implicit class DecoratesOps[Self <: Decorates] (val x: Self) extends AnyVal {
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
    def setDecorates(value: /* key */ js.Any => /* is aurelia-dependency-injection.anon.Get */ Boolean): Self = this.set("decorates", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDecorates: Self = this.set("decorates", js.undefined)
  }
  
}

