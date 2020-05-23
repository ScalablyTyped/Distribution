package typings.aureliaDependencyInjection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Decorates extends js.Object {
  var decorates: js.UndefOr[
    js.Function1[/* key */ js.Any, /* is aurelia-dependency-injection.anon.Get */ Boolean]
  ] = js.undefined
}

object Decorates {
  @scala.inline
  def apply(decorates: /* key */ js.Any => /* is aurelia-dependency-injection.anon.Get */ Boolean = null): Decorates = {
    val __obj = js.Dynamic.literal()
    if (decorates != null) __obj.updateDynamic("decorates")(js.Any.fromFunction1(decorates))
    __obj.asInstanceOf[Decorates]
  }
}

